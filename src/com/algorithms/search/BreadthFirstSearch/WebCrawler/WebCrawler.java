package com.algorithms.search.BreadthFirstSearch.WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A simple web crawler using Breadth First Search
 */
public class WebCrawler {

    private final String URL_REGEX = "http://(\\w+\\.)*(\\w+)"; // regex to check for a URL

    private Queue<String> queue; // Holds web to parse
    private List<String> discoveredWebsitesList; // Websites we've seen

    public WebCrawler() {
        this.queue = new LinkedList<>();
        this.discoveredWebsitesList = new ArrayList<>();
    }

    /**
     * Find some websites
     * @param root website to start with
     */
    public void discoverWeb(String root) {
        // Add root to queue
        this.queue.add(root);
        // Discover root site
        this.discoveredWebsitesList.add(root);

        while(!queue.isEmpty()) {
            String website = this.queue.remove();

            // Read data from this website
            String rawHtml = readURL(website);

            // Check for URLs in the raw HTML from this site
            Pattern pattern = Pattern.compile(URL_REGEX);
            Matcher matcher = pattern.matcher(rawHtml);

            while(matcher.find()) {
                // Get the URL that was found
                String actualUrl = matcher.group();

                // If we haven't discovered this website yet:
                if(!discoveredWebsitesList.contains(actualUrl)) {
                    // 1. Discover this website
                    discoveredWebsitesList.add(actualUrl);
                    // 2. Add to queue so its children will be discovered
                    queue.add(actualUrl);
                    // 3. Print that we discovered it
                    System.out.println("Website has been found with URL: " + actualUrl);
                }
            }
        }
    }

    /**
     * Reads the data from a given URL
     * @param inputUrl the URL to parse
     * @return the raw HTML for this URL
     */
    private String readURL(String inputUrl) {
        String rawHtml = "";

        try {
            // Create new URL object
            URL url = new URL(inputUrl);
            // Read the contents line-by-line
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // Add line to rawHtml
            String inputLine = "";
            while((inputLine = reader.readLine()) != null) {
                rawHtml += inputLine;
            }

            reader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return rawHtml;
    }
}

package com.g1n.webMonitor;

/**
 * Created by Ibrahim Saberi on 6/19/2017.
 */
public class webMonitor {
    public static void main(String[] args) {
        Parser parser = new Parser(
                "https://feeds.finance.yahoo.com/rss/2.0/headline?s=yhoo&region=US&lang=en-US");
        Feed feed = parser.parseFeed();
        System.out.println(feed);
        for (Msg message : feed.getMessages()) {
            System.out.println(message);

        }
    }
}

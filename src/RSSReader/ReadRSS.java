package RSSReader;

public class ReadRSS {
    public static void main(String[] args) {
        String urlName = args[0];
        RSSFeedParser parser = new RSSFeedParser(urlName);
        Feed feed = parser.readFeed();
        System.out.println("Feed: " + feed + "\n");
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);
        }
    }
}

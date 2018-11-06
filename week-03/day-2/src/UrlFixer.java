public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String url1;
        url1 = url.replace("//", "://");
        url1 = url1.replace("bots", "odds");
        String url2;
        url2 = url.substring(0, 5) + ":" + url.substring(5, 38) + "odds";
        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(url1);
        System.out.print(url2);
    }
}
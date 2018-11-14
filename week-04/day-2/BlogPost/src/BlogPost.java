import java.util.HashMap;

public class BlogPost {
  private HashMap<String, String> post = new HashMap<>();

  BlogPost (String authorName, String title, String text, String publicationDate) {
    post.put("authorName", authorName);
    post.put("title", title);
    post.put("text", text);
    post.put("publicationDate", publicationDate);
  }

  public void recall () {
    System.out.print("Author: ");
    System.out.println(post.get("authorName"));
    System.out.print("Title: ");
    System.out.println(post.get("title"));
    System.out.println("\n" + post.get("text"));
    System.out.println(post.get("publicationDate"));
    System.out.println("---");
  }
//
//  public void update (String fieldToUpdate, String update) {
//    if (post.containsKey(fieldToUpdate)) {
//      post.put(fieldToUpdate, update);
//    } else {
//      System.out.println("No such field in this post");
//    }
//  }
}

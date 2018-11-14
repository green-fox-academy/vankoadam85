import java.util.ArrayList;

public class Blog {
  ArrayList<BlogPost> blog = new ArrayList<>();

  public void addBlog(BlogPost post) {
    blog.add(post);
  }

  public void delete(int index) {
    blog.remove(index);
  }

  public void update (int index, BlogPost post) {
    blog.set(index, post);
  }

}

package week_14.assigment.question_20;

import java.util.HashSet;
import java.util.Set;

public class Post {
    private Set<String> post;


    public Post() {
        this.post = new HashSet<>();
    }

    public Set<String> getPost() {
        return post;
    }

    public void setPost(Set<String> post) {
        this.post = post;
    }

    public void add(String tag) {
        post.add(tag);
    }

    public void remove(String tag) {
        post.remove(tag);
    }

    public boolean check(String tag) {
        return post.contains(tag);
    }

    @Override
    public String toString() {
        return post.toString();
//        String s = "[";
//        for (String str : post) {
//            s += str + " , ";
//        }
//        return s + "]";
    }
}

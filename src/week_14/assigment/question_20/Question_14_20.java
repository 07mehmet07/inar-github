package week_14.assigment.question_20;

public class Question_14_20 {
    public static void main(String[] args) {
        Post post1 = new Post();

        post1.add("Java");
        post1.add("Coding");
        post1.add("Programming");
        System.out.println("Tags for post 1 " + post1);

        Post post2 = new Post();
        post2.add("Java");
        post2.add("Technology");
        post2.add("Coding");

        System.out.println("Tags for post 2 " + post2);
        System.out.println("Does post1 have the tag 'Java' ? " + post1.check("Java"));
        System.out.println("Does post2 have the tag 'Technology' ? " + post2.check("Technology"));
        post1.remove("Programming");
        System.out.println("Tags for post 1 " + post1);


    }
}

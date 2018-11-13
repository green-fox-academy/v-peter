package blog;

import blogpost.BlogPost;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Blog b = new Blog();
        BlogPost b1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost b2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost b3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");
        b.addPost(b1);
        b.addPost(b2);
        b.addPost(b3);

        for (BlogPost bp :
                b.bpl) {
            System.out.println(bp.toString());
        }

        //System.out.println(Arrays.toString(b.bpl.toArray()));

    }
}
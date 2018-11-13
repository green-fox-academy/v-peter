package blog;

import blogpost.BlogPost;

import javax.swing.*;
import java.util.ArrayList;

public class Blog {
    ArrayList<BlogPost> bpl;

    public Blog() {
        this.bpl = new ArrayList<>();
    }

    void addPost(BlogPost bp){
        bpl.add(bp);
    }

    void delete(int n){
        bpl.remove(n);
    }

    void update(int n, BlogPost bp){
        bpl.set(n, bp);
    }


}

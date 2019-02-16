package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController
{
    @RequestMapping("/") //The getAllPost() method in the HomeControllerclass is mapped to “/”, which represents the home page of the web application.
    public String getAllPosts(Model m)
    {
        ArrayList<Post> posts = new ArrayList<Post>();
        Post post1 = new Post();
        post1.setTitle("Post1");
        post1.setBody("Post Body1");
        post1.setDate(new Date());

        Post post2= new Post();
        post2.setTitle("Post2");
        post2.setBody("Post Body2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post3");
        post3.setBody("Post Body3");
        post3.setDate(new Date());


        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        m.addAttribute("posts",posts);//the model class provided by Spring is used to pass data from the controller to the view.
        return "index";


    }
}


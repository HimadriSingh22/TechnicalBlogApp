package technicalblog.model;

import java.util.Date;
//create the first model class called Post, which represents the posts in your blog. All the blog posts will be stored as objects of this model class, i.e., the blog posts will exist in the web application as objects of this class.
public class Post {
    private String title;
    private  String body;
    private Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

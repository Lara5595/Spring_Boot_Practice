package com.example.springbootpractice.models;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {

//    Instances
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String body;


//    Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    //    Constructors


    public Blog() {
    }


    public Blog(String title, String body) {
        this.title = title;
        this.body = body;
    }

} //End of blog

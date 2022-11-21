package com.example.springbootpractice.models;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movies {
//    Instances
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String genre;


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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


//    Constructor

    public Movies(){}



    public Movies(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

/**
 *
 * @author DUC
 */
public class News {
    private int id;
    private String title;
    private String content;
    private int author_id;
    private String sumary;
    
    public News(int id, String title, String content, int author_id, String sumary) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author_id = author_id;
        this.sumary = sumary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getSumary() {
        return sumary;
    }

    public void setSumary(String sumary) {
        this.sumary = sumary;
    }
    
}

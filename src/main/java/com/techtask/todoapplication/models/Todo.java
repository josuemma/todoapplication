package com.techtask.todoapplication.models;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "APPS_TO_DO_ENTRY")
public class Todo {
    @Id
    @Column(name="TASK_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank
    @Size(max=100)
    @Column(name="TITLE")
    private String title;
    
    @Column(name = "STATUS")
    private Boolean completed = false;
    
    @Column(name="CREATED_DATE")
    private Date createdAt = new Date();
    
    public Todo() {
        super();
    }
    
    public Todo(String title) {
        this.title = title;
    }
    
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
    
    public Boolean getCompleted() {
        return completed;
    }
    
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, title='%s', completed='%s']",
                id, title, completed);
    }
}
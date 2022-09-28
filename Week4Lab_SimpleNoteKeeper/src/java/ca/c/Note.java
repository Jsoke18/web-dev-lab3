/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.c;

import java.io.Serializable;

/**
 *
 * @author mucky
 */
public class Note implements Serializable {
    private String title; 
    private String contents;  
     
    public Note(){
        
    }
    public Note(String title, String contents){ 
         this.title = title;
         this.contents = contents; 
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
       
}

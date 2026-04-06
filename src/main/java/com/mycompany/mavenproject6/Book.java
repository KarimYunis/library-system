/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author user
 */
public class Book {
//=-----attributes-----------
    
    private String title;
    private String author;
    private int bookID;
    
//-------constructors----
    
    Book(String title, String author, int bookID){
        setTitle(title);
        setAuthor(author);
        setBookid(bookID);
    }
    
    
//---------setters-------
    
    public void setTitle(String title){
        if(title.length()==0){
            System.out.println("sorry, invalid title");
        }
       else this.title = title;
    }
    
    
     public void setAuthor(String author){
         if(author.length()==0){
            System.out.println("sorry, invalid auhtor name ");
        }
         else this.author = author;
    }
     
     
      public void setBookid(int bookID){
          if(bookID<=0){
              System.out.println("sorry, invalid book id");
          }
          else  this.bookID = bookID;
    }
      
//------------getters------------
      
      public String getTitle(){
          return title;
      }
      
      
      public String getAuthor(){
          return author;
      }
      
      
      public int getBookid(){
          return bookID;
      }
      
//------------methods----------------
      
      public void displaydetails(){
          System.out.println(getTitle());
          System.out.println(getAuthor());
          System.out.println(getBookid());
      }
}


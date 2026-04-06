/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author user
 */
public class Member extends LibraryMember {
    
    
    //---------constructors----------------- 
    
    
     Member(String name,int memberID){
         super(name,memberID);
     }
   
    //---------------abstract methods implementaion ------------------
     
     @Override
     public void borrowbook(Book book){
         boolean rejectance = true;
         for(int i =0;i<borrowedBooks.length;i++){
             if(borrowedBooks[i]==null){
                 borrowedBooks[i]= book;
                 rejectance = false;
                 break;
             }
         }
         if(rejectance){
             System.out.println("sorry, you can't have more than 5 books ");
         }
     }
     
     
     @Override
     public void displayBorrowedBooks(){
         
         System.out.println(this.name+" 's borrowed books info : ");
         for(int i=0;i<5;i++){
             if(borrowedBooks[i]!= null){
                  System.out.println((i+1)+"- "+borrowedBooks[i].getTitle()+" by "+borrowedBooks[i].getAuthor());
             }
         }
     }
          
}

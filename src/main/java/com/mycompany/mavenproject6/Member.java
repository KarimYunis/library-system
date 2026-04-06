/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author user
 */
public class Member {
    protected String name;
    protected int memberID;
    protected Book borrowedBooks[];
    protected int numbooks=0;
    
    //---------constructors----------------- 
    
    
     Member(String name,int memberID){
         setName(name);
         setMemberID(memberID);
         borrowedBooks = new Book[5];
     }
     //-----------setters----------
     
     public void setName(String name){
         if(name.length()==0){
             System.out.println("invalid name");
         }
         else this.name = name;
     }
     
     
     public void setMemberID(int memberID){
         if(memberID<=0){
             System.out.println("invalid ID");
         }
         else{
              this.memberID = memberID;
             }
     }
     
     
     public void setBorrowedBooks(Book arr[]){
         if(arr.length > borrowedBooks.length){
             System.out.println("the entered array's size is invalid");
         }
         else{
             for(int i=0;i<arr.length;i++){
                 borrowedBooks[i]=arr[i];
             }
         }
     }
     
     //----------getters-------------
     
     public String getName(){
         return name;
     }
     
     
     public int getMemberID(){
         return memberID;
     }
     
     
     public Book[] getBorrowedbooks(){
         return borrowedBooks;
         
     }
    //---------------method------------------
     
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
     
     public void returnbook(Book book){
         for(int i =0;i<borrowedBooks.length;i++){
             if(borrowedBooks[i]==book){
                 for(int j =i;j<borrowedBooks.length-1;j++){
                     borrowedBooks[j]=borrowedBooks[j+1];
                 }
                 borrowedBooks[borrowedBooks.length-1]=null;
            }
         }  
     }
     
     public void displayBorrowedBooks(){
         
         System.out.println(this.name+" 's borrowed books info : ");
         for(int i=0;i<5;i++){
             if(borrowedBooks[i]!= null){
                  System.out.println((i+1)+"- "+borrowedBooks[i].getTitle()+" by "+borrowedBooks[i].getAuthor());
             }
         }
     }
     //-----more fixtures-------------
     
     public int getNumbookedBooks(){
        for(int i =0;i<borrowedBooks.length;i++){
            if(borrowedBooks[i]!= null){
                numbooks++;
            }
        }
         return numbooks;
     }
     
     public void UserDetails(){
         System.out.println("Name: "+this.getName());
         System.out.println("User ID: "+this.getMemberID());
         System.out.println("number of booked books: "+this.numbooks);
     }
     
}

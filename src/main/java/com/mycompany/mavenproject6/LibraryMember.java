/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author user
 */
public abstract class LibraryMember {
    protected String name;
    protected int memberID;
    protected Book borrowedBooks[];
    protected int numbooks;
    protected int daysnumber;
    
    // ----constructors----
    
    LibraryMember(String name,int memberID){
         setName(name);
         setMemberID(memberID);
         this.borrowedBooks = new Book[5];
     }
    //----setters-------
    
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
     
     //---getters-------
      
     public String getName(){
         return name;
     }
     
     
     public int getMemberID(){
         return memberID;
     }
     
     
     public Book[] getBorrowedbooks(){
         return borrowedBooks;
         
     }
     
     //--- abstract methods-----
        
     public abstract void borrowbook(Book book);
     
     public abstract void displayBorrowedBooks();

     
     //---concrete methods-------
     
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
         System.out.println("number of booked books: "+getNumbookedBooks());
         System.out.println("the number of "+this.name+" days in the library : "+this.getDays());
        
     }
     
     public void setDays(int num){
         this.daysnumber=num;
     }
     public int getDays(){
         return daysnumber;
     }

}

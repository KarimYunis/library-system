/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author user
 */
public class PremiumMember extends LibraryMember{
    private int bonusPoints;
    private static int premiumMemberCounter =0;
    
    //-------------constructor-----------
    
    PremiumMember(String name,int memberID){
        super(name , memberID);
        premiumMemberCounter++;
        
    }
    //-------------setters----------------
    
    public void setBonus(int bonusPoints){
        if(bonusPoints<=0){
            System.out.println("invalid bonus");
        }
        else this.bonusPoints = bonusPoints; 
    }
    //------------getters---------------
    
    public int getBonus(){
        return bonusPoints;
    }
    
//------------ abstract methods implemenation -------------
 @Override
     public void borrowbook(Book book){
         boolean rejectance = true;
         for(int i =0;i<this.borrowedBooks.length;i++){
             if(borrowedBooks[i]==null){
                 borrowedBooks[i]= book;
                 this.addBonusPoints(1);
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
         System.out.println("the total bonus points of "+this.name+": ");
         System.out.println(this.getBonus());
     }    

//------------- methods --------------
    
        public void addBonusPoints(int bonusPoints){
         this.bonusPoints += bonusPoints;
        }
        
        public  static int getPremiumMembersNumber(){
            return premiumMemberCounter;
        }
}


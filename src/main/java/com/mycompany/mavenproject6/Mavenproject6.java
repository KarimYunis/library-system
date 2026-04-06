/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
    
package com.mycompany.mavenproject6;

/**
 *
 * @author user
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        
        // task 1 
        
        Book book1 = new Book("Data Structures & Algorithms","Karim Yunis",168);
        Book book2 = new Book("Medicine","Ibn Sena",198);
        Book book3 = new Book("Physics","Ibn Sena",68);
        Book book4 = new Book("Science","Spiderman",768);
        Book book5 = new Book("OOP","karim",178);
                    
        PremiumMember karim = new PremiumMember("karim",1982);
        
        Book arrkarim[] ={book1,book2,book3,book4,book5};
        
        karim.setBorrowedBooks(arrkarim);
        karim.displayBorrowedBooks();
        
        karim.borrowbook(book3);
        karim.displayBorrowedBooks();
        
        karim.returnbook(book3);
        karim.displayBorrowedBooks();
        
        karim.setBonus(20);
        karim.addBonusPoints(20);
        System.out.println(karim.getBonus());
        
        PremiumMember user2 = new PremiumMember("user2",192);
        PremiumMember user3 = new PremiumMember("user3",182);
        
        System.out.println(PremiumMember.getPremiumMembersNumber());
        
        Book borrowed[]=karim.getBorrowedbooks();
        for(Book x : borrowed){
            if(x!=null){
                System.out.println(("-"+x.getTitle()+" by "+x.getAuthor()));
            }
        }
        System.out.println(karim.getNumbookedBooks());
        karim.UserDetails();
        

//--------- task 2 ----------

//        Book b1 = new Book("footabll","messi",1);
//        Book b2 = new Book("Medicine","Ibn Sena",198);
//        Book b3 = new Book("Physics","Ibn Sena",68);
//        Book b4 = new Book("Science","Spiderman",768);
//        Book b5 = new Book("OOP","karim",178);
//        
//        Book bookarray[]={b1,b2,b3,b4,b5};
//        
//        Member member1 = new Member("normal user",4465);
//        PremiumMember user = new PremiumMember("karim",111);
//        
//        user.setBorrowedBooks(bookarray);
//        user.setBonus(9);
//       
//        user.addBonusPoints(1);
//        user.displayBorrowedBooks();
//        
//        
//        
//        user.returnbook(b3);
//        user.returnbook(b5);
//        user.displayBorrowedBooks();
//        
//        user.borrowbook(b3);
//        user.displayBorrowedBooks();
//        
//        user.setDays(5);
//        user.UserDetails();
//        
//        
//        
//        
//        
//        member1.setBorrowedBooks(bookarray);
//        member1.displayBorrowedBooks();
//        
//        
//        
//        member1.returnbook(b3);
//        member1.returnbook(b5);
//        member1.displayBorrowedBooks();
//        
//        member1.borrowbook(b3);
//        member1.displayBorrowedBooks();

        
        
    }
}

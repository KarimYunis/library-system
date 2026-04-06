/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author user
 */
public class PremiumMember extends Member {
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
    
    //-------------methods--------------
    
        public void addBonusPoints(int bonusPoints){
         this.bonusPoints += bonusPoints;
        }
        
        public  static int getPremiumMembersNumber(){
            return premiumMemberCounter;
        }
}


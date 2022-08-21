//Name   : Fernando Duffoo  
//Date   : 06/19/2022
//Course : CSC1231
//Project: 03

import java.util.*;

public class Fernando_Duffoo_Project03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score (0-100):");
        int score = sc.nextInt();
        
        if(score < 0 | score > 100){ //setting validation
            System.out.println("Error message: enter a numeric value (0-100)"); //error message for invalid input
            System.exit(0);
        }
        switch(score/10){ //switch branching
            case 10:
                System.out.println("Your grade is: A");
                break;
            case 9:
                System.out.println("Your grade is: A");
                break;
            case 8:
                System.out.println("Your grade is: B");
                break;
            case 7:
                System.out.println("Your grade is: C");
                break;
            case 6:
                System.out.println("Your grade is: D");
                break;
            case 5:
                System.out.println("Your grade is: F");
                break;
            case 4:
                System.out.println("Your grade is: F");
                break;
            case 3:
                System.out.println("Your grade is: F");
                break;
            case 2:
                System.out.println("Your grade is: F");
                break;
            case 1:
                System.out.println("Your grade is: F");
                break;
            }
        }
    }
        //if-else branching                        
        //else if(score >= 90){
        //    System.out.println("Your grade is: A");
        //}
        //else if(score >= 80 & score < 90){
        //    System.out.println("Your grade is: B");
        //}
        //else if(score >= 70 & score < 80){
        //    System.out.println("Your grade is: C");
        //}
        //else if(score >= 60 & score < 70){
        //    System.out.println("Your grade is: D");
        //}
        //else if (score >= 50 & score < 60){
        //    System.out.println("Your grade is: F");
        //}
        //else{
        //    System.out.println("Your grade is: F");
        //}

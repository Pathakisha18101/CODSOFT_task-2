/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codesoft_q2;


import java.util.Scanner;

public class Codesoft_q2 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________Codsoft task 2_________________");
        while(true)
        {
           
            System.out.println("Enter the marks of subject 1:");
            int mark1sub = scanner.nextInt();
            System.out.println("Enter the marks of subject 2:");
            int mark2sub = scanner.nextInt();
            System.out.println("Enter the marks of subject 3:");
            int mark3sub = scanner.nextInt();
            System.out.println("Enter the marks of subject 4:");
            int mark4sub = scanner.nextInt();
            System.out.println("Enter the marks of subject 5:");
            int mark5sub = scanner.nextInt();
            int total_marks = mark1sub + mark2sub + mark3sub + mark4sub + mark5sub;
            System.out.println("Total marks : " + total_marks);
            int perc = total_marks/5;
            System.out.println("Percentage : " + perc + "%");
            if(perc <= 100 && perc >= 80)
            {
               System.out.println("your Grade is A"); 
            }
            else if(perc <= 79 && perc >= 70)
            {
                System.out.println("your Grade is B"); 
            }
            else if(perc <= 69 && perc >= 50)
            {
                System.out.println("your Grade is C"); 
            }
            else if(perc <= 59 && perc >= 40)
            {
                System.out.println("your Grade is D"); 
            }   
            else
            {
             System.out.println("You are Fail");    
            }    
                
            System.out.println("Do you want to enter more again? (yes/no)");
            String entermore = scanner.next();

            if (!entermore.equalsIgnoreCase("yes")) {
                break;
            }
            
        }
        
        
    }
    
}

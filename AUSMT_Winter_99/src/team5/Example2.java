/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5;

import java.util.Scanner;
/**
 *
 * @author Rayamin
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiliseconds;
        int hours,minutes,seconds,miliseconds;
        
        System.out.print("Please enter total msec's:");
        totalMiliseconds = input.nextInt();
        
        miliseconds=totalMiliseconds%1000;
        seconds=totalMiliseconds/1000;
        
        minutes=seconds/60;
        seconds=seconds%60;
        
        hours=minutes/60;
        minutes=minutes%60;
        
        System.out.print("Total"+totalMiliseconds+"ms means it's been working for");
        
        System.out.print(hours +":");
        System.out.print(minutes +":");
        System.out.print(seconds +" ");
        System.out.print(miliseconds +"ms (h:m:s)\n");
    }
    
}
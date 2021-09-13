/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int attemp=4;
        Random random = new Random();
        Scanner scanner = new Scanner (System.in);
        int number = random.nextInt(10);
        System.out.println("программа задумала число от 0 до 9 отгадай!");
  //      for(int i=0; i<5; i++){
        int i=0;
        do{
            int userNumber = scanner.nextInt();
            if(userNumber == number){
                System.out.println("Ты выйграл!!");
                break;
            }else{
                 if (i<attemp){
                      System.out.println("Ты не угадал!");
                 }else{   
                      System.out.println("Число было"+ number);
                 }
            }  
            i++;
        }while(true); 
    }
}
   
        

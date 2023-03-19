/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.calculator;

import java.util.Scanner;

public class BinaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("from binary to number type 1\n from number to binary type 2 ");
        System.out.print("wich type of calculator you choose : ");
        int choise = input.nextInt();
        
  //==============from binary to number==============================================================================
        if(choise == 1){  
        int remain, nbr1, total = 0, brcounter = 1, i = 0;
        System.out.print("Enter your binary number : ");
        int binary = input.nextInt();

        remain = binary % 10;//we take first digit first
        total += remain * brcounter;//brcounter is the number that multiply 1 and 0
        
        //------------binary length----------------------------------------
        //we are checking how many time we do the loop
         nbr1 = binary;
        int length = 0;
        while (i != -1) {
            if (nbr1 < 1) {
                i = -1;
            } else {
                length++;
                nbr1 /= 10;
            }
        }
        
        //----------------real calculator------------------------------------------
        for (i = 0; i < length; i++) {
            binary /= 10;//we remove the didgit that we took
            brcounter *= 2;
            remain = binary % 10;//we take the digit
             total += remain * brcounter;
        }
        //----------------output--------------------------------
        System.out.println("Your result is : " + total);
        }
    //=======================from number to binary====================================================================
        else if(choise == 2){
            System.out.print("Enter your number : ");
            int num = input.nextInt();
            int i = 0;
            while(num > 0){
                if(num%2 == 0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
                num /= 2;
            }
            
            System.out.println("\nread the number <-------- because i dont know how to use arrays (in java) yet :)");
        }
  //===================================wrong number===================================================================      
        else{
            System.out.println("wrong number enter 1 0r 0");
        }
    }

}

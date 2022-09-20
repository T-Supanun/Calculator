/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4Assign;
import java.util.Scanner;
/**
 *
 * @author supanuntinbaanmai
 */
public class Calculator {
    
    public static void main(String[] args)
    {
        Display();
        Calculate();
    }
    
    static void Display()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Calculator!");
        System.out.println("---------------------------------");
        System.out.println("1 : Plus");
        System.out.println("2 : Minus");
        System.out.println("3 : Muliple");
        System.out.println("4 : Divide");
        System.out.println("5 : Modulo");
        System.out.println("6 : Power");
        System.out.println("---------------------------------");
    }
    
    public static void Calculate()
    {
    Scanner sc = new Scanner(System.in);    
    
        int x;
        do
        {
        System.out.print("Choose the number of operator 1 to 6: ");
        x = sc.nextInt();
        System.out.println("---------------------------------");
        }
        while(x != 1 && x != 2 && x != 3 && x != 4 && x != 5 && x != 6);
        
        
        System.out.print("Enter number A : ");
        double a = sc.nextInt();
        System.out.print("Enter number B : ");
        double b = sc.nextInt();
        System.out.println("---------------------------------");
        
        switch(x)
        {
            case 1 : System.out.println("Sum of "+a+" + "+b+" = " +(a+b));
                    break;
            case 2 : System.out.println("Minus of "+a+" - "+b+" = " +(a-b));
                    break;
            case 3 : System.out.println("Multiple of "+a+" x "+b+" = " +(a*b));
                    break;
            case 4 : System.out.println("Divide of "+a+" / "+b+" = " +(a/b));
                    break;
            case 5 : System.out.println("Modulo of "+a+" % "+b+" = " +(a%b));
                    break;
            case 6 : System.out.println("Power of "+a+" ^ "+b+" = " +(Math.pow(a,b)));
                    break;
        }
    }
}

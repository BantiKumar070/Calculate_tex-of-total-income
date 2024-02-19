//define the tex of your total income
package com.company;
import java.util.Scanner;
public class Calculate_tex{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your income");
        float f = sc.nextFloat();
        float a;
        if(f<250000)
        {
            System.out.println("No tex");
        } else if (f>25000 && f<500000) {
            System.out.println("you pay 5% of your income");
            a = f*5/100;
            System.out.println("And that tex is : " +a);
        } else if (f>500000 && f<1000000) {
            System.out.println("you pay 20% of your income");
            a = f*20/100;
            System.out.println("And that tex is : " +a);
        } else {
            System.out.println("you pay 30% of your income");
            a = f*30/100;
            System.out.println("And that tex is :" +a);

        }
    }
}

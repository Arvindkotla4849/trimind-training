package com.trimind.training.day04.home04;

import java.util.Scanner;

public class BakeryRunner
{
    public static void main(String[] args)
    {
     Bakery b = new Bakery();
        System.out.println("list of the flavours");
        System.out.println("1.chocolate moist\t 2.strawBerry\t 3.American Chocolate");
        System.out.println("price list");
        System.out.println("1.(1)kg=25.40\t 2.(2)kg=30.80 3.(3)kg=20.00");
        int n;
        System.out.println("enter no of cake order ");
        Scanner mywish=new Scanner(System.in);
        n=mywish.nextInt();
        for(int i=0;i<n;i++)
            n.order();
        System.out.println(n.toString());

    }
}

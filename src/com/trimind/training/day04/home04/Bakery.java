package com.trimind.training.day04.home04;

import java.util.Scanner;

public class Bakery
{
    public String flavour;
    public String weight;
    public int quantity;
    public double price;

   // Bakery()
    {
        this.flavour="StrawBerry";
        this.weight="1kg";
        this.quantity=1;
    }//
    Bakery(String flavour,String weight,int quantity)
    {
        this.flavour=flavour;
        this.weight=weight;
        this.quantity=quantity;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "flavour='" + flavour + '\'' +
                ", weight='" + weight + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public  void order()
    {
        int mywish;
        System.out.println("enter your choice ");
        Scanner king = new Scanner(System.in);
        mywish=king.nextInt();
        switch (mywish)
        {
            case 1: this.flavour="chocolate moist";
            break;
            case 2:  this.flavour="starwBerry";
            break;
            case 3: this.flavour="American chocolate";
            break;
            default:
                System.out.println("please choose correct option");
        }
        System.out.println("enter weight of cake(1kg,2kg,3kg):");
        String n=mywish.next();
        this.weight=n;
        System.out.println("enter ordered quantity");
    }

}

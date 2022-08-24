package com.company;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value of N and r :");
        int n=in.nextInt();
        int r=in.nextInt();
        while(true) {
            System.out.println("1.nPr 2.nCr 0.Exit");
            int ch = in.nextInt();
            if (ch == 1)
                System.out.println(Npr(n, r));
            else if (ch == 2)
                System.out.println(Ncr(n, r));
            else
                break;
        }
    }
    static int fact(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    static int Npr(int n,int r){
        return (fact(n)/fact((n-r)));
    }
    static int Ncr(int n,int r){
        return (fact(n)/(fact(r)*(fact((n-r)))));
    }
}

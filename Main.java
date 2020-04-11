package com.company;
import java.util.Scanner;
public class Main {
    public static int Euclid(int a, int b)
    {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    }
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Euclid(a, b));
    }
}

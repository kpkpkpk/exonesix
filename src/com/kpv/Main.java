package com.kpv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x/10 == 0 && x>=0){
            System.out.println("DIGIT");
        }else if(x/10 != 0 && x>=0 && x<=99){
            System.out.println("NUM");
        }else{
            System.out.println("OTHER");
        }
    }
}

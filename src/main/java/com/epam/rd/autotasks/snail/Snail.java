package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        int ai = a.nextInt();
        int bi = b.nextInt();
        int hi = h.nextInt();
        int dif = ai-bi;
        int step = 0;
        int ihi=hi;
        if (dif<=0 && hi>ai ){
            System.out.println("Impossible");
        }else{
            for(int i =0;i<=ihi;i++){

                hi=hi-ai;
                if (hi<=0){
                    step=i+1;
                    break;
                }
                hi=hi+bi;
            }
            System.out.println(step);
        }
    }
}

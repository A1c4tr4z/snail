package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        String as = a.nextLine();
        String bs = b.nextLine();
        String hs = h.nextLine();
        int ai = Integer.parseInt(as);
        int bi = Integer.parseInt(bs);
        int hi = Integer.parseInt(hs);
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
            System.out.println(""+step);
        }
    }
}

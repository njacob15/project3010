/*
 Author: Naveen
 Date: 30-Oct-2019
 Decription: write a function, pass in position as input, return the fibonnacci number at that position as output
 */
package com.example.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci
{
    private static final Scanner scanner = new Scanner(System.in);
    private static String PROGRAM_VERSION = "1.0";
    private static String PROGRAM_NAME = "Fibonacci Number";
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Started Program:" + PROGRAM_NAME + " Program Version:" + PROGRAM_VERSION);

            System.out.println("Please Enter the Position to find the Fibonnacci Number:");
            int position = scanner.nextInt();
            //System.out.println("position=" + position);
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long ret = executeFib(position);
            System.out.printf("The fibonnacci number at position %d is %d ",position, ret);

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                scanner.close();
            }catch(Exception Ex){}
        }
    }


    protected static int executeFib(int n)
    {
        ArrayList<Integer> arrList = new ArrayList<>();
        int t1 = 0, t2 = 1, nextTerm = 0;

        for (int i = 1; i <= n + 1; ++i)
        {
            //System.out.printf("%d, ", t1);
            arrList.add(t1);
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }

        //System.out.println(Arrays.deepToString(arrList.toArray()));
        return arrList.get(n);
    }

}


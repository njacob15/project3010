package com.example.reversestring;

import java.util.Scanner;

public class ReverseString
{
    private static final Scanner scanner = new Scanner(System.in);
    private static String PROGRAM_VERSION = "1.0";
    private static String PROGRAM_NAME = "Reverse String";
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Started Program:" + PROGRAM_NAME + " Program Version:" + PROGRAM_VERSION);

            System.out.println("Please Enter a String:");
            String str = scanner.nextLine();
            //System.out.println("position=" + position);
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String ret = reverseString(str);
            System.out.printf("The Reverse String is %s ", ret);

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                scanner.close();
            }catch(Exception Ex){}
        }
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}

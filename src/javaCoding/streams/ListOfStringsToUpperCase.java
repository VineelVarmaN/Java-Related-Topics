package javaCoding.streams;

import java.util.ArrayList;
import java.util.List;

public class ListOfStringsToUpperCase {
    public static void main(String[] args) {
        int n=3;
        boolean isprime=true;
       for(int i=2;i<n;i++)
       {
           if(n%i==0)
           {
               isprime=false;
           }
       }
        if(isprime)
        {
            System.out.println("it is prime");
        }
        else {
            System.out.println("not prime number");
        }

    }
}

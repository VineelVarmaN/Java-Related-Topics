package javaCoding.hackerRank;

import java.io.IOException;
import java.io.*;
import java.util.*;

import static javaCoding.hackerRank.Result1.getDay;
import static takeYouForward.baisctopics.patterns.SymmetricVoidPattern.SCANNER;

class Result {

        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */
        public static String findDay(int month, int day, int year) {
            final int BC = 0;
            Calendar rightNow = Calendar.getInstance();
            System.out.println(rightNow);
            return "";
        }

    }

    public class JavaDateAndTime {
        public static void main(String[] args) throws IOException {
            int month = SCANNER.nextInt();
            int day = SCANNER.nextInt();
            int year = SCANNER.nextInt();
            System.out.println(getDay(month,day,year));
        }
    }

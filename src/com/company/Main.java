package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String compGenNum = Integer.toString(randGen()) + randGen() + randGen() + randGen();
        String userNum;
        System.out.println(compGenNum);
        while (true) {
            System.out.println("Enter a 4 digit number:");
            userNum = input();
            if (userNum != "-1") {
                break;
            }
        }
    }
    public static String input() {
        Scanner input = new Scanner(System.in);
        try {
            int userIn = input.nextInt();
            String userInStr = Integer.toString(userIn);
            if (userInStr.length() == 4) {
                return userInStr;
            }
            else {
                System.out.println("Please enter a valid input\n");
                return "-1";
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid input\n");
            return "-1";
        }
    }
    public static int randGen() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
    public static void numCompare(String compGenNum, String userNum) {
        int[] repeatingNums = {0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {

        }
    }
}

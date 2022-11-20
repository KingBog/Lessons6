package Lessons6.task4;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        task4();

    }
    public static void task4() {
        Scanner scn= new Scanner(System.in);
        String first="i";
        String end="d";
        System.out.println("Input your card");
        String input=scn.next();
        char[] num=input.toCharArray();
        if (num.length==5){
            System.out.println("Корректно");
        }else  {
            System.out.println("Попробуйте еще раз");
            task4();

        }

    }
}

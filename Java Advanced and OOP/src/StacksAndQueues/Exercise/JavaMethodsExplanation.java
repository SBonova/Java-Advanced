package StacksAndQueues.Exercise;

import java.util.Scanner;

public class JavaMethodsExplanation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        welcome();
        multiply(5, 10);
        multiply(2, 3);
        multiply(6, 8);
        divide(66, 11);
        printAMassage();
        int sum = add(5,5);
        String shouting = caps("why are you reading my diary?!");
        System.out.println(shouting);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static void welcome() {
        System.out.println("Welcome to our home");
    }

    public static void multiply(int a, int b){
        System.out.println(a * b);
    }
    public static void divide(int a, int b){
        System.out.println(a/b);
    }

    public static void printAMassage(){
        System.out.println("This is our first method!");
    }

    public static String caps(String s){
        return s.toUpperCase();
    }
}

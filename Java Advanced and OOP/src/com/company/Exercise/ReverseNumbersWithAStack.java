package com.company.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"1 2 3 4 5"
        String input = scanner.nextLine();
        ArrayDeque<Integer>stack = new ArrayDeque<>();
        String[] splitInput = input.split(" ");//["1", "2", "3", "4", "5"]

        for (String element : splitInput) {
            stack.push(Integer.parseInt(element));
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }
}

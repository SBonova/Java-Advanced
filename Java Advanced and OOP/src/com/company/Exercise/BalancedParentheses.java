package com.company.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //проверка дали скобата е отворена или затворена
        String input = scanner.nextLine();//"{{[[(())]]}}"

        ArrayDeque<Character>openBrackets = new ArrayDeque<>();

        boolean areBalanced = false;

        for (int index = 0; index < input.length(); index++) {
            char currentBracket = input.charAt(index);
            //проверка дали скобата е отворена -> ( { [
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                  openBrackets.push(currentBracket);
                //проверка дали скобата е затворена -> ) } ]
            }else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']'){
                //взимам коя е последната отворена -> правя проверка дали съвпада със затворената
                if (openBrackets.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char lastOpenBracket = openBrackets.pop();
                //знам коя е отворената и коя е затворената, трябва да направя провека дали съвпадат
                // () {} []
                if (lastOpenBracket == '(' && currentBracket == ')'){
                      //balanced pair
                    areBalanced = true;
                }else if (lastOpenBracket == '{' && currentBracket == '}'){
                    //balanced pair
                  areBalanced = true;
                }else if (lastOpenBracket == '[' && currentBracket == ']'){
                    //balanced pair
                    areBalanced = true;
                }else {
                    //no balanced
                    areBalanced = false;
                    break;
                }
            }
        }

        //проверка дали всички са балансирани
        if (areBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

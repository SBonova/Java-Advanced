package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> brawser = new ArrayDeque<>();
        String line = scanner.nextLine();
        String currentURL = "";

        while (!line.equals("Home")){

            if (line.equals("back")){
                if (!brawser.isEmpty()){
                    currentURL = brawser.pop();
                }else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
                System.out.println("no previous URLs");
            }else {
                if (!currentURL.equals("")){
                    brawser.push(currentURL);
                }
                currentURL = line;
            }

            System.out.println(currentURL);
            line = scanner.nextLine();
        }

    }
}

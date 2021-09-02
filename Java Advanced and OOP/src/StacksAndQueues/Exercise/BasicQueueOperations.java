package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //FIFO-ПЪРВИЯТ ВЛЯЗЪЛ Е ПЪРВИЯТ ИЗЛЯЗЪЛ

        //N S X
        //сканирай ми до следващият инт
        int n = scanner.nextInt();//колко елемента трябва да добавя -> колко пъти ще изпълня push
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        //n на брой пъти добавяме
        for (int count = 1; count <= n; count++) {
            queue.offer(scanner.nextInt());
        }

        //s на брой пъти pop
        for (int count = 1; count <= s; count++) {
            queue.poll();
        }

        //x- число, за което проверяваме дали е в queue
        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                System.out.println(0);
            }
        }
    }
}



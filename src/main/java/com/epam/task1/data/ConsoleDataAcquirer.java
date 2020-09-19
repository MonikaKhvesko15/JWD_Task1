package com.epam.task1.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {
    public int getIntNumber() {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println(">> ");
        }
        number = scanner.nextInt();
        return number;
    }
}

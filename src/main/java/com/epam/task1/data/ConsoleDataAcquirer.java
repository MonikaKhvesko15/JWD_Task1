package com.epam.task1.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {

    public int getIntNumber() {
        int number;
        String buf;

        Scanner scanner = new Scanner(System.in);

        System.out.print(">> ");

        while (scanner.hasNextInt() == false) {
            buf = scanner.nextLine();
            System.out.println(">> ");
        }
        number = scanner.nextInt();
        return number;
    }
}

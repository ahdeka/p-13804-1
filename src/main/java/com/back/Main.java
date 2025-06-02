package com.back;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = """
                등록
                나의 죽음을 적들에게 알리지 말라.""";

        Scanner scanner = new Scanner(input);

        String cmd = scanner.nextLine();
        String cmd2 = scanner.nextLine();

        System.out.println("명령어: " + cmd);
        System.out.println("명령어2: " + cmd2);
    }
}

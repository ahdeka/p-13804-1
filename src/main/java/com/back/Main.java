package com.back;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lab1();
        lab2();
    }

    private static void lab1() {
        String input = """
                등록
                나의 죽음을 적들에게 알리지 말라.""";

        Scanner scanner = new Scanner(input);

        String cmd = scanner.nextLine();
        String cmd2 = scanner.nextLine();

        System.out.println("명령어: " + cmd);
        System.out.println("명령어2: " + cmd2);
    }

    private static void lab2() {
        System.out.println("안녕하세요.");

        // 기존의 output stream을 저장
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream, true);
        System.setOut(printStream);

        System.out.println("반갑습니다.");
        String str = outputStream.toString();

        // 기존의 output stream으로 복원
        System.setOut(originalOut);

        System.out.println("출력된 내용: " + str);
    }
}

package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        System.out.println("Первый игрок введите число от 1 до 3:");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 1 || matches > Math.min(3, count)) {
                System.out.println(player + " введите число от 1 до " + Math.min(3, count) + ":");
            } else {
                turn = !turn;
                count -= matches;
                System.out.println("Спичек осталось " + count);
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
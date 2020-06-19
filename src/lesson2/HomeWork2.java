package lesson2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Колличество строк: ");
        int x = scanner.nextInt();
        System.out.println("Колличество столбцов: ");
        int y = scanner.nextInt();
        String[][] line = new String[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Введите значение в ячейку (" + i + "," + j + "): ");
                line[i][j] = scanner.next();
            }
        }
        arrSumm(line);
    }

    private static void arrSumm(String[][] line) {
        int sum = 0;
        if (line.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < line.length; i++) {
            if (line[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                enterValue(line[i][j], i, j);
                sum += Integer.parseInt(line[i][j]);
            }
        }
        System.out.println("Сумма равна: " + sum);
    }

    private static void enterValue(String line, int x, int y) {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) < '0' || line.charAt(i) > '9') {
                throw new MyArrayDataException(x, y);
            }
        }
    }
}
package ru.tds.manyfiles;

import java.io.*;

/**
 * Класс для создания текстового файла, содержашего только счастливые номера
 * (сумма левых 3-х цифр равна сумме правых 3-х цифр), на основе файла int6data.dat
 *
 * @author Trushenkov Dmitry 15ОИТ18.
 */
public class ManyFiles3 {
    public static void main(String[] args) throws IOException {
        DataInputStream reader = new DataInputStream(new FileInputStream(new File("int6data.dat")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("txt6data.txt")));
        for (int i = 1; i < 150; i++) {
            int number = reader.readInt();
            if (isLuckyTicket(number)) {
                writer.write(String.valueOf(number));
                writer.write("\r\n");
            }
        }
        reader.close();
        writer.close();
    }

    /**
     * Метод для проверки числа на то, является ли число счастливым билетом.
     *
     * @param number число
     * @return true, если сумма левых 3-х цифр равна сумме правых 3-х цифр.
     */
    private static boolean isLuckyTicket(int number) {
        int number1 = number / 100000;
        int number2 = (number / 10000) % 10;
        int number3 = (number / 1000) % 10 % 10;
        int number4 = (number / 100) % 10 % 10 % 10;
        int number5 = (number / 10) % 10 % 10 % 10 % 10;
        int number6 = number % 10 % 10 % 10 % 10;
        int sum1 = number1 + number2 + number3;
        int sum2 = number4 + number5 + number6;
        return (sum1 == sum2);
    }
}

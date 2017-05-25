package ru.tds.manyfiles;

import java.io.*;

/**
 * Класс для создания текстового файла, содержашего только счастливые билеты
 * (сумма левых 3-х цифр равна сумме правых 3-х цифр), на основе файла int6data.dat
 *
 * @author Trushenkov Dmitry 15ОИТ18.
 */
public class ManyFiles3 {
    public static void main(String[] args) throws IOException {
        DataInputStream reader = new DataInputStream(new FileInputStream(new File("int6data.dat")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("txt6data.txt")));
        while (reader.available() > 0) {
            int number = reader.readInt();
            if (isCheckup(number)) {
                writer.write(String.valueOf(number));
                writer.write("\r\n");
            }
        }
        reader.close();
        writer.close();
    }

    /**
     * Метод для проверки числа на то, является ли оно счастливым билетом или нет.
     *
     * @param number число
     * @return true, если сумма левых 3-х цифр равна сумме правых 3-х цифр.
     */
    private static boolean isCheckup(int number) {
        return sum(number / 1000) == sum(number % 1000);
    }

    /**
     * Метод, который считает сумму трех чисел
     *
     * @param number трехзначое число
     * @return сумма чисел трехзначного числа
     */
    private static int sum(int number) {
        return number%10 + number/10%10 + number/100%10;
    }
}


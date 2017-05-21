package ru.tds.manyfiles;

import java.io.*;

/**
 * Класс для формирования файла int6data.dat, содержащего только шестизначные целые числа, на основе исходного файла с целыми числами.
 *
 * @author Trushenkov Dmitry 15ОИТ18.
 */
public class ManyFiles2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("int6data.dat")));
        BufferedReader reader = new BufferedReader(new FileReader(new File("intdata.txt")));
        for (int i = 1; i < 12; i++) {
            String number = reader.readLine();
            if (isCheck(number)) {
                writer.write(number);
                writer.write("\r\n");
            }
        }
        reader.close();
        writer.close();
    }

    /**
     * Метод для проверки и выбора из исходного файла целых чисел только четырех, пяти и шестихначных чисел.
     *
     * @param number число
     * @return четырех, пяти или шестизначное число
     */
    private static boolean isCheck(String number) {
        return (Integer.parseInt(number) < 1000000 && (Integer.parseInt(number) > 999));
    }
}

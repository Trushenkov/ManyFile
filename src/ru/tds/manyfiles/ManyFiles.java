package ru.tds.manyfiles;

import java.io.*;
import java.util.Random;

/**
 * Класс для создания файла целых чисел intdata.dat программным путём и заполнения его с помощью рандома.
 *
 * @author Трушенков Дмитрий 15ОИТ18
 */
public class ManyFiles {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        DataOutputStream writeNumbers = new DataOutputStream(new FileOutputStream(new File("intdata.dat")));
        for (int i = 1; i < 150; i++) {
            writeNumbers.writeInt(random.nextInt(999999));
        }
        writeNumbers.close();
    }
}


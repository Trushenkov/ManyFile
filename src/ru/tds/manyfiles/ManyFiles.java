package ru.tds.manyfiles;

import java.io.*;
import java.util.Random;

/**
 * Программа "Много файлов." Реализовано независимо работающие классы для решения отдельных этапов задачи.
 *
 * @author Трушенков Дмитрий 15ОИТ18
 */
public class ManyFiles {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        DataOutputStream writeNumbers = new DataOutputStream(new FileOutputStream(new File("intdata.dat")));
        for (int i = 0; i < 35; i++) {
            writeNumbers.writeInt(random.nextInt(999999));
        }
        writeNumbers.close();
    }
}


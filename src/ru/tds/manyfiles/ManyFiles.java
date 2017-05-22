package ru.tds.manyfiles;

import java.io.*;
import java.util.Random;

/**
 * Класс для создания файла целых чисел intdata.dat программным путём.
 *
 * @author Трушенков Дмитрий 15ОИТ18
 */
public class ManyFiles {
    public static void main(String[] args) throws IOException {
        DataOutputStream writer = new DataOutputStream(new FileOutputStream(new File("intdata.dat")));
        BufferedReader reader = new BufferedReader(new FileReader(new File("intdata.txt")));
        String string;
        while ((string = reader.readLine()) != null) {
            writer.writeInt(Integer.valueOf(string));
        }
        reader.close();
        writer.close();
    }
}


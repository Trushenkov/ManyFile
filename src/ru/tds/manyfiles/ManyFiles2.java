package ru.tds.manyfiles;

import java.io.*;

/**
 * @author Trushenkov Dmitry 15ОИТ18.
 */
public class ManyFiles2 {
    public static void main(String[] args) throws IOException {
        DataOutputStream writer = new DataOutputStream(new FileOutputStream(new File("int6data.dat")));
        DataInputStream reader = new DataInputStream(new FileInputStream(new File("intdata.dat")));
        for (int i = 0; i < 35; i++) {
            int number = reader.readInt();
            if (isSixNumber(number)) {
                writer.writeInt(number);
            }
        }
        reader.close();
        writer.close();
    }

    private static boolean isSixNumber(int number) {
        return (number < 1000000 && number > 999);
    }
}

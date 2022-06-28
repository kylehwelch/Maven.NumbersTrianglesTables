package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(4);

    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder str = new StringBuilder();

        for (int a = 1; a <= tableSize; a++) {
            for (int b = 1; b <= tableSize; b++) {
                str.append(String.format("%3d |",a*b));
            }
            str.append("\n");
        }
        return str.toString();    }
}

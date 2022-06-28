package io.zipcoder.microlabs.mastering_loops;

//USE STRING BUILDER
//CALL YOUR OWN CODE (do getRow first)

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder str = new StringBuilder();
        for (int y = 1; y < numberOfRows; y++) {
            str.append(getRow(y));
            str.append("\n");
        }
        return str.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder str = new StringBuilder();
        for (int x = 1; x <= numberOfStars; x++) {
            str.append("*");
        }
        return str.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}

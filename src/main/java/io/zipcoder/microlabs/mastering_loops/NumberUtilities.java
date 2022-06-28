package io.zipcoder.microlabs.mastering_loops;



//EVEN SMARTER WOULD BE TO JUST CALL CODE THAT IS ALREADY
// WRITTEN IN ANOTHER MODULE, RATHER THAN WRITE IT ALL AGAIN


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        //DELETED ORIGINAL CODE.  THIS IS A BASIC USE OF STRING BUILDER
        StringBuilder str = new StringBuilder();
        for (int z = start; z < stop; z++) {
            if (z % 2 == 0) {
                str.append(z);
            }
        }
        return str.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int z = start; z < stop; z++) {
            if (z % 2 == 1) {
                str.append(z);
            }
        }
        return str.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for (int x = start; x < stop; x += step) {

            str.append(x*x);
        }
        return str.toString();
    }

    public static String getRange(int stop) {
        String rangeStop = "";
        for (int x = 0; x < stop; x++) {
            rangeStop += x;
        }
        return rangeStop;
    }

    public static String getRange(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++) {
            str.append(i);
        }
        return str.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i+= step) {
            str.append(i);
        }
        return str.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder str = new StringBuilder();
        for (int x = start; x < stop; x += step) {
            int y = (int) Math.pow(x, exponent);
            str.append(y);
        }
        return str.toString();
    }
}

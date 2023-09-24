package package1;

import static java.lang.Integer.parseInt;

public class ArrayValueCalculator {

    public int doCalc(String[][] arr) throws ArraySizeException {
        int sum = 0;

        if (arr.length != 4 || arr[0].length != 4 || arr[1].length != 4) {
            throw new ArraySizeException("Not allowed size of array!");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j, arr[i][j], e);
                }
            }

        }
        return sum;
    }
}

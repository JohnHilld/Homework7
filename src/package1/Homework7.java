package package1;

public class Homework7 {

    private static void test(ArrayValueCalculator ar, String[][] arr, String name) {
        System.out.println("------------------"+name+" array------------------");
        try {
            System.out.println("Sum is " + ar.doCalc(arr));
        } catch (ArraySizeException e) {
            System.out.println(e);
        } catch (ArrayDataException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        String[][]  arr1 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][]  arr2 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}};

        String[][]  arr3 = {{"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}};

        String[][]  arr4 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "к"},
                {"9", "10", "B", "12"},
                {"13", "14", "15", "16"}};

        ArrayValueCalculator calc = new ArrayValueCalculator();

        test(calc, arr1, "First");
        test(calc, arr2, "Second");
        test(calc, arr3, "Third");
        test(calc, arr4, "Fourth");

    }
}

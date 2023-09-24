package package1;

public class ArraySizeException extends Exception {
    private String msg;
    public ArraySizeException(String s) {
        msg = s;
    }

    @Override
    public String toString() {
        return msg;
    }
}

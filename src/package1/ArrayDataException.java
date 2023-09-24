package package1;

public class ArrayDataException extends NumberFormatException {
    private int col, row;
    private String arrEr;
    NumberFormatException cause;
    public ArrayDataException(int a, int b, String s, NumberFormatException cause) {
        row = a;
        col = b;
        arrEr = s;
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "Value in row["+(row+1)+"], col["+(col+1)+"] is \'"+arrEr+"\'. But must be integer!\n" + cause;
    }
}

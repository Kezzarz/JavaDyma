package LesBasesDuJava;
public class debugger {
    public static void main(String[] args) {
        var result1 = 10.0 / 0;
        var result2 = 10.0 / Double.NaN;
        var result3 = 10.0 / Double.NEGATIVE_INFINITY;
        var result4 = 10.0 / Double.POSITIVE_INFINITY;
        var result5 = Double.NEGATIVE_INFINITY / 0;
        var result6 = Double.POSITIVE_INFINITY / 0;

        System.out.println("End");
    }
}

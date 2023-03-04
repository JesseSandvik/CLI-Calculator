import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[] operators = new char[4];
        double[] leftValues = new double[operators.length];
        double[] rightValues = new double[operators.length];
        double[] results = new double[operators.length];
    }

    static double[] generateRandomDoublesForArray(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            Random randomDouble = new Random();
            doubleArray[i] = randomDouble.nextDouble();
        }
        return doubleArray;
    }
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[] operators = {'a', 's', 'm', 'd'};
        double[] leftValues = new double[operators.length];
        double[] rightValues = new double[operators.length];
        double[] results = new double[operators.length];

        for (int i = 0; i < operators.length; i++) {
            results[i] = execute(operators[i], leftValues[i], rightValues[i]);
            System.out.println(leftValues[i] + operators[i] + rightValues[i] + "=" + results[i]);
        }
    }

    private static double execute(char operator, double leftValue, double rightValue) {
        double result = 0.0d;
        switch(operator) {
            case 'a':
                result = leftValue + rightValue;
                break;
            case 's':
                result = leftValue - rightValue;
                break;
            case 'm':
                result = leftValue * rightValue;
                break;
            case 'd':
                result = leftValue / rightValue;
                break;
            default:
                result = 0.0d;
                break;
        }
        return result;
    }

    static double[] generateRandomDoublesForArray(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            Random randomDouble = new Random();
            doubleArray[i] = randomDouble.nextDouble();
        }
        return doubleArray;
    }
}
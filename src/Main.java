import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        String[] operations = {"add", "subtract", "multiply", "divide"};
        double[] leftValues = new double[operations.length];
        double[] rightValues = new double[operations.length];
        double[] results = new double[operations.length];
        String matchingOperator = "";

        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                hashtable.put(i, args[i]);
                int operationsPointerIndex = 0;

                while (operationsPointerIndex < operations.length) {
                    if (args[i].toLowerCase().equals(operations[operationsPointerIndex])) {
                        matchingOperator = operations[operationsPointerIndex];
                        break;
                    } else {
                        operationsPointerIndex++;
                    }
                }
            }

            Enumeration<Integer> hashtableKeys = hashtable.keys();

            while (hashtableKeys.hasMoreElements()) {
                int nextHashtableKey = hashtableKeys.nextElement();
                System.out.println("Key: " + nextHashtableKey + " | Value: " + hashtable.get(nextHashtableKey));
            }
        } else {
            generateRandomDoublesForArray(leftValues);
            generateRandomDoublesForArray(rightValues);
        }

        for (int i = 0; i < operations.length; i++) {
            results[i] = execute(operations[i], leftValues[i], rightValues[i]);
            System.out.println(leftValues[i] + " " + operations[i] + " " + rightValues[i] + " = " + results[i]);
        }
    }

    static char getSymbolForOperator(String operator) {
        String[] operations = {"add", "subtract", "multiply", "divide"};
        char[] symbols = {'+', '-', '*', '/'};
        char matchingSymbol = ' ';

        for (int i = 0; i < operations.length; i++) {
            if (operator.equals(operations[i])) {
                matchingSymbol = symbols[i];
                break;
            }
        }
        return matchingSymbol;
    }

    private static double execute(String operator, double leftValue, double rightValue) {
        double result = 0.0d;
        switch(operator) {
            case "add":
                result = leftValue + rightValue;
                break;
            case "subtract":
                result = leftValue - rightValue;
                break;
            case "multiply":
                result = leftValue * rightValue;
                break;
            case "divide":
                result = leftValue / rightValue;
                break;
            default:
                result = 0.0d;
                break;
        }
        return result;
    }

    static void generateRandomDoublesForArray(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            Random randomDouble = new Random();
            doubleArray[i] = randomDouble.nextDouble();
        }
    }
}
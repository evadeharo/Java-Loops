import java.util.Arrays;

public class MultiplyArray {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        int finalResult[] = new int[5];

        for (int i=0; i < numbers.length-1; i++) {
            int extractedValues = numbers[i]*numbers[i+1];
            finalResult[i] = extractedValues;
        }

        int lastPosition = numbers[numbers.length-1] * numbers[0];
        finalResult[numbers.length-1] = lastPosition;

        System.out.println("input: " + Arrays.toString(finalResult));

        // Inverted array
        System.out.println("--INVERTED ARRAY--");
        int[] invertedArray = new int[numbers.length];

        for (int i=0; i < numbers.length; i++) {
            int index = numbers.length-1;
            invertedArray[i] = numbers[index-i];
        }
        for (int number: invertedArray) {
            System.out.println(number);
        }
    }
}

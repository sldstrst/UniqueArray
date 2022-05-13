import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11, 3};
        int arraySize = getSizeArray(numbers);
        int[] result = new int[arraySize];
        result = getUnique(numbers);
        System.out.println(Arrays.toString(result));
        //result = {11, 12, 10, 5, 4, 44, 100, 3}
    }

    static int[] getUnique(int[] numbers) {
        int arraySize = getSizeArray(numbers);
        int[] resultArray = new int[arraySize];
        int k = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                resultArray[k] = numbers[i];
                k++;
            }
        }

        return resultArray;
    }

    private static int getSizeArray(int[] numbers) {
        int size = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) size++;
        }
        return size;
    }
}
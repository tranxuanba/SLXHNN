import java.util.Arrays;

public class RecursiveAlgorithm {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 6, 63, 4, 6, 6, 2, 4, 5, 7};
        Arrays.sort(array);
        System.out.println("gia tri can tim la: ");
        RecursiveAlgorithm sb = new RecursiveAlgorithm();
        System.out.println(sb.binarySearch(array, 0, (array.length - 1), 4));
    }

    public int binarySearch(int[] array, int left, int right ,int value) {
        int middle;
        middle = (left+right)/2;
        if (left > right) return -1;
        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            binarySearch(array, middle+1, right, value);
        }else {
            binarySearch(array, left, middle-1, value);
        }
        return middle;
    }
}

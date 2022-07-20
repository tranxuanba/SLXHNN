import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao chuoi bat ky:");
        String text = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < text.length(); i++) {
            int ascii = (int) text.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("ky tu co tan suat hien nhieu nhat la: " + character);
    }
}

package Contest_letters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest_letters {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letters;
        String numbers;
        int fig = Integer.parseInt(reader.readLine());
        while (true) {
            if (fig > 0 && fig < Math.pow(10, 6)) {
                letters = reader.readLine();
                while (true) {
                    if (fig != letters.length()) {
                        letters = reader.readLine();
                    } else break;
                }
                break;
            } else fig = Integer.parseInt(reader.readLine());
        }
        numbers = reader.readLine();
        String[] str = numbers.split(" ");

        while (true) {
            if (fig != str.length) {
                numbers = reader.readLine();
                str = numbers.split(" ");
            } else break;
        }
        for (String s : str) {
            if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > Math.pow(10, 8)) {
                numbers = reader.readLine();
                str = numbers.split(" ");
            }
        }
        int[] Num = new int[fig];
        for (int i = 0; i < fig; i++) {
            Num[i] = Integer.parseInt(str[i]);
        }
        int check = Num[0];
        int check2 = 0;
        for (int i = 1; i < Num.length; i++) {
            if (check <= Num[i] - Num[i - 1]) {
                check = Num[i] - Num[i - 1];
                check2 = i;
            }
        }
        System.out.println(letters.charAt(check2));
    }
}

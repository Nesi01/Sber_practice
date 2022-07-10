package other;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

    public static void waitEnter() {
        System.out.println("Нажмите Enter для продолжения");
        try {
            Input.str();
        } catch (Exception e) {

        }
    }

    public static boolean isRandom() {
        boolean random = true;
        System.out.println("Сгенерировать случайные значения?");
        System.out.println("[1] - да");
        System.out.println("[0] - ввести в ручную");
        int choice = Input.number();
        if (choice == 0) random = false;
        return random;
    }

    public static String str() {
        String inp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            inp = s;
        } catch (Exception e) {
            System.out.println(e);
            inp = "0";
        }
        return inp;
    }

    public static int number() {
        return Integer.parseInt(Input.str());
    }

    public static int[] randArray(int a, int b) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = (int) (Math.random() * (b + 1));
        }
        return arr;
    }

    public static int[] randArray(int a) {
        return Input.randArray(a, 10);
    }

    //a,b - размерность массива, c - максимальное значение элементов
    public static int[][] randArrayTwoDim(int a, int b, int c) {
        int[][] arr = new int[a][b];
        int[] arr1;
        for (int i = 0; i < a; i++) {
            arr1 = Input.randArray(b, c);
            System.arraycopy(arr1, 0, arr[i], 0, b);
        }
        return arr;
    }

    public static int[][] randArrayTwoDim(int a, int b) {
        return Input.randArrayTwoDim(a, b, 10);
    }

    public static int[] arrayOne(int a) {
        String str = Input.str();

        String buffer = "";
        int[] arr = new int[a];
        for(int i = 0, j=0;i<str.length()&&j<a;i++) {
            if(str.charAt(i)!=' ') {
                buffer = buffer + str.charAt(i);
                if(i==str.length()-1) arr[j] = Integer.parseInt(buffer);
            }
            else {
                arr[j] = Integer.parseInt(buffer);
                buffer = "";
                j++;
            }

        }
        return arr;

    }
    public static int[][] arrayTwoDim(int a, int b) {
        int[][] arr = new int[a][b];
        for(int i=0;i<a;i++) {
            arr[i] = Input.arrayOne(b);
        }
        return arr;
    }
}

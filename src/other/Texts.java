package other;

import java.util.Arrays;

public class Texts {
    public static void menu() {
        System.out.println("Введите число для выбора задания.");
        System.out.println("[1] - Задание 1");
        System.out.println("[2] - Задание 2");
        System.out.println("[4] - Задание 4");
        System.out.println("[5] - Задание 5");
        System.out.println("[6] - Задание 6");
        System.out.println("[9] - Задание 9");
        System.out.println("[0] - Выход");
    }

    public static void Task1() {
        System.out.println("Составьте программу для расчета суммы целых чисел от 1 до 100");
    }

    public static void Task2() {
        System.out.println("Дана матрица чисел 5х5. Составьте программу для расчета суммы элементов\n" +
                "главной диагонали. (от левого верхнего к правому нижнему углу)");
    }

    public static void Task4() {
        System.out.println("Дана матрица чисел 5Х5. Составьте программу для расчета среднего арифметического\n" +
                "элементов главной и побочной диагонали.");
    }

    public static void Task5() {
        System.out.println("Дан массив чисел из 3-х  элементов. Составьте программу для вычисления значения минимального элемента.\n" +
                "(Попытайтесь учесть тот факт, что минимальных элементов может быть несколько)");
    }

    public static void Task6() {
        System.out.println("Дан массив чисел из 10-ти  элементов. Составьте программу для вычисления  значения и индекса минимального элемента.\n" +
                "(Попытайтесь учесть тот факт, что минимальных элементов может быть несколько)");
    }

    public static void Task9() {
        System.out.println("Выведите таблицу размерности N (размерность вводится с клавиатуры), заполненную числами от 1 до n^2 по спирали,\n" +
                "выходящей из левого верхнего угла и закрученной по часовой стрелки.");
    }

    public static void ArrayOutput(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void ArrayOutput(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

}

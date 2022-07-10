package tasks;

import other.Input;
import other.Texts;

public class Task2 {
    public Task2() {
        int[][] arr;
        Texts.Task2();
        if(Input.isRandom()) {
            System.out.println("Исходная матрица:");
            arr = Input.randArrayTwoDim(5,5);
            Texts.ArrayOutput(arr);
        }
        else {
            arr = Input.arrayTwoDim(5,5);
            System.out.println("Исходная матрица:");
            Texts.ArrayOutput(arr);
        }

        //Решение
        int sum = 0;
        for(int i=0;i<5;i++){
            sum+=arr[i][i];
        }
        System.out.print("Сумма: ");
        System.out.println(sum);
    }
}

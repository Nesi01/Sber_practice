package tasks;

import other.Input;
import other.Texts;

public class Task4 {
    public Task4(){
        int[][] arr;
        Texts.Task4();
        if(Input.isRandom()) {
            System.out.println("Исходная матрица:");
            arr = Input.randArrayTwoDim(5,5);
            Texts.ArrayOutput(arr);
        }
        else {
            System.out.println("Введите построчно:");
            arr = Input.arrayTwoDim(5,5);
            System.out.println("Исходная матрица:");
            Texts.ArrayOutput(arr);
        }

        int sum = 0;
        int count = 0;
        for(int i=0;i<5;i++){
            sum+=arr[i][i];
            sum+=arr[4-i][i];
            count+=2;
        }
        sum -= arr[2][2];
        double aver = sum;

        aver = aver/(count-1);

        System.out.format("Среднее арифметическое: %.2f\n",aver);
    }
}

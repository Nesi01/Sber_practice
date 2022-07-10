package tasks;

import other.*;

public class Task9 {
    public Task9(){
        Texts.Task9();
        System.out.print("Введите размерность: ");
        int n;
        n = Input.number();
        int[][] arr = new int[n][n];
        int i = 0;
        int j = 0;
        for(int k = 1;k<=n*n;k++) {
            arr[i][j]=k;
            if(i<=j+1 && i+j<n-1) j++;
            else if (i<j && i+j>=n-1) i++;
            else if (i>=j && i+j>n-1) j--;
            else if(i>j+1 && i+j<=n-1) i--;
        }


        System.out.println("Таблица:");
        Texts.ArrayOutput(arr);
    }
}

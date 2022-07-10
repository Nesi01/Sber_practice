package tasks;

import other.Input;
import other.Texts;

public class Task5 {
    public Task5(){
        int[] nums;
        int n = 3;
        int min, count;
        Texts.Task5();
        System.out.println("Введите три числа:");
        nums = Input.arrayOne(n);
        min = nums[0];
        count = 1;
        for(int i=1;i<n;i++) {
            if(nums[i]<min) {
                min = nums[i];
                count = 1;
            } else if (min==nums[i]) {
                count++;
            }
        }

        System.out.println("Минимальное значение: "+ min);
        System.out.println("Количество минимальных элементов: " + count);

    }
}

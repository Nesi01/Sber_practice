package tasks;

import other.Input;
import other.Texts;
import java.util.ArrayList;

public class Task6 {
    public Task6(){
        int[] nums;
        int n = 10;
        ArrayList<Integer> index = new ArrayList<Integer>();
        int min, count;
        Texts.Task6();
        if(Input.isRandom()) {
            System.out.println("Исходный массив:");
            nums = Input.randArray(n);
            Texts.ArrayOutput(nums);
        } else {
            System.out.println("Ввод:");
            nums = Input.arrayOne(n);
            System.out.println("Исходный массив:");
            Texts.ArrayOutput(nums);

        }
        min = nums[0];
        count = 1;
        index.add(0);
        for(int i=1;i<n;i++) {
            if(nums[i]<min) {
                min = nums[i];
                count = 1;
                index.clear();
                index.add(i);
            } else if (min==nums[i]) {
                count++;
                index.add(i);
            }
        }

        System.out.println("Минимальное значение: "+ min);
        System.out.println("Количество минимальных элементов: " + count);
        System.out.print("Индексы минимальных элементов: ");
        System.out.println(index.toString());
    }
}

package tasks;
import other.Texts;

public class Task1 {
    public Task1() {
        Texts.Task1();
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.print("Ответ:");
        System.out.println(sum);
    }
}

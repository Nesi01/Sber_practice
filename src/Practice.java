import other.Input;
import other.Texts;
import tasks.*;

public class Practice {
    public static void main(String[] args) {

        int choice;
        do {
            Texts.menu();
            choice = Input.number();
            switch (choice) {
                case 1:
                    new Task1();
                    Input.waitEnter();
                    break;
                case 2:
                    new Task2();
                    Input.waitEnter();
                    break;
                case 4:
                    new Task4();
                    Input.waitEnter();
                    break;
                case 5:
                    new Task5();
                    Input.waitEnter();
                    break;
                case 6:
                    new Task6();
                    Input.waitEnter();
                    break;
                case 9:
                    new Task9();
                    Input.waitEnter();
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Данный пункт отсутствует");
            }
        } while (choice!=0);
    }
}

<<<<<<< HEAD
public class MyFirstGame {	
    public static void main(String[] args) {
    int inputNumber = 90;
        
    for (int i = 1; i <= 100; i++) {
        if (i > inputNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
    } 
    else if (i < inputNumber) {
        System.out.println("Данное число меньше того, что загадал компьютер");
    }
    else {
        System.out.println("Поздравляем! Вы угадали число " + inputNumber);
        break;
    }         
        }
    }
=======
public class MyFirstGame {	
    public static void main(String[] args) {
    int inputNumber = 90;
        
    for (int i = 1; i <= 100; i++) {
        if (i > inputNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
    } 
    else if (i < inputNumber) {
        System.out.println("Данное число меньше того, что загадал компьютер");
    }
    else {
        System.out.println("Поздравляем! Вы угадали число " + inputNumber);
        break;
    }         
        }
    }
>>>>>>> 7a310e34a241bbf32b378993171f2d70a05d00ce
}
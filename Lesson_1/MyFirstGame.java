public class MyFirstGame {	
    public static void main(String[] args) {
    int setNumber = 90;
        
    for (int i = 1; i <= 100; i++) {
        if (i > setNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (i < setNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляем! Вы угадали число " + setNumber);
            break; 
        }
        }  
    }           
}

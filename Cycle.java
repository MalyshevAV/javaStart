public class Cycle {	
    public static void main(String[] args) {
    	
    for (int i = 0; i <= 20; i++) {
    	System.out.println("Цикл for :" + i);
    }

    int value = - 6;
    while (value <= 6) {
    	value = value + 2; 
        System.out.println("Возвращаем значение Value = " + value);            
    }
    int a = 11;
    int summ = 0;

    do {
    	summ = summ + a;
    	a= a + 2;
    } while (a < 20);
        System.out.println( "Сума нечетных чисел = " + summ);
    }
}
public class Cycle {	
    public static void main(String[] args) {	
        for (int i = 0; i <= 20; i++) {
    	    System.out.println("Цикл for :" + i);
        }

        int counter = -6;
        while (counter <= 6) {
            System.out.println("Возвращаем значение Counter = " + counter); 
            counter += 2;            
        }

        int count = 11;
        int summOdd = 0;
        do {
    	    sumOdd += count;
    	    count += 2;
        } while (count < 20); 
        System.out.println("Сумма нечетных чисел = " + sumOdd);             
    }
}


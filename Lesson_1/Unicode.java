public class Unicode {
    public static void main(String[] args) {
        System.out.println("Юникод числа и символы:\n № Символ");
        for (int i = 33; i < 126; i++) {
            System.out.println (i + "  " + (char) i);
        }
    }
}

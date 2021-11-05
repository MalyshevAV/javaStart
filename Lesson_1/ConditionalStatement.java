public class ConditionalStatement {	
    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("Человеку -" + age + " лет"); 
        } 
        boolean menSex = true;
        if (menSex) {
            System.out.println("Мужской пол");
        } 
        if (!menSex) {
            System.out.println("Женский пол");
        } 
        double height = 1.9;
        if (height < 1.80) {
	    System.out.println("Рост женщины ниже" + height);
        } else { 
            System.out.println("Мужчина ростом - " + height + " м."); 
        } 
        char firstLetterName = 'М';
        if (firstLetterName == 'M') {
            System.out.println("Если первая буква в имени - " + firstLetterName + " -  мужчину зовут Michail");
        } else if (firstLetterName == 'I') {
            System.out.println("Если первая буква в имени - " + firstLetterName + " - женщину зовут Irina");
        } else {
            System.out.println("Имя - не Michail и не Irina"); 
        } 
    }
}


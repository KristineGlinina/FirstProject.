package Conditionals;


public class MagicConditionals<age> {
    // De Morgan` law
    //! ( A&& B) is the same as !A || !B
    // ! ( A  || B) is the same as !A && !BB

    public static void main (String[] args) {

        int age = 25;

        if (age > 18) {
            System.out.println("You are an adult!");
        } else if (age < 22) {
            System.out.println("You might be 18 -> 22!");
        } else {
            System.out.println("You are here!");
        }

    }
}

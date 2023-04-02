import java.util.Random;
import java.util.Scanner;

public class FortuneTeller{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        int currentYear = java.time.Year.now().getValue();
        int  age = (currentYear - birthYear);

        String[] fortunes = {
            "You will find love in unexpected places.",
            "A financial windfall is in your future.",
            "Your dreams will come true if you have the courage to pursue them.",
            "The stars are aligned in your favor.",
            "You will soon embark on a great adventure.",
            "Good things come to those who wait.",
            "You will meet a stranger who will change your life."
        };

        int fortuneIndex = rand.nextInt(fortunes.length);

        System.out.printf("Hello, %s! You are %d year old.\n", name, age);
        System.out.printf("Your fortune is: %s! \n", fortunes[fortuneIndex]);

        while(true){
            System.out.println("Would you like another fortune? (Y/N)");
            String answer = input.next();

            if(answer.equalsIgnoreCase("N")){
                break;
            }

            fortuneIndex = rand.nextInt(fortunes.length);
            System.out.printf("Your new fortune is: %s! \n", fortunes[fortuneIndex]);
        }

        System.out.println("Thank you for using the Fortune Teller");
    }
}
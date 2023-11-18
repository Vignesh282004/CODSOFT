package NumberGame;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Hello This is a Number Guessing Game");
        System.out.println("AS a Computer I have Guessed an Number");
        Scanner next = new Scanner(System.in);
        Random rand = new Random();

        long score = 0;
        boolean go = true;

        while (go) {
            int targetNumber = rand.nextInt(100) + 1;
            int attempts = 0;
           int maxAttempts =8;

            System.out.println("please select a correct number so that you can match me ......");

            while (attempts < maxAttempts) {
                System.out.println("Enter Your Answer : ");
                int GueesedAnswer = next.nextInt();
                next.nextLine();
                attempts++;
            if(GueesedAnswer == targetNumber) {
                System.out.println("ok ! Correct....");
                score++;
                break;
            }
            else if(GueesedAnswer < targetNumber)
            {
                System.out.println("Give a Higher Number");
            }
            else
            {
                    System.out.println("Give a Lower Number");
            }
            }
            if(attempts>=maxAttempts) {
                System.out.println("OOPs ,i have Gueeseed Number ---- " + targetNumber);
                System.out.println("You have tried So many times Please Come Back Later....");
            }
            System.out.println("Play again /n/t Enter (yes/No) : ");
            String GoAgain = next.nextLine();
            go = GoAgain.equalsIgnoreCase("yes");
        }
        System.out.println("Game Over !!! Your Score is ------------ /t " + score);
        System.out.println("Than you for playing Game");
        next.close();
    }

}

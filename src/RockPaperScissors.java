import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args) {
        int input;
        int b = 1;
        Scanner sage = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("ROCK PAPER SCISSORS!!!");
        System.out.println("Select 1, 2, 3, for Rock, Paper, Scissors");

        while(b != 0) {
            int rock = 1, paper = 2, scissors = 3;
            input = sage.nextInt();
            int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;

            if (randomNumber == rock) {
                if (input == rock) {
                    System.out.println("Rock vs. Rock! TIE GAME!");
                } else if (input == paper) {
                    System.out.println("Rock vs. Paper! YOU WON!");
                } else if (input == scissors) {
                    System.out.println("Rock vs. Scissors! YOU LOST!");
                }
            } else if (randomNumber == paper) {
                if (input == rock) {
                    System.out.println("Paper vs. Rock! YOU LOST!");
                } else if (input == scissors) {
                    System.out.println("Paper vs. Scissors! YOU WON!");
                } else if (input == paper) {
                    System.out.println("Paper vs. Paper! TIE GAME!");
                } else if (randomNumber == scissors) {
                    if (input == rock) {
                        System.out.println("Scissors vs. Rock! YOU WON!");
                    } else if (input== scissors) {
                        System.out.println("Scissors vs. Scissors! TIE GAME!");
                    } else if (input == paper) {
                        System.out.println("Scissors vs. Paper! YOU LOST!");
                    }
                }
            }
        }





























}





























}

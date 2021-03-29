package PasswordGenerator;
import java.util.Scanner;

public class GenerateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of characters you want in your password: ");
        int numberOfCharacters = input.nextInt();

        for (int i = 0; i < numberOfCharacters; i++) {
            char randomCharacters = RandomCharacters.getRandomLowerCaseLetters();
                
                System.out.print(randomCharacters);
        }
        System.out.println("\n");
    }
}

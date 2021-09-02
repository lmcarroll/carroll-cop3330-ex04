import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        System.out.println("Enter a noun:");
        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();

        System.out.println("Enter a verb:");
        input = new Scanner(System.in);
        String verb = input.nextLine();

        System.out.println("Enter an adjective:");
        input = new Scanner(System.in);
        String adjective = input.nextLine();

        System.out.println("Enter an adverb:");
        input = new Scanner(System.in);
        String adverb = input.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");

    }
}

import Fishes.Carp;
import Fishes.Fish;
import Fishes.SheatFish;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pond pond = new Pond();
        int count = 0;
        int weight = 1;
        int whisckerLength = 1;

        System.out.println("Start the game!");
        System.out.println("-------------------------------");
        System.out.println("Options:");
        System.out.println(" 1 - Add fish in the pond.");
        System.out.println(" 2 - Remove fish from the pond.");
        System.out.println(" 3 - Show Capacity of the pond.");
        System.out.println(" 4 - Show State of the pond.");
        System.out.print("Your option: ");

        Scanner scanner = new Scanner(System.in);
        int command = Integer.parseInt(scanner.nextLine());

        do {

            weight++;
            whisckerLength++;

            if (command == 1) {
                count++;
                System.out.println(" 1 - Carp");
                System.out.println(" 2 - SheatFish");
                System.out.print("Type of fish: ");

                int typeOfFish = Integer.parseInt(scanner.nextLine());
                
                if (typeOfFish == 1) {
                    Fish currFish = new Carp(weight, "blue");
                    System.out.println();
                    pond.obtainFish(currFish);
                } else if (typeOfFish == 2) {
                    Fish currFish = new SheatFish(weight, whisckerLength);
                    System.out.println();
                    pond.obtainFish(currFish);
                } else {
                    System.out.println("Invalid input!");
                    continue;
                }
                System.out.println();
            }
            else if (command == 2) {
                count++;
                System.out.println();
                pond.lostFish();
                System.out.println();
            }
            else if (command == 3) {
                System.out.println();
                pond.ShowCapacity();
            }
            else if (command == 4) {
                System.out.println();
                pond.ShowState();
            }
            else {
                System.out.println("Invalid Input!");
                System.out.println("-------------------------------");
                System.out.println("Options:");
                System.out.println(" 1 - Add fish in the pond.");
                System.out.println(" 2 - Remove fish from the pond.");
                System.out.println(" 3 - Show Capacity of the pond.");
                System.out.println(" 4 - Show State of the pond.");
                System.out.print("Your option: ");

                command = Integer.parseInt(scanner.nextLine());
                continue;
            }
            if (pond.getPower() > 10) {
                break;
            }
            if (pond.fishes.size() == 0) {
                break;
            }
            System.out.println("-------------------------------");
            System.out.println("Options:");
            System.out.println(" 1 - Add fish in the pond.");
            System.out.println(" 2 - Remove fish from the pond.");
            System.out.println(" 3 - Show Capacity of the pond.");
            System.out.println(" 4 - Show State of the pond.");
            System.out.print("Your option: ");

            command = Integer.parseInt(scanner.nextLine());

        }while (pond.getPower() <= 10 || count <= 20);

        if (pond.getPower() > 10) {
            System.out.println("-------------------------------");
            System.out.println("Your pond's power is " + pond.getPower() + ".");
            System.out.println("You win the game!");
            pond.ShowCapacity();
            pond.ShowState();
        }
        else {
            System.out.println("-------------------------------");
            System.out.println("Your pond's power is " + pond.getPower() + ".");
            pond.ShowState();
            pond.ShowCapacity();
            System.out.println("You lose this game!!");
        }
        System.out.println();
        System.out.println("GAME OVER!");
    }
}

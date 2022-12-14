package main.java;

import java.util.Scanner;

class InteractiveMenu {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    public static Fish chooseOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired fish Carp or Sheatfish: ");
        String fishOption = scanner.nextLine();


        System.out.println("Enter fish weight: ");
        int fishWeight = scanner.nextInt();
        scanner.nextLine();

        Fish fish = null;
        if (fishOption.equals("Carp")) {
            System.out.println("Enter carp color: ");
            String color = scanner.nextLine();
            Carp carp1 = new Carp(fishWeight, color);
            fish = carp1;
        } else if (fishOption == "Sheatfish") {
            System.out.println("Enter sheatfish whisked length: ");
            String whiskedLength = scanner.nextLine();
            Carp sheafFish = new Carp(fishWeight, whiskedLength);
            fish = sheafFish;
        }
        return fish;
    }

    public static void main(String[] args) {


        Pond pond = new Pond();


        String[] options = {
                "1- View capacity",
                "2- View state of Pond",
                "3-  Add fish( Carp or SheatFish)",
                "4-  Catch fish (concrete instance)",
                "5- Exit",
        };
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
            printMenu(options);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    pond.showCapacity();
                    break;
                case 2:
                    pond.showState();
                    break;
                case 3:
                    pond.obtainFish(chooseOption());
                    break;
                case 4:
                    pond.lostFish();
                    break;
                case 5:
                    break;
            }

        }
    }
}
package banking;

import java.util.Scanner;

public class MenuApplication {

    public void menuApplicationForUser(){
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        double accountNumber = 1;
        while (running){
            System.out.println("1. Create an account");
            System.out.println("2. Log into account");
            System.out.println("0. Exit");
            Integer inputFromUser = scan.nextInt();
            switch (inputFromUser){
                case 1:
                    CountNumberCard number = new CountNumberCard();
                    CardMagazine person = new CardMagazine(number.numberCardForConsumer(), number.pinToCard());
                    person.outAfterCreateAccount();
                    break;
                case 2:

                    System.out.println("dupa2");

                    break;
                case 0:
                    System.out.println("dupa3");
                    running = false;
                    break;
                default:
                    break;

            }
        }

    }
}

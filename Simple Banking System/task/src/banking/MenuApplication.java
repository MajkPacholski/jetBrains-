package banking;

import java.util.Scanner;

public class MenuApplication {

    public void menuApplicationForUser(){
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running){
            System.out.println("1. Create an account");
            System.out.println("2. Log into account");
            System.out.println("0. Exit");
            Integer inputFromUser = scan.nextInt();
            switch (inputFromUser){
                case 1:
                    System.out.println("dupa");

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

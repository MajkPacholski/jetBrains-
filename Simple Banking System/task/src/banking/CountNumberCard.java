package banking;

import java.util.Random;

public class CountNumberCard {


    //tworzenie instancji random
    public int countRandomCardNumber() {
        Random random = new Random();
        int numberCard = random.nextInt(999999999) + 1;
        return numberCard;
    }
    //towrzenie numeru karty
    int[] countNumberCardForConsumer = new int[3];
    public int[] countNumberCard() {

        countRandomCardNumber();
        countNumberCardForConsumer[0] = 400000;
        countNumberCardForConsumer[1] = countRandomCardNumber();
        countNumberCardForConsumer[2] = 1;
        return countNumberCardForConsumer;
    }

    //numer karty jako int
    public long numberCardForConsumer() {
        countNumberCard();
        StringBuilder strNum = new StringBuilder();
        for (int number : countNumberCardForConsumer) {
            strNum.append(number);
        }
        long numberCardOut = Long.parseLong(String.valueOf(strNum));
        return numberCardOut;
    }

    // tworzenie pinu do karty
    public int pinToCard() {
        Random random = new Random();
        int forDigitPinCardPin = random.nextInt(9999);
return forDigitPinCardPin;
    }
}

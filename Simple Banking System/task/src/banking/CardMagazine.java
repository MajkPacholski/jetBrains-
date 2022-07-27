package banking;

import java.util.concurrent.atomic.AtomicInteger;

public class CardMagazine {
    private final long numberCardForConsumer;
    private final int pin;
    private static final AtomicInteger count = new AtomicInteger(0);
    private int cardId;



    public CardMagazine(long numberCardForConsumer, int pin) {
        this.numberCardForConsumer = numberCardForConsumer;
        this.pin = pin;
        this.cardId = count.incrementAndGet();

    }
    @Override
    public String toString() {
        return "CardMagazine{" +
                "numberCardForConsumer=" + numberCardForConsumer +
                ", pin=" + pin +
                ", cardId=" + cardId +
                '}';
    }

    public long getNumberCardForConsumer() {
        return numberCardForConsumer;
    }

    public int getPin() {
        return pin;
    }

    public int getCardId() {
        return cardId;
    }
    public void outAfterCreateAccount(){
        System.out.println("Your card has been created");
        System.out.println("Your card number:");
        System.out.println(getNumberCardForConsumer());
        System.out.println("Your card PIN:");
        System.out.println(getPin());
    }
}

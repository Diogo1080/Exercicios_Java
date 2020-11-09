package a5_ArraysMatrizes.cardsExercice;

public class Cards {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int inputNumber = 10;

        if (inputNumber * 5 > 52) {
            System.out.println("Too many players.");
            return;
        }

        int[] deck = new int[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        //shuffle deck
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * (i + 1));
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        //prints randomly
        int index = 1;
        for (int l = 0; l < inputNumber; l++) {
            for (int i = 0; i < 5; i++) {
                //visualization
                //System.out.println(deck[index] +" / 13 = "+ (deck[index]/13));
                //System.out.println(deck[index] +" % 13 = "+ (deck[index]%13));
                String suit = suits[deck[index] / 13];
                String rank = ranks[deck[index] % 13];
                System.out.println(rank + " of " + suit);

                index++;
            }
            System.out.println();
        }
    }
}

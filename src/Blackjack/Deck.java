package Blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    // Constructer
    public Deck(){
        this.cards = new ArrayList<Card>();
    }
    public void createFullDeck(){
        for (Suit cardSuit: Suit.values()) {
            for (Value cardValue: Value.values()) {
                // Add new card to the deck
                this.cards.add(new Card(cardSuit,cardValue));

            }

        }
    }

    public void shuffle(){
        ArrayList<Card> tmpDeck = new ArrayList<Card>();
        // Need to use random to shuffle
        Random random = new Random();
        int randomCardIndex = 0;
        int originalSize = this.cards.size();
        for (int i = 0; i < originalSize; i++) {
            //Generate Random index
            // Random number generater syntax rand.nextInt((max-min) + 1) + min;
            randomCardIndex = random.nextInt((this.cards.size()-1 - 0)+1)+0;
            tmpDeck.add(this.cards.get(randomCardIndex));

            //Remove for original deck
            this.cards.remove(randomCardIndex);


        }
        this.cards = tmpDeck;
    }
    public String toString(){
        String cardListOutput = "";
        int i = 0;
        for(Card aCard : this.cards){
            cardListOutput += "\n" + i + " " + aCard.toString();
            i++;
        }
        return cardListOutput;
    }
}

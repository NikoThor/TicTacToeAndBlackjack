package Blackjack;

public class Blackjack {
    public static void main(String[] args) {
        //Welcome message
        System.out.println("Welcome to Blackjack!");

        // Generate the deck
        Deck playingdeck = new Deck();
        playingdeck.createFullDeck();
        playingdeck.shuffle();
        System.out.println(playingdeck);
    }
}

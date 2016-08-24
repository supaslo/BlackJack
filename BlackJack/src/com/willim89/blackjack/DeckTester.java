package com.willim89.blackjack;

public class DeckTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
		Deck deck = new Deck();
		Card removalCard = new Card();
		for(x = 0;x < deck.getDeckLength();x++){
			Card displayCard = deck.getCard(x);
			System.out.println("Your deck contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit());
		}
		System.out.println("Your deck contains " + deck.getDeckLength() + " cards");
		deck.shuffleDeck();
		System.out.println("Shuffling!");
		for(x = 0;x < deck.getDeckLength();x++){
			Card displayCard = deck.getCard(x);
			if (x == 0){
				removalCard = displayCard;	
			}
			System.out.println("Your deck contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit());
		}
		System.out.println("Removing first card!");
		deck.removeCard(removalCard);
		for(x = 0;x < deck.getDeckLength();x++){
			Card displayCard = deck.getCard(x);
			System.out.println("Your deck contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit());
		}
		System.out.println("Your deck contains " + deck.getDeckLength() + " cards");
	}
}

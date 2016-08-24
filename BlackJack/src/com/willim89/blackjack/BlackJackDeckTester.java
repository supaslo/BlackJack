package com.willim89.blackjack;

public class BlackJackDeckTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
		BlackJackDeck deck = new BlackJackDeck();
		BlackJackCard removalCard = new BlackJackCard();
		for(x = 0;x < deck.getDeckLength();x++){
			BlackJackCard displayCard = deck.getBlackJackCard(x);
			System.out.println("Your deck contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and a value of " + displayCard.getNumericValue());
		}
		System.out.println("Your deck contains " + deck.getDeckLength() + " cards");
		deck.shuffleDeck();
		System.out.println("Shuffling!");
		for(x = 0;x < deck.getDeckLength();x++){
			BlackJackCard displayCard = deck.getBlackJackCard(x);
			if (x == 0){
				removalCard = displayCard;	
			}
			System.out.println("Your deck contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and a value of " + displayCard.getNumericValue());
		}
		System.out.println("Removing first card!");
		deck.removeCard(removalCard);
		for(x = 0;x < deck.getDeckLength();x++){
			BlackJackCard displayCard = deck.getBlackJackCard(x);
			System.out.println("Your deck contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and a value of " + displayCard.getNumericValue());
		}
		System.out.println("Your deck contains " + deck.getDeckLength() + " cards");

	}

}

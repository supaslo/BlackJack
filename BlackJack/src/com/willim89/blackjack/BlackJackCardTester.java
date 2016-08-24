package com.willim89.blackjack;

public class BlackJackCardTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlackJackCard card = new BlackJackCard();
		card.setSuit("Hearts");
		card.setFaceValue("Ace");
		card.setNumericValue(1);
		System.out.println("You have a(n) " + card.getFaceValue() + " of " + card.getSuit() + " with a value of " + card.getNumericValue());
	}

}

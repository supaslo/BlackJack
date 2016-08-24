package com.willim89.blackjack;

public class CardTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Card card = new Card();
		card.setSuit("Hearts");
		card.setFaceValue("Ace");
		System.out.println("You have a(n) " + card.getFaceValue() + " of " + card.getSuit());

	}

}

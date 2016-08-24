package com.willim89.blackjack;

import java.util.ArrayList;

public class BlackJackHand {
	private ArrayList<BlackJackCard> hand;
	private int handValue;
	
	public BlackJackHand(){
		hand = new ArrayList<BlackJackCard>();
	}
	public void addCard(BlackJackCard c){
		hand.add(c);
		handValue = handValue + c.getNumericValue();
	}
	public BlackJackCard getCard(int index){
		return hand.get(index);
	}
	public int getLength(){
		return hand.size();
	}
	public int gethandValue(){
		return handValue;
	}
	public void printBlackJackHand(){
		for (int x = 0;x < hand.size();x++){
			BlackJackCard displayCard = hand.get(x);
				System.out.println("Your hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
		}
	}
}

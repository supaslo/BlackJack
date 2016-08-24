package com.willim89.blackjack;

public class ScoringRules {
	private boolean stillIn = false;
	private boolean blackJack = false;
	private boolean usingAceAsEleven = false;
	
	public boolean checkForBlackJack(BlackJackHand hand){
		boolean checkAceValue = false;
		int handTotal = 0;
		for (int x = 0;x < hand.getLength();x++){
			BlackJackCard card = hand.getCard(x);
			if (card.getNumericValue() == 1){
				checkAceValue = true;
			}
			handTotal = handTotal + card.getNumericValue();
			//System.out.println("Your hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
		}
		if (checkAceValue){
			handTotal = adjustHandTotal(handTotal);
		}
		if (handTotal == 21){
			return blackJack = true;
		}
		return blackJack;
	}
	private int adjustHandTotal(int total){
		if (total < 21){
			total = total + 10;
			if (total > 21){
				total = total - 10;
			}
			else{
				usingAceAsEleven = true;
			}
		}
		return total;
	}
	public boolean getUsingAceAsEleven(){
		return usingAceAsEleven;
	}
	public boolean checkScore(BlackJackHand hand){
		int handTotal = 0;
		for (int x = 0;x < hand.getLength();x++){
			BlackJackCard card = hand.getCard(x);
			handTotal = handTotal + card.getNumericValue();
		}
		if (handTotal > 21){
			return stillIn = false;
		}else{
			return stillIn = true;
		}
	}
	public int getScore(BlackJackHand hand){
		int handTotal = 0;
		for (int x = 0;x < hand.getLength();x++){
			BlackJackCard card = hand.getCard(x);
			handTotal = handTotal + card.getNumericValue();
		}
		return handTotal;
	}
}

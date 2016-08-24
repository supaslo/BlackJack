package com.willim89.blackjack;

import java.util.Scanner;

public class BlackJackHandTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x;
		boolean playerHit = false;
		boolean blackJack = false;
		boolean stillIn = false;
		BlackJackDeck deck = new BlackJackDeck();
		BlackJackHand playersHand = new BlackJackHand();
		BlackJackHand dealersHand = new BlackJackHand();
		ScoringRules playerRules = new ScoringRules();
		ScoringRules dealerRules = new ScoringRules();
		deck.shuffleBlackJackDeck();
		for (x = 0;x < 4;x++){
			BlackJackCard dealtCard = deck.getBlackJackCard(x);
			if((x % 2) == 0){
				playersHand.addCard(dealtCard);
			}
			else{
				dealersHand.addCard(dealtCard);
			}
			deck.removeBlackJackCard(dealtCard);
		}
		playersHand.printBlackJackHand();
		/*for (x = 0;x < playersHand.getLength();x++){
			BlackJackCard displayCard = playersHand.getCard(x);
			System.out.println("Your hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
		}*/
		blackJack = playerRules.checkForBlackJack(playersHand);
		if (blackJack){
			System.out.println("You have black jack, you won!");
		}else{
			for (x = 0;x < dealersHand.getLength();x++){
				BlackJackCard displayCard = dealersHand.getCard(x);
				if(!(x == 0)){
					System.out.println("The dealer's hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
				}else{
					System.out.println("The dealer's first card is hidden!");
				}
			}
			blackJack = dealerRules.checkForBlackJack(dealersHand);
			if (blackJack){
				System.out.println("Dealer has black jack, you should have bought insurance!");
			}else {
				Scanner console = new Scanner(System.in);
				System.out.print("Hit?(Yes/No):  ");
				String hit = console.next();
				if (hit.equals("yes")){
					playerHit = true;
				} else {
					playerHit = false;
				}
				while (playerHit){
					BlackJackCard playerHitCard = deck.getNextBlackJackCard();
					playersHand.addCard(playerHitCard);
					deck.removeBlackJackCard(playerHitCard);
					for (x = 0;x < playersHand.getLength();x++){
						BlackJackCard displayCard = playersHand.getCard(x);
						System.out.println("Your hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
					}
					stillIn = playerRules.checkScore(playersHand);
					if (stillIn){
						System.out.print("Hit?(Yes/No):  ");
						hit = console.next();
						if (hit.equals("yes")){
							playerHit = true;
						} else {
							playerHit = false;
						}
					}else {
						playerHit = false;
					}
				}
				console.close();
				for (x = 0;x < dealersHand.getLength();x++){
					BlackJackCard displayCard = dealersHand.getCard(x);
					System.out.println("Dealer's hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
				}
				int playerScore = playerRules.getScore(playersHand);
				int dealerScore = dealerRules.getScore(dealersHand);
				if (playerScore > dealerScore){
					System.out.println("You Won!");
				}else{
					System.out.println("Dealer Won!");
				}
			}
		}
	}

}

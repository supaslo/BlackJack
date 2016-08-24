package com.willim89.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BlackJackDeck extends Deck{
	private ArrayList<BlackJackCard> blackJackCards;
	
	public BlackJackDeck(){
		//boolean keyNotFound = false;
		blackJackCards = new ArrayList<BlackJackCard>();
		String[] suits = {"hearts","clubs","spades","diamonds"};
		Map<String, Integer> blackJackValues = new TreeMap<String, Integer>();
		blackJackValues.put("Ace", 11);
		blackJackValues.put("Two", 2);
		blackJackValues.put("Three", 3);
		blackJackValues.put("Four", 4);
		blackJackValues.put("Five", 5);
		blackJackValues.put("Six", 6);
		blackJackValues.put("Seven", 7);
		blackJackValues.put("Eight", 8);
		blackJackValues.put("Nine", 9);
		blackJackValues.put("Ten", 10);
		blackJackValues.put("Jack", 10);
		blackJackValues.put("Queen", 10);
		blackJackValues.put("King", 10);
		//Integer[] numericValues = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		for (int suit = 0;suit < suits.length;suit++){
			Set<String> keySet = blackJackValues.keySet();
			for (String key : keySet){
				BlackJackCard card = new BlackJackCard();
				card.setSuit(suits[suit]);
				card.setFaceValue(key);
				card.setNumericValue(blackJackValues.get(key));
				addBlackJackCard(card);
			}
		}
		/*for(int x = 0;x < deck.getDeckLength();x++){
			Card card = new Card();
			card = deck.getCard(x);
			BlackJackCard blackJackCard = new BlackJackCard();
			blackJackCard.setSuit(card.getSuit());
			blackJackCard.setFaceValue(card.getFaceValue());
			
			do {
				if (card.getFaceValue() == blackJackValues.){
					keyNotFound = true;
				}
			}while(keyNotFound);*/
	}
	/*		blackJackCard.setNumericValue(numericValues[x]);
			addBlackJackCard(blackJackCard);
		}
	}*/
	public void addBlackJackCard(BlackJackCard c){
		blackJackCards.add(c);
	}
	public BlackJackCard getBlackJackCard(int index){
		return blackJackCards.get(index);
	}
	public void shuffleBlackJackDeck(){
		Collections.shuffle(blackJackCards);
	}
	public void removeBlackJackCard(BlackJackCard c){
		blackJackCards.remove(c);
	}
	public BlackJackCard getNextBlackJackCard(){
		return blackJackCards.get(1);
	}
}

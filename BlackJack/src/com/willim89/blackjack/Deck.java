package com.willim89.blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	private int deckLength = 0;
	
	public Deck(){
		cards = new ArrayList<Card>();
		String[] suits = {"hearts","clubs","spades","diamonds"};
		String[] faceValues = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		for (int suit = 0;suit < suits.length;suit++){
			for (String key : faceValues){
				Card card = new Card();
				card.setSuit(suits[suit]);
				card.setFaceValue(key);
				addCard(card);
			}
		}
	}
	public void addCard(Card c){
		cards.add(c);
		deckLength = deckLength + 1;
	}
	public Card getCard(int index){
		return cards.get(index);
	}
	public void shuffleDeck(){
		Collections.shuffle(cards);
	}
	public void removeCard(Card c){
		cards.remove(c);
		deckLength = deckLength - 1;
	}
	public Card getNextCard(){
		return cards.get(1);
	}
	public int getDeckLength(){
		return deckLength;
	}
}

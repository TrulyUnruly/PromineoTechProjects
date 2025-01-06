package week06WarCards;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	
	List<Card> hand;
	String name;
	int score;	
	
Player() {
	
this.score = 0;
this.name = "";
this.hand = new ArrayList<Card>();
}
public void describe() {
	System.out.println(this.name);
for (Card singleCard : this.hand) {
	singleCard.describe();
	}
}
public Card flip () {
	Card topCard = this.hand.remove(0);
	return topCard; 
}

public void draw (Deck deck) {
	Card topCard = deck.draw();
	this.hand.add(topCard);		
}

public void incrementScore () {
	this.score +=1;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

	
	
	
	
			
}

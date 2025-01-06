package week05;

public class App {

	public static void main(String[] args) {	
		
		Player player1 = new Player();
		Player player2 = new Player();
		Deck deck = new Deck();
		
		deck.shuffle();
	for (int i = 0; i <= 25; i++) {
		player1.draw(deck);
		player2.draw(deck);
				
	}	
	//each player flips card for 26 rounds	
	for (int turn = 1; turn <= 26; turn++) {
	System.out.println("\n");
	System.out.println("Begin Round " + turn);
	System.out.println("---------------");
	
		Card player1card = player1.flip();
		System.out.println("Player 1 card: " + player1card.getName() + " of " + player1card.getSuit());
		Card player2card = player2.flip();
		System.out.println("Player 2 card: " + player2card.getName() + " of " + player2card.getSuit());
	    
		
   if (player1card.getValue()== player2card.getValue()) {
	   System.out.println("It is a tie, no points awarded!");
	   System.out.println("---------------");  
	   
   }else  if (player1card.getValue() > player2card.getValue()) {
	   System.out.println("1 Point awarded to Player 1");
	   System.out.println("---------------");
	   player1.incrementScore();
	   
   }else{
	   System.out.println("1 Point awarded to Player 2");
	   System.out.println("---------------");
	   player2.incrementScore();     
   }
	}
   System.out.println("\n");
   System.out.println("Final Score");
   System.out.println("---------------");
   System.out.println("Player 1 score: " + player1.getScore());
   System.out.println("Player 2 score: " + player2.getScore());
   System.out.println("\n");
   
   
   if (player1.getScore() == player2.getScore()) {
	   System.out.println("It's a draw!");
	   
	}else if (player1.getScore() > player2.getScore()) {
	System.out.println("Player 1 is the winner!");
	   
   }else{
	   System.out.println("Player 2 is the winner!");
   
   
   		}		
  
	
	}
}
	
	
	
	

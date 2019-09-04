
public class diceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//players
		
		String firstPlayer = "player 1";
		String secondPlayer = "player 2";
		
		//dice
		
		int firstPlayerDie = (int) (6*Math.random()+1);
		int secondPlayerDie = (int) (6*Math.random()+1);
		//prints
		
		System.out.println("player 1- " + firstPlayerDie );
		System.out.println("player 2- " + secondPlayerDie);
		
		//booleans
		
		if (firstPlayerDie > secondPlayerDie) {
		System.out.println("player 1 wins");
		}
		if (firstPlayerDie < secondPlayerDie) {
			System.out.println("player 2 wins");
			}
		if (firstPlayerDie == secondPlayerDie) {
			System.out.println("draw");
			}
			
	
		
	}	
	}
	

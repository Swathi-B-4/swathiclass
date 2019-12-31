package classandobject2;

public class Player {
	private String  playerName ;
	private String playerPosition;
	public Player(String playerName, String playerPosition) {
		super();
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		System.out.println("Player Details - ");
		System.out.println("Player: "+ this.playerName+ "\nPosition: "+this.playerPosition );
	}
	

}

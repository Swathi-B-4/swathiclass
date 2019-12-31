package classandobject3;

public class PlayerRecord {
 private	byte matchesPlayed;
 private byte numOfWins;
 private byte numOfLosses;
 private float avgLapSpeed;
 private float maxLapSpeed;
 private float avgThrowDistance;
 private float maxThrowDistance;
 private int win;
 private int loss;
public PlayerRecord(byte matchesPlayed, byte numOfWins, byte numOfLosses, float avgLapSpeed, float maxLapSpeed,
		float avgThrowDistance, float maxThrowDistance) {
	//super();
	this.matchesPlayed = matchesPlayed;
	this.numOfWins = numOfWins;
	this.numOfLosses = numOfLosses;
	this.avgLapSpeed = avgLapSpeed;
	this.maxLapSpeed = maxLapSpeed;
	this.avgThrowDistance = avgThrowDistance;
	this.maxThrowDistance = maxThrowDistance;
}
public void DisplayPlayerRecord() {
	System.out.println("Player Record -");
	win = this.matchesPlayed / this.numOfWins ;
	loss = this.numOfLosses / this.numOfWins;
	System.out.println("Matches Played: "+this.matchesPlayed+"\nWin/Loss Ratio: "+win+":"+loss+"\nAvg/Max Lap Speed: "+this.avgLapSpeed+"|"+this.maxLapSpeed+" min");
	System.out.println("Avg/Max Throw Distance: "+this.avgThrowDistance+"|"+this.maxThrowDistance+" m");
}

 

}

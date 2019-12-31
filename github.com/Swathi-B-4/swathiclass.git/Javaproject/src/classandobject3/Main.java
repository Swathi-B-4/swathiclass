package classandobject3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matches: \nEnter wins: \nEnter losses: \nEnter avg lap speed: \nEnter max lap speed: \nEnter avg throw distance: \nEnter max throw distance: ");
		byte matchesPlayed = sc.nextByte();
		byte numOfWins = sc.nextByte();
		byte numOfLosses= sc.nextByte();
		float avgLapSpeed = sc.nextFloat();
		float maxLapSpeed = sc.nextFloat();
		float avgThrowDistance = sc.nextFloat();
		float maxThrowDistance = sc.nextFloat();
		PlayerRecord pr = new PlayerRecord(matchesPlayed, numOfWins, numOfLosses, avgLapSpeed, maxLapSpeed, avgThrowDistance, maxThrowDistance);
		pr.DisplayPlayerRecord();
	}

}

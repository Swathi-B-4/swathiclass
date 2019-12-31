package classandobject2;

import java.util.Scanner;

public class Main {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter player name: \nEnter player position: ");
	String  playerName = sc.nextLine();
	String playerPosition = sc.nextLine();
	 Player p = new Player (playerName,playerPosition);
	
}
}

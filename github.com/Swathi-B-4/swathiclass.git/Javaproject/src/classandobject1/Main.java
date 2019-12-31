package classandobject1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team name: \nEnter city represented: ");
		String  teamName = sc.nextLine();
		String cityRepresented = sc.nextLine();
		Team t = new Team(teamName, cityRepresented);
	}
}

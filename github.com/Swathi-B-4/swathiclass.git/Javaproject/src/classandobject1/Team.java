package classandobject1;

public class Team {
	private String  teamName;
	private String cityRepresented;
	public Team(String teamName, String cityRepresented) {
		//super();
		this.teamName = teamName;
		this.cityRepresented = cityRepresented;
		System.out.println("Team Details");
		System.out.println("Team: "+this.teamName+"\n"+"City: "+this.cityRepresented);
	}
	
}

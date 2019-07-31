

import java.util.ArrayList;

public class Team {
	
	static int numTeams = 0;
	private int id; 
	private String teamName;
	private ArrayList<Player> roster = new ArrayList<>();	
	
	public Team(String teamName) {
		numTeams+=1;
		this.id = numTeams;
		setTeamName(teamName.toLowerCase());
	}
	
	public ArrayList<Player> getRoster() {
		return roster;
	}
	public void setRoster(ArrayList<Player> roster) {
		this.roster = roster;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public ArrayList<Player> getPlayers(){
		return this.roster;
	}
	public void addPlayer(Player player) {
		this.roster.add(player);
	}

	public int getId(){
		return this.id;
	}

	public int getNumPlayers(){
		return this.roster.size();
	}

	public void removePlayer(String firstName, String lastName, int age) {
		int count = 0;
		for (Player player : this.roster){

			boolean ageFlag = player.getAge() == age;
			boolean firstNameFlag = player.getFirstName().equals(firstName);
			boolean lastNameFlag = player.getLastName().equals(lastName);

			if(ageFlag && firstNameFlag && lastNameFlag){
				roster.remove(count);
				break;
			}
			count+=1;
		}
	}

	public void removePlayer(int id) {
		int count = 0;
		for (Player player : this.roster){

			boolean idFlag = player.getId() == id;

			if(idFlag){
				roster.remove(count);
				break;
			}
			count+=1;
		}
	}

	public Object getPlayer(String firstName, String lastName, int age){
		int count = 0;
		for (Player player : this.roster){

			boolean ageFlag = player.getAge() == age;
			boolean firstNameFlag = player.getFirstName().equals(firstName);
			boolean lastNameFlag = player.getLastName().equals(lastName);

			if(ageFlag && firstNameFlag && lastNameFlag){
				return player;
			}
			count+=1;
		}	
		boolean b1 = Boolean.parseBoolean("False");
		return b1;
	}

	public Object getPlayer(int id){
		int count = 0;
		for (Player player : this.roster){

			boolean idFlag = player.getId() == id;

			if(idFlag){
				return player;
			}
			count+=1;
		}	
		boolean b1 = Boolean.parseBoolean("False");
		return b1;
	}
}


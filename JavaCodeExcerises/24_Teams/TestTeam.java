import java.util.ArrayList;
public class TestTeam{
	public static void main(String[] args){

		Player andrew = new Player("andrew", "rydzak", 30);
		Player lizzy = new Player("lizzy", "villere", 28);
		Player catniss = new Player("catniss", "rydzak", 9);
		Player oscar = new Player("oscar", "villere", 5);
		Player koshka = new Player("koshka", "villere", 2);

		Team bunyips = new Team("Bunyips");

		
		bunyips.addPlayer(andrew);
		bunyips.addPlayer(lizzy);
		bunyips.addPlayer(catniss);
		bunyips.addPlayer(oscar);
		bunyips.addPlayer(koshka);

		bunyips.removePlayer("lizzy", "villere", 28);

		Roster roster = new Roster();

		roster.addTeam(bunyips);

		System.out.println(bunyips.getPlayer("koshka", "villere", 2));


		for (Team team : roster.getTeams()){

			System.out.println(" Players on team: " + team.getTeamName() + " include,");

			for (Player player : team.getPlayers()){

				System.out.println(" Player: "+ player.getFirstName() + " ID: " + player.getId());		
			}
		}
	}
}
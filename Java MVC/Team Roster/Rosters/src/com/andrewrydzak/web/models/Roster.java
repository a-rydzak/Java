package com.andrewrydzak.web.models;

import java.util.ArrayList;



public class Roster{

	private ArrayList<Team> teams = new ArrayList<>(); 
	

	public Roster(){

	}

	public void addTeam(Team team){
		this.teams.add(team);
	}

	public void removeTeam(String teamName){
		int count = 0;
		for (Team team : this.teams){
			
			boolean teamNameFlag = team.getTeamName().equals(teamName);
			
			if(teamNameFlag){
				teams.remove(count);
				break;
			}
			count+=1;
		}
	}

	public void removeTeam(int id){
		int count = 0;
		for (Team team : this.teams){
			
			boolean idFlag = team.getId() == id;
			
			if(idFlag){
				teams.remove(count);
				break;
			}
			count+=1;
		}
	}

	public ArrayList<Team> getTeams(){
		return this.teams;
	}

	public Object getTeam(String teamName){
		int count = 0;
		for (Team team : this.teams){

			boolean teamNameFlag = team.getTeamName().equals(teamName);
			if(teamNameFlag){
				return team;
			}
			count+=1;
		}	
		boolean b1 = Boolean.parseBoolean("False");
		return b1;
	}


	public Object getTeam(int id){
		int count = 0;
		for (Team team : this.teams){

			boolean idFlag = team.getId() == id;
			if(idFlag){
				return team;
			}
			count+=1;
		}	
		boolean b1 = Boolean.parseBoolean("False");
		return b1;
	}

}
class Team {
	int teamId;
	String teamName;
	String [] players = new String[11];
	int runs[] = new int[11];

	Team team[] = new Team[5];
	int teamcount=0;



	public void addTeam(String teamname){
		if(teamcount<5){
			team[teamcount] = teamname;
			teamcount++;
		}

	}

	int playerCount = 0 ;

	public void enterPlayer(String Name){
		if(playerCount<11){
			players[playerCount] = Name;
			playerCount++;
		}
	}

	public void enterRuns(){

	}

	public void displayStatistics(){

	}

	public calculateTeamScore(){

	}


}


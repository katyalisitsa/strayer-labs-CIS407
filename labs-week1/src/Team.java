public class Team {

    /*
    * Given main(), define the Team class (in file Team.java).
    * For class method getWinPercentage(), the formula is:
    * teamWins / (teamWins + teamLosses)
    * Note: Use casting to prevent integer division.
    * Ex: If the input is Ravens 13 3 (where Ravens is the team's name, 13 is number of team wins,
    * and 3 is the number of team losses), the output is:
    *      Congratulations, Team Ravens has a winning average!
    *      If the input is Angels 80 82, the output is:
    *      Team Angels has a losing average.
    */

    // TODO: Declare private fields - teamName, teamWins, teamLosses

    private String teamName;
    private int teamWins;
    private int teamLosses;


    // TODO: Define mutator methods -
    //       setTeamName(), setTeamWins(), setTeamLosses()

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamWins(int teamWins) {
        this.teamWins = teamWins;
    }

    public void setTeamLosses(int teamLosses) {
        this.teamLosses = teamLosses;
    }

    // TODO: Define accessor methods -
    //       getTeamName(), getTeamWins(), getTeamLosses()

    public String getTeamName() {
        return teamName;
    }

    public int getTeamWins() {
        return teamWins;
    }

    public int getTeamLosses() {
        return teamLosses;
    }


    // TODO: Define getWinPercentage()

    public double getWinPercentage() {
        double getWinPercentage = (double)teamWins / (double)(teamWins + teamLosses);
        return getWinPercentage;
    }

}
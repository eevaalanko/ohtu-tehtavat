
package ohtu;

public class Player {
    private String name;
    private String nationality;
    private String team;
    private int goals;
    private int assists;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getAssists() {
        return assists;
    }


    public int getResults() {
        return assists + goals;
    }

    @Override
    public String toString() {
        return name + " " + team + " " + goals + " + " + assists + " = " + getResults();
    }


}

//Kyle Hix

public class Facade {
    
    private static Facade instance;
    private Athlete athlete;
    private AthleteList athleteList;
    private DataWriter dataWriter;
    private Stat stat;

    public Facade(){
        athleteList = new AthleteList();
        dataWriter = new DataWriter();
        stat = new Stat();
    }
    public static Facade getInstance(){
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public Athlete getAthlete(){
        return this.athlete;
    }

    public void addAthlete(Athlete athlete) {
        athleteList.addAthlete(athlete);
    }

    public void removeAthlete(Athlete athlete) {
        athleteList.removeAthlete(athlete);
    }

    public AthleteList getAthleteList(){
        return this.athleteList;
    }

    public void increaseStats(String statType, int value) {
        stat.incrementStat(statType, value);
    }

    public void decreaseStats(String statType, int value) {
        stat.decrementStat(statType, value);
    }

    public void displayStats() {
        stat.displayStats();
    }

    public void displayStat(String statType) {
        stat.displayStat(statType);
    } 

    public void displayByTeam(String team) {
        athleteList.displayByTeam(team);
    }
    


}

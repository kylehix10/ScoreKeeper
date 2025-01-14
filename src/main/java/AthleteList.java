import java.util.ArrayList;
import java.util.List;

public class AthleteList {
    private List<Athlete> athletes;
    
    public AthleteList() {
        athletes = new ArrayList<>();
    }
    
    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }
    
    public String displayAthletes() {
        for (Athlete athlete : athletes) {
            System.out.println(athlete.toString());
        }
        return null;
    }

    public Athlete displayByTeam(String team) {
        for (Athlete athlete : athletes) {
            if (athlete.getTeam().equals(team)) {
                System.out.println(athlete.toString());
                return athlete;
            }
        }
        return null;
    }

    public void removeAthlete(Athlete athlete) {
        athletes.remove(athlete);
    }
    
    public List<Athlete> getAthletes() {
        return athletes;
    }

    public Athlete getAthlete(String name){
        for (Athlete athlete : athletes) {
            if (athlete.getName().equals(name)) {
                return athlete;
            }
        }
        return null;
    }
}

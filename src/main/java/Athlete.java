//Kyle Hix

import java.util.UUID;

public class Athlete {
    private UUID id;
    private String name;
    private int age;
    private String team;
    private String position;
    private String sport;

    private Stat stats;      

    
    public Athlete(String name, int age, String team, String position, String sport) {
                this.id = createUUID();
                this.name = name;
                this.age = age;
                this.team = team;
                this.position = position;
                this.sport = sport;
                this.stats = new Stat(); 
            }
        
    private UUID createUUID() {
        return UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public String getSport() {
        return sport;
    }

    public Stat getStats() {
        return stats;
    }

    
    public void displayStats() {
        System.out.println("Athlete Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
        System.out.println("Position: " + position);
        System.out.println("Sport: " + sport);
        System.out.println("Statistics:");
        stats.displayStats();
    }

    public void displayStat(String statType) {
        stats.displayStat(statType);
    }

    
    public void increaseStats(String statType, int value) {
        stats.incrementStat(statType, value);
    }

    public void decreaseStats(String statType, int value) {
        stats.decrementStat(statType, value);
    }

    
    @Override
    public String toString() {
        return this.name+ ": "+ this.position+ ", "+ this.team;
    }
}

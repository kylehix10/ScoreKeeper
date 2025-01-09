//Kyle Hix
import java.util.UUID;

import javax.xml.crypto.Data;


public class App {
    private static Facade facade;

    public App(){
        facade = Facade.getInstance();
    }
   

    public static void scenario1(){
        
        Athlete athlete1 = new Athlete( "Tom Brady", 43, "Tampa Bay Buccaneers", "Quarterback", "Football");
        Athlete athlete2 = new Athlete( "Saquon Barkley", 27, "Philadelphia", "Running Back", "Football");
        Athlete athlete3 = new Athlete( "DK Metcalf", 27, "Seattle", "Wide Receiver", "Football");
        facade.addAthlete(athlete1);
        facade.addAthlete(athlete2);
        facade.addAthlete(athlete3);
        
        Athlete test = facade.getAthleteList().getAthlete("Tom Brady");
        test.increaseStats("touchDowns", 1);
        test.decreaseStats("rushingYards", 7);

        //test.displayStats();
        DataWriter dataWriter = new DataWriter();
        DataWriter.saveAthlete(facade.getAthleteList().getAthletes());
        facade.getAthleteList().removeAthlete(athlete3);
        DataWriter.saveAthlete(facade.getAthleteList().getAthletes());
        test.displayStat("touchDowns");

        
    }   
    
    
    
    public static void main(String[] args) {
      new App();
        scenario1();
    }
}

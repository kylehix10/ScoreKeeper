//Kyle Hix
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.json.simple.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class DataWriter {
   
    

   public static void saveAthlete(List<Athlete> athletes) {
        try (FileWriter file = new FileWriter("Athletes.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            List<JSONObject> athleteJsonList = new ArrayList<>();
            for (Athlete athlete : athletes) {
                JSONObject athleteJson = new JSONObject();
                athleteJson.put("id", athlete.getId());
                athleteJson.put("name", athlete.getName());
                athleteJson.put("age", athlete.getAge());
                athleteJson.put("team", athlete.getTeam());
                athleteJson.put("position", athlete.getPosition());
                athleteJson.put("sport", athlete.getSport());
                athleteJson.put("stats", athlete.getStats());
                athleteJsonList.add(athleteJson);
            }
            file.write(gson.toJson(athleteJsonList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<Athlete> getAthleteList() {
        try (FileReader reader = new FileReader("Athletes.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<Athlete>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static Athlete getAthlete(List<Athlete> athletes, UUID id) {
        Athlete athlete = null;
        for (Athlete a : athletes) {
            if (a.getId().equals(id)) {
                athlete = a;
                break;
            }
        }        
        return athlete;
    }

}

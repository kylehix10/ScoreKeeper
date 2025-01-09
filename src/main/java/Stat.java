//Kyle Hix

import java.util.HashMap;
import java.util.Map;

public class Stat {
    private Map<String, Integer> stats;

    
    public Stat() {
        stats = new HashMap<>();
        // Initialize with default stat types
        stats.put("rushingYards", 0);
        stats.put("passingYards", 0);
        stats.put("receivingYards ", 0);
        stats.put("touchDowns", 0);
        stats.put("fumbles", 0);
        stats.put("interceptions", 0);
        stats.put("passAttempts", 0);
        stats.put("completions", 0);
        stats.put("receptions", 0);
    }

    // Increment a specific stat
    public void incrementStat(String statType, int value) {
        stats.put(statType, stats.getOrDefault(statType, 0) + value);
    }

    public void decrementStat(String statType, int value) {
        stats.put(statType, stats.getOrDefault(statType, 0) - value);
    }

    // Display all statistics
    public void displayStats() {
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display a specific stat
    public void displayStat(String statType) {
        if (stats.containsKey(statType)) {
            System.out.println(statType + ": " + stats.get(statType));
        } else {
            System.out.println("Stat not found: " + statType);
        }
    }
}

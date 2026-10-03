import java.util.*;

public class AChatServerSOutgoingTraffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> activeUsers = new HashSet<>();
        long totalTraffic = 0;
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            
            if (line.charAt(0) == '+') {
                activeUsers.add(line.substring(1));
            } else if (line.charAt(0) == '-') {
                activeUsers.remove(line.substring(1));
            } else {
                int colonIdx = line.indexOf(':');
                if (colonIdx != -1) {
                    String message = line.substring(colonIdx + 1);
                    totalTraffic += (long) message.length() * activeUsers.size();
                }
            }
        }
        System.out.println(totalTraffic);
    }
}
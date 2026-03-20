import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> results = new ArrayList<>();
        
        // Define email regex pattern
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailRegex);
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            List<String> emails = new ArrayList<>();
            
            while (matcher.find()) {
                emails.add(matcher.group());
            }
            
            // Build JSON string for this line
            StringBuilder json = new StringBuilder();
            json.append("{\"emails\":[");
            for (int i = 0; i < emails.size(); i++) {
                json.append("\"").append(emails.get(i)).append("\"");
                if (i < emails.size() - 1) json.append(",");
            }
            json.append("]}");
            
            results.add(json.toString());
        }
        
        scanner.close();
        
        // Print final JSON array
        System.out.print("[");
        for (int i = 0; i < results.size(); i++) {
            System.out.print(results.get(i));
            if (i < results.size() - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}

package ode05.chat;

import java.io.*;

// Server side: stores users in a CSV file (username,password)
public class UserStore {
    private static final File USERS_FILE = new File("users.csv");

    public static boolean register(String username, String password) {
        // Reject empty input and commas (would break the CSV)
        if (username.isBlank() || password.isBlank()
                || username.contains(",") || password.contains(",")) {
            return false;
        }
        if (findPassword(username) != null) {
            return false;
        }
        // true = append, don't overwrite existing users
        try (PrintWriter writer = new PrintWriter(new FileWriter(USERS_FILE, true))) {
            writer.println(username + "," + password);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean login(String username, String password) {
        String stored = findPassword(username);
        return stored != null && stored.equals(password);
    }

    // Returns the stored password or null if the user doesn't exist
    private static String findPassword(String username) {
        if (!USERS_FILE.exists()) {
            return null;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username)) {
                    return parts[1];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

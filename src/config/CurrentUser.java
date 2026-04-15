package config;

/**
 * Holds information about the currently logged-in user so that
 * other forms (like profile screens) can access it easily.
 */
public class CurrentUser {
    public static int id = -1;
    public static String fullName;
    public static String email;
    public static String type;   // "admin" or "user"
    public static String status; // e.g. "active"
}


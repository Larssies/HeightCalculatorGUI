package utils;

public class System {

    static String os = java.lang.System.getProperty("os.name").toLowerCase();

    public static String checkOperatingSystem() {
        if (os.contains("win")) {
            return "Windows";
        }
        if (os.contains("mac")) {
            return "MacOS";
        }
        if (os.contains("nix") || os.contains("nux")) {
            return "Linux";
        }
        return "Unknown";
    }

}

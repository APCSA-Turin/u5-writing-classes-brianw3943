public class RaceUtility {
    private RaceUtility() { }
    public static double milesToKm(double miles) {
        return miles * 1.609;
    }
    public static double kmToMiles(double km) {
        return km * 0.621;
    }
    public static String makeProper(String origStr) {
        String lower = origStr.toLowerCase();
        String proper = "";
        for (int i = 0; i < lower.length(); i++) {
            String character = lower.substring(i, i + 1);
            if (i == 0) {
                proper += character.toUpperCase();
            } else {
                String charBefore = lower.substring(i - 1, i);
                if (charBefore.equals(" ")) {
                    proper += character.toUpperCase();
                } else {
                    proper += character;
                }
            }
        }
        return proper;
    }
}

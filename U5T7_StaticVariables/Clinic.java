public class Clinic {
    private static int totalClinics = 0;
    private static int totalVaccineCount = 0;
    private int clinicVaccineCount;
    private Person mostRecentlyVaccinated;
    public Clinic() {
        clinicVaccineCount = 0;
        totalClinics++;
        mostRecentlyVaccinated = null;
    }
    public static int getTotalClinics() {
        return totalClinics;
    }
    public static int getTotalVaccineCount() {
        return totalVaccineCount;
    }
    public int getClinicVaccineCount() {
        return clinicVaccineCount;
    }
    public Person mostRecentlyVaccinated() {
        return mostRecentlyVaccinated;
    }
    public boolean vaccinate (Person person) {
        if (person.isVaccinated() == false) {
            person.setVaccinated(true);
            mostRecentlyVaccinated = person;
            totalVaccineCount++;
            clinicVaccineCount++;
            return true;
        } else {
            return false;
        }
    }
}

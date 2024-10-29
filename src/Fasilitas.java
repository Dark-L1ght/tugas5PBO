public class Fasilitas {
    private String facilityName;
    private double facilityCost;

    public Fasilitas(String facilityName, double facilityCost) {
        this.facilityName = facilityName;
        this.facilityCost = facilityCost;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public double getFacilityCost() {
        return facilityCost;
    }
}

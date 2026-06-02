import java.util.Date;
import java.util.Objects;

public class Plant extends LivingBeing {
    private static int nextPlantId = 1; // Static counter for unique IDs
    private final int plantId;
    private String GrowthSeason;

    public Plant(String GrowthSeason, String name, String gender, Date arrivalDate, String location, String species, String conservationStatus, String habitatType) {
        super(name, gender, arrivalDate, location, species, conservationStatus, habitatType);
        this.GrowthSeason = GrowthSeason;
        this.plantId = nextPlantId++;
    }

    public int getPlantId() {
        return plantId;
    }

    public String getGrowthSeason() {
        return GrowthSeason;
    }

    public void setGrowthSeason(String growthSeason) {
        GrowthSeason = growthSeason;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return plantId == plant.plantId && Objects.equals(GrowthSeason, plant.GrowthSeason);
    }



    @Override
    public void displayInfo() {
        System.out.println("Plant ID: " + plantId);
        System.out.println("Plant name: " + name);
        System.out.println("Species: " + getSpecies());
        System.out.println("Gender: " + getGender());
        System.out.println("Arrival Date: " + getArrivalDate());
        System.out.println("Location: " + getLocation());
        System.out.println("Conservation Status: " + getConservationStatus());
        System.out.println("Habitat Type: " + getHabitatType());
        System.out.println("Growth Season: " + GrowthSeason);
    }
}

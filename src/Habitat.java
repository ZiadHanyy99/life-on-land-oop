import java.util.ArrayList;
import java.util.Objects;

public class Habitat {
    private static int nextHabitatId = 1; // Static counter for unique IDs
    private final int habitatId;         // Unique ID for each instance
    private String type;
    private String climate;
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Plant> plants = new ArrayList<>();


    public Habitat( String type, String climate) {
        this.habitatId = nextHabitatId++;
        this.type = type;
        this.climate = climate;
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
    }


    public int getHabitatId() {
        return habitatId;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }


    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    void addPlant(Plant plant) {
        plants.add(plant);
    }

    void removePlant(Plant plant) {
        plants.remove(plant);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Habitat habitat = (Habitat) o;
        return habitatId == habitat.habitatId && Objects.equals(type, habitat.type) && Objects.equals(climate, habitat.climate) && Objects.equals(animals, habitat.animals) && Objects.equals(plants, habitat.plants);
    }



    void displayHabitatInfo() {
        System.out.println("Habitat ID: " + habitatId);
        System.out.println("Type: " + type);
        System.out.println("Climate: " + climate);
    }


}

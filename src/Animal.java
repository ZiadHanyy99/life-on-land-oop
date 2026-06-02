import java.util.Date;
public class Animal extends LivingBeing{
    private int age;
    private int weight;
    private static int nextAnimalId = 1; // Static counter for unique IDs
    private final int animalId;

    public Animal(String name, String gender, Date arrivalDate, String location, String species, String conservationStatus, String habitatType, int age, int weight) throws InvalidAnimalAgeException{

      super(name, gender, arrivalDate, location, species, conservationStatus, habitatType);
        if (age < 0) {
            throw new InvalidAnimalAgeException("Animal age cannot be negative.");
        }
      this.age = age;
      this.weight = weight;
      this.animalId = nextAnimalId++;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && weight == animal.weight && animalId == animal.animalId;
    }



    // Overriding the displayInfo() method from LivingBeing
    @Override
    public void displayInfo() {
        System.out.println("Animal ID: " + animalId);
        System.out.println("Animal name: " + name);
        System.out.println("Species: " + getSpecies());
        System.out.println("Gender: " + getGender());
        System.out.println("Arrival Date: " + getArrivalDate());
        System.out.println("Location: " + getLocation());
        System.out.println("Conservation Status: " + getConservationStatus());
        System.out.println("Habitat Type: " + getHabitatType());
        System.out.println("Age: " + age);
        System.out.println("weight: " + weight);
    }


}

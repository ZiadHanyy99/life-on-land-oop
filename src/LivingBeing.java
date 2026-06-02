import java.util.Date;
import java.util.Objects;

public abstract class LivingBeing {
    public String name;
    private String gender;
    private Date arrivalDate;
    private String location;
    private String species;
    private String conservationStatus;
    private String habitatType;


    public LivingBeing(String name, String gender, Date arrivalDate, String location, String species, String conservationStatus , String habitatType) {
        this.name = name;
        this.gender = gender;
        this.arrivalDate = arrivalDate;
        this.location = location;
        this.species = species;
        this.conservationStatus = conservationStatus;
        this.habitatType = habitatType;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public String getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LivingBeing that = (LivingBeing) o;
        return Objects.equals(name, that.name) && Objects.equals(gender, that.gender) && Objects.equals(arrivalDate, that.arrivalDate) && Objects.equals(location, that.location) && Objects.equals(species, that.species) && Objects.equals(conservationStatus, that.conservationStatus) && Objects.equals(habitatType, that.habitatType);
    }



    // Abstract method to be implemented by subclasses
    abstract void displayInfo();
}

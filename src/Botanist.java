import java.util.Objects;

public class Botanist extends Staff{
    private String researchFocus;

    public Botanist(String researchFocus,  String name, String position, double salary) {
        super( name, position, salary);
        this.researchFocus = researchFocus;
    }

    public String getResearchFocus() {
        return researchFocus;
    }

    public void setResearchFocus(String researchFocus) {
        this.researchFocus = researchFocus;
    }

    @Override
    void performDuty() {
        System.out.println(getName() + " is conducting botanical research.");
    }

    // Method to study a plant
    void studyPlant(Plant plant) {
        System.out.println(getName() + " is studying the plant: " + plant.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Botanist botanist = (Botanist) o;
        return Objects.equals(researchFocus, botanist.researchFocus);
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Focus: " + researchFocus);
    }

}

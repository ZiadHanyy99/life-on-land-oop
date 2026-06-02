import java.util.Objects;

public class Ranger extends Staff implements Monitorable{
    private String patrolArea;

    public Ranger(String patrolArea, String name, String position, double salary) {
        super( name, position, salary);
        this.patrolArea = patrolArea;
    }

    public String getPatrolArea() {
        return patrolArea;
    }

    public void setPatrolArea(String patrolArea) {
        this.patrolArea = patrolArea;
    }

    @Override
    void performDuty() {
        System.out.println(getName() + " is patrolling the area: " + patrolArea);
    }

    // Method to monitor a habitat
    public void monitorHabitat(Habitat habitat) {
        System.out.println(getName() + " is monitoring habitat: " + habitat.getType());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ranger ranger = (Ranger) o;
        return Objects.equals(patrolArea, ranger.patrolArea);
    }



    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patrol Area: " + patrolArea);
    }

}

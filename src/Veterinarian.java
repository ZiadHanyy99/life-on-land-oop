import javax.naming.Name;
import java.util.Objects;

public class Veterinarian extends Staff implements Caring{
   private String specialization;

   public Veterinarian(String specialization , String name, String position, double salary) {
       super( name, position, salary);
       this.specialization = specialization;
   }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void performDuty() {
        System.out.println(getName() + " is performing veterinary duties.");
    }

    public void treatAnimal(Animal animal) {
        System.out.println(getName() + " is treating the animal: " + animal.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veterinarian that = (Veterinarian) o;
        return Objects.equals(specialization, that.specialization);
    }



    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }

}

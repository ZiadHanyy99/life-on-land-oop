import java.util.ArrayList;
import java.util.Objects;

public class NaturePreserve {
    private String PreserveName;
    private String location;
    private double size;
     ArrayList<Habitat> habitats = new ArrayList<>();
     ArrayList<Staff> staff = new ArrayList<>();
     ArrayList<Visitor> visitors = new ArrayList<>();
     ArrayList<Tour> tours = new ArrayList<>();
     ArrayList<Donation> donations = new ArrayList<>();

    public NaturePreserve(String preserveName, String location, double size) {
        this.PreserveName = preserveName;
        this.location = location;
        this.size = size;
        this.staff = new ArrayList<>();
        this.habitats = new ArrayList<>();
        this.tours = new ArrayList<>();
        this.donations = new ArrayList<>();
        this.visitors = new ArrayList<>();

    }


    public String getPreserveName() {
        return PreserveName;
    }

    public void setPreserveName(String preserveName) {
        PreserveName = preserveName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }



    public void addHabitat(Habitat habitat) {
        habitats.add(habitat);
    }
    public void removehabitat(Habitat habitat){
        habitats.remove(habitat);
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }
    public void removestaff(Staff staffMember){
        staff.remove(staffMember);
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }
    public void removeViator(Visitor visitor){
        visitors.remove(visitor);
    }


    public void addTour(Tour tour) {
        tours.add(tour);
    }
    public void removetour(Tour tour){
        tours.remove(tour);
    }

    public void addDonation(Donation donation) {
        donations.add(donation);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NaturePreserve that = (NaturePreserve) o;
        return Double.compare(size, that.size) == 0 && Objects.equals(PreserveName, that.PreserveName) && Objects.equals(location, that.location) && Objects.equals(habitats, that.habitats) && Objects.equals(staff, that.staff) && Objects.equals(visitors, that.visitors) && Objects.equals(tours, that.tours) && Objects.equals(donations, that.donations);
    }



    // Display details of the Nature Preserve
    public void displayPreserveDetails() {
        System.out.println("Nature Preserve: " + PreserveName);
        System.out.println("Location: " + location);
        System.out.println("Size: " + size + " square meters");
        System.out.println("Number of Habitats: " + habitats.size());
        System.out.println("Number of Staff: " + staff.size());
        System.out.println("Number of Visitors: " + visitors.size());
        System.out.println("Number of Tours: " + tours.size());
        System.out.println("Number of Donations: " + donations.size());
    }

}

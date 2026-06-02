import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tour {
    private static int nextTourID = 1; // Static counter for auto-incrementing tour IDs
    private final int tourID;
    private String tourName;
    private String date;
    private double price;
    ArrayList<Visitor> visitors = new ArrayList<>();

    public Tour( String tourName, String date, double price) {
        this.tourID = nextTourID++;
        this.tourName = tourName;
        this.date = date;
        this.price = price;
        this.visitors = new ArrayList<>();
    }

    public int getTourID() {
        return tourID;
    }



    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to add a visitor to the tour
    void addVisitor(Visitor visitor) {
        visitors.add(visitor);
        System.out.println(visitor.getVisitorName() + " has been added to the tour: " + tourName);
    }

    // Method to remove a visitor from the tour
    void removeVisitor(Visitor visitor) {
        visitors.remove(visitor);
        System.out.println(visitor.getVisitorName() + " has been removed from the tour: " + tourName);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return tourID == tour.tourID && Double.compare(price, tour.price) == 0 && Objects.equals(tourName, tour.tourName) && Objects.equals(date, tour.date) && Objects.equals(visitors, tour.visitors);
    }


    // Method to display tour details
    void displayTourDetails() {
        System.out.println("Tour ID: " + tourID);
        System.out.println("Tour Name: " + tourName);
        System.out.println("Date: " + date);
        System.out.println("Price: $" + price);
        System.out.println("Visitors: ");
        for (Visitor visitor : visitors) {
            System.out.println("- " + visitor.getVisitorName());
        }
    }
}

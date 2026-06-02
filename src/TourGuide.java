public class TourGuide extends Staff {
    private int TourConductor;

    public TourGuide(int TourConductor, String name, String position, double salary) {
        super(name, position, salary);
        TourConductor = TourConductor;
    }

    public int getTourConductor() {
        return TourConductor;
    }

    public void setTourConductor(int tourConductor) {
        TourConductor = tourConductor;
    }

    @Override
    void performDuty() {
        System.out.println(getName() + " is conducting a tour.");
    }

    // Method to lead a tour
    void leadTour(Tour tour) {
        System.out.println(getName() + " is leading tour: " + tour.getTourName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TourGuide tourGuide = (TourGuide) o;
        return TourConductor == tourGuide.TourConductor;
    }



    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tours Conducted: " + TourConductor);
    }
}

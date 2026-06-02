import java.util.Objects;

public abstract class Staff {
    private static int nextStaffId = 1; // Static counter for auto-incrementing IDs
    private final int staffId;
    private String Name;
    private String position;
    private double salary;

    public Staff(String name, String position, double salary) {
        this.Name = name;
        this.staffId = nextStaffId++;
        this.position = position;
        this.salary = salary;
    }




    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // Abstract method that must be implemented by subclasses
    abstract void performDuty();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffId == staff.staffId && Double.compare(salary, staff.salary) == 0 && Objects.equals(Name, staff.Name) && Objects.equals(position, staff.position);
    }



    // Method to display staff details
    public void displayInfo() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + Name);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
    }
}

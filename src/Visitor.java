import java.util.Objects;

public class Visitor {
    private String VisitorName;
    private int age;

    public Visitor( String VisitorName, int age) {

        this.VisitorName = VisitorName;
        this.age = age;
    }



    public String getVisitorName() {

        return VisitorName;
    }

    public void setVisitorName(String visitorName) {

        VisitorName = visitorName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Visitor visitor = (Visitor) o;
        return age == visitor.age && Objects.equals(VisitorName, visitor.VisitorName);
    }



    // Method to display visitor info
    public void displayVisitorInfo() {
        System.out.println("Name: " + VisitorName);
        System.out.println("Age: " + age);
    }


}

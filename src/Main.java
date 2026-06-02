import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize Nature Preserve and lists
        NaturePreserve naturePreserve = new NaturePreserve("Sunset Preserve", "California", 2500.5);
        ArrayList<Habitat> habitats = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Plant> plants = new ArrayList<>();
        ArrayList<Staff> staffList = new ArrayList<>();
        ArrayList<Tour> tours = new ArrayList<>();

        // Define user credentials
        String staffUsername = "staff";
        String staffPassword = "staff123";
        String visitorUsername = "visitor";
        String visitorPassword = "visitor123";

        // Authenticate user
        System.out.println("Welcome to the Nature Preserve System!");
        boolean authenticated = false;
        String loggedInUserRole = "";

        while (!authenticated) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equalsIgnoreCase(staffUsername) && password.equalsIgnoreCase(staffPassword)) {
                authenticated = true;
                loggedInUserRole = "staff";  // Staff role
                System.out.println("Login successful! Welcome, " + username + "!");
            } else if (username.equals(visitorUsername) && password.equals(visitorPassword)) {
                authenticated = true;
                loggedInUserRole = "visitor";  // Visitor role
                System.out.println("Login successful! Welcome, " + username + "!");
            } else {
                System.out.println("Invalid credentials. Please try again.");
            }
        }

        // Show appropriate menu for staff or visitor
        boolean exit = false;
        while (!exit) {
            if (loggedInUserRole.equals("staff")) {
                // Show staff menu
                showStaffMenu(scanner, habitats, animals, plants, staffList, tours, naturePreserve);
            } else if (loggedInUserRole.equals("visitor")) {
                showVisitorMenu(scanner, habitats, animals, plants, staffList, tours,naturePreserve);
            }
        }

        scanner.close();
    }

    // Staff Menu
    private static void showStaffMenu(Scanner scanner, ArrayList<Habitat> habitats, ArrayList<Animal> animals,
                                      ArrayList<Plant> plants, ArrayList<Staff> staffList, ArrayList<Tour> tours,
                                      NaturePreserve naturePreserve) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nWelcome to the Nature Preserve Menu!");
            System.out.println("1. Add Habitat");
            System.out.println("2. Remove Habitat");
            System.out.println("3. Add Animal");
            System.out.println("4. Remove Animal");
            System.out.println("5. Add Plant");
            System.out.println("6. Remove Plant");
            System.out.println("7. Add Staff");
            System.out.println("8. Remove Staff");
            System.out.println("9. Add Tour");
            System.out.println("10. Remove Tour");
            System.out.println("11. Display Preserve Details");
            System.out.println("12. Display All Habitats");
            System.out.println("13. Display All Animals");
            System.out.println("14. Display All Plants");
            System.out.println("15. Display All Staff");
            System.out.println("16. Display All Tours");
            System.out.println("17. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Habitat
                    System.out.print("Enter habitat type: ");
                    String type = scanner.nextLine();
                    System.out.print("Enter habitat climate: ");
                    String climate = scanner.nextLine();
                    habitats.add(new Habitat(type, climate));
                    System.out.println("Habitat added!");
                    break;
                case 2:
                    // Remove Habitat
                    System.out.print("Enter habitat type to remove: ");
                    String habitatTypeToRemove = scanner.nextLine();
                    habitats.removeIf(habitat -> habitat.getType().equalsIgnoreCase(habitatTypeToRemove));
                    System.out.println("Habitat removed!");
                    break;
                case 3:
                    // Add Animal
                    System.out.print("Enter animal name: ");
                    String animalName = scanner.nextLine();
                    System.out.print("Enter animal species: ");
                    String species = scanner.nextLine();
                    System.out.print("Enter habitat type for animal: ");
                    String animalHabitatType = scanner.nextLine();
                    System.out.print("Enter animal age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter animal weight: ");
                    int weight = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    animals.add(new Animal(animalName, "Unknown", new Date(), "", species, "Unknown", animalHabitatType, age, weight));
                    System.out.println("Animal added!");
                    break;
                case 4:
                    // Remove Animal
                    System.out.print("Enter animal name to remove: ");
                    String animalNameToRemove = scanner.nextLine();
                    animals.removeIf(animal -> animal.name.equalsIgnoreCase(animalNameToRemove));
                    System.out.println("Animal removed!");
                    break;
                case 5:
                    // Add Plant
                    System.out.print("Enter plant name: ");
                    String plantName = scanner.nextLine();
                    System.out.print("Enter plant species: ");
                    String plantSpecies = scanner.nextLine();
                    System.out.print("Enter habitat type for plant: ");
                    String plantHabitatType = scanner.nextLine();
                    System.out.print("Enter plant growth season: ");
                    String growthSeason = scanner.nextLine();
                    plants.add(new Plant(growthSeason, plantName, "Unknown", new Date(), "", plantSpecies, "Unknown", plantHabitatType));
                    System.out.println("Plant added!");
                    break;
                case 6:
                    // Remove Plant
                    System.out.print("Enter plant name to remove: ");
                    String plantNameToRemove = scanner.nextLine();
                    plants.removeIf(plant -> plant.name.equalsIgnoreCase(plantNameToRemove));
                    System.out.println("Plant removed!");
                    break;
                case 7:
                    // Add Staff
                    System.out.print("Enter staff name: ");
                    String staffName = scanner.nextLine();
                    System.out.print("Enter staff position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter staff salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    staffList.add(new Staff(staffName, position, salary) {
                        @Override
                        void performDuty() {
                            System.out.println(staffName + " is performing duties as " + position);
                        }
                    });
                    System.out.println("Staff added!");
                    break;
                case 8:
                    // Remove Staff
                    System.out.print("Enter staff name to remove: ");
                    String staffNameToRemove = scanner.nextLine();
                    staffList.removeIf(staff -> staff.getName().equalsIgnoreCase(staffNameToRemove));
                    System.out.println("Staff removed!");
                    break;
                case 9:
                    // Add Tour
                    System.out.print("Enter tour name: ");
                    String tourName = scanner.nextLine();
                    System.out.print("Enter tour date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter tour price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    tours.add(new Tour(tourName, date, price));
                    System.out.println("Tour added!");
                    break;
                case 10:
                    // Remove Tour
                    System.out.print("Enter tour name to remove: ");
                    String tourNameToRemove = scanner.nextLine();
                    tours.removeIf(tour -> tour.getTourName().equalsIgnoreCase(tourNameToRemove));
                    System.out.println("Tour removed!");
                    break;
                case 11:
                    // Display Preserve Details
                    System.out.println("Preserve Name: " + naturePreserve.getPreserveName());
                    System.out.println("Location: " + naturePreserve.getLocation());
                    System.out.println("Area: " + naturePreserve.getSize() + " acres");
                    System.out.println("Habitats: " + habitats.size());
                    System.out.println("Animals: " + animals.size());
                    System.out.println("Plants: " + plants.size());
                    System.out.println("Staff: " + staffList.size());
                    System.out.println("Tours: " + tours.size());
                    break;
                case 12:
                    System.out.println("\nHabitats:");
                    for (int i = 0; i < habitats.size(); i++) {
                        System.out.println((i + 1) + ".");
                        habitats.get(i).displayHabitatInfo();
                        System.out.println("-------------------------");
                    }
                    break;
                case 13:
                    System.out.println("\nAnimals:");
                    for (int i = 0; i < animals.size(); i++) {
                        System.out.println((i + 1) + ".");
                        animals.get(i).displayInfo();
                        System.out.println("-------------------------");
                    }
                    break;
                case 14:
                    System.out.println("\nPlants:");
                    for (int i = 0; i < plants.size(); i++) {
                        System.out.println((i + 1) + ".");
                        plants.get(i).displayInfo();
                        System.out.println("-------------------------");
                    }
                    break;
                case 15:
                    System.out.println("\nStaff:");
                    for (int i = 0; i < staffList.size(); i++) {
                        System.out.println((i + 1) + ".");
                        staffList.get(i).displayInfo();
                        System.out.println("-------------------------");
                    }
                    break;
                case 16:
                    // Display Tours
                    System.out.println("\nTours:");
                    for (int i = 0; i < tours.size(); i++) {
                        System.out.println((i + 1) + ".");
                        tours.get(i).displayTourDetails();
                        System.out.println("-------------------------");
                    }
                    break;
                case 17:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Visitor Menu
    private static void showVisitorMenu(Scanner scanner, ArrayList<Habitat> habitats, ArrayList<Animal> animals,
                                        ArrayList<Plant> plants, ArrayList<Staff> staffList, ArrayList<Tour> tours,NaturePreserve naturePreserve) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nVisitor Menu:");
            System.out.println("1. Display Preserve Details");
            System.out.println("2. Display Habitats");
            System.out.println("3. Display Animals");
            System.out.println("4. Display Plants");
            System.out.println("5. Display Tours");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Preserve Name: " +naturePreserve.getPreserveName());
                    System.out.println("Location: " + naturePreserve.getLocation());
                    System.out.println("Area: " + naturePreserve.getSize() + " acres");
                    break;
                case 2:
                    for (int i = 0; i < habitats.size(); i++) {
                        habitats.get(i).displayHabitatInfo();
                    }
                    break;
                case 3:
                    for (int i = 0; i < animals.size(); i++) {
                        animals.get(i).displayInfo();
                    }
                    break;
                case 4:
                    for (int i = 0; i < plants.size(); i++) {
                        plants.get(i).displayInfo();
                    }
                    break;
                case 5:
                    for (int i = 0; i < tours.size(); i++) {
                        tours.get(i).displayTourDetails();
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
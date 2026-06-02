import java.util.Date;
import java.util.Objects;

public class Donation {
    private static int nextDonationID = 1; // Static counter for auto-incrementing IDs
    private final int donationID;
    private double amount;
    private String donorName;
    private Date date;

    public Donation( double amount, String donorName, Date date) throws InvalidDonationAmountException{
        if (amount <= 0) {
            throw new InvalidDonationAmountException("Donation amount must be positive.");
        }
        this.donationID = nextDonationID++;
        this.amount = amount;
        this.donorName = donorName;
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public Date getDate() {
        return date;
    }

    public int getDonationID() {
        return donationID;
    }

    public double getAmount() {
        return amount;
    }

    public String getDonorName() {
        return donorName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return donationID == donation.donationID && Double.compare(amount, donation.amount) == 0 && Objects.equals(donorName, donation.donorName) && Objects.equals(date, donation.date);
    }



    // Method to display donation details
    void displayDonationInfo() {
        System.out.println("Donation ID: " + donationID);
        System.out.println("Amount: $" + amount);
        System.out.println("Donor Name: " + donorName);
        System.out.println("Date: " + date);
    }
}

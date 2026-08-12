package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private final String role; // "User" or "Admin"
    private int loyaltyPoints;
    private List<String> bookingHistory;
    private String preferredLanguage;
    private String themePreference;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
        this.loyaltyPoints = 0;
        this.bookingHistory = new ArrayList<>();
        this.preferredLanguage = "English";
        this.themePreference = "Light";
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public boolean isAdmin() {
        return "Admin".equalsIgnoreCase(role);
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        if (points > 0) {
            this.loyaltyPoints += points;
        } else {
            System.err.println("Invalid points: Points must be positive.");
        }
    }

    public void deductLoyaltyPoints(int points) {
        if (points > 0 && this.loyaltyPoints >= points) {
            this.loyaltyPoints -= points;
        } else {
            System.err.println("Invalid points deduction: Points must be positive and not exceed current balance.");
        }
    }

    public List<String> getBookingHistory() {
        return new ArrayList<>(bookingHistory);
    }

    public void addBooking(String itemName) {
        if (itemName != null && !itemName.isEmpty()) {
            this.bookingHistory.add(itemName);
        } else {
            System.err.println("Invalid item name: Cannot add null or empty booking.");
        }
    }

    public void clearBookingHistory() {
        this.bookingHistory.clear();
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        if (preferredLanguage != null && (preferredLanguage.equalsIgnoreCase("English") || preferredLanguage.equalsIgnoreCase("French"))) {
            this.preferredLanguage = preferredLanguage;
        } else {
            System.err.println("Invalid language: Supported languages are English and French.");
        }
    }

    public String getThemePreference() {
        return themePreference;
    }

    public void setThemePreference(String themePreference) {
        if (themePreference != null && (themePreference.equalsIgnoreCase("Light") || themePreference.equalsIgnoreCase("Dark"))) {
            this.themePreference = themePreference;
        } else {
            System.err.println("Invalid theme: Supported themes are Light and Dark.");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                ", bookingHistory=" + bookingHistory +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                ", themePreference='" + themePreference + '\'' +
                '}';
    }
}

import java.sql.*;
import java.util.Scanner;

public class MunicipalTaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MUNICIPAL TAX SYSTEM ---");
            System.out.println("1. Add Citizen");
            System.out.println("2. View Citizens");
            System.out.println("3. Update Citizen");
            System.out.println("4. Delete Citizen");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(sc.nextLine()); // FIXED

            switch (choice) {

                case 1:
                    addCitizen(sc);
                    break;

                case 2:
                    viewCitizens();
                    break;

                case 3:
                    updateCitizen(sc);
                    break;

                case 4:
                    deleteCitizen(sc);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // 🔹 ADD
    public static void addCitizen(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            String query = "INSERT INTO citizens(name, address, phone) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, phone);

            ps.executeUpdate();
            System.out.println("Citizen Added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 VIEW
    public static void viewCitizens() {
        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM citizens";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("\n--- Citizens List ---");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("address") + " | " +
                        rs.getString("phone")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 UPDATE
    public static void updateCitizen(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Enter ID to update: ");
            int id = Integer.parseInt(sc.nextLine()); // FIXED

            System.out.print("New Name: ");
            String name = sc.nextLine();

            System.out.print("New Address: ");
            String address = sc.nextLine();

            System.out.print("New Phone: ");
            String phone = sc.nextLine();

            String query = "UPDATE citizens SET name=?, address=?, phone=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, phone);
            ps.setInt(4, id);

            ps.executeUpdate();
            System.out.println("Citizen Updated!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 DELETE
    public static void deleteCitizen(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Enter ID to delete: ");
            int id = Integer.parseInt(sc.nextLine()); // FIXED

            String query = "DELETE FROM citizens WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Citizen Deleted!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

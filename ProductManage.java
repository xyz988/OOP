import java.util.Scanner;

class Product { 
    int productId;
    String name;
    double price;

    void acceptProductDetails(Scanner sc) {
        System.out.print("Enter product ID: ");
        productId = sc.nextInt();
        sc.nextLine(); // Clear buffer
        System.out.print("Enter product name: ");
        name = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronic extends Product { 
    String brand;
    int warranty;

    void acceptElectronicsDetails(Scanner sc) {
        acceptProductDetails(sc);
        sc.nextLine(); // Clear buffer
        System.out.print("Enter brand name: ");
        brand = sc.nextLine();
        System.out.print("Enter warranty (in years): ");
        warranty = sc.nextInt();
    }

    void displayElectronicDetails() {
        displayProductDetails();
        System.out.println("Brand Name: " + brand);
        System.out.println("Warranty: " + warranty + " years");
    }
}

class Clothing extends Product { 
    String size;
    String material;

    void acceptClothingDetails(Scanner sc) {
        acceptProductDetails(sc);
        sc.nextLine(); // Clear buffer
        System.out.print("Enter size: ");
        size = sc.nextLine();
        System.out.print("Enter material: ");
        material = sc.nextLine();
    }

    void displayClothingDetails() {
        displayProductDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

public class ProductManage { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Electronic product handling
        System.out.println("--- Enter Electronic Details ---");
        Electronic e = new Electronic();
        e.acceptElectronicsDetails(sc);
        
        System.out.println("\n--- Electronic Details ---");
        e.displayElectronicDetails();

        // Clothing product handling
        System.out.println("\n--- Enter Clothing Details ---");
        Clothing c = new Clothing();
        c.acceptClothingDetails(sc);
        
        System.out.println("\n--- Clothing Details ---");
        c.displayClothingDetails();

        sc.close();
    }
}

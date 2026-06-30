package Week_1_Engineering_Concepts.DataStructuresAndAlgorithms.EcommercePlatformSearch;
import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product[ID=" + productId + ", Name=" + productName + ", Category=" + category + "]";
    }
}

public class EcommerceSearch {

    // 1. Linear Search Algorithm - O(n) Time Complexity
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null; // Not found
    }

    // 2. Binary Search Algorithm - O(log n) Time Complexity (Requires sorted array)
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        // Setup initial unsorted product array
        Product[] inventory = {
            new Product(103, "Gaming Mouse", "Electronics"),
            new Product(101, "Mechanical Keyboard", "Electronics"),
            new Product(105, "Anker USB-C Cable", "Accessories"),
            new Product(102, "Dell 27 Inch Monitor", "Electronics"),
            new Product(104, "Leather Office Chair", "Furniture")
        };

        String searchTarget = "Gaming Mouse";

        System.out.println("=== Running Linear Search ===");
        Product result1 = linearSearch(inventory, searchTarget);
        System.out.println("Found via Linear Search: " + result1);

        System.out.println("\n--- Preparing Array for Binary Search ---");
        // Binary search requires items to be sorted explicitly by the key we are searching for
        Arrays.sort(inventory, Comparator.comparing(p -> p.productName.toLowerCase()));
        
        System.out.println("Sorted Inventory for Binary Search:");
        for(Product p : inventory) {
            System.out.println("  " + p.productName);
        }

        System.out.println("\n=== Running Binary Search ===");
        Product result2 = binarySearch(inventory, searchTarget);
        System.out.println("Found via Binary Search: " + result2);
    }
}
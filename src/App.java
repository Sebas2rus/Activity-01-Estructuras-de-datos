import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> inventory = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        // Menú de opciones
        int menuOption;
        do {
            System.out.println("\nMENÚ DE PRODUCTOS\n" + //
                    "1. Agregar producto\n" + //
                    "2. Consultar productos\n" + //
                    "3. Filtrar categoria\n" + //
                    "4. Salir\n");
            System.out.println("Seleccione una opción: \n");
            menuOption = scanner.nextInt();
            switch (menuOption) {
                case 1 -> createProduct();
                case 2 -> listProducts();
                case 3 -> filterCategory();
                case 4 -> {
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                }
                default -> System.out.println("Opción invalida, porfavor selecciona una opción válida");

            }

        } while (menuOption != 4);
    }

    public static void createProduct() {
        // Lógica para crear un producto
        Scanner src = new Scanner(System.in);

        System.out.println("Nombre del producto: ");
        String name = src.nextLine();

        System.out.println("Marca del producto: ");
        String brand = src.nextLine();

        System.out.println("Precio del producto: ");
        double price = src.nextDouble();
        src.nextLine(); // Limpia el salto de línea pendiente

        System.out.println("Categoría del producto: ");
        String category = src.nextLine();
        System.out.println("Cantidad del producto: ");
        int quantity = src.nextInt();

        Product product = new Product(name, price, quantity, brand, category);
        inventory.add(product);
        System.out.println("Creando un nuevo producto...");
    }

    public static void listProducts() {
        // Lógica para Listar un producto
        if (inventory.isEmpty()) {
            System.out.println("No hay productos en el inventario");
            return;
        } else {
            for (Product product : inventory) {
                // Funcion que devuelve la representacion en String del objeto
                System.out.println(product.toString());
            }
        }

    }

    public static void filterCategory() {
        // Lógica para filtrar por categorias
        System.out.print("Escriba el nombre de la categoría: ");
        String filtro = scanner.nextLine().toLowerCase();

        ArrayList<Product> filteredProducts = new ArrayList<>();

        for (Product product : inventory) {
            if (product.getCategory().toLowerCase().contains(filtro)) {
                filteredProducts.add(product);
            }
        }
        if (filteredProducts.isEmpty()) {
            System.out.println("No se encontraron productos en la categoría: " + filtro);
        } else {
            System.out.println("Productos en la categoría '" + filtro + "':");
            for (Product product : filteredProducts) {
                System.out.println(product.toString());
            }
        }

    }
}

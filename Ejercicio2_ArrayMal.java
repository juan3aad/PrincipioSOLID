public class Ejercicio2_ArrayMal {
    public static void main(String[] args) {
        String[] fruit = initializeFruit();
        printFruit(fruit);
    }

    private static String[] initializeFruit() {
        return new String[]{"manzana", "banano", "fresa"};
    }

    private static void printFruit(String[] fruits) {
        System.out.println("Lista de frutas:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}

public class Ejercicio4_ArrayBien {

    public class Main {
        public static void main(String[] args) {
            String[] fruits = initializeFruits();
            printFruits(fruits);
        }

        // Método para inicializar el array de frutas
        private static String[] initializeFruits() {
            return new String[] { "manzana", "banano", "fresa" };
        }

        // Método para imprimir las frutas
        private static void printFruits(String[] fruits) {
            System.out.println("Lista de frutas:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }
}
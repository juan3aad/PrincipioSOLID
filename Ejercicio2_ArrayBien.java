public class Ejercicio2_ArrayBien {

    public class Main {
        public static void main(String[] args) {
            String[] fruitNames = initializeFruitNames();
            printFruitNames(fruitNames);
        }

        // Método para inicializar el array de frutas
        private static String[] initializeFruitNames() {
            return new String[] { "manzana", "banano", "fresa" };
        }

        // Método para imprimir las frutas
        private static void printFruitNames(String[] fruitNames) {
            System.out.println("Lista de nombres de frutas:");
            for (String fruitName : fruitNames) {
                System.out.println(fruitName);
            }
        }
    }
}
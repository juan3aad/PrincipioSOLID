import java.util.ArrayList;
import java.util.List;

public class Ejercicio6_PracticaSegunTipoMal {

    public static void main(String[] args) {

        System.out.println("Realizando pruebas");
        // Arreglo de temperaturas celsius
        double[] arrayOfNums = {33.6, 12.34};

        // Dirección IP del servidor
        String ip = "123.123.123.123";

        // Listado de usuarios
        List<User> people = new ArrayList<>();
        people.add(new User(1, "fernando@google.com"));
        people.add(new User(2, "juan@google.com"));
        people.add(new User(3, "melissa@google.com"));

        // Listado de emails de los usuarios
        List<String> emails = new ArrayList<>();
        for (User user : people) {
            emails.add(user.getEmail());
        }

        // Variables booleanas de un video juego
        boolean jump = false;
        boolean run = true;
        boolean noTieneItems = true;
        boolean loading = false;

        // Otros ejercicios
        // Tiempo inicial
        long start = System.currentTimeMillis();
        // ...
        // 3 doritos después
        // ...
        // Tiempo al final
        long end = System.currentTimeMillis() - start;
    }

    // Clase para representar un usuario
    static class User {
        private int id;
        private String email;

        public User(int id, String email) {
            this.id = id;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    // Funciones
    // Obtiene los libros
    public static void book() {
        throw new UnsupportedOperationException("Function not implemented.");
    }

    // Obtiene libros desde un URL
    public static void booksUrl(String u) {
        throw new UnsupportedOperationException("Function not implemented.");
    }

    // Obtiene el área de un cuadrado basado en sus lados
    public static void areaCuadrado(double s) {
        throw new UnsupportedOperationException("Function not implemented.");
    }

    // Imprime el trabajo si el trabajo está activo
    public static void printJobIfJobIsActive() {
        throw new UnsupportedOperationException("Function not implemented.");
    }
}

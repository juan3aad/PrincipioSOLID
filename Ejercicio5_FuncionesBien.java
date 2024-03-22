import java.util.HashMap;
import java.util.Map;

public class Ejercicio5_FuncionesMal {
    private Map<String, User> users;

    public UserManager() {
        this.users = new HashMap<>();
    }

    
    public void createUser(String username) {
        if (!users.containsKey(username)) {
            User newUser = new User(username);
            users.put(username, newUser);
            System.out.println("Usuario creado: " + newUser);
        } else {
            System.out.println("El usuario ya existe");
        }
    }

    
    public void updateUser(String username, String newName) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (!newName.isEmpty()) {
                user.setName(newName);
                System.out.println("Usuario actualizado: " + user);
            } else {
                System.out.println("El nuevo nombre está vacío");
            }
        } else {
            System.out.println("El usuario no existe");
        }
    }

    
    public void sendEmail(String username, String email, String message) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (email != null && !email.isEmpty() && message != null && !message.isEmpty()) {
                // Aquí enviarías el correo electrónico
                System.out.println("Enviando correo electrónico a " + email + ": " + message);
            } else {
                System.out.println("Campos de correo electrónico no válidos");
            }
        } else {
            System.out.println("El usuario no existe");
        }
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Ejemplo de uso de las funciones
        userManager.createUserIfNotExists("usuario1");
        userManager.createUserIfNotExists("usuario2");

        userManager.sendEmailIfFieldsValid("usuario1", "usuario1@example.com", "Hola, ¿cómo estás?");
        userManager.sendEmailIfFieldsValid("usuario2", "", "Mensaje de prueba"); // Correo vacío
        userManager.sendEmailIfFieldsValid("usuario3", "usuario3@example.com", ""); // Mensaje vacío
        userManager.sendEmailIfFieldsValid("usuario4", "", ""); // Correo y mensaje vacíos
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}


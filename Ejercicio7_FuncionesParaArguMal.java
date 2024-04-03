import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7_FuncionesParaArguMal {

    public void sendEmail(String recipient, String subject, String body) {
        // Validación simple de la dirección de correo electrónico
        if (!isValidEmail(recipient)) {
            System.out.println("Dirección de correo electrónico no válida.");
            return;
        }

        // Aquí iría la lógica para enviar el correo electrónico, pero por simplicidad, solo mostramos el cuerpo del correo
        System.out.println("Enviando correo electrónico a: " + recipient);
        System.out.println("Asunto: " + subject);
        System.out.println("Cuerpo: " + body);
    }

    private boolean isValidEmail(String email) {
        // Expresión regular para validar direcciones de correo electrónico
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Ejercicio7_FuncionesParaArguMal sender = new Ejercicio7_FuncionesParaArguMal();
        sender.sendEmail("destinatario@example.com", "Prueba de correo", "Este es un mensaje de prueba.");
    }

    
}

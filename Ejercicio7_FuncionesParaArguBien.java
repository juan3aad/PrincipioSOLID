import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7_FuncionesParaArguBien {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String INVALID_EMAIL_MESSAGE = "Dirección de correo electrónico no válida.";






    public void sendEmail(String recipient, String subject, String body) {
        if (!isValidEmail(recipient)) {
            System.out.println(INVALID_EMAIL_MESSAGE);
            return;
        }

        sendEmailToRecipient(recipient, subject, body);
    }

    private boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void sendEmailToRecipient(String recipient, String subject, String body) {
        System.out.println("Enviando correo electrónico a: " + recipient);
        System.out.println("Asunto: " + subject);
        System.out.println("Cuerpo: " + body);
        // Lógica para enviar el correo electrónico real
    }

    public static void main(String[] args) {
        Ejercicio7_FuncionesParaArguBien sender = new Ejercicio7_FuncionesParaArguBien();




        sender.sendEmail("destinatario@example.com", "Prueba de correo", "Este es un mensaje de prueba.");

        
    }    
}

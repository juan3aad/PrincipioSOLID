import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.crypto.Cipher;

public class Cifrar {

    public static void main(String[] args) throws Exception {
        // Generar un par de claves RSA
        KeyPair keyPair = generateKeyPair();

        // Obtener la clave pública y privada del par de claves
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Cifrar el archivo utilizando la clave pública
        encryptFile("archivo.txt", "archivo_cifrado.txt", publicKey);

        // Descifrar el archivo utilizando la clave privada
        decryptFile("archivo_cifrado.txt", "archivo_descifrado.txt", privateKey);
    }

    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048, new SecureRandom());
        return keyPairGenerator.generateKeyPair();
    }

    public static void encryptFile(String inputFile, String outputFile, Key key) throws Exception {
        // Leer el archivo a cifrar
        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[inputStream.available()];
        inputStream.read(inputBytes);

        // Inicializar el cifrado
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        // Cifrar el archivo
        byte[] outputBytes = cipher.doFinal(inputBytes);

        // Escribir el archivo cifrado
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);

        inputStream.close();
        outputStream.close();
    }

    public static void decryptFile(String inputFile, String outputFile, Key key) throws Exception {
        // Leer el archivo cifrado
        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[inputStream.available()];
        inputStream.read(inputBytes);

        // Inicializar el descifrado
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, key);

        // Descifrar el archivo
        byte[] outputBytes = cipher.doFinal(inputBytes);

        // Escribir el archivo descifrado
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);

        inputStream.close();
        outputStream.close();
    }
}


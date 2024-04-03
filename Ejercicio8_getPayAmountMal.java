public class Ejercicio8_getPayAmountMal {

    public static int getPayAmount(boolean isDead, boolean isSeparated, boolean isRetired) {
        int result;

        if (isDead) {
            result = 1500;
        } else {
            if (isSeparated) {
                result = 2500;
            } else {
                if (isRetired) {
                    result = 3000;
                } else {
                    result = 4000;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int payAmount = getPayAmount(false, true, false);
        System.out.println("Monto de pago: " + payAmount);
    }
}

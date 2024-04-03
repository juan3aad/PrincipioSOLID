public class Ejercicio8_getPayAmountBien {

    public static int getPayAmount(boolean isDead, boolean isSeparated, boolean isRetired) {
        
        if (isDead) {
            return 1500;
        } 
        
        if (isSeparated) {
                return 2500;
        } 

        return isRetired ? 3000:4000;
                    
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int payAmount = getPayAmount(false, true, false);
        System.out.println("Monto de pago: " + payAmount);
    }
}

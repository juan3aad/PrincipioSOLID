import java.util.Date;


 

public class Ejercicio1_Mal {
    public static void main(String[] args) {
        // Archivos a evaluar - files to evaluate
        FileStatus[] fs = {
            new FileStatus(1, false),
            new FileStatus(2, false),
            new FileStatus(3, true),
            new FileStatus(4, false),
            new FileStatus(5, false),
            new FileStatus(7, true)
        };

        // Archivos marcados para borrar - files to delete
        boolean[] archivos = new boolean[fs.length];
        for (int i = 0; i < fs.length; i++) {
            archivos[i] = fs[i].isToDelete();
        }

      

        // Todo: Tarea

        // Día de hoy - today
        Date today = new Date();

        // Días transcurridos - elapsed time in days
        int d = 23;

        // Número de archivos en un directorio - number of files in directory
        int dir = 33;

        // Primer nombre - first name
        String nombre = "Fernando";

        // Primer apellido - last name
        String apellido = "Herrera";

        // Días desde la última modificación - days since modification
        int dsm = 12;

        // Cantidad máxima de clases por estudiante - max classes per student
        int max = 6;
    }

    // Clase para representar el estado de un archivo
    static class FileStatus {
        private int id;
        private boolean toDelete;

        public FileStatus(int id, boolean toDelete) {
            this.id = id;
            this.toDelete = toDelete;
        }

        public boolean isToDelete() {
            return toDelete;
        }
    }
}

 // Mejor
        // Clase de usuario
        class User {}

        // Interfaz de usuario
        interface IUser {}
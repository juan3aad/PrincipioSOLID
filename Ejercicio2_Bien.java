import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Archivos a evaluar
        FileStatus[] fileStatuses = {
            new FileStatus(1, false),
            new FileStatus(2, false),
            new FileStatus(3, true),
            new FileStatus(4, false),
            new FileStatus(5, false),
            new FileStatus(7, true)
        };

        // Archivos marcados para borrar
        boolean[] filesToDelete = new boolean[fileStatuses.length];
        for (int i = 0; i < fileStatuses.length; i++) {
            filesToDelete[i] = fileStatuses[i].isToDelete();
        }

        // Clase de usuario
        class User {}

        // Interfaz de usuario
        interface IUser {}

        // Todo: Tarea

        // Día de hoy
        Date today = new Date();

        // Días transcurridos
        int elapsedDays = 23;

        // Número de archivos en un directorio
        int numFilesInDirectory = 33;

        // Primer nombre
        String firstName = "Fernando";

        // Primer apellido
        String lastName = "Herrera";

        // Días desde la última modificación
        int daysSinceModification = 12;

        // Cantidad máxima de clases por estudiante
        int maxClassesPerStudent = 6;
    }

    // Clase para representar el estado de un archivo
    static class FileStatus {
        private int id;
        private boolean toDelete;

        public FileStatus(int id, boolean toDelete) {
            this.id = id;
            this.toDelete = toDelete;
        }

        // Función flecha para verificar si se debe borrar el archivo
        public boolean isToDelete() {
            return toDelete;
        }
    }
}

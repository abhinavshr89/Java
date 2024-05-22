import java.io.File;

public class FileOperations {
    public static void main(String[] args) {
        File file = new File("example.txt");

        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists.");

            // Delete the file
            if (file.delete()) {
                System.out.println("The file was deleted.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

package filehandling;

/**
 *
 * @author scorpiocodes
 */
import java.io.File;


public class FileHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("E:/LearningPath-Java/LearningPath-Java/FileHandling/src/files/example.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
    }

}

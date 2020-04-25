package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 *
 * @author scorpiocodes
 */
public class FileHandling3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        FileInputStream fis = null;
        FileChannel f = null;
        
        int i=0;
        try{
            fis = new FileInputStream("E:/LearningPath-Java/LearningPath-Java/FileHandling/src/files/example.txt");
            while((i=fis.read())!=-1)
            {
                f = fis.getChannel();
           
                long pos = f.position();
                System.out.println("Position: "+pos+" character read: "+i);
            }            
            
            
        }catch(IOException e){
            System.out.println(e);
        }
        finally{
            if(fis!=null){
                fis.close();
            }
            if(f!=null){
                f.close();
            }
        }
    }

}

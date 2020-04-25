package filehandling;

/**
 *
 * @author scorpiocodes
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;


public class FileHandling2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        
        FileOutputStream fos = null;
        FileChannel f = null;
        
        try{
            fos = new FileOutputStream("E:/LearningPath-Java/LearningPath-Java/FileHandling/src/files/example.txt");
            f = fos.getChannel();
            byte[] b1;
            b1 = new byte[20];
            for(int i=0;i<20;i++){
                b1[i] = 'j';
            }
            
            fos.flush();
            fos.write(b1);
            long pos = f.position();
            System.out.println(pos);
            
        }catch(IOException e){
            System.out.println(e);
        }
        finally{
            if(fos!=null){
                fos.close();
            }
            if(f!=null){
                f.close();
            }
        }
    }

}

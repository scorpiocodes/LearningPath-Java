package abstraction;

/**
 *
 * @author scorpiocodes
 */

interface reg {
    void rollNo();
}
interface registration extends reg {
    void studentGroup();
    void studentSection();
}

class BS implements registration {
    @Override
    public void rollNo() {
        System.out.println("BS-1");
    }
    
    @Override
    public void studentGroup(){
        System.out.println("BS-Group");
    }
    
    @Override
    public void studentSection(){
        System.out.println("BS-A");
    }
}

class MS implements registration {
    @Override
    public void rollNo() {
        System.out.println("MS-1");
    }
    
    @Override
    public void studentGroup(){
        System.out.println("MS-Group");
    }
    
    @Override
    public void studentSection(){
        System.out.println("MS-A");
    }
}

class PhD implements registration {
    @Override
    public void rollNo() {
        System.out.println("PhD-1");
    }
    
    @Override
    public void studentGroup(){
        System.out.println("PhD-Group");
    }
    
    @Override
    public void studentSection(){
        System.out.println("PhD-A");
    }
}

public class interface2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BS b = new BS();
        b.rollNo();b.studentGroup();b.studentSection();
        MS m = new MS();
        m.rollNo();m.studentGroup();m.studentSection();
        PhD p = new PhD();
        p.rollNo();p.studentGroup();p.studentSection();
    }

}

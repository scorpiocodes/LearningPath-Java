package abstraction;

/**
 *
 * @author scorpiocodes
 */

abstract class account {
    abstract void rateOfInterest();
}

class personalaccount extends account {
    @Override
    void rateOfInterest(){
        System.out.println("5%");
    }
}

class savingsaccount extends account {
    @Override
    void rateOfInterest() {
        System.out.println("6%");
    }
}

public class abstractmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        personalaccount p = new personalaccount();
        p.rateOfInterest();
        savingsaccount s = new savingsaccount();
        s.rateOfInterest();
    }

}

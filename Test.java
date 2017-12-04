import java.util.ArrayList;
import java.util.Arrays;
public class Test{
    
    public static void test(){
        
        ArrayList<String> csapatnevek = new ArrayList<String>();
        csapatnevek.add("Barcelona");
        csapatnevek.add("Real Madrid");
        csapatnevek.add("Chelsea");
        Tablazat tablazat = new Tablazat(csapatnevek);
        tablazat.ertekeles("Chelsea" , "Real Madrid" , 1 , 2);
        
    }
}
        

import java.util.ArrayList;

public class IdojarasAdatok{
    
    ArrayList<NapiHomerseklet> homersekletlista = new ArrayList<NapiHomerseklet>();
    
    public void addNap(NapiHomerseklet napihomerseklet){
        homersekletlista.add(napihomerseklet);
    }
    
    public double getKozephomerseklet(){
        double sum = 0;
        
        for(NapiHomerseklet n : homersekletlista){
            sum = sum + n.getHomerseklet();
        }
        return sum / homersekletlista.size();
    }
    
    public boolean tulMeleg(NapiHomerseklet napihomerseklet){
        if(napihomerseklet.getHomerseklet() >= getKozephomerseklet() + 3){
            return true;
        }
        
        return false;
    }
}
        
                

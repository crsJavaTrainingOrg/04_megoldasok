import java.util.ArrayList;

public class Nyaklanc{

    private Gyongy fajta1;
    private Gyongy fajta2;
    ArrayList<Gyongy> nyaklanc = new ArrayList<Gyongy>();

    public Nyaklanc(String szin1, String szin2, double keresztmetszet1, double keresztmetszet2){

        fajta1 = new Gyongy(szin1, keresztmetszet1);
        fajta2 = new Gyongy(szin2, keresztmetszet2);
    }

    public Gyongy getUtolso(){
        if(nyaklanc.isEmpty()){
            return null;
        }

        return nyaklanc.get(nyaklanc.size()-1);

    }

    public Gyongy getElso(){
        if(nyaklanc.isEmpty()){
            return null;
        }

        return nyaklanc.get(0);

    }

    public boolean addGyongy(Gyongy kovetkezo){
        if(kovetkezo.getSzin().equals(fajta1.getSzin()) || kovetkezo.getSzin().equals(fajta2.getSzin())){
            if(nyaklanc.isEmpty()){
                nyaklanc.add(kovetkezo);
                return true;
            }
            if(!getUtolso().getSzin().equals(kovetkezo.getSzin())){
                nyaklanc.add(kovetkezo);
                return true;
            }
        }
        return false;
    }

    public boolean ugyanannyi(){
        int a = 0;
        int b = 0;

        for(Gyongy gy : nyaklanc){
            if(gy.getSzin().equals(fajta1.getSzin())){
                a++;
            }
            if(gy.getSzin().equals(fajta2.getSzin())){
                b++;
            }

        }
        if(a == b){
            return true;
        }
        
        return false;
    }
    
    public boolean osszecsukhato(int minimumhosszusag){
        int size = nyaklanc.size();
        if(size<2 || size < minimumhosszusag){
            return false;
        }
        
        
        Gyongy gyongy1 = nyaklanc.get(0);
        Gyongy gyongy2 = nyaklanc.get(nyaklanc.size()-1);
        if(!gyongy1.getSzin().equals(gyongy2.getSzin()) && size >=minimumhosszusag){
            return true;
        }
        return false;
    }
}

            
            
        
    
    

    



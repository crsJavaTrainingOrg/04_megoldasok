import java.util.ArrayList;

public class Halozat{

    ArrayList<Adotorony> adotornyok = new ArrayList<Adotorony>();

    public boolean add(Adotorony adotorony){
        for(Adotorony a : adotornyok){
            if(a.getJel().equals(adotorony.getJel())){

                return false;
            }
        }
        adotornyok.add(adotorony);
        return true;
    }

    public boolean addKapacitas(String jel, int pluszkapacitas){
        for(Adotorony a : adotornyok){
            if(jel.equals(a.getJel())){
                a.addKapacitas(jel,pluszkapacitas);
                return true;
            }
        }
        return false;
    }

    public int torles(int minimumKapacitas){
        ArrayList<Adotorony> torles = new ArrayList<Adotorony>();
        int kitoroltekszama = 0;
        for(Adotorony a : adotornyok){
            if(a.getKapacitas() < minimumKapacitas){
                torles.add(a);
                kitoroltekszama++;
            }
        }
        adotornyok.removeAll(torles);
        return kitoroltekszama;
    }
    
    public int getBeszelgetesekSzama(double xKoordinata, double yKoordinata, double sugar){
        int beszelgetesekszama = 0;
        
        for(Adotorony a : adotornyok){
            if((a.getX() - xKoordinata) * (a.getX() - xKoordinata) + (a.getY() - yKoordinata) * (a.getY() - yKoordinata) <= sugar * sugar){
                beszelgetesekszama = beszelgetesekszama + a.getKapacitas();
            }
        }
        return beszelgetesekszama;
    }
    
    
}


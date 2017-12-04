import java.util.ArrayList;

public class Tablazat{
    
    ArrayList<Csapat> csapatok = new ArrayList<Csapat>();
    
    public Tablazat(ArrayList<String> csapatnevek){
        for(String s : csapatnevek){
            Csapat csapat = new Csapat(s);
            csapatok.add(csapat);
        }
    }
    
    public void ertekeles(String csapat1Nev, String csapat2Nev, int gol1, int gol2){
        
        Csapat csapat1 = null;
        Csapat csapat2 = null;
        for(Csapat cs : csapatok){
            if(csapat1Nev.equals(cs.getNev())){
                csapat1 = cs;
            }
            if(csapat2Nev.equals(cs.getNev())){
                csapat2 = cs;
            }
        }
        if(csapat1 ==null || csapat2 == null){
            return;
        }
        
        csapat1.setGolkulonbseg(csapat1.getGolkulonbseg() + gol1 );
        
        csapat2.setGolkulonbseg(csapat2.getGolkulonbseg() + gol2 );
        
        if(gol1 > gol2){
            csapat1.addPontok(3);
        }
        if(gol1 < gol2){
            csapat2.addPontok(3);
        }
        
        if(gol1 == gol2){
            csapat1.addPontok(1);
            csapat2.addPontok(1);
        }
        addCsapat(csapat1);
        addCsapat(csapat2);
        
        for(Csapat cs : csapatok){
            System.out.println(cs.getNev());
        }
    }
    
    private void addCsapat(Csapat csapat){
        csapatok.remove(csapat);
        int i = 0;
        while(csapat.getPontok() < csapatok.get(i).getPontok() && csapat.getGolkulonbseg()< csapatok.get(i).getGolkulonbseg()){
            i++;
        }
        csapatok.add(i, csapat);
    }
}
        
        
    
    
        
            
        
        
    
    

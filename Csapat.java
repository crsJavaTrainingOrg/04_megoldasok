public class Csapat{
    
    private String nev;
    private int pontok;
    private int golkulonbseg;
    
    
    public Csapat(String nev){
        this.nev = nev;
    }
    
    public void addPontok(int pontok){
        this.pontok = this.pontok + pontok;
    }
    
    public void setGolkulonbseg(int golkulonbseg){
        this.golkulonbseg = golkulonbseg;
    }
    
    public String getNev(){
        return nev;
    }
    
    public int getPontok(){
        return pontok;
    }
    
    public int getGolkulonbseg(){
        return golkulonbseg;
    }
}
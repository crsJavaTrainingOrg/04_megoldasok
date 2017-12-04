public class Gyongy{
    
    private String szin;
    private double keresztmetszet;
    
    public Gyongy(String szin, double keresztmetszet){
        this.szin = szin;
        this.keresztmetszet = keresztmetszet;
    }
    
    public String getSzin(){
        return szin;
    }
    
    public double getKeresztmetszet(){
        return keresztmetszet;
    }
}

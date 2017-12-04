public class NapiHomerseklet{
    
    private String datum;
    private double homerseklet;
    
    public NapiHomerseklet(String datum, double homerseklet){
        this.datum = datum;
        this.homerseklet = homerseklet;
    }
    
    public String getDatum(){
        return datum;
    }
    
    public double getHomerseklet(){
        return homerseklet;
    }
    
    public void setHomerseklet(double ujHomerseklet){
        homerseklet = ujHomerseklet;
    }
}
    
  

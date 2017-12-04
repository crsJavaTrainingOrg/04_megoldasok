public class Adotorony{
    
    private String jel;
    private double x;
    private double y;
    private int kapacitas;
    
    public Adotorony(String jel, double xKoordinata, double yKoordinata, int kapacitas){
        this.jel = jel;
        x = xKoordinata;
        y = yKoordinata;
        this.kapacitas = kapacitas;
    }
    
    public String getJel(){
        return jel;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public int getKapacitas(){
        return kapacitas;
    }
    
    public void addKapacitas(String jel,int pluszkapacitas){
        kapacitas = kapacitas + pluszkapacitas;
    }
}
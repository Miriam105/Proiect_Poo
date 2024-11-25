package ro.ugal.proiectpoo;
public class AspiratorUscat extends Aparat {
    private int numarRoti;
    private byte lungimeCablu; //in metri
    private byte lungimeFurtun; //in metri
    private String culoare;
    private String tipSac;
    
    //constructor fara argumente
    public AspiratorUscat(){
        super();
        this.numarRoti = 4;
        this.tipSac = "Textil";
        this.lungimeCablu = 8;
        this.culoare = "Verde";
        this.lungimeFurtun = 4;
    }
    
    //constructor cu toate argumentele

    public AspiratorUscat(int numarRoti, byte lungimeCablu, byte lungimeFurtun, String culoare, String tipSac, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        setNumarRoti(numarRoti);
        setLungimeCablu(lungimeCablu);
        setLungimeFurtun(lungimeFurtun);
        setCuloare(culoare);
        setTipSac(tipSac);
    }
    
    
    //constructor de copiere
    public AspiratorUscat(AspiratorUscat other) {
        super(other);
        this.numarRoti = other.numarRoti;
        this.lungimeCablu = other.lungimeCablu;
        this.lungimeFurtun = other.lungimeFurtun;
        this.culoare = other.culoare;
        this.tipSac = other.tipSac;
    }
    
    //metoda toString:
    @Override
    public String toString() {
        return "numarRoti=" + numarRoti + ", lungimeCablu=" + lungimeCablu + ", lungimeFurtun=" + lungimeFurtun + ", culoare=" + culoare + ", tipSac=" + tipSac + ", modAlimentare= " + modAlimentare + ", tipActionare= " + tipActionare + ", modUtilizare= " + modUtilizare + ", tipSuprafata= " + tipSuprafata + ", greutate= " + greutate;
    }
    
    //setteri:

    public void setNumarRoti(int numarRoti) {
        this.numarRoti = numarRoti;
    }

    public void setLungimeCablu(int lungimeCablu) {
        this.lungimeCablu = (byte) lungimeCablu;
    }

    public void setLungimeFurtun(int lungimeFurtun) {
        this.lungimeFurtun = (byte) lungimeFurtun;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setTipSac(String tipSac) {
        this.tipSac = tipSac;
    }
    
    
    //getteri:

    public int getNumarRoti() {
        return numarRoti;
    }

    public int getLungimeCablu() {
        return lungimeCablu;
    }

    public int getLungimeFurtun() {
        return lungimeFurtun;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getTipSac() {
        return tipSac;
    }
    
}

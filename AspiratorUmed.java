package ro.ugal.proiectpoo;
public class AspiratorUmed extends Aparat {
    private byte capacitateRezervor; // in litri
    private String tipLichid; // apa, detergent
    private int timpFunctionare;
    private String tipSistemUmezire; // ex: jet continuu / stropire
    private String culoare;
    
    //constructor fara argumente
    public AspiratorUmed(){
        this.capacitateRezervor = 10;
        this.tipLichid = "apa";
        this.timpFunctionare = 60;
        this.tipSistemUmezire = "stropire";
        this.culoare = "galben";
    }

    //constructor cu toate argumentele
    public AspiratorUmed(byte capacitateRezervor, String tipLichid, int timpFunctionare, String tipSistemUmezire, String culoare, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        setCapacitateRezervor(capacitateRezervor);
        setTipLichid(tipLichid);
        setTimpFunctionare(timpFunctionare);
        setTipSistemUmezire(tipSistemUmezire);
        setCuloare(culoare);
    }

    //constructor de copiere
    public AspiratorUmed(AspiratorUmed other) {
        super(other);
        this.capacitateRezervor = other.capacitateRezervor;
        this.tipLichid = other.tipLichid;
        this.timpFunctionare = other.timpFunctionare;
        this.tipSistemUmezire = other.tipSistemUmezire;
        this.culoare = other.culoare;
    }
    //metoda toString:
    @Override
    public String toString() {
        return "capacitateRezervor=" + capacitateRezervor + ", tipLichid=" + tipLichid + ", timpFunctionare=" + timpFunctionare + ", tipSistemUmezire=" + tipSistemUmezire + ", culoare=" + culoare + ", modAlimentare= " + modAlimentare + ", tipActionare= " + tipActionare + ", modUtilizare= " + modUtilizare + ", tipSuprafata= " + tipSuprafata + ", greutate= " + greutate;
    }
    
    //setteri:

    public void setCapacitateRezervor(int capacitateRezervor) {
        this.capacitateRezervor = (byte) capacitateRezervor;
    }

    public void setTipLichid(String tipLichid) {
        this.tipLichid = tipLichid;
    }

    public void setTimpFunctionare(int timpFunctionare) {
        this.timpFunctionare = timpFunctionare;
    }

    public void setTipSistemUmezire(String tipSistemUmezire) {
        this.tipSistemUmezire = tipSistemUmezire;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    
    //getteri:

    public int getCapacitateRezervor() {
        return capacitateRezervor;
    }

    public String getTipLichid() {
        return tipLichid;
    }

    public int getTimpFunctionare() {
        return timpFunctionare;
    }

    public String getTipSistemUmezire() {
        return tipSistemUmezire;
    }

    public String getCuloare() {
        return culoare;
    }
    
    
    
}

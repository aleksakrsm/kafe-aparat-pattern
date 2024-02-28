package boliNacinApstraktnaKlasa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleks
 */
public class Zahtev {
    private int kusur;
    private String txt;

    public Zahtev(int kusur) {
        this.kusur = kusur;
        txt = "";
    }

    public int getKusur() {
        return kusur;
    }

    public void setKusur(int kusur) {
        this.kusur = kusur;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
    
    
}

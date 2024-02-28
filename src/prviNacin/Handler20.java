package prviNacin;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import Handler;

/**
 *
 * @author aleks
 */
public class Handler20 implements Handler {
       private int kolicina = 5;
       private Handler next = null;
       private int brojDatih = 0;
       
    @Override
    public void vratiKusur(Zahtev zahtev) {
        
        while(zahtev.getKusur()>=20 && kolicina>0){
            zahtev.setKusur(zahtev.getKusur()-20);
            kolicina--;
            brojDatih++;
//            zahtev.setTxt(zahtev.getTxt().concat("20\n"));
//            System.out.println("20");
        }
        zahtev.setTxt(zahtev.getTxt()+"\n"+"20 x "+brojDatih);
        if(next!=null  && zahtev.getKusur()!=0){
            next.vratiKusur(zahtev);
        }
        if(next==null && zahtev.getKusur()>0){
           zahtev.setTxt(zahtev.getTxt()+"\nDUGUJEMO KUPCU "+zahtev.getKusur()+" RSD");
        }
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
}

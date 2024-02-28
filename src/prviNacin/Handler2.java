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
public class Handler2 implements Handler {
       private int kolicina = 3;
       private Handler next = null;
       private int brojDatih = 0;
    @Override
    public void vratiKusur(Zahtev zahtev) {
        
        while(zahtev.getKusur()>=2 && kolicina>0){
            zahtev.setKusur(zahtev.getKusur()-2);
            kolicina--;
            brojDatih++;
            
//            zahtev.setTxt(zahtev.getTxt().concat("2\n"));
//            System.out.println("2");
        }
        zahtev.setTxt(zahtev.getTxt()+"\n"+"2 x "+brojDatih);
        if(next!=null){
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

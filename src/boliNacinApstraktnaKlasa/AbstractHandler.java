package boliNacinApstraktnaKlasa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aleks
 */
public abstract class AbstractHandler {

    private int kolicina;
    private AbstractHandler next;
    private int brojVracenihKomada = 0;

    public abstract int getVrednost();

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public void setBrojVracenihKomada(int brojVracenihKomada) {
        this.brojVracenihKomada = brojVracenihKomada;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public void vratiKusur(Zahtev zahtev) {

        while (zahtev.getKusur() >= getVrednost() && kolicina > 0) {
            zahtev.setKusur(zahtev.getKusur() - getVrednost());
            System.out.println(zahtev.getKusur());
            kolicina--;
            brojVracenihKomada++;
        }
        if (brojVracenihKomada >= 1) {
            zahtev.setTxt(zahtev.getTxt() + "\n" + getVrednost() + " x " + brojVracenihKomada);
        }
        if (next != null && zahtev.getKusur() != 0) {
            next.vratiKusur(zahtev);
        }

        if (next == null && zahtev.getKusur() > 0) {
            zahtev.setTxt(zahtev.getTxt() + "\nDUGUJEMO KUPCU " + zahtev.getKusur() + " RSD");
        }
    }
}

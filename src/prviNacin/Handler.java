package prviNacin;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleks
 */
public interface Handler {
    public void vratiKusur(Zahtev zahtev);
    public void setNext(Handler next);
}

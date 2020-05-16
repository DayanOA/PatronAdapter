/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

/**
 *
 * @author Tonny
 */
public class CarrozaAdaptada extends Vehiculo {

    final Carroza carrosa = new Carroza();

    @Override
    public void frenar() {
        carrosa.halarRiendas();
    }

    @Override
    public void acelerar() {
        carrosa.moverRiendas();
        carrosa.arrearCaballos();
    }

}

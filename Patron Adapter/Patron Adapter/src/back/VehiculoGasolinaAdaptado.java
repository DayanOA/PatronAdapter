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
public class VehiculoGasolinaAdaptado extends Vehiculo {

    final VehiculoGasolina gasolina = new VehiculoGasolina();

    @Override
    public void frenar() {
        gasolina.frenarGasolina();
    }

    @Override
    public void acelerar() {
        gasolina.acelerarGasolina();
    }

}

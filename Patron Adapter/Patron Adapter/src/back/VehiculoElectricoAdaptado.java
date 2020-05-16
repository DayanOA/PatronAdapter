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
public class VehiculoElectricoAdaptado extends Vehiculo {

    final VehiculoElectrico electrico = new VehiculoElectrico();

    @Override
    public void frenar() {
        electrico.frenarElectrico();
    }

    @Override
    public void acelerar() {
        electrico.acelerarElectrico();
    }

}

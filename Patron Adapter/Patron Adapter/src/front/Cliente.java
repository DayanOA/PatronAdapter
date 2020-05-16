/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import back.*;
import java.util.Scanner;

/**
 *
 * @author Tonny
 */
//Client
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo carro;
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");

            System.out.println("Seleccione el Vehiculo que desea conducir");
            System.out.println("1. Triciclo");
            System.out.println("2. TroncoMovil");
            System.out.println("3. Carroza");
            System.out.println("4. Vehiculo gasolina");
            System.out.println("5. Vehiculo electrico");
            System.out.println("6. Salir");

            int opcion = sc.nextInt();
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            switch (opcion) {
                case 1:
                    carro = new TricicloAdaptado();
                    carro.acelerar();
                    carro.frenar();
                    break;
                case 2:
                    carro = new TroncoMovilAdaptado();
                    carro.acelerar();
                    carro.frenar();
                    break;
                case 3:
                    carro = new CarrozaAdaptada();
                    carro.acelerar();
                    carro.frenar();
                    break;
                case 4:
                    carro = new VehiculoGasolinaAdaptado();
                    carro.acelerar();
                    carro.frenar();
                    break;
                case 5:
                    carro = new VehiculoElectricoAdaptado();
                    carro.acelerar();
                    carro.frenar();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("La opcion seleccionada no existe");
                    break;
            }
        }
    }

}

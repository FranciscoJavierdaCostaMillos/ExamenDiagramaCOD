/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

/**
 *
 * @author Javi
 */
public class Display {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SET_HORA_ALARMA hora = new SET_HORA_ALARMA();
        SET_HORA_ALARMA alarma = new SET_HORA_ALARMA();
        ON_OFF op = new ON_OFF();
        int opcion = 3;
//Depende del caso que escojamos hace diferentes cosas
        switch (opcion) {
            case 1:  //Configurar Hora
                hora.setHORA();
                hora.setMIN();
                hora.toString();
            case 2://configurar Alarma
                alarma.setHORA();
                alarma.setMIN();
                hora.toString();
            case 3://Funcionalidad de la alarma
                op.EncendApag();

        }
    }

}

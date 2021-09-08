/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lablist;


import classes.CarrosP;
import classes.Node;

import classes.SimpleListADT;
import classes.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author cahuc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         
        SimpleListADT list = new SimpleListADT();

        int input = -1;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar \n2. Buscar \n3. Eliminar \n4. Imprimir \n0. Salir"));

            switch (input) {
                case 1:
                    String placa = JOptionPane.showInputDialog("Digite el placa");
                    String marca = JOptionPane.showInputDialog("Digite el modelo");
                    int idConductor = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del conductor"));
                    
                    CarrosP carrosP = new CarrosP(placa,marca);
      
                    Node node = new Node( carrosP );
                    list.add(node);
                    break;
                case 2:
                    break;

                case 3:
                    break;
                case 4:
                    //String carrosP = list.print();
                    //JOptionPane.showMessageDialog(null, carrosP);
                    break;
            }

        } while (input != 0);
        
    }
    
}

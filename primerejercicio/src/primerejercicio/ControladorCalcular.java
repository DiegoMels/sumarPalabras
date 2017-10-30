/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejercicio;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
class ControladorCalcular implements MouseListener {
    
    private JTextField primerPalabra, segundaPalabra, resultado;
    //constructor
    ControladorCalcular(JTextField pPalabra1, JTextField pPalabra2, JTextField pResultado) {
        this.primerPalabra = pPalabra1;
        this.segundaPalabra = pPalabra2;
        this.resultado = pResultado;
      
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       
// a resultado le tengo que settear cada palabras convertidas a numeros para luego poder sumarlos  
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}
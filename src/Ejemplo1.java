import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
/*
 * Autor Ivan barroso
 * ejemplo github
 * 
 */


public class Ejemplo1 extends GraphicsProgram{

	public void run (){

		//cambio el tamaño de la ventana 
		setSize (800, 600);
		//llamo al  metodo que dibuja la piramide 
		pintaPiramide ();

	}

	public void pintaPiramide(){
		int numLadrillosBase= 14;
		int anchoLadrillo= 30;
		int altoLadrillo = 12;
		//querido yo del martes:
		//te falta girar la piramide 
		for (int j=0; j<numLadrillosBase; j++){
			for (int i=0; i<numLadrillosBase-j; i++){
				GRect ladrillo = new GRect (anchoLadrillo, altoLadrillo);
				ladrillo.setFilled(true);
				ladrillo.setFillColor(Color.GREEN);
				add(ladrillo,anchoLadrillo*j/2 + anchoLadrillo*i, altoLadrillo*j );
			}
		}
		
	}
}

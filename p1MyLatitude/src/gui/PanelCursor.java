/**
 * @author Pablo Lanaspa e Ismael Rodriguez
 * 
 * Clase que va indicando en la parte derecha de la aplicacion la posicion en coordenadas
 * por donde se va pasando el raton en el mapa.
 */
package gui;

import java.awt.*;
import javax.swing.*;

public class PanelCursor extends JPanel  {

	private static final long serialVersionUID = 1L;
	public JLabel cursorLongitud;
	public JLabel cursorLatitud;
	
	public PanelCursor()
	{	
		GridLayout layout = new GridLayout(0,2);
		layout.setHgap(5); layout.setVgap(5);
		this.setLayout(layout);

        JLabel latitudLabel = new JLabel("Latitud (N): ");
        this.add(latitudLabel);
        cursorLatitud = new JLabel("-");
        this.add(cursorLatitud);
    	
        JLabel longitudLabel = new JLabel("Longitud (O): ");
        this.add(longitudLabel);
        cursorLongitud = new JLabel("-");
        this.add(cursorLongitud);
      
	}

}

package juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class juego extends Canvas {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 600;
	private static final String NOMBRE = "juego";
	private static JFrame ventana;

	private juego() {
		setPreferredSize(new Dimension(ANCHO, ALTO));
		ventana = new JFrame(NOMBRE);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false); // no podra cambiar el tamaño
		ventana.setLayout(new BorderLayout()); // gestor del espacio
		ventana.add(this, BorderLayout.CENTER);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] arg) {
		juego j = new juego();

	}
}

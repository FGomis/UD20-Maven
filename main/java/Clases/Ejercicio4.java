package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Ejercicio4 extends JFrame implements WindowListener{
	private JPanel contentPane;
	private JTextArea textArea;
	
	public void run() {
		try {
			Ejercicio4 frame = new Ejercicio4();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Ejercicio4() {
		setTitle("Ejercicio 4");
		setBounds(100, 100, 656, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(true);
		contentPane.setLayout(null);
		
		JLabel eventos = new JLabel("Eventos");
		eventos.setHorizontalAlignment(SwingConstants.LEFT);
		eventos.setBounds(10, 127, 77, 14);
		contentPane.add(eventos);
		
		textArea = new JTextArea();
		textArea.setBounds(80, 11, 550, 267);
		contentPane.add(textArea);
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		textArea.append("Ventana abierta\n");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		textArea.append("Ventana cerrando\n");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		textArea.append("Ventana cerrada\n");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		textArea.append("Ventana iconizada\n");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		textArea.append("Ventana desiconizada\n");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		textArea.append("Ventana activada\n");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		textArea.append("Ventana desactivada\n");
	}
}

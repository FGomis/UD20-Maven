package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.Hashtable;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio9 extends JFrame {
	private JPanel contentPane;
	private JPanel panel;
	private Component[] componentes;
	private String[] imagenes = { "ghost", "nintendo", "playstation", "space-invaders", "steam", "switch", "triforce",
			"xbox" };
	private Random random = new Random();
	private int contadorBotones = 0;
	private int contadorAciertos = 0;

	public void run() {
		try {
			Ejercicio9 frame = new Ejercicio9();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Ejercicio9() {
		setTitle("Ejercicio 9");
		setBounds(100, 100, 795, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(10, 97, 759, 536);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 0, 0));

		JToggleButton btn00 = new JToggleButton("");
		btn00.setEnabled(false);
		panel.add(btn00);

		JToggleButton btn01 = new JToggleButton("");
		btn01.setEnabled(false);
		panel.add(btn01);
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn01);
			}
		});

		JToggleButton btn02 = new JToggleButton("");
		btn02.setEnabled(false);
		panel.add(btn02);
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn02);
			}
		});

		JToggleButton btn03 = new JToggleButton("");
		btn03.setEnabled(false);
		panel.add(btn03);
		btn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn03);
			}
		});

		JToggleButton btn10 = new JToggleButton("");
		btn10.setEnabled(false);
		panel.add(btn10);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn10);
			}
		});

		JToggleButton btn11 = new JToggleButton("");
		btn11.setEnabled(false);
		panel.add(btn11);

		JToggleButton btn12 = new JToggleButton("");
		btn12.setEnabled(false);
		panel.add(btn12);

		JToggleButton btn13 = new JToggleButton("");
		btn13.setEnabled(false);
		panel.add(btn13);

		JToggleButton btn20 = new JToggleButton("");
		btn20.setEnabled(false);
		panel.add(btn20);

		JToggleButton btn21 = new JToggleButton("");
		btn21.setEnabled(false);
		panel.add(btn21);

		JToggleButton btn22 = new JToggleButton("");
		btn22.setEnabled(false);
		panel.add(btn22);

		JToggleButton btn23 = new JToggleButton("");
		btn23.setEnabled(false);
		panel.add(btn23);

		JToggleButton btn30 = new JToggleButton("");
		btn30.setEnabled(false);
		panel.add(btn30);

		JToggleButton btn31 = new JToggleButton("");
		btn31.setEnabled(false);
		panel.add(btn31);

		JToggleButton btn32 = new JToggleButton("");
		btn32.setEnabled(false);
		panel.add(btn32);

		JToggleButton btn33 = new JToggleButton("");
		btn33.setEnabled(false);
		panel.add(btn33);

		JButton btnNuevaPartida = new JButton("Iniciar Partida");
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarPartida();
			}
		});
		btnNuevaPartida.setBounds(217, 21, 328, 33);
		contentPane.add(btnNuevaPartida);
		btn33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn33);
			}
		});
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn32);
			}
		});
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn31);
			}
		});
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn30);
			}
		});
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn23);
			}
		});
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn22);
			}
		});
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn21);
			}
		});
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn20);
			}
		});
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn13);
			}
		});
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn12);
			}
		});
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn11);
			}
		});
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btn00);
			}
		});
		setResizable(true);

		componentes = panel.getComponents();
	}

//	Método para iniciar partida, que da un valor entre 0 y 7 a los botones, repitiendose ese valor en 2 botones
	public void iniciarPartida() {
		for (int i = 0; i < componentes.length; i++) {
			JToggleButton bot = (JToggleButton) componentes[i];
			bot.setEnabled(true);
		}
		int n = random.nextInt(8);
		int numUsado = 0;
		int i = 0;

		while (i < 16) {
			for (int j = 0; j < componentes.length; j++) {
				String nombre = componentes[j].getName();
				String numero = String.valueOf(n);
				if (nombre != null) {
					if (nombre.equals(numero)) {
						numUsado++;
					}
				}
			}
			if (numUsado >= 2) {
				n = random.nextInt(8);
				numUsado = 0;
			} else {
				componentes[i].setName(String.valueOf(n));
				n = random.nextInt(8);
				i++;
				numUsado = 0;
			}
		}
	}

//	Método para comprobar si las dos imagenes clickadas són iguales
	public void click(JToggleButton boton) {
//		Con este contador nos encargamos de controlar que nunca haya mas de 2 botones seleccionados a la vez
		contadorBotones++;

		if (contadorBotones > 2) {
			borrar();
			boton.setSelected(true);
			contadorBotones = 1;
		}

//		Pintaremos la imagen del boton segun le hagamos click, usamos el atributo name del boton para identificar que imagen tendrá cada botón
		int pos = Integer.parseInt(boton.getName());
		boton.setIcon(new ImageIcon(Ejercicio9.class.getResource("/Imagenes/" + imagenes[pos] + ".png")));

//		Comprobamos si el botón seleccionado tiene el mismo identificador que otro botón seleccionado, de ser así borramos ambos botones
		for (int i = 0; i < componentes.length; i++) {
			JToggleButton bot = (JToggleButton) componentes[i];

			if (bot.isSelected() && bot.getName().equals(boton.getName()) && bot != boton) {
				bot.setVisible(false);
				boton.setVisible(false);
				contadorAciertos++;
			}
		}
		if(contadorAciertos == 8) {
			JOptionPane.showMessageDialog(null, "Felicidades, has ganado!");
			dispose();
		}
	}

//	Método que borra la imagen y deselecciona todos los botones
	public void borrar() {
		for (int i = 0; i < componentes.length; i++) {
			JToggleButton bot = (JToggleButton) componentes[i];
			bot.setIcon(null);
			bot.setEnabled(true);
			bot.setSelected(false);
		}
	}
}

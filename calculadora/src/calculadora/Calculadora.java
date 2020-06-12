package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Calculadora {

	private JFrame frame;
	private JTextField display;
	private JTextField display_result;
	
	boolean is_decimal;
	boolean signal = false;
	double result;
	int calc;


// Função para realizar os cálculos	
public void operacao() {
	switch(calc) {
	case 1: // Adição
		result = Double.parseDouble(display_result.getText()) + Double.parseDouble(display.getText()); 
		display_result.setText(Double.toString(result));
		display.setText("");
		break;
	case 2: // Subtração 
		result = Double.parseDouble(display_result.getText()) - Double.parseDouble(display.getText());
		display_result.setText(Double.toString(result));
		display.setText("");
		break;
	case 3: // Multiplicação 
		result = Double.parseDouble(display_result.getText()) * Double.parseDouble(display.getText());
		display_result.setText(Double.toString(result));
		display.setText("");
		break;
	case 4: // Divisão 
		result = Double.parseDouble(display_result.getText()) / Double.parseDouble(display.getText());
		display_result.setText(Double.toString(result));
		display.setText("");
		break;
	}
}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(300, 100, 282, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_backspace = new JButton("⬅");
		button_backspace.setBorderPainted(false);
		button_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() > 0) {
					StringBuilder numero_digitado = new StringBuilder(display.getText());
					numero_digitado.deleteCharAt(display.getText().length() - 1);
					String backspace = numero_digitado.toString();
					display.setText(backspace);
				}
			}
		});
		button_backspace.setBackground(new Color(25, 25, 50));
		button_backspace.setForeground(new Color(0, 0, 139));
		button_backspace.setFont(new Font("Dialog", Font.BOLD, 26));
		button_backspace.setBounds(200, 73, 60, 25);
		frame.getContentPane().add(button_backspace);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Dialog", Font.PLAIN, 18));
		editorPane.setBackground(new Color(25, 25, 50));
		editorPane.setForeground(Color.WHITE);
		editorPane.setBounds(12, 12, 260, 86);
		frame.getContentPane().add(editorPane);
		
		JButton button_c = new JButton("C");
		button_c.setFont(new Font("Dialog", Font.BOLD, 18));
		button_c.setForeground(new Color(30, 144, 255));
		button_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signal = false;
				display.setText(null);
				display_result.setText(null);
			}
		});
		
		display_result = new JTextField();
		display_result.setBorder(null);;
		display_result.setHorizontalAlignment(SwingConstants.RIGHT);
		display_result.setForeground(Color.WHITE);
		display_result.setFont(new Font("Dialog", Font.BOLD, 14));
		display_result.setColumns(10);
		display_result.setBackground(new Color(25, 25, 50));
		display_result.setBounds(12, 12, 260, 31);
		frame.getContentPane().add(display_result);
		
		display = new JTextField();
		display.setBorder(null);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Dialog", Font.BOLD, 14));
		display.setForeground(new Color(255, 255, 255));
		display.setBackground(new Color(25, 25, 50));
		display.setBounds(12, 44, 260, 31);
		frame.getContentPane().add(display);
		display.setColumns(10);
		button_c.setBackground(new Color(25, 25, 112));
		button_c.setBounds(20, 110, 60, 50);
		frame.getContentPane().add(button_c);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "7");
			}
		});
		button_7.setFont(new Font("Dialog", Font.BOLD, 18));
		button_7.setForeground(new Color(32, 178, 170));
		button_7.setBackground(new Color(0, 0, 0));
		button_7.setBounds(20, 160, 60, 50);
		frame.getContentPane().add(button_7);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "4");
			}
		});
		button_4.setFont(new Font("Dialog", Font.BOLD, 18));
		button_4.setForeground(new Color(32, 178, 170));
		button_4.setBackground(new Color(0, 0, 0));
		button_4.setBounds(20, 210, 60, 50);
		frame.getContentPane().add(button_4);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "1");
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 18));
		button_1.setForeground(new Color(32, 178, 170));
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setBounds(20, 260, 60, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_abs = new JButton("+-");
		button_abs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero_digitado = display.getText();
				if(!numero_digitado.contains("-")) {
					display.setText("-" + numero_digitado);
				}
				else {
					try {
						display.setText(numero_digitado.split("-")[1]);
					}
					catch(IndexOutOfBoundsException ex) {
						display.setText("");
					}
				}
			}
		});
		button_abs.setFont(new Font("Dialog", Font.BOLD, 16));
		button_abs.setForeground(new Color(32, 178, 170));
		button_abs.setBackground(new Color(0, 0, 0));
		button_abs.setBounds(20, 310, 60, 50);
		frame.getContentPane().add(button_abs);
		
		JButton button_parent = new JButton("()");
		button_parent.setFont(new Font("Dialog", Font.BOLD, 18));
		button_parent.setForeground(new Color(30, 144, 255));
		button_parent.setBackground(new Color(25, 25, 112));
		button_parent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_parent.setBounds(80, 110, 60, 50);
		frame.getContentPane().add(button_parent);
		
		JButton button_8 = new JButton("8");
		button_8.setFont(new Font("Dialog", Font.BOLD, 18));
		button_8.setForeground(new Color(32, 178, 170));
		button_8.setBackground(new Color(0, 0, 0));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "8");
			}
		});
		button_8.setBounds(80, 160, 60, 50);
		frame.getContentPane().add(button_8);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "5");
			}
		});
		button_5.setFont(new Font("Dialog", Font.BOLD, 18));
		button_5.setForeground(new Color(32, 178, 170));
		button_5.setBackground(new Color(0, 0, 0));
		button_5.setBounds(80, 210, 60, 50);
		frame.getContentPane().add(button_5);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "2");
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 18));
		button_2.setForeground(new Color(32, 178, 170));
		button_2.setBackground(new Color(0, 0, 0));
		button_2.setBounds(80, 260, 60, 50);
		frame.getContentPane().add(button_2);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "0");
			}
		});
		button_0.setFont(new Font("Dialog", Font.BOLD, 18));
		button_0.setForeground(new Color(32, 178, 170));
		button_0.setBackground(new Color(0, 0, 0));
		button_0.setBounds(80, 310, 60, 50);
		frame.getContentPane().add(button_0);
		
		JButton button_porcento = new JButton("%");
		button_porcento.setForeground(new Color(30, 144, 255));
		button_porcento.setFont(new Font("Dialog", Font.BOLD, 18));
		button_porcento.setBackground(new Color(25, 25, 112));
		button_porcento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_porcento.setBounds(140, 110, 60, 50);
		frame.getContentPane().add(button_porcento);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "9");
			}
		});
		button_9.setFont(new Font("Dialog", Font.BOLD, 18));
		button_9.setForeground(new Color(32, 178, 170));
		button_9.setBackground(new Color(0, 0, 0));
		button_9.setBounds(140, 160, 60, 50);
		frame.getContentPane().add(button_9);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "6");
			}
		});
		button_6.setFont(new Font("Dialog", Font.BOLD, 18));
		button_6.setForeground(new Color(32, 178, 170));
		button_6.setBackground(new Color(0, 0, 0));
		button_6.setBounds(140, 210, 60, 50);
		frame.getContentPane().add(button_6);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "3");
			}
		});
		button_3.setFont(new Font("Dialog", Font.BOLD, 18));
		button_3.setForeground(new Color(32, 178, 170));
		button_3.setBackground(new Color(0, 0, 0));
		button_3.setBounds(140, 260, 60, 50);
		frame.getContentPane().add(button_3);
		
		JButton button_ponto = new JButton(".");
		button_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!is_decimal) {
					display.setText(display.getText() + '.');
					is_decimal = true;
				}
			}
		});
		button_ponto.setFont(new Font("Dialog", Font.BOLD, 18));
		button_ponto.setForeground(new Color(32, 178, 170));
		button_ponto.setBackground(new Color(0, 0, 0));
		button_ponto.setBounds(140, 310, 60, 50);
		frame.getContentPane().add(button_ponto);
		
		JButton button_div = new JButton("÷");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() > 0) {
						calc = 4;
						if(signal) {
							operacao();
						}
						else {
						display_result.setText(display.getText());
						display.setText("");
						signal = true;
						}
				}
			}
		});
		button_div.setFont(new Font("Dialog", Font.BOLD, 20));
		button_div.setForeground(new Color(30, 144, 255));
		button_div.setBackground(new Color(25, 25, 112));
		button_div.setBounds(200, 110, 60, 50);
		frame.getContentPane().add(button_div);
		
		JButton button_multi = new JButton("x");
		button_multi.setFont(new Font("Dialog", Font.BOLD, 18));
		button_multi.setForeground(new Color(30, 144, 255));
		button_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() > 0) {
						calc = 3;
						if(signal) {
							operacao();
						}
						else {
						display_result.setText(display.getText());
						display.setText("");
						signal = true;
						}
				}
			}
		});
		button_multi.setBackground(new Color(25, 25, 112));
		button_multi.setBounds(200, 160, 60, 50);
		frame.getContentPane().add(button_multi);
		
		JButton button_sub = new JButton("-");
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() > 0) {
						calc = 3;
						if(signal) {
							operacao();
						}
						else {
						display_result.setText(display.getText());
						display.setText("");
						signal = true;
						}
				}
			}
		});
		button_sub.setFont(new Font("Dialog", Font.BOLD, 18));
		button_sub.setForeground(new Color(30, 144, 255));
		button_sub.setBackground(new Color(25, 25, 112));
		button_sub.setBounds(200, 210, 60, 50);
		frame.getContentPane().add(button_sub);
		
		JButton button_soma = new JButton("+");
		button_soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Este If é para caso o botão + seja precionado antes de um número não causar uma exceção
				if(display.getText().length() > 0) {
						calc = 1;
						if(signal) {
							operacao();
						}
						else {
						display_result.setText(display.getText());
						display.setText("");
						signal = true;
						}
				}
			}
		});
		button_soma.setFont(new Font("Dialog", Font.BOLD, 18));
		button_soma.setForeground(new Color(30, 144, 255));
		button_soma.setBackground(new Color(25, 25, 112));
		button_soma.setBounds(200, 260, 60, 50);
		frame.getContentPane().add(button_soma);
		
		JButton button_igual = new JButton("=");
		button_igual.setFont(new Font("Dialog", Font.BOLD, 18));
		button_igual.setForeground(new Color(255, 255, 255));
		button_igual.setBackground(Color.BLUE);
		button_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().length() > 0) {
					operacao();
				}
			}
		});
		button_igual.setBounds(200, 310, 60, 50);
		frame.getContentPane().add(button_igual);
	}
}

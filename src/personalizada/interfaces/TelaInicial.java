package personalizada.interfaces;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaInicial extends JFrame {
	private List<String> players = new ArrayList<String>();
	//private String players[] = new String[10];
	private String playersMisturados[] = new String[10];
	private JPanel contentPane;
	private JTextField play1;
	private JTextField play2;
	private JTextField play3;
	private JTextField play4;
	private JTextField play5;
	private JTextField play6;
	private JTextField play7;
	private JTextField play8;
	private JTextField play9;
	private JTextField play10;

	/**
	 * Launch the application.
	 * @return 
	 */
	
	public void criaTela() {
		setVisible(true);
	}
	

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Gabriel\\eclipse-workspace\\SorteioPersonalizada\\iznunq2m8vgy.png"));
		setTitle("Separador de times");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFeitoPor = new JLabel("Feito por - @Ursoo (1Urso)");
		lblFeitoPor.setBounds(10, 601, 268, 14);
		contentPane.add(lblFeitoPor);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setBounds(10, 66, 59, 14);
		contentPane.add(lblPlayer);
		
		play1 = new JTextField();
		play1.setBounds(84, 66, 262, 20);
		contentPane.add(play1);
		play1.setColumns(10);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(10, 94, 59, 14);
		contentPane.add(lblPlayer_1);
		
		play2 = new JTextField();
		play2.setColumns(10);
		play2.setBounds(84, 94, 262, 20);
		contentPane.add(play2);
		
		JLabel lblPlayer_2 = new JLabel("Player 3");
		lblPlayer_2.setBounds(10, 122, 59, 14);
		contentPane.add(lblPlayer_2);
		
		play3 = new JTextField();
		play3.setColumns(10);
		play3.setBounds(84, 122, 262, 20);
		contentPane.add(play3);
		
		JLabel lblPlayer_3 = new JLabel("Player 4");
		lblPlayer_3.setBounds(10, 150, 59, 14);
		contentPane.add(lblPlayer_3);
		
		play4 = new JTextField();
		play4.setColumns(10);
		play4.setBounds(84, 150, 262, 20);
		contentPane.add(play4);
		
		JLabel lblPlayer_4 = new JLabel("Player 5");
		lblPlayer_4.setBounds(10, 178, 59, 14);
		contentPane.add(lblPlayer_4);
		
		play5 = new JTextField();
		play5.setColumns(10);
		play5.setBounds(84, 178, 262, 20);
		contentPane.add(play5);
		
		JLabel lblPlayer_5 = new JLabel("Player 6");
		lblPlayer_5.setBounds(10, 214, 59, 14);
		contentPane.add(lblPlayer_5);
		
		play6 = new JTextField();
		play6.setColumns(10);
		play6.setBounds(84, 214, 262, 20);
		contentPane.add(play6);
		
		JLabel lblPlayer_6 = new JLabel("Player 7");
		lblPlayer_6.setBounds(10, 242, 59, 14);
		contentPane.add(lblPlayer_6);
		
		play7 = new JTextField();
		play7.setColumns(10);
		play7.setBounds(84, 242, 262, 20);
		contentPane.add(play7);
		
		JLabel lblPlayer_7 = new JLabel("Player 8");
		lblPlayer_7.setBounds(10, 270, 59, 14);
		contentPane.add(lblPlayer_7);
		
		play8 = new JTextField();
		play8.setColumns(10);
		play8.setBounds(84, 270, 262, 20);
		contentPane.add(play8);
		
		JLabel lblPlayer_8 = new JLabel("Player 9");
		lblPlayer_8.setBounds(10, 298, 59, 14);
		contentPane.add(lblPlayer_8);
		
		play9 = new JTextField();
		play9.setColumns(10);
		play9.setBounds(84, 298, 262, 20);
		contentPane.add(play9);
		
		JLabel lblPlayer_9 = new JLabel("Player 10");
		lblPlayer_9.setBounds(10, 326, 59, 14);
		contentPane.add(lblPlayer_9);
		
		play10 = new JTextField();
		play10.setColumns(10);
		play10.setBounds(84, 326, 262, 20);
		contentPane.add(play10);
		
		JButton btnSortear = new JButton("Sortear");
		btnSortear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				players.add(play1.getText());
				players.add(play2.getText());
				players.add(play3.getText());
				players.add(play4.getText());
				players.add(play5.getText());
				players.add(play6.getText());
				players.add(play7.getText());
				players.add(play8.getText());
				players.add(play9.getText());
				players.add(play10.getText());
				
				Collections.shuffle(players);
			
				
				play1.setText(players.get(0));
				play2.setText(players.get(1));
				play3.setText(players.get(2));
				play4.setText(players.get(3));
				play5.setText(players.get(4));
				play6.setText(players.get(5));
				play7.setText(players.get(6));
				play8.setText(players.get(7));
				play9.setText(players.get(8));
				play10.setText(players.get(9));
				
				
			}
		});
		btnSortear.setBounds(10, 392, 122, 46);
		contentPane.add(btnSortear);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(200, 392, 122, 46);
		contentPane.add(btnCancelar);
		
		JLabel lblSeparadorDeTimes = new JLabel("Separador de times");
		lblSeparadorDeTimes.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSeparadorDeTimes.setBounds(34, 11, 302, 30);
		contentPane.add(lblSeparadorDeTimes);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play1.setText("");
				play2.setText("");
				play3.setText("");
				play4.setText("");
				play5.setText("");
				play6.setText("");
				play7.setText("");
				play8.setText("");
				play9.setText("");
				play10.setText("");
			}
		});
		btnApagar.setBounds(10, 458, 122, 46);
		contentPane.add(btnApagar);
		
		JLabel label = new JLabel("---------------------------------------------------------------------------------------");
		label.setBounds(10, 200, 354, 14);
		contentPane.add(label);
	}
}

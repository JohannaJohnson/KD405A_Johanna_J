import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.BLACK);
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		mnArkiv.setBackground(Color.WHITE);
		menuBar.add(mnArkiv);
		
		JCheckBoxMenuItem chckbxmntmSkrivUt = new JCheckBoxMenuItem("Skriv ut");
		mnArkiv.add(chckbxmntmSkrivUt);
		
		JCheckBoxMenuItem chckbxmntmAvsluta = new JCheckBoxMenuItem("Avsluta");
		mnArkiv.add(chckbxmntmAvsluta);
		
		JMenu mnMedlemmar = new JMenu("Medlemmar");
		mnMedlemmar.setBackground(Color.BLACK);
		menuBar.add(mnMedlemmar);
		
		JCheckBoxMenuItem chckbxmntmNyMedlem = new JCheckBoxMenuItem("Ny medlem");
		mnMedlemmar.add(chckbxmntmNyMedlem);
		
		JCheckBoxMenuItem chckbxmntmHittaMedlem = new JCheckBoxMenuItem("Hitta medlem");
		mnMedlemmar.add(chckbxmntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		
		JCheckBoxMenuItem chckbxmntmHjlp = new JCheckBoxMenuItem("Hjälp");
		mnHjlp.add(chckbxmntmHjlp);
		
		JCheckBoxMenuItem chckbxmntmOmProgrammet = new JCheckBoxMenuItem("Om programmet");
		mnHjlp.add(chckbxmntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 99, 244);
		contentPane.add(scrollPane);
		
		JTextPane txtrHej = new JTextPane();
		txtrHej.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtrHej.setText("Harry Potter\nHermione Granger\nRonald Weasley\nRemus Lupin\nProfessor Dumbledore\nProfessor Snape\nGandalf the Gray \nGollum \nBilbo Baggins\nFrodo Baggins\nSmaug the Dragon\nKhal Drogo\nHilmer\nKato\nKhaleesi\nJamie Lannister\nKapten Morgan\nSeth Cohan\nSummer\nRyan Gåsling \nJean Paul\nDexter Morgan\nRachel Green\nRoss Geller\nPhoebe Buffay\nMonica Geller\nChandler Bing\nJoey Tribbiani\nJanice Joplin\nKhal Drogo\n\n\n");
		scrollPane.setViewportView(txtrHej);
		
		JTextPane txtrNamn = new JTextPane();
		txtrNamn.setForeground(Color.WHITE);
		txtrNamn.setBackground(Color.BLACK);
		txtrNamn.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtrNamn.setText("Khal Drogo");
		txtrNamn.setBounds(284, 22, 160, 25);
		contentPane.add(txtrNamn);
		
		JTextPane txtrPersonnummer = new JTextPane();
		txtrPersonnummer.setForeground(Color.WHITE);
		txtrPersonnummer.setBackground(Color.BLACK);
		txtrPersonnummer.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtrPersonnummer.setText("Födelsedatum: 1968.04.08");
		txtrPersonnummer.setBounds(284, 59, 160, 25);
		contentPane.add(txtrPersonnummer);
		
		JTextArea txtrAdress = new JTextArea();
		txtrAdress.setForeground(Color.WHITE);
		txtrAdress.setBackground(Color.BLACK);
		txtrAdress.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtrAdress.setText("Vaes Dotherak");
		txtrAdress.setBounds(284, 96, 160, 25);
		contentPane.add(txtrAdress);
		
		JTextArea txtrTelefonnummer = new JTextArea();
		txtrTelefonnummer.setForeground(Color.WHITE);
		txtrTelefonnummer.setBackground(Color.BLACK);
		txtrTelefonnummer.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtrTelefonnummer.setText("Telefon: 076-235 02 xx");
		txtrTelefonnummer.setBounds(284, 133, 160, 25);
		contentPane.add(txtrTelefonnummer);
		
		JTextArea txtrKortnummer = new JTextArea();
		txtrKortnummer.setForeground(Color.WHITE);
		txtrKortnummer.setBackground(Color.BLACK);
		txtrKortnummer.setFont(new Font("Helvetica", Font.PLAIN, 13));
		txtrKortnummer.setText("Kortnummer: 32");
		txtrKortnummer.setBounds(284, 170, 160, 25);
		contentPane.add(txtrKortnummer);
		
		JButton btnSpara = new JButton("spara");
		btnSpara.setForeground(Color.BLACK);
		btnSpara.setBackground(Color.BLACK);
		btnSpara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpara.setBounds(309, 207, 117, 29);
		contentPane.add(btnSpara);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/johannajohnson/Desktop/programmering II/KD405A_Johanna_J/Assignment_1/src/Drogo_HBO.jpg"));
		lblNewLabel.setBounds(-27, -37, 710, 657);
		contentPane.add(lblNewLabel);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanDogsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField dogTextField;
	int minNameLength = 3;
	Human Human1;
	Dog Dog1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogsGUI frame = new HumanDogsGUI();
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
	public HumanDogsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HUMANS AND DOGS");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(139, 6, 184, 34);
		contentPane.add(lblNewLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(24, 62, 184, 26);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		dogTextField = new JTextField();
		dogTextField.setBounds(24, 100, 184, 26);
		contentPane.add(dogTextField);
		dogTextField.setColumns(10);
		
		JTextArea infoTextArea = new JTextArea();
		infoTextArea.setBounds(24, 179, 400, 34);
		contentPane.add(infoTextArea);
		
		JTextArea errorTextArea = new JTextArea();
		errorTextArea.setBounds(24, 238, 400, 34);
		contentPane.add(errorTextArea);
		
		
		JButton btnNewButton = new JButton("Create Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nameTextField.getText().length()<3){
					errorTextArea.setText(" namnet har för få bokstäver ");
				}
				
				Human1 = new Human(nameTextField.getText());
				
				infoTextArea.append(Human1.getName());
				
				//nameTextField.setText("");
			}
		});
		btnNewButton.setBounds(242, 62, 157, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nameTextField.getText().isEmpty()){
					errorTextArea.setText(" Hunden måste ha en ägare först...");
				}else{
					Dog1 = new Dog(dogTextField.getText());
					Human1.buyDog(Dog1);
					
					infoTextArea.append(Dog1.getName());
					
					dogTextField.setText("");
				}
			}
		});
		btnNewButton_1.setBounds(242, 100, 157, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoTextArea.setText(Human1.getInfo(Human1.getName()));
				
			}
		});
		btnNewButton_2.setBounds(139, 138, 150, 29);
		contentPane.add(btnNewButton_2);
		
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(24, 162, 61, 16);
		contentPane.add(lblInfo);
		
		JLabel lblError = new JLabel("Error");
		lblError.setBounds(24, 220, 61, 16);
		contentPane.add(lblError);
	}
}

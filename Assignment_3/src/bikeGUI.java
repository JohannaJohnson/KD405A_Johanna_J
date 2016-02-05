import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class bikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textPrice;
	private JTextField textSize;
	private JTextField textColor;
	private JTextField PRICE;
	private JTextField SIZE;
	private JTextField COLOR;
	private BikeStore bikeStore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bikeGUI frame = new bikeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	  Create the frame.
	 */
	public bikeGUI() {
		bikeStore = new BikeStore();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPrice = new JTextField();
		textPrice.setBounds(351, 46, 76, 26);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		textSize = new JTextField();
		textSize.setBounds(351, 96, 76, 26);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		textColor = new JTextField();
		textColor.setBounds(351, 150, 76, 26);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(21, 31, 231, 225);
		contentPane.add(textArea);
		
		PRICE = new JTextField();
		PRICE.setText("price");
		PRICE.setBounds(264, 46, 75, 26);
		contentPane.add(PRICE);
		PRICE.setColumns(10);
		
		SIZE = new JTextField();
		SIZE.setText("size");
		SIZE.setBounds(261, 96, 76, 26);
		contentPane.add(SIZE);
		SIZE.setColumns(10);
		
		COLOR = new JTextField();
		COLOR.setText("color");
		COLOR.setBounds(264, 150, 75, 26);
		contentPane.add(COLOR);
		COLOR.setColumns(10);
		
		JButton btnNewButton = new JButton("Add bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**bikeStore.addBike(textColor.getText(), Integer.parseInt(textSize.getText()), Integer.parseInt(textPrice.getText()));
				textArea.setText(bikeStore.getAllBikes());
				textColor.setText(" ");
				textSize.setText(" ");
				textPrice.setText(" "); */
				
				String bikeColor = textColor.getText();
				int bikeSize = Integer.parseInt(textSize.getText());
				int bikePrice = Integer.parseInt(textPrice.getText());
				
				bikeStore.addBike(bikeColor, bikeSize, bikePrice);
				
				textArea.setText(bikeStore.getAllBikes());
			}
		});
		btnNewButton.setBounds(298, 201, 117, 29);
		contentPane.add(btnNewButton);
		
		
	}
}

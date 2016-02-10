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
import javax.swing.JLabel;

public class bikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textPrice;
	private JTextField textSize;
	private JTextField textColor;
	private BikeStore bikeStore;
	private String setColor;
	private int setSize;
	private int setPrice;
	
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
		textPrice.setBounds(368, 46, 76, 26);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		textSize = new JTextField();
		textSize.setBounds(368, 96, 76, 26);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		textColor = new JTextField();
		textColor.setBounds(368, 150, 76, 26);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(21, 31, 301, 225);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Add bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				_setColor();
				setSize = Integer.parseInt(textSize.getText());
				setPrice = Integer.parseInt(textPrice.getText());
				if(setSize >= Constants.MIN_SIZE && setSize <= Constants.MAX_SIZE && setPrice <= Constants.MAX_PRICE){
				String bikeColor = textColor.getText();
				int bikeSize = Integer.parseInt(textSize.getText());
				int bikePrice = Integer.parseInt(textPrice.getText());
				
				bikeStore.addBike(setColor, bikeSize, bikePrice);
				
				textArea.setText(bikeStore.getAllBikes());
				}
			}
		});
		btnNewButton.setBounds(351, 201, 93, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(327, 51, 42, 16);
		contentPane.add(lblPrice);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(333, 101, 36, 16);
		contentPane.add(lblSize);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(327, 155, 42, 16);
		contentPane.add(lblColor);
		
		
	}

	

private void _setColor(){
for(int i = 0; i < Constants.COLORS.length; i++){
	if(Constants.COLORS[i].equals(textColor.getText())){
		setColor = textColor.getText();	
		break;
	}
	else{
		setColor = "wrong color ";
	}
}
}
}
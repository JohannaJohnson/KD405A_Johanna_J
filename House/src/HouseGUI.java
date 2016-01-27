import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouse;
	
	private ArrayList<House> houseArmy = new ArrayList<House>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 68, 272, 148);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		House myHouse1 = new House(100, 2014);
		House myHouse2 = new House(132, 2010);
		House myHouse3 = new House(400, 1999);
		
		
		System.out.println("ett hus som byggdes " + myHouse1.getYear() + " är " + myHouse1.getSize() + " kvadratmeter stort" + "\n");
		System.out.println("ett hus som byggdes " + myHouse2.getYear() + " är " + myHouse2.getSize() + " kvadratmeter stort" + "\n");
		System.out.println("ett hus som byggdes " + myHouse3.getYear() + " är " + myHouse3.getSize() + " kvadratmeter stort" + "\n");

		textArea.append("ett hus som byggdes " + myHouse1.getYear() + " är " + myHouse1.getSize() + " kvadratmeter stort" + "\n");
		textArea.append("ett hus som byggdes " + myHouse2.getYear() + " är " + myHouse2.getSize() + " kvadratmeter stort" + "\n");
		textArea.append("ett hus som byggdes " + myHouse3.getYear() + " är " + myHouse3.getSize() + " kvadratmeter stort" + "\n");
		
		myHouse = new House[10];
		
		myHouse[0] = new House(45, 1936);
		myHouse[1] = new House(120, 1891);
		myHouse[2] = new House(632, 2013);
		myHouse[4] = new House(602, 642);
		myHouse[5] = new House(22, 2003);
		myHouse[6] = new House(100, 400);
		myHouse[7] = new House(30, 473);
		myHouse[8] = new House(300, 194);
		myHouse[9] = new House(22, 1994);
		
		for(int i = 0; i < 10; i = i++){
			textArea.append("ett hus som byggdes " + myHouse[i].getYear() + " är " + myHouse[i].getSize() + " kvadratmeter stort" + "\n");
	
		}
		
		
	}
}
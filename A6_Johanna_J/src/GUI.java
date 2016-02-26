import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchTextField;
	private JTextField fromTextField;
	private JTextField toTextField;
private JTextArea resultArea;
private JTextArea resResultArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(6, 71, 177, 26);
		contentPane.add(searchTextField);
		searchTextField.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultArea.setText("Searching...");
				new StationThread().start();
				
			}
		});
		searchButton.setBounds(195, 71, 117, 29);
		contentPane.add(searchButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 122, 447, 155);
		contentPane.add(scrollPane);
		
		resultArea = new JTextArea();
		scrollPane.setViewportView(resultArea);
		
		fromTextField = new JTextField();
		fromTextField.setBounds(6, 306, 130, 26);
		contentPane.add(fromTextField);
		fromTextField.setColumns(10);
		
		toTextField = new JTextField();
		toTextField.setColumns(10);
		toTextField.setBounds(6, 344, 130, 26);
		contentPane.add(toTextField);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(148, 311, 305, 107);
		contentPane.add(scrollPane_1);
		
		resResultArea = new JTextArea();
		scrollPane_1.setViewportView(resResultArea);
		
		JButton searchResButton = new JButton("Search");
		searchResButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resResultArea.setText("Searching...");
				new ResThread().start();
			}
		});
		searchResButton.setBounds(6, 382, 130, 29);
		contentPane.add(searchResButton);
	}
	private class StationThread extends Thread {
		@Override
		public void run() {
			String info = searchTextField.getText();
			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			searchStations.addAll(Parser.getStationsFromURL(info));
			resultArea.setText("");
			for (Station s: searchStations){
				resultArea.append(s.getStationName() +" number:" +s.getStationNbr() + "\n");
			}
			
		}
	}
	private class ResThread extends Thread {
		@Override
		public void run(){
			String from = fromTextField.getText();
			String to = toTextField.getText();
			String searchURL = Constants.getURL(from,to, 5);
			Journeys journeys = Parser.getJourneys(searchURL);
			resResultArea.setText("");
			for (Journey journey : journeys.getJourneys()) {
				System.out.print(journey.getStartStation()+" - ");
				System.out.print(journey.getEndStation());
				DecimalFormat decimal = new DecimalFormat("00");
				String time = decimal.format(journey.getDepDateTime().get(Calendar.HOUR_OF_DAY))+":"+decimal.format(journey.getDepDateTime().get(Calendar.MINUTE));
				resResultArea.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late" + "\n");
			} 
		}
	}
}

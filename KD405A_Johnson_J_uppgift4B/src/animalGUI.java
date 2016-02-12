import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;



public class animalGUI extends JFrame {
	//static JTextArea textArea;

	public ArrayList<Animal> allAnimals = new ArrayList<Animal>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					animalGUI frame = new animalGUI();
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
	public animalGUI() {
		getContentPane().setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 41, 438, 191);
		getContentPane().add(textArea);

		// ArrayList of animals
		Cat c = new Cat("lynxlynx", 3, 9);
		allAnimals.add(c);
		Dog d = new Dog("doggelito", 2, true);
		allAnimals.add(d);
		Snake s = new Snake("snakius", false);
		allAnimals.add(s);
		Cat c2 = new Cat("cattus", 4, 12);
		allAnimals.add(c2);
		Dog d2 = new Dog("hundis", 4, false);
		allAnimals.add(d2);
		Snake s2 = new Snake("ormis", true);
		allAnimals.add(s2);

		/**
		 * for loop that prints all the animals from the arrayList to the text
		 * area
		 */
		for (Animal animal : allAnimals) {
			textArea.append(animal.getInfo() + "\n");
		}

	}

}

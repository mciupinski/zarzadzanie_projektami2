import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TaxMain {

	private static List<JTextField> textFieldsList;
	private final static State[] stateList = { new State("Alabama", new Double(4)),
			new State("California", new Double(7.25)), new State("Colorado", new Double(2.9)),
			new State("Montana", new Double(0)), new State("Washington", new Double(6.5)),
			new State("New York", new Double(4)) };
	public final static String[] comboBox1NumbersArray = { "Groceries", "Prepared Food", "Prescription drug",
			"Non prescription drug", "Clothing", "Intangibles" };

	public static void main(String[] args) {

        JFrame window = new JFrame();
        final JTextField textField = new JTextField();
        JLabel valueLabel = new JLabel("Gross price:");
        JLabel number2Label = new JLabel("Group of goods:");
        JLabel resultLabel = new JLabel("Results:");
		final JTextField resultTextField = new JTextField("");

		JButton okButton = new JButton("OK");

		JComboBox number1ComboBox = new JComboBox(comboBox1NumbersArray);

		resultTextField.setEditable(false);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < stateList.length; i++) {
					State state = stateList[i];
					textFieldsList.get(i).setText(state.getStateName() + " " + state.getTaxValue() + " "
							+ Math.round(Calc.calculate(state, Double.parseDouble(textField.getText())) * 100) / 100);
				}
			}
		});

		// Ustawienia okna
		window.setMinimumSize(new Dimension(500, 300));
		window.setLayout(new GridLayout(0, 1));

		window.add(valueLabel);
		window.add(textField);
		window.add(number2Label);
		window.add(number1ComboBox);
		window.add(okButton);
		window.add(resultLabel);
		window.add(resultTextField);

		textFieldsList = new ArrayList<JTextField>();
		for (int i = 0; i < stateList.length; i++) {
			JTextField textField1 = new JTextField();
			textField1.setEditable(false);
			textFieldsList.add(textField1);
			window.add(textField1);
		}

		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

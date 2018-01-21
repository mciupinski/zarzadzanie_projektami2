import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TaxMain {

    public static String[] comboBox1NumbersArray = {"Groceries", "Prepared Food", "Prescription drug", "Non prescription drug", "Clothing", "Intangibles"};
    public static void main(String[] args) {

        JFrame window = new JFrame();
        JTextField textField = new JTextField();
        JLabel valueLabel = new JLabel("Gross price:");
        JLabel number2Label = new JLabel("Group of goods:");
        JLabel resultLabel = new JLabel("Results:");

        final JTextField resultTextField = new JTextField("");

        JButton okButton = new JButton("OK");

        JComboBox number1ComboBox = new JComboBox(comboBox1NumbersArray);

        resultTextField.setEditable(false);

        okButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                resultTextField.setText("4");
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

        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

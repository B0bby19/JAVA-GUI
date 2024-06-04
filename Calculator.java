import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Calculator Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null); // Use null layout for absolute positioning

        // Create the text fields
        JTextField textField1 = new JTextField();
        textField1.setBounds(50, 50, 100, 30);
        
        JTextField textField2 = new JTextField();
        textField2.setBounds(50, 100, 100, 30);

        // Create the combo box
        String[] operations = { "Add", "Subtract", "Multiply", "Divide" };
        JComboBox<String> comboBox = new JComboBox<>(operations);
        comboBox.setBounds(200, 50, 100, 30);

        // Create the result label
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50, 200, 300, 30);

        // Create the button
        JButton button = new JButton("Calculate");
        button.setBounds(200, 100, 100, 30);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers from the text fields
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    String operation = (String) comboBox.getSelectedItem();
                    double result = 0;

                    // Perform the selected operation
                    switch (operation) {
                        case "Add":
                            result = num1 + num2;
                            break;
                        case "Subtract":
                            result = num1 - num2;
                            break;
                        case "Multiply":
                            result = num1 * num2;
                            break;
                        case "Divide":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                resultLabel.setText("Error: Division by zero");
                                return;
                            }
                            break;
                    }

                    // Display the result
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Invalid input");
                }
            }
        });

        // Add the components to the frame
        frame.getContentPane().add(textField1);
        frame.getContentPane().add(textField2);
        frame.getContentPane().add(comboBox);
        frame.getContentPane().add(resultLabel);
        frame.getContentPane().add(button);

        // Display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareNumber {

    public static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Square Number Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null); // Use null layout for absolute positioning

        // Create the text field
        JTextField textField = new JTextField("2");
        textField.setBounds(50, 50, 100, 30); // Set position and size of text field

        // Create the button
        JButton button = new JButton("Square");
        button.setBounds(160, 50, 100, 30); // Set position and size of button

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the number from the text field
                    int number = Integer.parseInt(textField.getText());
                    // Square the number
                    int squared = number * number;
                    // Update the text field with the squared value
                    textField.setText(String.valueOf(squared));
                } catch (NumberFormatException ex) {
                    textField.setText("Invalid Input");
                }
            }
        });

        // Add the text field and button to the frame
        frame.getContentPane().add(textField);
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

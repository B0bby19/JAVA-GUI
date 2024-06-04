import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class NameButton {

    public static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Name Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create the button
        JButton button = new JButton("Basant Joshi");

        // Add the button to the frame
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

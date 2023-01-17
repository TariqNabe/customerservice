import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMIDisplay {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        frame.setVisible(true);
    }

    private static JFrame getFrame() {
        JFrame frame = new JFrame(...); // TODO title
        frame.setPreferredSize(...); // TODO size 350x300
        // TODO it should end program on close
        JPanel mainPanel = new JPanel();

        // define certain elements that to be referenced elsewhere
        // TODO You'll need:
        ageInput = ; // text input, 10 columns
        sexInputGroup = ; // this is a ButtonGroup, a logical group for buttons, which lets us ensure only one radiobutton is selected
        heightFeetInput = ; // text input, 10 columns
        heightInchesInput = ; // text input, 10 columns
        weightInput = ; // text input, 20 columns
        bmiOutput = ; // simply text on screen, defaults to no text
        healthOutput = ; // text on screen, no default text

        // TODO look through all the methods below that create the rows. Define JPanels for the results of each and call
        //      those methods here with the inputs they need.
        JPanel ageRowPanel = getAgeRowPanel(ageInput); // this one is done
        // TODO and so on...

        // sets layout to align elements vertically in rows
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // TODO add all panels to mainPanel in the right order

        // TODO prepare and return frame. this means add mainPanel to frame and pack the frame

    }

    private static JPanel getBasicRowPanel() {
        // Helper method to reduce code duplication, simply returns a JPanel formatted with X-Axis BoxLayout
        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS)); // you can experiment with this layout setting if you want
        return panel;
    }

    private static JPanel getAgeRowPanel(JTextField ageInput) {
        JPanel ageRowPanel = getBasicRowPanel(); // use this each time instead of new JPanel()
        // TODO add the two labels and text field, then return the panel at the end
    }

    private static JPanel getSexRowPanel(ButtonGroup sexInputGroup) {
        JPanel sexRowPanel = getBasicRowPanel();
        // TODO add the label
        // TODO make the male radio button with some text "Male"
        maleRadioButton.setActionCommand("Male"); // this lets us identify the button later on
        // maleRadioButton.setSelected(true); TODO something like this will set male to be selected by default
        //                                        its always a good idea to set one as default to ON so you know
        //                                        at least one is always selected
        // TODO make the female radio button with some text "Female"
        femaleRadioButton.setActionCommand("Female");
        // TODO add the buttons to sexInputGroup to make sure only one is selected at once
        // TODO add the buttons to the panel. You cannot just add sexInputGroup to the panel because a ButtonGroup does
        //      not physically group elements, it only links them logically. i.e. it is not a panel

        // TODO return it
    }

    private static JPanel getHeightRowPanel(JTextField heightFeetInput, JTextField heightInchesInput) {
        // TODO this one shouldn't be too tough, just the three labels and text fields
    }

    private static JPanel getWeightRowPanel(JTextField weightInput) {
        // TODO you get the idea
    }

    private static JPanel getCalculateRowPanel(JTextField ageInput, ButtonGroup sexInputGroup, JTextField heightFeetInput, JTextField heightInchesInput, JTextField weightInput, JLabel bmiOutput, JLabel healthOutput) {
        JPanel calculateRowPanel = getBasicRowPanel();
        // TODO make the calculate button with appropriate text
        // TODO same for clear button

        // action listeners for buttons
        class CalculateButtonHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try {
                    int age = ; // TODO extract age as int from some parameter's .getText() method (which returns a string)
                    boolean isMale = sexInputGroup.getSelection().getActionCommand().equals("Male");
                          // see how the ButtonGroup lets us find out which button is selected, since there is always just one?
                          // We also use the actionCommand we assigned to each button
                    double height = ; // TODO get this number in inches. You can restrict "ft" to whole numbers but "in" to decimals
                    double weight = ; // TODO get this, can be a decimal
                    double bmi = ; // TODO call the method from BMIHelperMethods to calculate BMI
                    bmiOutput.setText("" + bmi);
                    // TODO set the text of healthOutput to some value based on the call to a BMIHelperMethods method
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
        calculateButton.addActionListener(new CalculateButtonHandler());
        // TODO make a actionlistener that, when pressed, sets the text of all inputs to the empty string
        // TODO and assign it to the clear button

        calculateRowPanel.add(calculateButton);
        calculateRowPanel.add(clearButton);

        return calculateRowPanel;
    }

    private static JPanel getResultsRowPanel(JLabel bmiOutput, JLabel healthOutput) {
        // We'll give this one to you
        JPanel resultsRowPanel = getBasicRowPanel();
        resultsRowPanel.add(new JLabel("Results:"));
        resultsRowPanel.add(bmiOutput);
        resultsRowPanel.add(healthOutput);

        return resultsRowPanel;
    }
}

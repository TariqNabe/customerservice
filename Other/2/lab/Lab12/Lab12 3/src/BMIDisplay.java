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
        JFrame frame = new JFrame("Image Editor"); // TODO title
        frame.setSize(350,300); // TODO size 350x300
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();

        JTextField ageInput = new JTextField(10);
        ButtonGroup sexInputGroup = new ButtonGroup();
        JTextField heightFeetInput = new JTextField(10);
        JTextField heightInchesInput = new JTextField(10);
        JTextField weightInput = new JTextField(20);
        JLabel bmiOutput = new JLabel();
        JLabel healthOutput = new JLabel();


        JPanel getAgeRowPanel = getAgeRowPanel(ageInput); // this one is done
        JPanel getSexRowPanel = getSexRowPanel(sexInputGroup);
        JPanel getHeightRowPanel = getHeightRowPanel(heightFeetInput, heightInchesInput);
        JPanel getWeightRowPanel= getWeightRowPanel(weightInput);
        JPanel getCalculateRowPanel = getCalculateRowPanel(ageInput, sexInputGroup, heightFeetInput,  heightInchesInput,  weightInput,  bmiOutput,  healthOutput);
        JPanel resultsRowPanel = getResultsRowPanel(bmiOutput, healthOutput);
        // sets layout to align elements vertically in rows
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // TODO add all panels to mainPanel in the right order
        mainPanel.add(getAgeRowPanel);
        mainPanel.add(getSexRowPanel);
        mainPanel.add(getHeightRowPanel);
        mainPanel.add(getWeightRowPanel);
        mainPanel.add(getCalculateRowPanel);
        mainPanel.add(resultsRowPanel);


        // TODO prepare and return frame. this means add mainPanel to frame and pack the frame
        frame.add(mainPanel);
        return frame;
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
        JTextField heightInchesInput = new JTextField(10);
        JTextField weightInput = new JTextField(20);
        JLabel bmiOutput = new JLabel();
        JLabel healthOutput = new JLabel();
        return ageRowPanel;
    }

    private static JPanel getSexRowPanel(ButtonGroup sexInputGroup) {
        JPanel sexRowPanel = getBasicRowPanel();
        // TODO add the label
        JLabel bmiOutput = new JLabel();
        JLabel healthOutput = new JLabel();
        // TODO make the male radio button with some text "Male"
        JRadioButton maleRadioButton=  new JRadioButton();

        maleRadioButton.setActionCommand("Male"); // this lets us identify the button later on
        // maleRadioButton.setSelected(true); TODO something like this will set male to be selected by default
        //                                        its always a good idea to set one as default to ON so you know
        //                                        at least one is always selected
        // TODO make the female radio button with some text "Female"
        JRadioButton femaleRadioButton=  new JRadioButton();

        femaleRadioButton.setActionCommand("Female");
        // TODO add the buttons to sexInputGroup to make sure only one is selected at once
        // TODO add the buttons to the panel. You cannot just add sexInputGroup to the panel because a ButtonGroup does
        //      not physically group elements, it only links them logically. i.e. it is not a panel
        ButtonGroup group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioButton);
        sexRowPanel.add(maleRadioButton, femaleRadioButton);
        return sexRowPanel;
    }

    private static JPanel getHeightRowPanel(JTextField heightFeetInput, JTextField heightInchesInput) {
        // TODO this one shouldn't be too tough, just the three labels and text fields
        JPanel getHeightRowPanel = getBasicRowPanel ();
        JPanel getWeightRowPanel = getBasicRowPanel();
        JPanel getCalculateRowPanel = getBasicRowPanel();

        return getHeightRowPanel;

    }

    private static JPanel getWeightRowPanel(JTextField weightInput) {
        JPanel getWeightRowPanel = getBasicRowPanel();
        JPanel getCalculateRowPanel = getBasicRowPanel();

        return getCalculateRowPanel;
    }

    private static JPanel getCalculateRowPanel(JTextField ageInput, ButtonGroup sexInputGroup, JTextField heightFeetInput, JTextField heightInchesInput, JTextField weightInput, JLabel bmiOutput, JLabel healthOutput) {
        JPanel calculateRowPanel = getBasicRowPanel();
        // TODO make the calculate button with appropriate text
        // TODO same for clear button

        // action listeners for buttons
        class CalculateButtonHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try {
                    int age = 0; // TODO extract age as int from some parameter's .getText() method (which returns a string)
                    boolean isMale = sexInputGroup.getSelection().getActionCommand().equals("Male");
                          // see how the ButtonGroup lets us find out which button is selected, since there is always just one?
                          // We also use the actionCommand we assigned to each button
                    double height = 0; // TODO get this number in inches. You can restrict "ft" to whole numbers but "in" to decimals
                    double weight = 0; // TODO get this, can be a decimal
                    double bmi = 0; // TODO call the method from BMIHelperMethods to calculate BMI
                    bmiOutput.setText("" + bmi);
                    // TODO set the text of healthOutput to some value based on the call to a BMIHelperMethods method
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
       // calculateButton.addActionListener(new CalculateButtonHandler());
        // TODO make a actionlistener that, when pressed, sets the text of all inputs to the empty string
        // TODO and assign it to the clear button

        //calculateRowPanel.add(calculateButton);
        //calculateRowPanel.add(clearButton);

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

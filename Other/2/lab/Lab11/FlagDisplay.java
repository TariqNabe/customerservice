import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlagDisplay {
    private static JLabel capitalLabel; // make this static so it's in scope from the button
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTITLE("COUNTRY FLAG'S");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        // Frame and its settings
        // TODO: create the frame, set size via .setPreferredSize(), set program to exit on close, set frame title

        // Flag panel, flag component
        // TODO: Make a flagPanel JPanel on this line
        flagPanel.setLayout(new BoxLayout(flagPanel, BoxLayout.PAGE_AXIS)); // leave this line alone, sets the panel's layout
        // TODO: here, make the flag component and add it to the panel
        frame.add(flagPanel, BorderLayout.CENTER); // leave this alone, it adds the panel to the frame and tells it where
        // Label and button panel
        // TODO: on this line create the panel which will have the label and button
        itemsPanel.setLayout(new BoxLayout(itemsPanel, BoxLayout.PAGE_AXIS)); // leave alone, it sets panel's layout
        // TODO: instantiate the label defined statically in FlagDisplay, set it to be invisible by default,
        //     add the button, give the button the action listener we create below, and add these elements to the panel
        frame.add(itemsPanel, BorderLayout.PAGE_END);
        // TODO: then prepare and show the frame
    }

    static class ToggleCapitalButtonListener implements ... {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO: method body modifying the static variable
        }
    }
}
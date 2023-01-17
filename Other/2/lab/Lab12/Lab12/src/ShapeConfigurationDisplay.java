import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ShapeConfigurationDisplay {
    private static final Dimension SHAPE_DIMS = new Dimension(100, 100);
    public static void main(String[] args) {
        JFrame frame = getFrame();
        frame.setVisible(true);
    }

    private static JFrame getFrame() {
        // TODO the usual getFrame stuff. Window size 300x300

        // Note: colorsGroup isn't a ButtonGroup, because the point of a ButtonGroup is only one thing can be selected
        // from it at a time. We want some, all, or none of the checkboxes to be selectable. So, we will just put them in
        // an ArrayList in getColorsPanel. Here, just define the empty one.
    }

    private static JPanel getColorsPanel(ArrayList<JCheckBox> colorsGroup, JPanel drawnShapePanel) {
        // TODO there's only one thing to do in this method, the rest is done for you.
        JPanel colorsPanel = new JPanel();
        colorsPanel.add(new JLabel("Colors:"));

        JCheckBox redCheckBox = new JCheckBox("Red");

        JCheckBox blueCheckBox = new JCheckBox("Blue");
        class ColorCheckBoxEventListener implements ItemListener {
            public void itemStateChanged(ItemEvent e) {
                updateDrawnShapePanel(drawnShapePanel, .................., ...................); // TODO
                                                       // whether or not red is selected using a method on redCheckBox
                                                                           // whether or not blue in selected, in a similar way
            }
        }
        redCheckBox.addItemListener(new ColorCheckBoxEventListener());
        blueCheckBox.addItemListener(new ColorCheckBoxEventListener());
        colorsGroup.add(redCheckBox);
        colorsGroup.add(blueCheckBox);

        colorsPanel.add(redCheckBox);
        colorsPanel.add(blueCheckBox);

        return colorsPanel;
    }

    private static JPanel getShapesPanel(ButtonGroup shapesGroup, JPanel drawnShapePanel) {
        JPanel shapesPanel = new JPanel();
        JRadioButton circleButton = new JRadioButton("Circle");
        JRadioButton squareButton = new JRadioButton("Square");
        // TODO make the ShapeButtonEventListener with its event handler method. It should call the other overloaded
        //      helper method in this class, passing in the shapeCode matching a constant in DrawnShapeComponent (don't hardcode!)
        circleButton.addItemListener(new ShapeButtonEventListener());
        squareButton.addItemListener(new ShapeButtonEventListener());
        shapesGroup.add(circleButton);
        shapesGroup.add(squareButton);
        circleButton.setSelected(true);
        shapesPanel.add(new JLabel("Shape:"));
        shapesPanel.add(circleButton);
        shapesPanel.add(squareButton);

        return shapesPanel;
    }

    private static JPanel getDrawnShapePanel(int shapeCode) {
        JPanel drawnShapePanel = new JPanel();
        DrawnShapeComponent drawnShape = new DrawnShapeComponent(shapeCode, false, false); // initially, both checkboxes are not selected, so false to both
        drawnShape.setPreferredSize(SHAPE_DIMS);
        drawnShapePanel.add(drawnShape);

        return drawnShapePanel;
    }

    private static void updateDrawnShapePanel(JPanel drawnShapePanel, boolean isRed, boolean isBlue) {
        DrawnShapeComponent oldComponent = (DrawnShapeComponent) drawnShapePanel.getComponent(0);
        // Notice the OOP concepts we've been studying at work above ^
        int oldShapeCode = ; // TODO fill this in
        drawnShapePanel.remove(0);
        DrawnShapeComponent newShapeDrawing = new DrawnShapeComponent(oldShapeCode, isRed, isBlue);
        newShapeDrawing.setPreferredSize(SHAPE_DIMS);
        drawnShapePanel.add(newShapeDrawing);
        drawnShapePanel.revalidate();
    }

    private static void updateDrawnShapePanel(JPanel drawnShapePanel, int shapeCode) {
        DrawnShapeComponent oldComponent = (DrawnShapeComponent) drawnShapePanel.getComponent(0);
        drawnShapePanel.remove(0);
        DrawnShapeComponent newShapeDrawing = new DrawnShapeComponent(shapeCode, oldComponent.isRed(), oldComponent.isBlue());
        newShapeDrawing.setPreferredSize(SHAPE_DIMS);
        drawnShapePanel.add(newShapeDrawing);
        drawnShapePanel.revalidate();
    }
}

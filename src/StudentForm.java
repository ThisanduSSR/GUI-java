import javax.swing.*;
import java.awt.*;
public class StudentForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Form");
        frame.setSize(600,300);
        frame.setLayout(new FlowLayout());

        frame.add(new JLabel("Enter your age:"));
        frame.add(new JTextField("Type here",15));
        frame.add(new JButton("Submit"));
        frame.add(new JCheckBox("Bold"));
        frame.add(new JCheckBox("Italic"));
        frame.add(new JRadioButton("Red"));
        frame.add(new JRadioButton("Blue"));
        frame.add(new JComboBox<>(new String[]{"Apple","Mango","Banana"}));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

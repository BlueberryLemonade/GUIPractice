import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Saving and Loading from gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        JButton button = new JButton("Click");
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("3D Rotating Cube");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.add(new Renderer());
        frame.setVisible(true);
    }
} 

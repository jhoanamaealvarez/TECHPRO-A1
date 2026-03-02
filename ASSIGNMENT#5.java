import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout {
    public static void main(String[] args) {
        JFrame Frame = new JFrame("ABSOLUTE POSITIONING");
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(400, 300);

        // 1. Disable the layout manager
        Frame.setLayout(null);

        JButton button = new JButton("Button 1");
        // 2. Set Bounds: (X, Y, Width, Height)
        // (50, 50) is the top-left corner; 150px wide, 40ps tall BTN1. setBounds (150, 120, 150, 40);

        Frame.add(button 1);
        Frame.add(button 2);

        Frame.setVisible(true);
    }
}

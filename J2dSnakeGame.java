package j2dsnakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class J2dSnakeGame extends JFrame {
    
    public J2dSnakeGame() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            JFrame ex = new J2dSnakeGame();
            ex.setVisible(true);
        }
        
    });
    }
}

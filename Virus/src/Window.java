import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {

    public Window(int w, int h, String title, Game game){
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setPreferredSize(new Dimension(w, h));
        frame.setMaximumSize(new Dimension(w, h));
        frame.setMinimumSize(new Dimension(w, h));

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Mouse mouse = new Mouse();
        game.addMouseMotionListener(mouse);
        game.addMouseListener(mouse);

        frame.add(game);



        frame.setVisible(true);

        game.start();
    }
}

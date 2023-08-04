import javax.swing.*;
import java.awt.*;

// task 3
public class Main extends JFrame {
    public static void main (String[] args ) throws Exception {
        Main window = new Main();
        Grid windowGrid = new Grid();
        Cell windowCell = new Cell();
    }

    class Canvas extends JPanel{
        public Canvas(){
            // set the canvas of the java pop - up
            setPreferredSize(new Dimension(720, 720));
        }       
    }

    private Main() {
        // functions
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Canvas canvas = new Canvas();
            this.setContentPane(canvas);
            this.pack();
            this.setVisible(true);
            this.paint(Grid());
        }
}


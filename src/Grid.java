import javax.swing.*;
import java.awt.*;

public class Grid {
    
        public Grid(){}
            //@Override
        // using 2D array to generate a grid
         public void paint (Graphics g){
            for(int i = 10; i <710; i += 35){
                for(int k = 10; k < 710; k += 35){
                    Cell();
                }
            }
        }
        
    }



package higherorlower;
import java.awt.Toolkit;
import java.util.*;
import java.io.*;

public class HigherOrLower {

    
    public static void main(String[] args) {
            playingBoard start = new playingBoard(); 
        Toolkit tk = Toolkit.getDefaultToolkit();
        int width =(int) tk.getScreenSize().getWidth();
         int height =(int) tk.getScreenSize().getHeight();

        start.setSize(width,height);
        start.setVisible(true);
    }
    
}


package casinoGame;
import java.awt.Toolkit;
import java.util.*;
import java.io.*;

public class CasinoGame {

    
    public static void main(String[] args) {
            LogInSystem start = new LogInSystem(); 
        Toolkit tk = Toolkit.getDefaultToolkit();
        int width =(int) tk.getScreenSize().getWidth();
         int height =(int) tk.getScreenSize().getHeight();

        start.setSize(width,height);
        start.setVisible(true);
        
    }
    
}

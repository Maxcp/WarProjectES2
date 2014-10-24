/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warproject;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

/**
 *
 * @author Igor
 */
public class WarProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Window gameWindow = new Window(800, 600);
        Keyboard gameKeyboard = gameWindow.getKeyboard();
        GameImage background = new GameImage("img/background.png");
        boolean execute = true;
        
        while(execute)
        {
            if(gameKeyboard.keyDown(Keyboard.ESCAPE_KEY))
            {
                execute = false;
            }
            
            background.draw();
            
            gameWindow.update();
        }
        
        gameWindow.exit();
    }
    
}

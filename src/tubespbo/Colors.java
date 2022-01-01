/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.awt.Color;


/**
 *
 * @author Sefruit Cerita
 */
public class Colors {
    public static final Colors INSTANCE = new Colors();
    
    public Color primaryColor(){
        return new Color(35,43,42);
    }
    
    public Color secondaryColor(){
        return new Color(249,211,154);
    }
    
    public Color mouseMovedColor(){
        return new Color(204,102,0);
    }
}

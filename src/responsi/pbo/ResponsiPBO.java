/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.pbo;

import modeldatabase.Connector;
import view.MovieData;

/**
 *
 * @author Istimewa Megahaztuti
 */
public class ResponsiPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connector DB = new Connector();
        MovieData moviedata = new MovieData(DB);
        moviedata.setVisible(true);
    }
    
}

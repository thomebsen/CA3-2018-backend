/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import facade.FavoritFacade;
import java.io.IOException;

/**
 *
 * @author Andreas
 */
public class GetFive extends Thread {
    
    FavoritFacade ff;

    public GetFive() {
      
    }
    public void run(int id) throws IOException{
        ff.getFavorits(id);
        
    }
    
    
}

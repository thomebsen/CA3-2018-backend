/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oliver
 */
public class FavoritFacade {

    public String myFiveCalls() throws IOException {
        
//        ExecutorService es = Executors.newFixedThreadPool(4);
//
//        Runnable task1 = () -> {
//            try {
//                String person1 = getSwappiData(1);
//            } catch (IOException ex) {
//                Logger.getLogger(FavoritFacade.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        };
//        
//        Runnable task2 = () -> {
//            try {
//                String person2 = getSwappiData(2);
//            } catch (IOException ex) {
//                Logger.getLogger(FavoritFacade.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        };
//        
//        Runnable task3 = () -> {
//            try {
//                String person3 = getSwappiData(3);
//            } catch (IOException ex) {
//                Logger.getLogger(FavoritFacade.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        };
//        
//        Runnable task4 = () -> {
//            try {
//                String person4 = getSwappiData(4);
//            } catch (IOException ex) {
//                Logger.getLogger(FavoritFacade.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        };
//        
//        Runnable task5 = () -> {
//            try {
//                String person5 = getSwappiData(5);
//            } catch (IOException ex) {
//                Logger.getLogger(FavoritFacade.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        };
        
        String person1 = getSwappiData(1);
        String person2 = getSwappiData(2);
        String person3 = getSwappiData(3);
        String person4 = getSwappiData(4);
        String person5 = getSwappiData(5);

        String jsonPersons = "["
                + person1 + ", "
                + person2 + ", "
                + person3 + ", "
                + person4 + ", "
                + person5
                + "]";

        return jsonPersons;

    }

    public String getSwappiData(int id) throws MalformedURLException, IOException {
        URL url = new URL("https://swapi.co/api/people/" + id);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json;charset=UTF-8");
        con.setRequestProperty("User-Agent", "server");
        Scanner scan = new Scanner(con.getInputStream());
        String jsonStr = null;
        if (scan.hasNext()) {
            jsonStr = scan.nextLine();
        }
        scan.close();
        return jsonStr;
    }

}

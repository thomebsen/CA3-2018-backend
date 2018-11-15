/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Andreas
 */
public class ThreadFacade {

    public static List<String> myCallable() {
        
        List<String> Data = new ArrayList<>();

        ExecutorService es = Executors.newFixedThreadPool(4);

        List<Future<String>> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            Callable<String> callable = new FiveFacade(1);

            Future<String> future = es.submit(callable);
            list.add(future);
        }
        
        
        for (Future<String> fut : list) {
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
            Data.add(fut.get());    
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
       return Data;
    }

}

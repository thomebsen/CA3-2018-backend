/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Andreas
 */
public class swapiFacade {
    
    private String URL = "https://swapi.co/api/";
    
    
    public String fetchSwapi(String data){
        fetch(URL+data).then(response=> {
    return response.json();
    }).then(data=>  {
        console.log(data);
    }).catch(err => {"Error"});
    }
    
    
}

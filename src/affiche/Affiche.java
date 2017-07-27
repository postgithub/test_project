/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affiche;

/**
 *
 * @author michelB
 */
public class Affiche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        if(args.length > 0){
            System.out.println("modifié par post **");
        }else{
            System.out.println("modifié par michelb **");
        }
    }
    
}

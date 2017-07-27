/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affiche;

import modele.Etudiant;

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
            System.out.println(new Etudiant() + "ajouté par michelb");
            
        }else{
            System.out.println(new LoginController().checkEmail() + "ajouté par post");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import com.mycompany.codoacodobackendtp1.models.User;

/**
 *
 * @author HhV
 */
public class UserConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new User();
        user.userDataInput ();
        System.out.println(user.toString());
    }
    
}

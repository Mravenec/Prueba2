/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communications;

/**
 *
 * @author Mravenec
 */
public class OptOutEmail {
    /*
     Opts out all customers and customer contacts with specified email from receiving broadcast emails. 
     */

    String email;//Optional. The address you are opting out.

    /*
     OptOutEmailResponse
     */
    Integer recordsAffected;
}

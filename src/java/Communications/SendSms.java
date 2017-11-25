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
public class SendSms {
    /*
     Sends an SMS message. 
     */

    Integer customerID;//Unique identifier for a customer entity.
    String message;//Optional.
    String phone;//Optional. Optional. Will send to Customer Phone(s) if omitted.
}

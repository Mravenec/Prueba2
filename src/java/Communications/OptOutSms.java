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
public class OptOutSms {

    /*
     Opts out all customers and customer contacts with specified phone number from receiving broadcast SMS messages. 
     */
    /*
     OptOutSmsRequest
     */
    private Integer customerID;//Optional. The CustomerID being opted out. Use either CustomerID or phone number.
    private String phoneNumber;//Optional. The phone number you are opting out.

    /*
     OptOutSmsResponse
     */
    private Integer recordsAffected;

}

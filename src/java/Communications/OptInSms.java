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
public class OptInSms {
    /*
     Setup opt in settings for Sms messaging by phone number.
     */

    private Integer customerID;//Optional. The CustomerID being opted in. Use either CustomerID or phone number.
    private String phoneNumber;//Optional. The phone number you are opting in.

    /*
     OptInSmsResponse
     */
    private Integer recordsAffected;
}

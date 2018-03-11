/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import java.sql.Date;
import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CreatePaymentCreditCard {

    /*
     Creates a specific credit card payment for an existing order, or a new order in a transaction. 
     Note: This does not charge a card, and you must have an authorization code to submit this. 

     Note: This request can participate in a transaction.
     */
    private Integer orderID;
    private Date paymentDate;
    private DecimalStyle amount;
    private String creditCardNumber;//Optional.
    private Integer expirationMonth;
    private Integer expirationYear;
    private String billingName;//Optional.
    private String billingAddress;//Optional.
    private String billingAddress2;//Optional.
    private String billingCity;//Optional.
    private String billingState;//Optional.
    private String billingZip;//Optional.
    private String billingCountry; //Optional.
    private Integer creditCardType;//Optional. Optionally pass in Visa, Master Card, etc.
    private String authorizationCode;//Optional.
    private String memo;//Optional.
}

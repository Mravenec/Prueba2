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
public class CreateExpectedPayment {
    /*
     Creates a new expected payment type using cash, money order etc.
     Note: This request can participate in a transaction.
     */

    Integer orderID;
    Date paymentDate;
    DecimalStyle amount;
    PaymentType paymentType;
    String authorizationCode;//Optional. Optional.
    
    
}

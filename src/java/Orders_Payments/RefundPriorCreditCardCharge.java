/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class RefundPriorCreditCardCharge {
    /*
     Refunds a prior charge. To be used with a return order. 

     Note: This request can participate in a transaction
     */

    private Integer returnPaymentID;
    private Integer orderID;
    private DecimalStyle maxAmount;//Optional.
}

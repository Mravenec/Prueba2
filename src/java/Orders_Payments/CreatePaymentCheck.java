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
public class CreatePaymentCheck {
    /*
     Creates a new payment using check information.

     Note: This request can participate in a transaction.
     */

    private Integer orderID;
    private Date paymentDate;
    private DecimalStyle amount;
    private String memo;//Optional. Optional.
    private String checkNumber;//Optional. Optional.
    private String checkAccountNumber;//Optional. Optional.
    private String checkRoutingNumber;//Optional. Optional.
    private Date checkDate;//Optional. Optional.
}

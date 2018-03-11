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
public class CreatePaymentPointAccount {
    /*
     Creates a new payment for point account.

     Note: This request can participate in a transaction
     */

    private Integer OrderID;
    private Integer PointAccountID;
    private Date PaymentDate;
    private DecimalStyle Amount;
    private String Memo;//Optional. Optional.
}

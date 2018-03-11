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
public class CreatePaymentWallet {
    /*
     Creates a new payment for wallet account.
     Note: This request can participate in a transaction
     */

    private Integer orderID;
    private Date paymentDate;
    private DecimalStyle amount;
    private Integer walletType;
    private String walletAccount;//Optional.
    private String authorizationCode;//Optional.
    private String memo;//Optional.
    private String billingName;//Optional.
}

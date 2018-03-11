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
public class ChargeWalletAccount {
    /*
     Attempts to debit a wallet account with the amount found on an exiting order, or a new order in a transaction. 
     If the debit request is successful, the order is changed to accepted. 

     Note: This request can participate in a transaction.
     */

    String walletAccountNumber;//Optional.
    Integer walletTy;
    Integer orderID;
    String memo;//Optional.
    DecimalStyle maxAmount;//Optional. Optional. Only use if you are applying multiple payments.
}

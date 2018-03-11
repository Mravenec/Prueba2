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
public class DebitBankAccount {
    /*
     Attempts to debit a bank account with the amount found on an exiting order, or a new order in a transaction.
     If the debit request is successful, the order is changed to accepted. 

     Note: This request can participate in a transaction.
     */

    private String bankAccountNumber;//Optional.
    private String bankRoutingNumber;//Optional.
    private String bankName;//Optional.
    private BankAccountType bankAccountType;
    private String checkNumber;//Optional. Optional (will be auto generated if pay by check).
    private String nameOnAccount;//Optional.
    private String billingAddress;//Optional.
    private String billingAddress2;//Optional.
    private String billingCity;//Optional.
    private String billingState;//Optional.
    private String billingZip;//Optional.
    private String billingCountry;//Optional.
    private Integer orderID;
    private DecimalStyle maxAmount;//Optional. Optional. Only use if you are applying multiple payments.

    enum BankAccountType {

        CheckingPersonal,
        CheckingBusiness,
        SavingsPersonal,
        SavingsBusiness,

    }
}

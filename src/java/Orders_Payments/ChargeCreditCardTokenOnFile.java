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
public class ChargeCreditCardTokenOnFile {
    /*
     Attempts to charge a card token on file with the amount found on an exiting order, or a new order in a transaction. 
     If the charge is successful, the order is changed to accepted. 

     Note: This request can participate in a transaction.
     */

    private AccountCreditCardType creditCardAccountType;
    private Integer orderID;
    private String cvcCode;//Optional. Optional.
    private DecimalStyle maxAmount;//Optional. Optional. Only use if you are applying multiple payments.
    private Integer merchantWarehouseIDOverride;//Optional. Optional. Use to override the warehouse used for merchant selection.
    private String clientIPAddress;//Optional. Optional.
    private String otherData1;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData2;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData3;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData4;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData5;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData6;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData7;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData8;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData9;//Optional. Optional. Use for some merchants to pass additional data.
    private String otherData10;//Optional. Optional. Use for some merchants to pass additional data.

    enum AccountCreditCardType {

        Primary,
        Secondary,
    }

}

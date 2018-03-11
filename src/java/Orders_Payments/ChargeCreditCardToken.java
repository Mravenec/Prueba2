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
public class ChargeCreditCardToken {
    /*
     Attempts to charge a card token with the amount found on an exiting order, or a new order in a transaction. 
     If the charge is successful, the order is changed to accepted. 

     Note: This request can participate in a transaction.
     */

    private String creditCardToken;//Optional.
    private String billingName;//Optional.
    private String billingAddress;//Optional.
    private String billingAddress2;//Optional.
    private String billingCity;//Optional.
    private String billingState;//Optional.
    private String billingZip;//Optional.
    private String billingCountry;//Optional.
    private String cvcCode;//Optional. Optional.
    private String issueNumber;//Optional. Optional.
    private Integer creditCardType;//Optional. Optionally pass in Visa, Master Card, etc.
    private Integer orderID;
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

/**
 *
 * @author Mravenec
 */
public class ChargeGroupOrderCreditCardToken {
    /*
     Attempts to charge a card token with the amount found on the specified orders. 
     */

    private String creditCardToken;//Optional.
    private String billingName;//Optional.
    private String billingAddress;//Optional.
    private String billingAddress2;//Optional.
    private String billingCity;//Optional.
    private String billingState;//Optional.
    private String billingZip;//Optional.
    private String billingCountry; //Optional.
    private String cvcCode;//Optional.
    private String issueNumber;//Optional.
    private Integer creditCardType;//Optional. Optionally pass in Visa, Master Card, etc.
    private Integer masterOrderID;
    private GroupOrder[] orders;
    private Integer merchantWarehouseIDOverride;//Optional. Use to override the warehouse used for merchant selection.
    private String clientIPAddress;//Optional.
    private String otherData1;//Optional. Use for some merchants to pass additional data.
    private String otherData2;//Optional. Use for some merchants to pass additional data.
    private String otherData3;//Optional. Use for some merchants to pass additional data.
    private String otherData4;//Optional. Use for some merchants to pass additional data.
    private String otherData5;//Optional. Use for some merchants to pass additional data.
    private String otherData6;//Optional. Use for some merchants to pass additional data.
    private String otherData7;//Optional. Use for some merchants to pass additional data.
    private String otherData8;//Optional. Use for some merchants to pass additional data.
    private String otherData9;//Optional. Use for some merchants to pass additional data.
    private String otherData10;//Optional. Use for some merchants to pass additional data.
    private String paymentMemo;//Optional. Used to specify the memo on the generated payment records for successful transactions.
}

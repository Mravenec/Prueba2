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
class PaymentResponse {
    /*
     See GetOrders class
     */

    private Integer paymentID;
    private Integer customerID;
    private PaymentType paymentType;
    private Date paymentDate;
    private DecimalStyle amount;
    private Integer orderID;
    private String currencyCode;
    private String billingName;
    private String billingAddress1;
    private String billingAddress2;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private String bankName;
    private String memo;
    private String creditCardNumberDisplay;
    private String authorizationCode;
    private Integer creditCardType;//Optionally pass in Visa, Master Card, etc.
    private String creditCardTypeDescription;
}

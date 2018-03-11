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
class PaymentType {
    /*
     check CreatePayment 
     */

    private Integer orderID;
    private Date paymentDate;
    private DecimalStyle amount;
    private PaymentType paymentType;
    private String authorizationCode;//Optional. Optional.
    private String memo;//Optional. Optional.
    private String billingName;//Optional. Optional.
    private String billingAddress;//Optional. Optional.
    private String billingAddress2;//Optional. Optional.
    private String billingCity;//Optional. Optional.
    private String billingState;//Optional. Optional.
    private String billingZip;//Optional. Optional.
    private String billingCountry;//Optional. Optional.
}

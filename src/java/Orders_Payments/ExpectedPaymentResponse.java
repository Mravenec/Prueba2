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
class ExpectedPaymentResponse {
    /*
     See GetOrders class
     */

    private Integer expectedPaymentID;
    private Integer customerID;
    private PaymentType paymentType;
    private Date paymentDate;
    private DecimalStyle amount;
    private Integer orderID;
    private String currencyCode;
    private String billingName;
    private String authorizationCode;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payout;

import java.sql.Date;
import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CreatePayout {

    /*
     Creates a new payout for one or more bills and updates status
     */
    /*
     CreatePayoutRequest
     */
    private Integer[] billIDs_ToPay;
    private Integer vendorPaymentTypeID; //Payment type.
    private Integer customerID;//Unique identifier for a customer entity.
    private Integer bankAccountID;
    private String reference;//Optional.
    private String transactionNote;//Optional.
    private Date paymentDate;//Optional.

    /*
     CreatePayoutResponse
     */
    private Integer payoutID;
    private DecimalStyle totalDollarAmount;

}

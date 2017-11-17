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
public class CreateBill {
    /*
    Creates a new bill
    */
    
    /*
    CreateBillRequest
    */
    
 private Integer  customerID; //Unique identifier for a customer entity.
 private String currencyCode; //Optional.
 private Boolean isOtherIncome;
 private Date dueDate;
 private DecimalStyle amount;
 private String reference;//Optional.
 private String notes;//Optional.
 private Integer billStatusTypeID;//Optional. Optional Bill Status (default is Unpaid).
 private Integer payableTypeIDOverride;//Optional. Optionally override the payable type of the bill.
 
 /*
 CreateBillResponse
 */
 
 private Integer billID;
}

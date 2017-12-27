/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Mravenec
 */
public class CreateCustomerInquiry {
    /*
     Creates a customer history record. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private String detail;//Optional.
    private String description;//Optional.
    private String assignToUser;//The Exigo admin's login name that should be assigned this inquiry.
    private Integer customerInquiryStatusID; //Customer history/inquiry status type.
    private Integer customerInquiryCategoryID;//Customer history/inquiry category type.

    /*
     CreateCustomerInquiryResponse
     */
    private Integer newCustomerHistoryID;//Unique identifier for newly create customer history/inquiry record.
}

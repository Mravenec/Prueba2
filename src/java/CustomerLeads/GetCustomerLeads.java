/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerLeads;

/**
 *
 * @author Mravenec
 */
public class GetCustomerLeads {
    /*
     Gets a list of customer leads. 
     */

    /*
     GetCustomerLeadsRequest
     */
    Integer customerID;//Unique identifier for a customer entity.
    Integer customerLeadID;//Optional. Optionally pull just one customer lead by ID.
    Integer greaterThanCustomerLeadID;//Optional. Optional paging controller.
    Integer batchSize;//Optional. Defaults to 100 at a time.

    /*
     GetCustomerLeadsResponse
     */
    CustomerLeadsResponse[] customerLeads;

    /*
     CustomerLeadsResponse
     */
}

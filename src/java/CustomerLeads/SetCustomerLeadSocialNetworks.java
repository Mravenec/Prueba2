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
public class SetCustomerLeadSocialNetworks {
    /*
     Deletes all existing social network(s) for the customer lead, then inserts the provided list of social network(s) for the customer lead. 

     Note: This request can participate in a transaction
     */

    private Integer customerLeadID;//Unique identifier for a customer lead entity.
    private Integer customerID;//Unique identifier for a customer entity.
    private CustomerLeadSocialNetworkRequest[] customerLeadSocialNetworks;
    
    /*
    see CustomerLeadSocialNetworkRequest
    */
    
    
}

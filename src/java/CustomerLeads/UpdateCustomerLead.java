/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerLeads;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class UpdateCustomerLead {
    /*
     Updates a customer leads. 

     Note: This request can participate in a transaction.
     */

    private Integer CustomerID;//Unique identifier for a customer entity.
    private Integer customerLeadID;//Unique identifier for a customer lead entity.
    private String firstName;//Optional.
    private String lastName;//Optional.
    private String middleName;//Optional.
    private String company;//Optional.
    private String phone;//Optional.
    private String phone2;//Optional.
    private String mobilePhone;//Optional.
    private String fax;//Optional.
    private String email;//Optional.
    private String address1;//Optional.
    private String address2;//Optional.
    private String city;//Optional.
    private String state;//Optional.
    private String zip;//Optional.
    private String country;//Optional.
    private Date birthDate;//Optional.
    private String notes;//Optional.
}

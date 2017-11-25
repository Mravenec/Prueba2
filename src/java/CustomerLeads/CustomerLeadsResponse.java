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
class CustomerLeadsResponse {

    /*
     See GetCustomerLeads class
     */
    private Integer customerID;//Unique identifier for a customer entity.
    private Integer customerLeadID;//Unique identifier for a customer lead entity.
    private String firstName;
    private String lastName;
    private String middleName;
    private String company;
    private String phone;
    private String phone2;
    private String mobilePhone;
    private String fax;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private Date birthDate;
    private String notes;

}

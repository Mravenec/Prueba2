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
public class SetCustomerSite {

    /*
     Setup public web site info for an existing customer, or new customer in a transaction.
     Note: This request can participate in a transaction.
     */
    private Integer customerID;//Unique identifier for a customer entity.
    private String webAlias;//The unique name used in a replicated site to identify the customer.
    private String firstName;//Optional.
    private String lastName;//Optional.
    private String company;//Optional.
    private String address1;//Optional.
    private String address2;//Optional.
    private String city;//Optional.
    private String state; //Optional.
    private String zip;//Optional.
    private String country;//Optional.
    private String email;//Optional.
    private String phone;//Optional.
    private String phone2;//optional.
    private String notes1;//Optional.
    private String notes2;//Optional.
    private String notes3;//Optional.
    private String notes4;//Optional.
    private String url1;//Optional.
    private String url2;//Optional.
    private String url3;//Optional.
    private String url4;//Optional.
    private String url5;//Optional.
    private String url6;//Optional.
    private String url7;//Optional.
    private String url8;//Optional.
    private String url9;//Optional.
    private String url10;//Optional.
    private String url1Description;//Optional.
    private String url2Description;//Optional.
    private String url3Description;//Optional.
    private String url4Description;//Optional.
    private String url5Description;//Optional.
    private String url6Description;//Optional.
    private String url7Description;//Optional.
    private String url8Description;//Optional.
    private String url9Description;//Optional.
    private String url10Description;//Optional.

    public SetCustomerSite(Integer customerID, String webAlias, String firstName, String lastName, String company, String address1, String address2, String city, String state, String zip, String country, String email, String phone, String phone2, String notes1, String notes2, String notes3, String notes4, String url1, String url2, String url3, String url4, String url5, String url6, String url7, String url8, String url9, String url10, String url1Description, String url2Description, String url3Description, String url4Description, String url5Description, String url6Description, String url7Description, String url8Description, String url9Description, String url10Description) {
        this.customerID = customerID;
        this.webAlias = webAlias;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.email = email;
        this.phone = phone;
        this.phone2 = phone2;
        this.notes1 = notes1;
        this.notes2 = notes2;
        this.notes3 = notes3;
        this.notes4 = notes4;
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
        this.url4 = url4;
        this.url5 = url5;
        this.url6 = url6;
        this.url7 = url7;
        this.url8 = url8;
        this.url9 = url9;
        this.url10 = url10;
        this.url1Description = url1Description;
        this.url2Description = url2Description;
        this.url3Description = url3Description;
        this.url4Description = url4Description;
        this.url5Description = url5Description;
        this.url6Description = url6Description;
        this.url7Description = url7Description;
        this.url8Description = url8Description;
        this.url9Description = url9Description;
        this.url10Description = url10Description;
    }

    public SetCustomerSite() {
    }
    
    

}

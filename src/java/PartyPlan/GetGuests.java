/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartyPlan;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class GetGuests {
    /*
     Gets a list of guests
     */

    /*
     GetGuestsRequest
     */
    private Integer guestID;//Optional. If set, guests with this unique identifier will be returned.
    private Integer customerID;//Optional. If set, guests with, this customer ID will be returned. Customer IDs are assigned only if they have a corresponding customer account.
    private Integer hostID;//Optional. If set, guests tied to this host will be returned.
    private Integer[] guestStatuses;//Optional. If set, guests with any of these statuses will be returned.
    private Integer languageID;//Optional. The language ID the guests should have.
    private String firstName;//Optional. The guest's first name.
    private String middleName;//Optional. The guest's middle name.
    private String lastName;//Optional. The guest's last name.
    private String nameSuffix;//Optional. The guest's name suffix.
    private String company;//Optional. The guest's company name.
    private String email;//Optional. The guest's email address.
    private String phone;//Optional.
    private String phone2;//Optional.
    private String mobilePhone;//Optional.
    private String address1;//Optional.
    private String address2;//Optional.
    private String address3;//Optional.
    private String city;//Optional.
    private String county;//Optional.
    private String state;//Optional.
    private String zip;//Optional.
    private String country;//Optional.
    private String field1;//Optional.
    private String field2;//Optional.
    private String field3;//Optional.
    private String field4;//Optional.
    private String field5;//Optional.
    private String field6;//Optional.
    private String field7;//Optional.
    private String field8;//Optional.
    private String field9;//Optional.
    private String field10;//Optional.
    private String field11;//Optional.
    private String field12;//Optional.
    private String field13;//Optional.
    private String field14;//Optional.
    private String field15;//Optional.
    private Date date1;//Optional.
    private Date date2;//Optional.
    private Date date3;//Optional.
    private Date date4;//Optional.
    private Date date5;//Optional.
    private Date createdDateStart;//Optional.
    private Date createdDateEnd;//Optional.

    /*
     GetGuestsResponse   
     */
  private  GuestResponse[] guests;
  
  /*
  see GuestResponse class
  */
}

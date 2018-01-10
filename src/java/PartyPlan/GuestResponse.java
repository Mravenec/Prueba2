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
class GuestResponse {
    /*
     See GetPartyGuests
     */

    private Integer guestID;
    private Integer customerID;//Unique identifier for a customer entity.
    private Integer hostID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nameSuffix;
    private String company;
    private Gender gender;
    private Integer guestStatus;
    private Integer languageID; //Customize the web experience by setting this.
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String county;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String phone2;
    private String mobilePhone;
    private String email;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String field10;
    private String field11;
    private String field12;
    private String field13;
    private String field14;
    private String field15;
    private Date date1;
    private Date date2;
    private Date date3;
    private Date date4;
    private Date date5;
    private Date createdDate;
    private Date modifiedDate;

    private enum Gender {
        /*
         Unknown
         Male
         Female
         */

    }
}

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
public class UpdateGuest {
    /*
     Updates one or more fields on an existing guest.
     */

    private Integer GuestID;//The unique identifier of the guest.
    private Integer customerID;//Optional. Unique identifier for a customer entity.
    private String firstName;//Optional. 
    private String middleName;//Optional. 
    private String lastName;//Optional. 
    private String nameSuffix;//Optional. 
    private String company;//Optional. 
    private Gender gender;//Optional. 
    private Integer languageID;//Optional. Customize the web experience by setting this.
    private Integer guestStatus;//Optional. 
    private String address1;//Optional.
    private String address2;//Optional.
    private String address3;//Optional.
    private String city;//Optional.
    private String county;//Optional.
    private String state;//Optional. 
    private String zip;//Optional.
    private String country;//Optional. 
    private String phone;//Optional.
    private String phone2;//Optional.
    private String mobilePhone;//Optional.
    private String email;//Optional.
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
    private String notes;//Optional. 

    private enum Gender { //Optional. The guest's gender.
        /*
         Unknown
         Male
         Female
         */

    }

}

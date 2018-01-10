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
public class CreateGuest {

    /*
     Creates a new guest. Can optionally be put in a party.
     */
    private Integer hostID;//The unique identifier of the host that the guest was created/referred by.
    private Integer partyID;//Optional. If set, the guest will be placed in the provided party.
    private Integer customerID;//Optional. If set, the guest will be linked to the provided customer account.
    private String firstName;//Optional. The guest's first name.
    private String middleName;//Optional. The guest's middle name.
    private String lastName;//Optional. The guest's last name.
    private String nameSuffix;//Optional. The guest's name suffix.
    private String company;//Optional. The guest's company name.
    private Gender gender;//Optional. The guest's gender.
    private Integer languageID;//Optional. The guest's preferred language. Defaults to 0.
    private Integer guestStatus;//Optional. The guest's status as defined by the company. Defaults to 1.
    private String address1;//Optional.
    private String address2;//Optional.
    private String address3;//Optional.
    private String city;//Optional.
    private String county;//Optional.
    private String state;//Optional. The state of the guest's address. This field is required if Address1 is provided.
    private String zip;//Optional.
    private String country;//Optional. The country of the guest's address. This field is required if Address1 is provided.
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
    private String notes;//Optional. Any additional notes about the guest.
    private Date entryDate;//The date the guest was created. The provided date must be greater than 1/1/1900.

    private enum Gender { //Optional. The guest's gender.
        /*
         Unknown
         Male
         Female
         */

    }

    /*
     CreateGuestResponse
     */
    private Integer GuestID;
}

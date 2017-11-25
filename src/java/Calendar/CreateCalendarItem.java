/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class CreateCalendarItem {

    /*
     Creates a new calendar item. 

     Note: This request can participate in a transaction.
     */
    /*
     CreateCalendarItemRequest
     */
    private Integer userID;
    private Integer calendarID;
    private CalendarItemType calendarItemType;
    private CalendarItemStatusType calendarItemStatusType;
    private CalendarItemPriorityType calendarItemPriorityType;
    private String subject;//Optional.
    private String location;//Optional.
    private String notes;//Optional.
    private Date startDate;
    private Date endDate;
    private Integer timeZone;
    private String address1;//Optional.
    private String address2;//Optional.
    private String city;//Optional.
    private String state;//Optional.
    private String country;//Optional.
    private String postalCode;//Optional.
    private String contactInfo;//Optional.
    private String contactPhone;//Optional.
    private ContactPhoneType contactPhoneType;
    private String contactEmail;//Optional.
    private String eventHost;//Optional.
    private String specialGuests;//Optional.
    private String eventFlyer;//Optional.
    private String eventCostInfo;//Optional.
    private String eventConferenceCallOrWebinar;//Optional.
    private String eventRegistrationInfo;//Optional.
    private String eventTags;//Optional.
    private Boolean isShared;

    enum CalendarItemType {
        /*
         Appointment
         ToDo
         Anniversary
         */
    }

    enum CalendarItemStatusType {
        /*
         Open
         Closed
         */
    }

    enum CalendarItemPriorityType {
        /*
         None
         High
         Medium
         Low
         */
    }

    enum ContactPhoneType {
        /*
         Office
         Mobile
         Home
         */
    }

    /*
     CreateCalendarItemResponse
    
     private Integer calendarID;
     private Integer calendarItemID;
     */
    
    
}

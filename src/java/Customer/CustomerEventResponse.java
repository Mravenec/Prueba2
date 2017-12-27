/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
class CustomerEventResponse {
    
    /*
    see DequeueCustomerEvents
    */

    Integer eventID;
    Integer customerID ;//Unique identifier for a customer entity.
    String eventDescription;
    CustomerEventField[] fields;
    Date eventDate;
    
    /*
    CustomerEventField
    */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Points_and_Subscriptions;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class GetSubscription {
    /*
     Get the subscription account for a customer. 
     */
    /*
     GetSubscriptionRequest
     */

    private Integer subscriptionID;
    private Integer customerID;//Unique identifier for a customer entity.

    /*
     GetSubscriptionResponse
     */
    private SubscriptionStatus status;
    private Date startDate;
    private Date expireDate;

    enum SubscriptionStatus {
        /*NotFound
         Active
         Expired
         Cancelled*/
    }
}

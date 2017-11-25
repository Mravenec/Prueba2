/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Points_and_Subscriptions;

import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CreatePointTransaction {
    /*
     Create a transaction that adjusts or redeems points from a customer's point account. 
     */

    private Integer pointAccountID;
    private Integer customerID;//Unique identifier for a customer entity.
    private DecimalStyle amount;//The amount to apply to the point account. A positive amount will add points while a negative amount will subtract points from the account.
    private String reference;//Optional.
    private PointTransactionType transactionType;//The type of point transaction. This property is for logging purposes only and has no bearing on how the points are applied to the point account.

    enum PointTransactionType {
        /*
         Redemption
         Adjustment
         */
    }
}

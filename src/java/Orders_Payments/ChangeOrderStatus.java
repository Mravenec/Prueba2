/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

/**
 *
 * @author Mravenec
 */
public class ChangeOrderStatus {
    /*
     Changes an existing order from one status to another. 
     */

    private Integer orderID;
    private OrderStatusType orderStatus;

    enum OrderStatusType{
    /*
     Incomplete
     Pending
     CCDeclined
     ACHDeclined
     Canceled
     CCPending
     ACHPending
     Accepted
     Printed
     Shipped
     PendingInventory
     */
    }
}

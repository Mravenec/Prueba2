/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import Orders_Payments.CreateOrderImport.OrderStatusType;

/**
 *
 * @author Mravenec
 */
public class ChangeOrderStatusBatch {
    /*
     Changes existing orders from one status to another in a batch. Can optionally update tracking numbers as well. 
     */

    private OrderStatusType orderStatus; //The status to apply to all detail.
    private OrderBatchDetailRequest[] details;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecurringOrders;

/**
 *
 * @author Mravenec
 */
public class ChangeAutoOrderStatus {
    /*
     Changes the status of an AutoOrder. This is typically used to delete or suspend an auto order. 
     */

    private Integer autoOrderID;
    private AutoOrderStatusType autoOrderStatus;

    enum AutoOrderStatusType {
        /*
         Active
         Inactive
         Deleted
         */
    }

    public ChangeAutoOrderStatus(Integer autoOrderID, AutoOrderStatusType autoOrderStatus) {
        this.autoOrderID = autoOrderID;
        this.autoOrderStatus = autoOrderStatus;
    }

    public ChangeAutoOrderStatus() {
        
    }
    
    

}

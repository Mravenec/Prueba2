/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Mravenec
 */
public class SetItemWarehouse {
    /*
     Sets warehouse info for an item) 

     Note: This request can participate in a transaction.
     */

    /*
     SetItemWarehouseRequest
     */
    private String itemCode; //Optional.
    private Integer warehouseID; //Unique location for orders.
    private Boolean isAvailable;//Optional.
    private Integer itemManageTypeID;//Optional. Item management type.

}

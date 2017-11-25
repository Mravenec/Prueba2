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
public class AdjustInventory {
    /*
     Posts an adjustment to item inventory. 
     */

    /*
     AdjustInventoryRequest
     */
    private Integer warehouseID;//Unique location for orders.
    private String itemCode;//Optional.
    private Integer quantity;
    private String notes;//Optional.

}

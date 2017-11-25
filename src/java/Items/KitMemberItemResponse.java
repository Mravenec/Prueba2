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
class KitMemberItemResponse {
    /*
     See Getitems class
     */

    private String itemCode;
    private String description;
    private InventoryStatusType inventoryStatus;

    enum InventoryStatusType {
        /*
         Available
         OnBackOrder
         OutOfStock
         Discontinued
         */
    }
}

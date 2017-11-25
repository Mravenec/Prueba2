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
class ItemMemberResponse {
    /*
     Please check getItems class
     */

    private String itemCode;
    private String memberDescription;
    private String itemDescription;
    private InventoryStatusType inventoryStatus;
    private Integer stockLevel;
    private Integer availableStockLevel;

    enum InventoryStatusType {
        /*
         Available
         OnBackOrder
         OutOfStock
         Discontinued
         */
    }
}

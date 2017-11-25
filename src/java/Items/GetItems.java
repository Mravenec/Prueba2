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
public class GetItems {

    /*
     Returns price, volume, and description for one or more item codes. 
     */
    /*
     GetItemsRequest
     */
    private String currencyCode;//Optional.
    private Integer priceType; //Controls which price band to use.
    private Integer warehouseID; //Unique location for orders.
    private String[] itemCodes;//Optional array of item codes.
    private Integer webID; //Optional. Optionally use categories from content engine.
    private Integer webCategoryID; //Optional. Optionally use categories from content engine.
    private Boolean returnLongDetail;//
    private Boolean restrictToWarehouse;//Optional. Determines if the items returned must be available in the provided WarehouseID (Default: false).
    private Integer languageID; //Optional. Customize the web experience by setting this.
    private Boolean excludeHideFromSearch;//Optional. Will exclude Hide from Search items. (defaults to false).

    /*
     GetItemsResponse
     */
    private ItemResponse[] items;

    /*
     check class ItemResponse
     */
    /*
     check class ItemMemberResponse
     */
    /*
     KitMemberResponse
     */
    private String Description;
    private KitMemberItemResponse[] KitMemberItems;
}

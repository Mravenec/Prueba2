/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
class ItemResponse {
    /*
     Please check getItems class
     */

    private String itemCode;
    private String description;
    private DecimalStyle price;//Price amount.
    private DecimalStyle commissionableVolume;
    private DecimalStyle businessVolume;
    private DecimalStyle other1Price;
    private DecimalStyle other2Price;
    private DecimalStyle other3Price;
    private DecimalStyle other4Price;
    private DecimalStyle other5Price;
    private DecimalStyle other6Price;
    private DecimalStyle other7Price;
    private DecimalStyle other8Price;
    private DecimalStyle other9Price;
    private DecimalStyle other10Price;
    private String category;
    private Integer categoryID;
    private String tinyPicture;
    private String smallPicture;
    private String largePicture;
    private String shortDetail;
    private String shortDetail2;
    private String shortDetail3;
    private String shortDetail4;
    private String longDetail;
    private String longDetail2;
    private String longDetail3;
    private String longDetail4;
    private InventoryStatusType inventoryStatus;
    private Integer stockLevel;
    private Integer availableStockLevel;
    private Integer maxAllowedOnOrder;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String field10;
    private Boolean otherCheck1;
    private Boolean otherCheck2;
    private Boolean otherCheck3;
    private Boolean otherCheck4;
    private Boolean otherCheck5;
    private Boolean isVirtual;
    private Boolean allowOnAutoOrder;
    private Boolean isGroupMaster;
    private String groupDescription;
    private String groupMembersDescription;
    private ItemMemberResponse[] groupMembers;
    private Boolean isDynamicKitMaster;
    private Boolean hideFromSearch;
    private MemberResponse[] kitMembersKit;
    private DecimalStyle taxablePrice;
    private DecimalStyle shippingPrice;

    enum InventoryStatusType {
        /*
         Available
         OnBackOrder
         OutOfStock
         Discontinued
         */
    }
}

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
public class CreateItem {
    /*
     Adds an Item (and optional warehouse/price info) 

     Note: This request can participate in a transaction.
     */

    /*
     CreateItemRequest
     */
    private String itemCode; //Optional.
    private String description;//Optional.
    private DecimalStyle weight;
    private String notes;//Optional.
    private Boolean availableInAllCountryRegions;
    private Boolean taxedInAllCountryRegions;
    private Boolean availableInAllWarehouses;
    private Boolean isVirtual;
    private Integer itemTypeID;
    private Boolean otherCheck1;
    private Boolean otherCheck2;
    private Boolean otherCheck3;
    private Boolean otherCheck4;
    private Boolean therCheck5;
    private String field1; //Optional.
    private String field2;//Optional.
    private String field3;//Optional.
    private String field4;//Optional.
    private String field5;//Optional.
    private String field6;//Optional.
    private String field7;//Optional.
    private String field8;//Optional.
    private String field9;//Optional.
    private String field10;//Optional.
    private Boolean hideFromSearch;

    /*
     CreateItemResponse
     */
    String _itemCode;//Newly created identifier for an item entity.
}

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
public class UpdateItem {
    /*
     Updates an Item (and optional warehouse/price info) 

     Note: This request can participate in a transaction.
     */

    private String itemCode; //Optional.
    private String description;//Optional.
    private DecimalStyle weight;//Optional.
    private String notes;//Optional.
    private Boolean availableInAllCountryRegions;//Optional.
    private Boolean taxedInAllCountryRegions;//Optional.
    private Boolean availableInAllWarehouses;//Optional.
    private Boolean isVirtual;//Optional.
    private Integer itemTypeID;//Optional.
    private String shortDetail;//Optional.
    private String shortDetail2;//Optional.
    private String shortDetail3;//Optional.
    private String shortDetail4;//Optional.
    private String longDetail;//Optional.
    private String longDetail2;//Optional.
    private String longDetail3;//Optional.
    private String longDetail4;//Optional.
    private Boolean otherCheck1;//Optional.
    private Boolean otherCheck2;//Optional.
    private Boolean otherCheck3;//Optional.
    private Boolean otherCheck4;//Optional.
    private Boolean otherCheck5;//Optional.
    private String field1;//Optional.
    private String field2;//Optional.
    private String field3;//Optional.
    private String field4;//Optional.
    private String field5;//Optional.
    private String field6;//Optional.
    private String field7;//Optional.
    private String field8;//Optional.
    private String field9;//Optional.
    private String field10;//Optional.
    private Boolean hideFromSearch;//Optional.
    
    
}

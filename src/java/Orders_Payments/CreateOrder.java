/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import java.sql.Date;
import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CreateOrder {
    /*
     Creates a new Order for an existing customer. Can create an order for a new customer if part of a transaction. 
     Server will calculate all pricing, tax, shipping and volume info unless overridden in the request. 

     Note: This request can participate in a transaction. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private OrderStatusType orderStatus;
    private Date orderDate;
    private String currencyCode;//Optional.
    private Integer warehouseID;//Unique location for orders.
    private Integer shipMethodID;
    private Integer priceType;//Controls which price band to use.
    private String firstName;//Optional.
    private String middleName;//Optional.
    private String lastName;//Optional.
    private String nameSuffix;//Optional.
    private String company;//Optional.
    private String address1;//Optional.
    private String address2;//Optional.
    private String address3;//Optional.
    private String city;//Optional.
    private String state;//Optional.
    private String zip;//Optional.
    private String country;//Optional.
    private String county;//Optional.
    private String email;//Optional.
    private String phone;//Optional.
    private String notes;//Optional.
    private String other11;//Optional.
    private String other12;//Optional.
    private String other13;//Optional.
    private String other14;//Optional.
    private String other15;//Optional.
    private String other16;//Optional.
    private String other17;//Optional.
    private String other18;//Optional.
    private String other19;//Optional.
    private String other20;//Optional.
    private OrderType orderType;
    private DecimalStyle taxRateOverride;//Optional.
    private DecimalStyle shippingAmountOverride;//Optional.
    private Boolean useManualOrderID;//Optional.
    private Integer manualOrderID;//Optional.
    private Integer transferVolumeToID;//Optional. Optional. Only pass in if you want volume to goto another CustomerID.
    private Integer returnOrderID;//Optional.
    private Boolean overwriteExistingOrder;
    private Integer existingOrderID;
    private Integer partyID;//Optional.
    private OrderDetailRequest[] details;
    private Boolean suppressPackSlipPrice;

    private enum OrderStatusType {

        Incomplete,
        Pending,
        CCDeclined,
        ACHDeclined,
        Canceled,
        CCPending,
        ACHPending,
        Accepted,
        Printed,
        Shipped,
        PendingInventory,
    }
}

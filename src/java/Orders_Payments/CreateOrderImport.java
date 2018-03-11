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
public class CreateOrderImport {
    /*
     Imports a new Order for an existing customer. 
     Use this for import routines or other instances where you wish to supply all calculation data. 
     It is advised to use CreateOrder unless you know the exact breakdown of all pricing, tax, shipping and volume info. 

     Note: This request can participate in a transaction. 
     */

    Integer customerID;//Unique identifier for a customer entity.
    String firstName;//Optional.
    String lastName;//Optional.
    String company;//Optional.
    String phone;//Optional.
    String email;//Optional.
    Integer shipMethodID;
    String address1;//Optional.
    String address2;//Optional.
    String city;//Optional.
    String state;//Optional.
    String zip;//Optional.
    String country;//Optional.
    String county;//Optional.
    String notes;//Optional.
    Integer warehouseID; //Unique location for orders.
    String currencyCode;//Optional.
    DecimalStyle shippingStateTax;
    DecimalStyle shippingFedTax;
    DecimalStyle shippingCountyLocalTax;
    DecimalStyle shippingCountyTax;
    DecimalStyle shippingCityLocalTax;
    DecimalStyle shippingCityTax;
    DecimalStyle shipping;
    Integer priceType; //Controls which price band to use.
    OrderStatusType orderStatus;
    Date orderDate;
    String other11;//Optional.
    String other12;//Optional.
    String other13;//Optional.
    String other14;//Optional.
    String other15;//Optional.  
    String other16;//Optional.
    String other17;//Optional.
    String other18;//Optional.
    String other19;//Optional.
    String other20;//Optional.
    OrderType orderType;
    Boolean useManualOrderID;//Optional.
    Integer manualOrderID;//Optional.
    Integer returnOrderID;//Optional. Return Order ID.
    OrderImportDetail[] orderDetails;
    Integer partyID;//Optional.

    enum OrderStatusType {

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

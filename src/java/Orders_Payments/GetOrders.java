/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class GetOrders {
    /*
     Returns one or more orders. You can submit several optional filter fields to control the results. 
     */

    private Integer customerID;//Optional.
    private Integer orderID;//Optional.
    private Integer[] orderIDs;//Optionally supply a list to return off of.
    private Date orderDateStart;//Optional. If supplied only orders greater than or equal to will be returned.
    private Date orderDateEnd;//Optional.
    private OrderStatusType orderStatus;//Optional.
    private Integer warehouseID;//Optional. Unique location for orders.
    private String currencyCode;//Optional.
    private Boolean returnCustomer;//Optional. Optionally return full customer info with every order.
    private Boolean returnKitDetails;//Optional. Optionally return bill of material for kits.
    private Integer greaterThanOrderID;//Optional.
    private Date greaterThanModifiedDate;//Optional.
    private Integer batchSize;//Optional. Defaults to 100 orders at a time.
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
    private Integer partyID;//Optional.

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
        PendingInventory
    }
}

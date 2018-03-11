/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CalculateOrder {
    /*
     Calculates pricing, tax, shipping and volume info for a potential order. 
     This is for calculation only and does not store a permanent record. 
     Client provides address, itemcodes, and quantity. Server calculates and returns pricing, tax, shipping and volume info. 
     */

    /*
     CalculateOrderRequest
     */
    private String currencyCode; //Optional.
    private Integer warehouseID; //Unique location for orders.
    private Integer shipMethodID;
    private Integer priceType; //Controls which price band to use.
    private String address1;//Optional.
    private String address2;//Optional.
    private String address3;//Optional.
    private String city;//Optional.
    private String state;//Optional.
    private String zip;//Optional.
    private String country; //Optional.
    private String county;//Optional.
    private Integer customerID;//Unique identifier for a customer entity.
    private OrderType orderType;
    private DecimalStyle taxRateOverride;//Optional. Optional.
    private DecimalStyle shippingAmountOverride;//Optional. Optional.
    private Integer returnOrderID;//Optional. Optional.
    private String other11;//Optional. Optional.
    private String other12;//Optional. Optional.
    private String other13;//Optional. Optional.
    private String other14;//Optional. Optional.
    private String other15;//Optional. Optional.
    private String other16;//Optional. Optional.
    private String other17;//Optional. Optional.
    private String other18;//Optional. Optional.
    private String other19;//Optional. Optional.
    private String other20;//Optional. Optional.
    private DetailRequest[] detailsOrder;
    private Boolean returnShipMethods;
    private Integer partyID;//Optional.
    private Boolean returnTrace;//Optional.

    /*
     OrderDetailRequest class
     */
    /*
    
     CalculateOrderResponse
     
     */
    private DecimalStyle total;
    private DecimalStyle subTotal;
    private DecimalStyle taxTotal;
    private DecimalStyle shippingTotal;
    private DecimalStyle discountTotal;
    private DecimalStyle discountPercent;
    private DecimalStyle weightTotal;
    private DecimalStyle businessVolumeTotal;
    private DecimalStyle commissionableVolumeTotal;
    private DecimalStyle other1Total;
    private DecimalStyle other2Total;
    private DecimalStyle other3Total;
    private DecimalStyle other4Total;
    private DecimalStyle other5Total;
    private DecimalStyle other6Total;
    private DecimalStyle other7Total;
    private DecimalStyle other8Total;
    private DecimalStyle other9Total;
    private DecimalStyle other10Total;
    private String _other11;
    private String _other12;
    private String _other13;
    private String _other14;
    private String _other15;
    private String _other16;
    private String _other17;
    private String _other18;
    private String _other19;
    private String _other20;
    private DecimalStyle shippingTax;
    private DecimalStyle orderTax;
    private DecimalStyle fedTaxTotal;
    private DecimalStyle stateTaxTotal;
    private OrderDetailResponse[] details;
    private ShipMethodResponse[] shipMethods;
    private String warnings;
    private String trace;

}

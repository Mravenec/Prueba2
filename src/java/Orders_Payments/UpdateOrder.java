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
public class UpdateOrder {

    /*
     Updates one or more fields on an existing order. Can participate in a transaction. 

     Note: This request can participate in a transaction.
     */
    private Integer orderID;
    private Date orderDate;//Optional.
    private Integer declineCount;//Optional.
    private Integer orderTy;//Optional.
    private Integer orderStatus;//Optional.
    private Integer priceTy; //Optional. Controls which price band to use.
    private DecimalStyle total;//Optional.
    private DecimalStyle subTotal;//Optional.
    private DecimalStyle shipping;//Optional.
    private DecimalStyle orderTax;//Optional.
    private DecimalStyle shippingTax;//Optional.
    private DecimalStyle fedShippingTax;//Optional.
    private DecimalStyle stateShippingTax;//Optional.
    private DecimalStyle cityShippingTax;//Optional.
    private DecimalStyle cityLocalShippingTax;//Optional.
    private DecimalStyle countyShippingTax;//Optional.
    private DecimalStyle countyLocalShippingTax;//Optional.
    private DecimalStyle manualTaxRate;//Optional.
    private DecimalStyle totalTax;//Optional.
    private String currencyCode;//Optional.
    private Integer paymentMethod;//Optional.
    private Integer warehouseID;//Optional. Unique location for orders.
    private Integer batchID;//Optional.
    private DecimalStyle previousBalance;//Optional.
    private Boolean overrideShipping;//Optional.
    private Boolean overrideTax;//Optional.
    private DecimalStyle businessVolume;//Optional. Price amount.
    private DecimalStyle commissionableVolume;//lOptional. Price amount.
    private DecimalStyle other1;//Optional.
    private DecimalStyle other2;//Optional.
    private DecimalStyle other3;//Optional.
    private DecimalStyle other4;//Optional.
    private DecimalStyle other5;//Optional.
    private DecimalStyle discount;//Optional.
    private DecimalStyle discountPercent;//Optional.
    private DecimalStyle weight;//Optional.
    private Integer sourcety;//Optional.
    private String notes;//Optional.
    private String usr;//Optional.
    private String firstName;//Optional.
    private String lastName;//Optional.
    private String company;//Optional.
    private String address1;//Optional.
    private String address2;//Optional.
    private String city;//Optional.
    private String state;//Optional.
    private String zip;//Optional.
    private String country;//Optional.
    private String email;//Optional.
    private String phone;//Optional.
    private Boolean suppressPackSlipPrice;//Optional.
    private Integer shipMethodID;//Optional.
    private Integer autoOrderID;//Optional.
    private String createdBy;//Optional.
    private Integer returnOrderID;//Optional.
    private Integer orderRankID;//Optional.
    private Integer orderPayRankID;//Optional.
    private Boolean addressIsVerified;//Optional.
    private String county;//Optional.
    private Boolean isRMA;//Optional.
    private Integer backOrderFromID;//Optional.
    private DecimalStyle creditsEarned;//Optional.
    private DecimalStyle totalFedTax;//Optional.
    private DecimalStyle totalStateTax;//Optional.
    private DecimalStyle manualShippingTax;//Optional.
    private Integer replacementOrderID;//Optional.
    private Date lockedDate;//Optional.
    private Date commissionedDate;//Optional.
    private Boolean flag1;//Optional.
    private Boolean flag2;//Optional.
    private Boolean flag3;//Optional.
    private DecimalStyle other6;//Optional.
    private DecimalStyle other7;//Optional.
    private DecimalStyle other8;//Optional.
    private DecimalStyle other9; //Optional.
    private DecimalStyle other10; //Optional.
    private Integer originalWarehouseID;//Optional.
    private String pickupName;//Optional.
    private Integer transferToID;//Optional.
    private Boolean isCommissionable;//Optional.
    private String fulfilledBy;//Optional.
    private DecimalStyle creditApplied;//Optional.
    private Date shippedDate;//Optional.
    private Date taxLockDate;//Optional.
    private DecimalStyle totalTaxable;//Optional.
    private Integer returnCategoryID;//Optional.
    private Integer replacementCategoryID;//Optional.
    private DecimalStyle calculatedShipping;//Optional.
    private DecimalStyle handlingFee;//Optional.
    private Integer orderProcessTy;//Optional.
    private Integer actualCarrier;//Optional.
    private Integer parentOrderID;//Optional.
    private Integer customerTy;//Optional. Classification of a customer as defined by the company.
    private String reference;//Optional.
    private String middleName;//Optional.
    private String nameSuffix;//Optional.
    private String address3;//Optional.
    private Integer partyID;//Optional.
    private String trackingNumber1;//Optional.
    private String trackingNumber2;//Optional.
    private String trackingNumber3;//Optional.
    private String trackingNumber4;//Optional.
    private String trackingNumber5;//Optional.
    private OrderShipCarrier webCarrierID;//Optional.
    private OrderShipCarrier webCarrierID2;//Optional.
    private OrderShipCarrier webCarrierID3;//Optional.
    private OrderShipCarrier webCarrierID4;//Optional.
    private OrderShipCarrier webCarrierID5;//Optional.
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

    private enum OrderShipCarrier {
        /*
         FedEx
         UPS
         Purolator
         CanadaPostRegular
         CanadaPostExpress
         DHL
         USPS
         Estafeta
         RoyalMail
         GLSHungary
         PostenNorway
         LandMarkGlobal
         GDEX
         */
    }
}

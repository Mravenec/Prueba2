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
class OrderResponse {
    /*
     See Getorders class
     */

    private Integer orderID;
    private Integer customerID;
    private OrderStatusType orderStatus;
    private Date orderDate;
    private String currencyCode;
    private Integer warehouseID;//Unique location for orders.
    private Integer shipMethodID;
    private Integer priceType;//Controls which price band to use.
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String county;
    private String email;
    private String phone;
    private String notes;
    private DecimalStyle total;
    private DecimalStyle subTotal;
    private DecimalStyle taxTotal;
    private DecimalStyle shippingTotal;
    private DecimalStyle discountTotal;
    private DecimalStyle discountPercent;
    private DecimalStyle weightTotal;
    private DecimalStyle businessVolumeTotal;
    private DecimalStyle commissionableVolumeTotal;
    private String trackingNumber1;
    private String trackingNumber2;
    private String trackingNumber3;
    private String trackingNumber4;
    private String trackingNumber5;
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
    private DecimalStyle shippingTax;
    private DecimalStyle orderTax;
    private DecimalStyle fedTaxTotal;
    private DecimalStyle stateTaxTotal;
    private DecimalStyle fedShippingTax;
    private DecimalStyle stateShippingTax;
    private DecimalStyle cityShippingTax;
    private DecimalStyle cityLocalShippingTax;
    private DecimalStyle countyShippingTax;
    private DecimalStyle countyLocalShippingTax;
    private String other11;
    private String other12;
    private String other13;
    private String other14;
    private String other15;
    private String other16;
    private String other17;
    private String other18;
    private String other19;
    private String other20;
    private Date modifiedDate;
    private OrderType orderType;
    private Date shippedDate;
    private Date createdDate;
    private String createdBy;
    private String modifiedBy;
    private DecimalStyle taxFedRate;
    private DecimalStyle taxStateRate;
    private DecimalStyle taxCityRate;
    private DecimalStyle taxCityLocalRate;
    private DecimalStyle taxCountyRate;
    private DecimalStyle taxCountyLocalRate;
    private DecimalStyle taxManualRate;
    private String taxCity;
    private String taxCounty;
    private String taxState;
    private String taxZip;
    private String taxCountry;
    private Boolean taxIsExempt;
    private Boolean taxIsOverRide;
    private OrderDetailResponse[] details;
    private PaymentResponse[] payments;
    private ExpectedPaymentResponse[] expectedPayments;
    private CustomerResponse customer;//Optional customer record.
    private String middleName;
    private String nameSuffix;
    private Integer autoOrderID;//AutoOrderID from which this order was generated, if applicable.
    private Integer partyID;//PartyID, if applicable.
    private String reference1;//Reference1.
    private Boolean isRMA;
    private Integer transferToID;//CustomerID of volume transfer, if applicable.
    
    
    enum OrderStatusType{
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

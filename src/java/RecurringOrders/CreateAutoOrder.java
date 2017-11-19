/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecurringOrders;

import java.sql.Date;
import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CreateAutoOrder {
    /*
     Create a new Recurring Order template for an existing customer or a new customer as part of a transaction. 
     Client provides schedule, item codes, quantity, and shipping info. 
     Server calculates and commits data, then returns pricing, tax, shipping and volume info. 
     You can also update/overwrite an existing autoorder by using the OverwriteExistingAutoOrder and ExistingAutoOrderID properties. 
     Note: This request can participate in a transaction
     */

    /*
     Input Properties
     CreateAutoOrderRequest
     */
    private Integer customerID;//Unique identifier for a customer entity.
    private Frequency frequencyType;
    private Date startDate;
    private Date stopDate;//Optional. Optional. Leave null if there is no stop date.
    private Integer specificDayInterval;//Optional. Optional. To be used with Frequency Type SepecifDays.
    private String currencyCode; //Optional.
    private Integer warehouseID; //Unique location for orders.
    private Integer shipMethodID;
    private PriceType priceType; //Controls which price band to use.
    private PaymentType autoOrderPaymentType;
    private ProcessType autoOrderProcessType;//Optional.
    private String firstName;//Optional.
    private String middleName;//Optional.
    private String lastName;//Optional.
    private String nameSuffix;//Optional.
    private String company;//Optional.
    private String address1;//Optional.
    private String address2;//Optional.
    private String address3;//Optional.
    private String city;//Optional.
    private String state; //Optional.
    private String zip;//Optional.
    private String country; //Optional.
    private String county;//Optional.
    private String email;//Optional.
    private String phone;//Optional.
    private String notes;//Optional.
    private String other11;//Optional. //Optional.
    private String other12;//Optional. //Optional.
    private String other13;//Optional. //Optional.
    private String ther14;//Optional. //Optional.
    private String other15;//Optional. //Optional.
    private String other16;//Optional. //Optional.
    private String other17;//Optional. //Optional.
    private String other18;//Optional. //Optional.
    private String other19;//Optional. //Optional.
    private String other20;//Optional. //Optional.
    private String description;//Optional. Optional description for this auto order.
    private Boolean overwriteExistingAutoOrder;
    private Integer existingAutoOrderID;
    private OrderdetailRequest[] details;

    enum Frequency {
        /*
         Weekly
         BiWeekly
         Monthly
         Quarterly
         SemiYearly
         Yearly
         BiMonthly
         EveryFourWeeks
         EverySixWeeks
         EveryEightWeeks
         EveryTwelveWeeks
         SpecificDays
         */
    }

    enum PriceType {//Controls which price band to use.
        /*
        
         */
    }

    enum PaymentType {
        /*
         PrimaryCreditCard
         SecondaryCreditCard
         CheckingAccount
         WillSendPayment
         BankDraft
         PrimaryWalletAccount
         SecondaryWalletAccount
         */
    }

    enum ProcessType {
        /*
         AlwaysProcess
         Conditional
         */
    }


    /*
     OrderDetailRequest
     */
    private String itemCode; //Optional.
    private DecimalStyle quantity;
    private String parentItemCode;//Optional. Optional. Use only when building kits.
    private DecimalStyle priceEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle taxableEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle shippingPriceEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle businessVolumeEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle commissionableVolumeEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other1EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other2EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other3EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other4EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other5EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other6EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other7EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other8EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other9EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle Other10EachOverride;//Optional. Optional, overrides item setup.
    private String descriptionOverride;//Optional. Optional, overrides item setup.
    private String reference1;//Optional. Optional, reference field.
    private AdvancedAutoOptionsRequest advancedAutoOptions;//Optional, advanced auto order options.

    /*
     Output Properties
     CreateAutoOrderResponse
     */
    Integer autoOrderID;
    String _description;
    DecimalStyle total;
    DecimalStyle subTotal;
    DecimalStyle taxTotal;
    DecimalStyle shippingTotal;
    DecimalStyle discountTotal;
    DecimalStyle weightTotal;
    DecimalStyle businessVolumeTotal;
    DecimalStyle commissionableVolumeTotal;
    DecimalStyle other2Total;
    DecimalStyle other3Total;
    DecimalStyle other4Total;
    DecimalStyle other5Total;
    DecimalStyle other6Total;
    DecimalStyle other7Total;
    DecimalStyle other8Total;
    DecimalStyle other9Total;
    DecimalStyle other10Total;
    DecimalStyle shippingTax;
    DecimalStyle orderTax;
    OrderDetailResponse[] _details;

    /*
     OrderDetailResponse
     */
    private String _itemCode;
    private String __description;
    private DecimalStyle _quantity;
    private DecimalStyle priceEach;
    private DecimalStyle priceTotal;
    private DecimalStyle tax;
    private DecimalStyle weightEach;
    private DecimalStyle weight;
    private DecimalStyle businessVolumeEach;
    private DecimalStyle usinesVolume;
    private DecimalStyle commissionableVolumeEach;
    private DecimalStyle commissionableVolume;
    private DecimalStyle other1Each;
    private DecimalStyle other1;
    private DecimalStyle other2Each;
    private DecimalStyle other2;
    private DecimalStyle other3Each;
    private DecimalStyle other3;
    private DecimalStyle other4Each;
    private DecimalStyle other4;
    private DecimalStyle other5Each;
    private DecimalStyle other5;
    private DecimalStyle other6Each;
    private DecimalStyle other6;
    private DecimalStyle other7Each;
    private DecimalStyle other7;
    private DecimalStyle other8Each;
    private DecimalStyle other8;
    private DecimalStyle other9Each;
    private DecimalStyle other9;
    private DecimalStyle oher10Each;
    private DecimalStyle other10;
    private String _parentItemCode;
    private DecimalStyle taxable;
    private DecimalStyle fedTax;
    private DecimalStyle stateTax;
    private DecimalStyle cityTax;
    private DecimalStyle cityLocalTax;
    private DecimalStyle countyTax;
    private DecimalStyle countyLocalTax;
    private DecimalStyle manualTax;
    private Boolean isStateTaxOverride;
    private Integer orderLine;
    private String _reference1;
    private DecimalStyle shippingPriceEach;
}

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
public class GetAutoOrders {
    /*
     Returns any AutoOrders setup and active for a given customer. 
     */

    /*
     Input Properties
     GetAutoOrdersRequest
     */
    private Integer customerID;//Unique identifier for a customer entity.
    private Integer autoOrderID;//Optional. Optional to pull just one AutoOrder.
    private AutoOrderStatusType autoOrderStatus;//Optional. Optional. Will assume Active if not supplied.

    enum AutoOrderStatusType {
        /*
         Active
         Inactive
         Deleted
         */
    }

    /*
     Output Properties
     GetAutoOrdersResponse
     */
    AutoOrderResponse[] autoOrders;

    /*
     AutoOrderResponse
     */
    private Integer _customerID;//Unique identifier for a customer entity.
    private Integer _autoOrderID;
    private AutoOrderStatusType _autoOrderStatus;
    private FrequencyType frequency;
    private Date startDate;
    private Date stopDate;
    private Date lastRunDate;
    private Date nextRunDate;
    private String currencyCode;
    private Integer warehouseID; //Unique location for orders.
    private Integer shipMethodID;
    private AutoOrderPaymentType paymentType;
    private AutoOrderProcessType processType;
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
    private DecimalStyle saxTotal;
    private DecimalStyle shippingTotal;
    private DecimalStyle discountTotal;
    private DecimalStyle businessVolumeTotal;
    private DecimalStyle commissionableVolumeTotal;
    private String description;
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
    private AutoOrderDetailResponse[] details;
    private Date modifiedDate;
    private String modifiedBy;
    private String middleName;
    private String nameSuffix;
    private Integer specificDayInterval;

    enum FrequencyType {
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

    enum AutoOrderPaymentType {
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

    enum AutoOrderProcessType {
        /*
         AlwaysProcess
         Conditional
         */
    }


    /*
     AutoOrderDetailResponse
     */
    private String itemCode;
    private String _description;
    private DecimalStyle quantity;
    private DecimalStyle priceEach;
    private DecimalStyle priceTotal;
    private DecimalStyle businessVolumeEach;
    private DecimalStyle businesVolume;
    private DecimalStyle commissionableVolumeEach;
    private DecimalStyle commissionableVolume;//Price amount.
    private String parentItemCode;
    private DecimalStyle priceEachOverride;
    private DecimalStyle taxableEachOverride;
    private DecimalStyle shippingPriceEachOverride;
    private DecimalStyle businessVolumeEachOverride;
    private DecimalStyle commissionableVolumeEachOverride;
    private String reference1;
    private Date processWhileDate;
    private Date skipUntilDate;
}

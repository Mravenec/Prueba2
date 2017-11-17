/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.sql.Date;
import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CreateCustomer {

    /*
     Creates a new Customer. Can optionally be put in one or more trees. 
     Note: This request can participate in a transaction.
     */
    private String firstName;//Optional. The customer's first name.
    private String lastName;//Optional. The customer's last name.
    private String company;//Optional. The customer's company name.
    private Integer customerType;//The customer's type as defined by the company.
    private Integer customerStatus;//Optional. The customer's status as defined by the company. Defaults to 1.
    private String email;//Optional.
    private String phone;//Optional.
    private String phone2;//Optional.
    private String mobilePhone;//Optional.
    private String fax;//Optional.
    private String notes;//Optional.
    private String mainAddress1;//Optional.
    private String mainAddress2;//Optional.
    private String mainAddress3;//Optional.
    private String mainCity;//Optional.
    private String mainState;//Optional. The state of the customer's primary address. This field is required if MainAddress1 is provided.
    private String mainZip;//Optional.
    private String mainCountry;//Optional. The country of the customer's primary address. This field is required if MainAddress1 is provided.
    private String mainCounty;//Optional.
    private String mailAddress1;//Optional.
    private String mailAddress2;//Optional.
    private String mailAddress3;//Optional.
    private String mailCity;//Optional.
    private String mailState;//Optional. The state of the customer's mailing address. This field is required if MailAddress1 is provided.
    private String mailZip;//Optional.
    private String mailCountry;//Optional. The country of the customer's mailing address. This field is required if MailAddress1 is provided.
    private String mailCounty;//Optional.
    private String otherAddress1;//Optional.
    private String otherAddress2;//Optional.
    private String otherAddress3;//Optional.
    private String otherCity;//Optional.
    private String otherState;//Optional. The state of the customer's other address. This field is required if OtherAddress1 is provided.
    private String otherZip;//Optional.
    private String otherCountry;//Optional. The country of the customer's other address. This field is required if OtherAddress1 is provided.
    private String otherCounty;//Optional.
    private Boolean canLogin;//Optional. If true, the customer will be able to be authenticated using their login name and password. Defaults to False.
    private String loginName;//Optional. The customer's desired login name.
    private String loginPassword;//Optional. The customer's desired password.
    private Boolean insertEnrollerTree;//Optional. If true, the customer will be inserted into the Enroller tree using the provided EnrollerID. Defaults to False.
    private Integer enrollerID;//The customer's enroller's unique identifier. Required only when InsertEnrollerTree is true.
    private Boolean insertUnilevelTree;//Optional. If true, the customer will be inserted into the UniLevel tree using the provided SponsorID. Defaults to False.
    private Integer sponsorID;//The customer's UniLevel sponsor's unique identifier. Required only when InsertSponsorTree is true.
    private Boolean useManualCustomerID;//Optional. If true, the customer's ID will be set to the ID provided in the ManualCustomerID field. Defaults to False.
    private Integer manualCustomerID;//The ID to use when creating this customer. If set, UseManualCustomerID must also be set to true.
    private String taxID;//Optional. The customer's tax ID.
    private String salesTaxID;//Optional. The customer's sales tax ID.
    private Date salesTaxExemptExpireDate;//Optional.
    private Boolean isSalesTaxExempt;//Optional. If true, the customer will be considered exempt from sales tax.
    private Date birthDate;//Optional. The customer's birth date. The provided date must be greater than 1/1/1900.
    private String field1; //Optional.
    private String field2; //Optional.
    private String field3; //Optional.
    private String field4; //Optional.
    private String field5; //Optional.
    private String field6; //Optional.
    private String field7; //Optional.
    private String field8; //Optional.
    private String field9; //Optional.
    private String field10; //Optional.
    private String field11; //Optional.
    private String field12; //Optional.
    private String field13; //Optional.
    private String field14; //Optional.
    private String field15; //Optional.
    private Boolean subscribeToBroadcasts;//If true, the customer will be opted in to receive email broadcasts. Note that the SubscribeFromIPAddress field must also be provided.
    private String subscribeFromIPAddress;//Optional. The IP address the customer is being subscribed from.
    private String currencyCode;//Optional. The default currency code this customer will use in future transactions. Defaults to 'usd'.
    private String payableToName;//Optional.
    private Date entryDate;//The date the customer was created. The provided date must be greater than 1/1/1900.
    private Integer defaultWarehouseID;//Optional. The default warehouse this customer will use in future transactions.
    private PayableType payableType;//Optional.
    private DecimalStyle checkThreshold;//Optional.
    private TaxIDType taxIDType;//Optional.
    private Integer languageID;//Optional. The customer's preferred language. Defaults to 0.
    private Gender gender;//Optional. The customer's gender.
    private String vatRegistration;//Optional.
    private Date date1;//Optional.
    private Date date2;//Optional.
    private Date date3;//Optional.
    private Date date4;//Optional.
    private Date date5;//Optional.
    private String middleName;//Optional. The customer's middle name.
    private String nameSuffix;//Optional. The customer's name suffix.
    private Integer binaryPlacementPreference;//Optional.
    private Boolean useBinaryHoldingTank;//Optional.
    private Boolean mainAddressVerified;//Optional.
    private Boolean mailAddressVerified;//Optional.
    private Boolean otherAddressVerified;//Optional.

    enum PayableType {//Optional.
        /*
         Check
         WireTransfer
         PaymentCard
         DirectDeposit
         OnHold
         BankWire
         DebitCardHold
         Other100
         */
    }

    enum TaxIDType {//Optional.
        /*
         SSN
         EIN
         OtherType3
         OtherType4
         OtherType5
         OtherType6
         OtherType7
         OtherType8
         OtherType9
         OtherType10
         OtherType11
         OtherType12
         OtherType13
         OtherType14
         OtherType15
         OtherType16
         OtherType17
         OtherType18
         OtherType19
         OtherType20
         */
    }

    enum Gender {//Optional. The customer's gender
        /*
         Unknown
         Male
         Female
         */
    }

    public CreateCustomer(String firstName, String lastName, String company, Integer customerType, Integer customerStatus, String email, String phone, String phone2, String mobilePhone, String fax, String notes, String mainAddress1, String mainAddress2, String mainAddress3, String mainCity, String mainState, String mainZip, String mainCountry, String mainCounty, String mailAddress1, String mailAddress2, String mailAddress3, String mailCity, String mailState, String mailZip, String mailCountry, String mailCounty, String otherAddress1, String otherAddress2, String otherAddress3, String otherCity, String otherState, String otherZip, String otherCountry, String otherCounty, Boolean canLogin, String loginName, String loginPassword, Boolean insertEnrollerTree, Integer enrollerID, Boolean insertUnilevelTree, Integer sponsorID, Boolean useManualCustomerID, Integer manualCustomerID, String taxID, String salesTaxID, Date salesTaxExemptExpireDate, Boolean isSalesTaxExempt, Date birthDate, String field1, String field2, String field3, String field4, String field5, String field6, String field7, String field8, String field9, String field10, String field11, String field12, String field13, String field14, String field15, Boolean subscribeToBroadcasts, String subscribeFromIPAddress, String currencyCode, String payableToName, Date entryDate, Integer defaultWarehouseID, PayableType payableType, DecimalStyle checkThreshold, TaxIDType taxIDType, Integer languageID, Gender gender, String vatRegistration, Date date1, Date date2, Date date3, Date date4, Date date5, String middleName, String nameSuffix, Integer binaryPlacementPreference, Boolean useBinaryHoldingTank, Boolean mainAddressVerified, Boolean mailAddressVerified, Boolean otherAddressVerified) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.customerType = customerType;
        this.customerStatus = customerStatus;
        this.email = email;
        this.phone = phone;
        this.phone2 = phone2;
        this.mobilePhone = mobilePhone;
        this.fax = fax;
        this.notes = notes;
        this.mainAddress1 = mainAddress1;
        this.mainAddress2 = mainAddress2;
        this.mainAddress3 = mainAddress3;
        this.mainCity = mainCity;
        this.mainState = mainState;
        this.mainZip = mainZip;
        this.mainCountry = mainCountry;
        this.mainCounty = mainCounty;
        this.mailAddress1 = mailAddress1;
        this.mailAddress2 = mailAddress2;
        this.mailAddress3 = mailAddress3;
        this.mailCity = mailCity;
        this.mailState = mailState;
        this.mailZip = mailZip;
        this.mailCountry = mailCountry;
        this.mailCounty = mailCounty;
        this.otherAddress1 = otherAddress1;
        this.otherAddress2 = otherAddress2;
        this.otherAddress3 = otherAddress3;
        this.otherCity = otherCity;
        this.otherState = otherState;
        this.otherZip = otherZip;
        this.otherCountry = otherCountry;
        this.otherCounty = otherCounty;
        this.canLogin = canLogin;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.insertEnrollerTree = insertEnrollerTree;
        this.enrollerID = enrollerID;
        this.insertUnilevelTree = insertUnilevelTree;
        this.sponsorID = sponsorID;
        this.useManualCustomerID = useManualCustomerID;
        this.manualCustomerID = manualCustomerID;
        this.taxID = taxID;
        this.salesTaxID = salesTaxID;
        this.salesTaxExemptExpireDate = salesTaxExemptExpireDate;
        this.isSalesTaxExempt = isSalesTaxExempt;
        this.birthDate = birthDate;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.field6 = field6;
        this.field7 = field7;
        this.field8 = field8;
        this.field9 = field9;
        this.field10 = field10;
        this.field11 = field11;
        this.field12 = field12;
        this.field13 = field13;
        this.field14 = field14;
        this.field15 = field15;
        this.subscribeToBroadcasts = subscribeToBroadcasts;
        this.subscribeFromIPAddress = subscribeFromIPAddress;
        this.currencyCode = currencyCode;
        this.payableToName = payableToName;
        this.entryDate = entryDate;
        this.defaultWarehouseID = defaultWarehouseID;
        this.payableType = payableType;
        this.checkThreshold = checkThreshold;
        this.taxIDType = taxIDType;
        this.languageID = languageID;
        this.gender = gender;
        this.vatRegistration = vatRegistration;
        this.date1 = date1;
        this.date2 = date2;
        this.date3 = date3;
        this.date4 = date4;
        this.date5 = date5;
        this.middleName = middleName;
        this.nameSuffix = nameSuffix;
        this.binaryPlacementPreference = binaryPlacementPreference;
        this.useBinaryHoldingTank = useBinaryHoldingTank;
        this.mainAddressVerified = mainAddressVerified;
        this.mailAddressVerified = mailAddressVerified;
        this.otherAddressVerified = otherAddressVerified;
    }

    public CreateCustomer() {
    }

}

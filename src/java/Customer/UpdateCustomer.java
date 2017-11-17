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
public class UpdateCustomer extends CreateCustomer{

    /*
     Updates one or more fields on an existing customer. Can participate in a transaction. 
     Note: This request can participate in a transaction.
     */
    
    
    Integer customerID;//Unique identifier for a customer entity.
    private String firstName;//Optional.
    private String lastName;//Optional.
    private String company;//Optional.
    private Integer customerType; //Optional. Classification of a customer as defined by the company.
    private Integer customerStatus; //Optional. Current status of a customer as defined by the company.
    private String email;//Optional.
    private String phone;//Optional.
    private String phone2;//Optional.
    private String mobilePhone;//Optional.
    private String fax;//Optional.
    private String mainAddress1;//Optional.
    private String mainAddress2;//Optional.
    private String mainAddress3;//Optional.
    private String mainCity;//Optional.
    private String mainState; //Optional.
    private String mainZip;//Optional.
    private String mainCountry;//Optional.
    private String mainCounty;//Optional.
    private String mailAddress1;//Optional.
    private String mailAddress2;//Optional.
    private String mailAddress3;//Optional.
    private String mailCity;//Optional.
    private String mailState; //Optional.
    private String mailZipString;//Optional.
    private String mailCountry;//Optional.
    private String mailCounty;//Optional.
    private String otherAddress1;//Optional.
    private String otherAddress2;//Optional.
    private String otherAddress3;//Optional.
    private String otherCity;//Optional.
    private String otherState; //Optional.
    private String otherZip;//Optional.
    private String otherCountry;//Optional.
    private String otherCounty;//Optional.
    private String canLogin;//Optional.
    private String loginName;//Optional.
    private String loginPassword;//Optional.
    private String taxID;//Optional.
    private String salesTaxID;//Optional.
    private Date salesTaxExemptExpireDate;//Optional.
    private Boolean isSalesTaxExempt;//Optional.
    private Date birthDate;//Optional.
    private String field1; //Optional.
    private String field2;//Optional.
    private String field3;//Optional.
    private String field4;//Optional.
    private String field5;//Optional.
    private String field6;//Optional.
    private String field7;//Optional.
    private String field8;//Optional.
    private String field9;//Optional.
    private String field10;//Optional.
    private String field11;//Optional.
    private String field12;//Optional.
    private String field13;//Optional.
    private String field14;//Optional.
    private String field15;//Optional.
    private Boolean subscribeToBroadcasts;//Optional.
    private String subscribeFromIPAddress;//Optional.
    private String currencyCode;//Optional.
    private String payableToName;//Optional.
    private PayableType payableType;//Optional.
    private Integer defaultWarehouseID; //Optional. Unique location for orders. ****
    private DecimalStyle checkThreshold;//Optional.
    private Date createdDate;//Optional.
    private TaxIDType taxIDType;//Optional.
    private Integer languageID;//Optional. Customize the web experience by setting this.
    private Gender gender;//Optional.
    private String vatRegistration;//Optional.
    private Date date1;//Optional.
    private Date date2;//Optional.
    private Date date3;//Optional.
    private Date date4;//Optional.
    private Date date5;//Optional.
    private String middleName;//Optional.
    private String nameSuffix;//Optional.
    private Integer binaryPlacementPreference;//Optional.
    private Boolean useBinaryHoldingTank;//Optional.
    private Boolean mainAddressVerified;//Optional.
    private Boolean mailAddressVerified;//Optional.
    private Boolean otherAddressVerified;//Optional.

    enum PayableType {
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

    enum TaxIDType {
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

    enum Gender {
        /*
         Unknown
         Male
         Female
         */
    }

   /* 
    Constructor Super()?
    */
    

    

    public UpdateCustomer() {
    }

  
    
    

}

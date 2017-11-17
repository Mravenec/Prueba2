/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Mravenec
 */
public class SetAccountChecking {
    /*
     Setup bank account on file an existing customer, or new customer in a transaction. 
     You can also empty the account settings by simply leaving everything but CustomerID empty.
     Note: This request can participate in a transaction.
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private String bankAccountNumber;//Optional.
    private String bankRoutingNumber;//Optional.
    private String bankName;//Optional.
    private BankAccountType bankAccountType;//Optional. The type of bank account. Defaults to CheckingPersonal.
    private String nameOnAccount;//Optional.
    private Boolean useMainAddress;//If true, the customer's main address on file will be used. If UseMainAddress is set to true, do not submit a seperate billing address.
    private String billingAddress;//Optional.
    private String billingCity;//Optional.
    private String billingState;//Optional. The state of the account's billing address. If UseMainAddress is set to true, do not set this field.
    private String billingZip;//Optional.
    private String billingCountry;//Optional. The country of the account's billing address. If UseMainAddress is set to true, do not set this field.

    enum BankAccountType {//Optional. The type of bank account. Defaults to CheckingPersonal.
        /*
         CheckingPersonal
         CheckingBusiness
         SavingsPersonal
         SavingsBusiness
         */
    }

    public SetAccountChecking(Integer customerID, String bankAccountNumber, String bankRoutingNumber, String bankName, BankAccountType bankAccountType, String nameOnAccount, Boolean useMainAddress, String billingAddress, String billingCity, String billingState, String billingZip, String billingCountry) {
        this.customerID = customerID;
        this.bankAccountNumber = bankAccountNumber;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankName = bankName;
        this.bankAccountType = bankAccountType;
        this.nameOnAccount = nameOnAccount;
        this.useMainAddress = useMainAddress;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
    }

    public SetAccountChecking() {

    }

}

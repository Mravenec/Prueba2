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
public class SetAccountDirectDeposit {
    /*
     Setup direct deposit info for an existing customer, or new customer in a transaction. 
     You can also empty the account settings by simply leaving everything but CustomerID empty.
     Note: This request can participate in a transaction.
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private String nameOnAccount;//Optional.
    private String bankAccountNumber;//Optional.
    private String bankRoutingNumber;//Optional.
    private DepositAccountType depositAccountType;//Optional. The type of account. Defaults to Checking.
    private String bankName;//Optional.
    private String bankAddress;//Optional.
    private String bankCity;//Optional.
    private String bankState;//Optional.
    private String bankZip;//Optional.
    private String bankCountry;//Optional.
    private String iban;//Optional.
    private String swiftCode;//Optional.
    private BankAccountType bankAccount;//TypeDeprecated, use DepositAccountType instead.

    enum DepositAccountType {//Optional. The type of account. Defaults to Checking.
        /*
         Checking
         Saving
         Business
         Personal
         */
    }

    enum BankAccountType {//TypeDeprecated, use DepositAccountType instead.
        /*
         CheckingPersonal
         CheckingBusiness
         SavingsPersonal
         SavingsBusiness
         */
    }

    public SetAccountDirectDeposit(Integer customerID, String nameOnAccount, String bankAccountNumber, String bankRoutingNumber, DepositAccountType depositAccountType, String bankName, String bankAddress, String bankCity, String bankState, String bankZip, String bankCountry, String iban, String swiftCode, BankAccountType bankAccount) {
        this.customerID = customerID;
        this.nameOnAccount = nameOnAccount;
        this.bankAccountNumber = bankAccountNumber;
        this.bankRoutingNumber = bankRoutingNumber;
        this.depositAccountType = depositAccountType;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.bankCity = bankCity;
        this.bankState = bankState;
        this.bankZip = bankZip;
        this.bankCountry = bankCountry;
        this.iban = iban;
        this.swiftCode = swiftCode;
        this.bankAccount = bankAccount;
    }

    public SetAccountDirectDeposit() {
    }
    
    
    

}

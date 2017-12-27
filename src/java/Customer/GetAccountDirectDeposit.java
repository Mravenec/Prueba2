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
public class GetAccountDirectDeposit {
    /*
     Returns direct deposit info for an existing customer.
     */

    /*
     GetAccountDirectDepositRequest
     */
    private Integer customerID;//Unique identifier for a customer entity.

    /*
     GetAccountDirectDepositResponse
     */
    private String nameOnAccount;
    private String bankAccountNumberDisplay;
    private String bankRoutingNumber;
    private DepositAccountType depositAccountType;
    private String bankName;
    private String bankAddress;
    private String bankCity;
    private String bankState;
    private String bankZip;
    private String bankCountry;
    private BankAccount bankAccountType; //TypeDeprecated, use DepositAccountType instead.
    private String iban;
    private String swiftCode;

    enum DepositAccountType {
        /*
         Checking
         Saving
         Business
         Personal
         */
    }

    enum BankAccount {
        /*CheckingPersonal
         CheckingBusiness
         SavingsPersonal
         SavingsBusiness*/

    }
}

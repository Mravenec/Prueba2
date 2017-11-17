/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author kcamp
 */
public class SetAccountCreditCardToken {
    /*
     Setup primary or secondary credit card token on file for an existing customer, or new customer in a transaction.
     Note: This request can participate in a transaction.
     */

    Integer customerID;//The customer's unique identifier. This field is not required if it part of a transaction that is also creating a customer.
    CreditCardAccountType accountCreditCardType;//Optional. Whether the credit card is the customer's primary or secondary card. Defaults to Primary.
    String creditCardToken;
    ;//The credit card's token created by the Exigo Payment API.
Integer expirationMonth;//The month of the card's expiration date.
    Integer expirationYear;//The year of the card's expiration date.
    Integer creditCardType;//Optional. Defaults to 1.
    String billingName;//Optional.
    Boolean useMainAddress;//If true, the customer's main address on file will be used. If UseMainAddress is set to true, do not submit a seperate billing address.
    String billingAddress;//Optional.
    String billingAddress2;//Optional.
    String billingCity;//Optional.
    String billingState;//The state of the card's billing address. If UseMainAddress is set to true, do not set this field.
    String billingZip;//Optional.
    String billingCountry;//The country of the card's billing address. If UseMainAddress is set to true, do not set this field.
    Boolean hideFromWeb;//Optional. Can be used for AutoOrder but will not show up in shopping cart.

    enum CreditCardAccountType {//Optional. Whether the credit card is the customer's primary or secondary card. Defaults to Primary.
        /*
         Primary
         Secondary
        */
    }

    public SetAccountCreditCardToken(Integer customerID, CreditCardAccountType accountCreditCardType, String creditCardToken, Integer expirationMonth, Integer expirationYear, Integer creditCardType, String billingName, Boolean useMainAddress, String billingAddress, String billingAddress2, String billingCity, String billingState, String billingZip, String billingCountry, Boolean hideFromWeb) {
        this.customerID = customerID;
        this.accountCreditCardType = accountCreditCardType;
        this.creditCardToken = creditCardToken;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.creditCardType = creditCardType;
        this.billingName = billingName;
        this.useMainAddress = useMainAddress;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.hideFromWeb = hideFromWeb;
    }

    public SetAccountCreditCardToken() {

    }

}

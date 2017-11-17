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
public class SetAccountWallet {
    /*
     Setup primary or secondary wallet account on file for an existing customer, or new customer in a transaction.
     Note: This request can participate in a transaction
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private WalletAccountType acountWalletType;//Optional. The customer's wallet slot. Defaults to 0.
    private Integer walletType;//The type of wallet account.
    private String walletAccount;//The wallet's account number.

    enum WalletAccountType {//Optional. The customer's wallet slot. Defaults to 0.
        /*
         Primary
         Secondary
         */
    }

    public SetAccountWallet(Integer customerID, WalletAccountType acountWalletType, Integer walletType, String walletAccount) {
        this.customerID = customerID;
        this.acountWalletType = acountWalletType;
        this.walletType = walletType;
        this.walletAccount = walletAccount;
    }

    public SetAccountWallet() {
    }
    
    

}

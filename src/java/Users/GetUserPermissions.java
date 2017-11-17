/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author Mravenec
 */
public class GetUserPermissions {
    /*
     Returns permissions associated with the corporate user account.
     */

    /*
     GetUserPermissionsRequest
     */
    private String loginName; //Optional.

    /*
     GetUserPermissionsResponse
     */
    private Integer[] restrictToCustomerTypes;//List of any Customer Type Restrictions.
    private Integer[] restrictToCustomerStatuses;//List of any Customer Status Restrictions.
    private Integer[] restrictToWarehouses;//List of any warehouse Restrictions.
    private String[] restrictToCountries;//List of any Country Restrictions.
    private String[] restrictToCurrencies;//List of any Currency Code Restrictions.
    private Boolean viewDeletedCustomers;
    private Boolean allowRemoteCheckPrint;
    private Boolean allowOverrideItemPrice;
    private Boolean allowStatementPrint;
    private Integer[] defaultWarehouseID; //Unique location for orders.
    private Integer[] languageID; //Customize the web experience by setting this.
    private String cultureCode;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class GetCustomerWall {
    /*
     Get wall item(s) from CustomerWall table. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer wallItemID;//Optional. Identifier for a single wall item.
    private Date olderThanEntryDate;//Optional. Filter for wall item(s) older than the provided date.
    private Integer batchSize;//Optional. Defaults to 100 at a time.

    /*
    GetCustomerWallResponse
    */
    private CustomerWallItemResponse[] customerWallItems;
}

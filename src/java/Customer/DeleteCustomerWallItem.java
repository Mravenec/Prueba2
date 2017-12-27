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
public class DeleteCustomerWallItem {
    /*
     Delete wall item(s) from CustomerWall table. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer wallItemID;//Optional. Optional identifier for a single wall item.
    private Date olderThanEntryDate;//Optional. Optional filter for wall item(s) older than date.

    /*
     DeleteCustomerWallItemResponse
     */
    private Integer countOfDeletedRows;//How many wall items were deleted.

}

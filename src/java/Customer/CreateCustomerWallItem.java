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
public class CreateCustomerWallItem {
    /*
     Create new wall item in CustomerWall table. 

     Note: This request can participate in a transaction
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private String text;//Text for new wall item.
    private String field1;//Optional. Optional field.
    private String field2;//Optional. Optional field.
    private String field3;//Optional. Optional field.

    /*
     CreateCustomerWallItemResponse
     */
    private Integer wallItemID;//Unique identifier for new wall item.
}

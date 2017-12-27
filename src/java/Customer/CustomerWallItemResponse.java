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
class CustomerWallItemResponse {
    /*
     see class GetCustomerWall
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer wallItemID;//Unique identifier for wall item.
    private String text;//Text for wall item.
    private Date entryDate;//Entry date for wall item.
    private String field1;//Optional field.
    private String field2;//Optional field.
    private String field3;//Optional field.
    
    
}

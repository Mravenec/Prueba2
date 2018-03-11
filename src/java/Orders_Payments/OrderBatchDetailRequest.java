/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
class OrderBatchDetailRequest {
    /*
     check ChangeOrderStatus class
     */

    private Integer orderID;
    private String trackingNumber1;//Optional. Optionally update tracking number.
    private String trackingNumber2;//Optional. Optionally update tracking number.
    private String trackingNumber3;//Optional. Optionally update tracking number.
    private String trackingNumber4;//Optional. Optionally update tracking number.
    private String trackingNumber5;//Optional. Optionally update tracking number.
    private Date shippedDate;//Optional. Optionally manually set ShippedDate.
}

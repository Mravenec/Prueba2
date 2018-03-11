/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CreateOrderResponse {
    /*
     see CreateOrder details
     */

    private Integer orderID;
    private DecimalStyle total;
    private DecimalStyle subTotal;
    private DecimalStyle taxTotal;
    private DecimalStyle shippingTotal;
    private DecimalStyle discountTotal;
    private DecimalStyle weightTotal;
    private DecimalStyle businessVolumeTotal;
    private DecimalStyle commissionableVolumeTotal;
    private DecimalStyle other1Total;
    private DecimalStyle other2Total;
    private DecimalStyle other3Total;
    private DecimalStyle other4Total;
    private DecimalStyle other5Total;
    private DecimalStyle other6Total;
    private DecimalStyle other7Total;
    private DecimalStyle other8Total;
    private DecimalStyle other9Total;
    private DecimalStyle other10Total;
    private DecimalStyle shippingTax;
    private DecimalStyle orderTax;
    private OrderDetailResponse[] details;
    private String warnings;
}

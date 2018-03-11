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
class OrderDetailResponse {

    /*
     See CalculateOrder  class
     */
    private String itemCode;
    private String description;
    private DecimalStyle quantity;
    private DecimalStyle priceEach;
    private DecimalStyle priceTotal;
    private DecimalStyle tax;
    private DecimalStyle weightEach;
    private DecimalStyle weight;
    private DecimalStyle businessVolumeEach;
    private DecimalStyle businesVolume;
    private DecimalStyle commissionableVolumeEach;
    private DecimalStyle commissionableVolume;
    private DecimalStyle other1Each;
    private DecimalStyle other1;
    private DecimalStyle other2Each;
    private DecimalStyle other2;
    private DecimalStyle other3Each;
    private DecimalStyle other3;
    private DecimalStyle other4Each;
    private DecimalStyle other4;
    private DecimalStyle other5Each;
    private DecimalStyle other5;
    private DecimalStyle other6Each;
    private DecimalStyle other6;
    private DecimalStyle other7Each;
    private DecimalStyle other7;
    private DecimalStyle other8Each;
    private DecimalStyle other8;
    private DecimalStyle other9Each;
    private DecimalStyle other9;
    private DecimalStyle other10Each;
    private DecimalStyle other10;
    private String parentItemCode;
    private DecimalStyle taxable;
    private DecimalStyle fedTax;
    private DecimalStyle stateTax;
    private DecimalStyle cityTax;
    private DecimalStyle cityLocalTax;
    private DecimalStyle countyTax;
    private DecimalStyle countyLocalTax;
    private DecimalStyle manualTax;
    private Boolean isStateTaxOverride;
    private Integer orderLine;
    private String reference1;
    private DecimalStyle shippingPriceEach;

}

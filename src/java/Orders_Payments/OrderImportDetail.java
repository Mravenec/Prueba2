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
class OrderImportDetail {
    /*
     see CreateOrderImport class
     */

    private String parentItemCode;//Optional.
    private String itemCode; //Optional.
    private String description;//Optional.
    private DecimalStyle qty;
    private DecimalStyle weightEach;
    private DecimalStyle countyLocalTax;
    private DecimalStyle countyTax;
    private DecimalStyle cityTax;
    private DecimalStyle stateTax;
    private DecimalStyle fedTax;
    private DecimalStyle taxablePriceEach;
    private DecimalStyle _CVEach;
    private DecimalStyle _BVEach;
    private DecimalStyle priceEach;
    private DecimalStyle other10Each;
    private DecimalStyle other9Each;
    private DecimalStyle other8Each;
    private DecimalStyle other7Each;
    private DecimalStyle other6Each;
    private DecimalStyle other5Each;
    private DecimalStyle other4Each;
    private DecimalStyle other3Each;
    private DecimalStyle other2Each;
    private DecimalStyle other1Each;
}

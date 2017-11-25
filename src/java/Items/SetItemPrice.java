/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class SetItemPrice {
    /*
     Sets pricing info for an item) 

     Note: This request can participate in a transaction.
     */

    /*
     SetItemPriceRequest
     */
    private String itemCode; //Optional.
    private String currencyCode; //Optional.
    private Integer priceType; //Controls which price band to use.
    private DecimalStyle price;//Optional. Price amount.
    private DecimalStyle businessVolume;//Optional. Price amount.
    private DecimalStyle commissionableVolume;//Optional. Price amount.
    private DecimalStyle taxablePrice;//Optional. Price amount.
    private DecimalStyle shippingPrice;//Optional. Price amount.
    private DecimalStyle other1Price;//Optional. Price amount.
    private DecimalStyle other2Price;//Optional. Price amount.
    private DecimalStyle other3Price;//Optional. Price amount.
    private DecimalStyle other4Price;//Optional. Price amount.
    private DecimalStyle other5Price;//Optional. Price amount.
    private DecimalStyle other6Price;//Optional. Price amount.
    private DecimalStyle other7Price;//Optional. Price amount.
    private DecimalStyle other8Price;//Optional. Price amount.
    private DecimalStyle other9Price;//Optional. Price amount.
    private DecimalStyle other10Price;//Optional. Price amount.

    /*
     SetItemPriceResponse
     */
}

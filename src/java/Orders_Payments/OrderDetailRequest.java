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
class OrderDetailRequest {
    /*
     see CreateOrder
     */

    private String itemCode; //Optional.
    private DecimalStyle quantity;
    private String parentItemCode;//Optional. Optional. Use only when building kits.
    private DecimalStyle priceEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle taxableEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle shippingPriceEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle businessVolumeEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle commissionableVolumeEachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other1EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other2EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other3EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other4EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other5EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other6EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other7EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other8EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other9EachOverride;//Optional. Optional, overrides item setup.
    private DecimalStyle other10EachOverride;//Optional. Optional, overrides item setup.
    private String descriptionOverride;//Optional. Optional, overrides item setup.
    private String reference1;//Optional. Optional, reference field.
    private AdvancedAutoOptionsRequest advancedAutoOptions;//Optional, advanced auto order options.
}

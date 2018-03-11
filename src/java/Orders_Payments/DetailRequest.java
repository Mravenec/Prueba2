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
class DetailRequest {
    /*
     see CalculateOrder class
     */

    String itemCode;//Optional.
    DecimalStyle quantity;
    String parentItemCode;//Optional. Optional. Use only when building kits.
    DecimalStyle priceEachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle taxableEachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle shippingPriceEachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle businessVolumeEachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle commissionableVolumeEachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other1EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other2EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other3EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other4EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other5EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other6EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other7EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other8EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other9EachOverride;//Optional. Optional, overrides item setup.
    DecimalStyle other10EachOverride;//Optional. Optional, overrides item setup.
    String descriptionOverride;//Optional. Optional, overrides item setup.
    String reference1;//Optional. Optional, reference field.
    AdvancedAutoOptionsRequest advancedAutoOptions;//Optional, advanced auto order options.
}

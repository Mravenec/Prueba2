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
public class SetItemCountryRegion {
    /*
     Sets country/region info for an item) 

     Note: This request can participate in a transaction
     */

    private String itemCode; //Optional.
    private String countryCode; //Optional.
    private String regionCode; //Optional.
    private Boolean taxed;//Optional.
    private Boolean taxedFed;//Optional.
    private Boolean taxedState;//Optional.
    private Boolean useTaxOverride;//Optional.
    private DecimalStyle taxOverridePct;//Optional.
    
    

}

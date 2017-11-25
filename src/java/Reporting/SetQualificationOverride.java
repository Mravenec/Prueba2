/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;

import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class SetQualificationOverride {
    /*
     Create or Edit a Customer Override
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer overrideID;
    private Boolean qualifies;
    private Integer periodType; //Optional. Optional.
    private Integer startPeriodID;//Optional.
    private Integer endPeriodID;//Optional.
    private DecimalStyle amount;//Optional. Defaults to 0.00.

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;

import java.sql.Date;
import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
class GetQualificationOverrideResponse {

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer overrideID;
    private Boolean qualifies;
    private Integer periodType;
    private Integer startPeriodID;
    private Integer endPeriodID;
    private Date modifiedDate;
    private String modifiedBy;
    private DecimalStyle amount;
}

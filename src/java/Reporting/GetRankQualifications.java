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
public class GetRankQualifications {
    /*
     Returns rank qualification report card. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer rankID;
    private Integer periodType;
    private Integer periodID;//Optional. Optional. Will default to current period.
    private String cultureCode;//Optional. Optional. Return qualifications in a different language.
    private Integer rankGroupID;//Optional. Optional. Will default to primary rank group

    /*
     GetRankQualificationsResponse
     */
    private Integer _customerID;//Unique identifier for a customer entity.
    private Integer _rankID;
    private String rankDescription;
    private Boolean qualifies;
    private Boolean qualifiesOverride;
    private LegsQualificationResponse[][] payeeQualification;
    private Integer backRankID;
    private String backRankDescription;
    private Integer nextRankID;
    private String nextRankDescription;
    private DecimalStyle score;

    /*
     QualificationResponse
     */
    private String QualificationDescription;
    private String Required;
    private String actual;
    private Boolean _qualifies;
    private Boolean _qualifiesOverride;
    javax.sql.rowset.WebRowSet supportingTable; //could be ResultSet or this declaration (DataTable in C#)
    DecimalStyle Completed;
    DecimalStyle weight;
    DecimalStyle xcore;

}

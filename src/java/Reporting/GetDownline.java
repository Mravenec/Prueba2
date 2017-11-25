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
public class GetDownline {
    /*
     Gets nodes in a downline. 
     */

    /*
     GetDownlineRequest
     */
    private TreeType treeType;
    private Integer customerID;//Unique identifier for a customer entity.
    private Integer periodType;
    private Integer periodID; //Optional.
    private Integer maxLevelDepth;
    private Integer[] customerTypes;//Classification of a customer as defined by the company.
    private Integer[] ranks;
    private Integer[] payRanks;
    private VolumeFilter[] volumeFilters;
    private Integer[] customerStatusTypes;
    private Integer batchSize;//Optional. Defaults to 1000 at a time.
    private Boolean sortByLevel;
    private Integer batchOffset;

    enum TreeType {
        /*
         Enroller
         UniLevel
         Binary
         Matrix
         Stack
         */
    }

    /*
     VolumeFilter
     */
    private Integer volumeID;
    private NumericCompareType compare;
    private DecimalStyle value;

    /*
     GetDownlineResponse
     */
private    NodeResponse[] Nodes;
private     Integer RecordCount;

/*
NodeResponse
see class
*/
}

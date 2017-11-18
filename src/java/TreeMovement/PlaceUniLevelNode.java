/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeMovement;

/**
 *
 * @author Mravenec
 */
public class PlaceUniLevelNode {
    /*
     Inserts/Moves a customer within the UniLevel (Sponsor) Tree. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer toSponsorID;
    private String reason;//Optional.
    private Integer optionalPlacement;
    private Boolean optionalFindAvailable;
    private Integer optionalUnilevelBuildTypeID;

    public PlaceUniLevelNode(Integer customerID, Integer toSponsorID, String reason, Integer optionalPlacement, Boolean optionalFindAvailable, Integer optionalUnilevelBuildTypeID) {
        this.customerID = customerID;
        this.toSponsorID = toSponsorID;
        this.reason = reason;
        this.optionalPlacement = optionalPlacement;
        this.optionalFindAvailable = optionalFindAvailable;
        this.optionalUnilevelBuildTypeID = optionalUnilevelBuildTypeID;
    }

    public PlaceUniLevelNode() {
    }
    
    
}

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
public class PlaceEnrollerNode {
    /*
     Inserts/Moves a customer within the Enroller Tree. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer toEnrollerID;
    private String reason;//Optional.

    public PlaceEnrollerNode(Integer customerID, Integer toEnrollerID, String reason) {
        this.customerID = customerID;
        this.toEnrollerID = toEnrollerID;
        this.reason = reason;
    }

    public PlaceEnrollerNode() {
    }
    
    
    
}

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
public class PlaceMatrixNode {
    /*
     Inserts/Moves a customer within the Matrix Tree. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer toParentCustomerID;
    private Integer toParentMatrixID;//Optional.
    private String reason;//Optional.
    private Integer placement;

    public PlaceMatrixNode(Integer customerID, Integer toParentCustomerID, Integer toParentMatrixID, String reason, Integer placement) {
        this.customerID = customerID;
        this.toParentCustomerID = toParentCustomerID;
        this.toParentMatrixID = toParentMatrixID;
        this.reason = reason;
        this.placement = placement;
    }

    public PlaceMatrixNode() {
    }
    
    
}

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
public class PlaceBinaryNode {
    /*
     Inserts/Moves a customer within the Binary Tree. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer toParentID;
    private PlacementType binaryPlacementType;
    private String reason;//Optional.

    enum PlacementType {
        /*
         StrategicPlacement
         BuildLeft
         BuildRight
         BalancedBuild
         EvenFill
         WeakLeg
         EnrollerPreference
         LeftEvenFill
         RightEvenFill
         LesserVolumeLeg
         LesserVolumeLegOutside
         StrongLegOutside
         LesserVolumeLegEvenFill
         GreaterVolumeLegEvenFill
         InsertRightMoveDownline
         InsertLeftMoveDownline
         BuildTeamLeg
         */
    }

    public PlaceBinaryNode(Integer customerID, Integer toParentID, PlacementType binaryPlacementType, String reason) {
        this.customerID = customerID;
        this.toParentID = toParentID;
        this.binaryPlacementType = binaryPlacementType;
        this.reason = reason;
    }

    public PlaceBinaryNode() {
    }
    
    
}

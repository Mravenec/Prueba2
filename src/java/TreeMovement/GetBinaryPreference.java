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
public class GetBinaryPreference {
    /*
     Returns the currently configured placement preference for new placements under a customer. 
     */

    /*
     GetBinaryPreferenceRequest
     */
    Integer CustomerID;//Unique identifier for a customer entity.

    /*
     GetBinaryPreferenceResponse
     */
    Integer customerID;//Unique identifier for a customer entity.
    PlacementType binaryPlacementType;

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
    
    
}

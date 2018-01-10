/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartyPlan;

/**
 *
 * @author Mravenec
 */
public class GetParties {
    /*
     Gets Parties list
     */

    private Integer partyID;//Optional.
    private Integer hostID;//Optional.
    private Integer distributorID;//Optional.
    private Integer partyStatusType; //Optional. Party Status.
    private Integer bookingPartyID;//Optional. Optional BookingPartyID.
    private String field1;//Optional. Optional Field1.
    private String field2;//Optional. Optional Field2.
    private String field3;//Optional. Optional Field3.
    private String field4;//Optional. Optional Field4.
    private String field5;//Optional. Optional Field5.

    /*
     Output Properties
   
     */
    private PartyResponse[] parties;
}

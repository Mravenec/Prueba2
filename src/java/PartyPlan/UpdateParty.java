/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartyPlan;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class UpdateParty {
    /*
     Updates selected Party instance
     */

    
    /*
    UpdatePartyRequest
    */
    private Integer partyID;
    private Integer partyType;//Optional. Optional PartyTy.
    private Integer partyStatusType;//Optional. Optional PartyStatusTy.
    private Integer hostID;//Optional. Optional HostID.
    private Integer distributorID;//Optional. Optional DistributorID.
    private Date startDate;//Optional. Optional StartDate.
    private Date closeDate;//Optional. Optional Close Date.
    private String description;//Optional. Optional Description.
    private Date eventStart;//Optional. Optional Event Start date.
    private Date eventEnd;//Optional. Optional Event End date.
    private Integer languageID;//Optional. Optional Language ID.
    private String information;//Optional. Optional Information.
    private PartyAddress address;//Optional Information.
    private Integer bookingPartyID;//Optional. Optional BookingPartyID.
    private String field1;//Optional. Optional Field1.
    private String field2;//Optional. Optional Field2.
    private String field3;//Optional. Optional Field3.
    private String field4;//Optional. Optional Field4.
    private String field5;//Optional. Optional Field5.
}

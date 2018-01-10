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
class PartyResponse {
    /*
     see GetParties
     */

    private Integer partyID;
    private Integer partyType;//Party type.
    private Integer partyStatusType;//Party Status.
    private Integer hostID;
    private Integer distributorID;
    private Date startDate;
    private Date closeDate;
    private String description;
    private Date eventStart;
    private Date eventEnd;
    private Integer languageID; //Customize the web experience by setting this.
    private String information;
    private PartyAddress address;
    private Integer bookingPartyID;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
}

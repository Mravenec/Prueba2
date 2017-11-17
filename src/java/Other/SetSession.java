/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

/**
 *
 * @author Mravenec
 */
public class SetSession {
    /*
     Sets a generic session string for a unique sessionID. 
     */

    private String sessionID;//Optional.
    private String sessionData;//Optional.

    public SetSession(String sessionID, String sessionData) {
        this.sessionID = sessionID;
        this.sessionData = sessionData;
    }

    public SetSession() {
    }
    
    

}

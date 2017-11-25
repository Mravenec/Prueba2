/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communications;

/**
 *
 * @author Mravenec
 */
public class GetRandomMessage {

    /*
     Gets a random message (defined in the Company Admin). 
     */
    /*
     GetRandomMessageRequest
     */
    private Integer languageID;//Optional. The language of the random message. Defaults to 0 (English).

    /*
     GetRandomMessageResponse
     */
    private Integer randomMessageID;//The unique identifier for the random message.
    private String content;//The content of the random message.
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Mravenec
 */
public class GetFileContents {
    /*
     Returns a list of customer files for a given customer 

     Note: This request can participate in a transaction.
     */

    private String fileName;//Optional. File Name requested with file extention.
    private Integer customerID;//Unique Identifier for Customer record.

    /*
     GetFileContentsResponse
     */
    private Byte[] file;
}

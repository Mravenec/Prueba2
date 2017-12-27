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
public class CreateCustomerFile {
    /*
     Creates a file for the customer in their default directory 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private String fileName;//Name of destination file in customer's folder (do not include path).
    private Byte[] fileData;//An array of bytes than comprise the file contents.
    private Boolean overwriteExistingFile;//Optional. . Defaults to False.

    /*
     CreateCustomerFileResponse
     */
    private Integer folderID;//Unique identifier for the location of the new file.
    private Integer fileID;//Unique identifier for the new file.
}

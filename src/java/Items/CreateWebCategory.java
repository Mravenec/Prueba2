/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Mravenec
 */
public class CreateWebCategory {
    /*
     Creates a new product web category. 

     Note: This request can participate in a transaction.
     */

    private Integer webID;//WebID used in content engine.
    private Integer parentID;//Parent category ID (use 0 for the root).
    private String sescription;//Optional.

    /*
     CreateWebCategoryResponse
     */
    private Integer CategoryID;
    private Integer WebID; //Optionally use categories from content engine.

}

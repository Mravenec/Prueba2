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
public class UpdateWebCategory {
    /*
     Updates web category information. 

     Note: This request can participate in a transaction.
     */

    /*
     UpdateWebCategoryRequest
     */
    private Integer WebID;//WebID used in content engine.
    private Integer CategoryID;
    private String Description;//Optional. Maximum length is 50.

    /*
     UpdateWebCategoryResponse
     
     private Integer _CategoryID;
     private Integer _WebID;//WebID used in content engine.
     private String _Description;
    
     */
}

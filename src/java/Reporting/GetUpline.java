/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;

/**
 *
 * @author Mravenec
 */
public class GetUpline {
    /*
    Gets nodes in an upline
    */

    
    /*
    GetUplineRequest
    */
    TreeType treeType;
    Integer customerID;//Unique identifier for a customer entity.
    Integer periodType;
    Integer periodID;//Optional.

    enum TreeType {
        /*
         Enroller
         UniLevel
         Binary
         Matrix
         Stack
         */
    }
    
    /*
    GetUplineResponse
    */
    
   NodeResponse[] nodes;
   
   
   /*
   NodeResponse
   */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtendedDB;

import javax.swing.text.html.parser.Entity;

/**
 *
 * @author Mravenec
 */
public class GetExtendedDbEntity {

    /*
     Get Extended DB Entity.
     */
    /*
     GetEntityRequest
     */
    private String schemaName;//Optional. Name of Schema containing Entity to retrieve.
    private String entityName;//Optional. Name of entity to retrieve.

    /*
     GetEntityResponse
     */
    private Entity entity;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communications;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class GetCompanyNews {
    /*
     Gets a list of company news descriptions.
     */

    Date startDate;//Optional. Use when pulling data in chunks.
    Date endDate;//Optional. Use when pulling data in chunks.
    Integer departmentType; //Optional. Classification of a department as defined by the company.
}

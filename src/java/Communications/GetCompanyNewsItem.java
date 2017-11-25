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
public class GetCompanyNewsItem {
    /*
     Gets company news details. 
     */

    /*
     GetCompanyNewsItemRequest
     */
    private Integer newsID;

    /*
     GetCompanyNewsItemResponse
     */
    private String description;
    private Integer _newsID;
    private Date createdDate;
    private NewsWebSettings webSettings;
    private NewsCompanySettings companySettings;
    private String content;
    private DepartmentInfo[] departments;

    enum NewsWebSettings {
        /*
         AccessAvailable
         AccessNotAvailable
         */
    }

    enum NewsCompanySettings {
        /*
         AccessAllUsers
         AccessByDepartment
         AccessNotAvailable
         */
    }
    
    /*
    see class DepartmentInfo
    */
}

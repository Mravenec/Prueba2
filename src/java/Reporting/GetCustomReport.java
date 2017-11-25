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
public class GetCustomReport {
    /*
     Returns a custom report in dataset format.
     */

    private Integer ReportID;//2Unique Report ID.
    private ParameterRequest[] Parameters;

    /*
     ParameterRequest
     */
    private String ParameterName;//Optional.
    private Object value;

    /*
     GetCustomReportResponse
     */
    private java.sql.ResultSet ReportData; //(It should be like a Dataset in C#)
}

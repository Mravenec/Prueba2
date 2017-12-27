/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.sql.Date;

/**
 *
 * @author Mravenec
 */
public class GetCustomerExtended {
    /*
     Returns extended properties setup for a customer. 
     */

    private Integer extendedGroupID;//Unique ID of data set.
    private Integer customerID;//Optional. Optionally supply if getting data for just one customer.
    private Integer customerExtendedID;//Optional. Optionally supply if getting a single record.
    private String field1;//Optional. Optionally search Field1.
    private String field2;//Optional. Optionally search Field2.
    private String field3;//Optional. Optionally search Field3.
    private String field4;//Optional. Optionally search Field4.
    private String field5;//Optional. Optionally search Field5.
    private String field6;//Optional. Optionally search Field6.
    private String field7;//Optional. Optionally search Field7.
    private String field8;//Optional. Optionally search Field8.
    private String field9;//Optional. Optionally search Field9.
    private String field10;//Optional. Optionally search Field10.
    private String field11;//Optional. Optionally search Field11.
    private String field12;//Optional. Optionally search Field12.
    private String field13;//Optional. Optionally search Field13.
    private String field14;//Optional. Optionally search Field14.
    private String field15;//Optional. Optionally search Field15.
    private String field16;//Optional. Optionally search Field16.
    private String field17;//Optional. Optionally search Field17.
    private String field18;//Optional. Optionally search Field18.
    private String field19;//Optional. Optionally search Field19.
    private String field20;//Optional. Optionally search Field20.
    private String field21;//Optional. Optionally search Field21.
    private String field22;//Optional. Optionally search Field22.
    private String field23;//Optional. Optionally search Field23.
    private String field24;//Optional. Optionally search Field24.
    private String field25;//Optional. Optionally search Field25.
    private String field26;//Optional. Optionally search Field26.
    private String field27;//Optional. Optionally search Field27.
    private String field28;//Optional. Optionally search Field28.
    private String field29;//Optional. Optionally search Field29.
    private String field30;//Optional. Optionally search Field30.
    private Integer greaterThanCustomerExtendedID;//Optional. Use when pulling data in chunks.
    private Date greaterThanModifiedDate;//Optional. Use when pulling data in chunks.
    private Integer batchSize;//Optional. Defaults to 100 at a time.

    /*
    
     GetCustomerExtendedResponse
     */
    
  CustomerExtendedResponse[]  items;
  
  /*
  see CustomerExtendedResponse
  */
}

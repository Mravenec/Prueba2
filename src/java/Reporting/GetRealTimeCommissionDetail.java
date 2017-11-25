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
public class GetRealTimeCommissionDetail {
    /*
     Returns realtime commission detail for a customer/bonus. 
     */

    private Integer customerID;//Unique identifier for a customer entity.
    private Integer periodType;
    private Integer periodID;
    private Integer bonusID;
    
    
    /*
    GetRealTimeCommissionDetailResponse
    */
    
    DetailsCommissionDetailResponse[] commission;
    
    /*
    CommissionDetailResponse
    see class
    */
}

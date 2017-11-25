/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;

import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
class DetailsCommissionDetailResponse {

    private Integer fromCustomerID;
    private String fromCustomerName;
    private Integer orderID;
    private Integer level;
    private Integer paidLevel;
    private DecimalStyle sourceAmount;
    private DecimalStyle percentage;
    private DecimalStyle commissionAmount;
}

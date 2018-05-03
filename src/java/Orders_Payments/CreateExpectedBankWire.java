    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

import java.sql.Date;
import java.time.format.DecimalStyle;

/**
 *
 * @author Mravenec
 */
public class CreateExpectedBankWire {
    /*
     Creates a new expected payment of type Bank Bire.

     Note: This request can participate in a transaction. 
     */

    private Integer orderID;
    private Date paymentDate;
    private DecimalStyle amount;
    private String bankName;//Optional.
    private String nameOnAccount;//Optional.
    private String memo;//Optional.
    private String authorizationCode;//Optional. Optional.
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Mravenec
 */
public class SetCustomerSiteImage {

    /*
     Setup public web site image for an existing customer.
     */
    
    Integer CustomerID;//Unique identifier for a customer entity.
    String ImageName;//The image's file name.
    Byte[] ImageData;//The image's data.
    CustomerSiteImageType CustomerSiteImageType;//Optional. The desired image slot. Defaults to 0.

    enum CustomerSiteImageType {//Optional. The desired image slot. Defaults to 0.
        /*
         Primary
         Secondary
         */
    }

    public SetCustomerSiteImage(Integer CustomerID, String ImageName, Byte[] ImageData, CustomerSiteImageType CustomerSiteImageType) {
        this.CustomerID = CustomerID;
        this.ImageName = ImageName;
        this.ImageData = ImageData;
        this.CustomerSiteImageType = CustomerSiteImageType;
    }

    public SetCustomerSiteImage() {
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

/**
 *
 * @author Mravenec
 */
public class CreateWarehouse {
    /*
     Creates a new Warehouse 
     */

    private String description;//Optional.
    private String address1;//Optional.
    private String address2;//Optional.
    private String city;//Optional.
    private String state; //Optional.
    private String zip;//Optional.
    private String country; //Optional.
    private String[] currencies;

    public CreateWarehouse(String description, String address1, String address2, String city, String state, String zip, String country, String[] currencies) {
        this.description = description;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.currencies = currencies;
    }

    public CreateWarehouse() {
    }

}

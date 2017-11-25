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
public class GetVolumes {
    /*
     Returns volume records for a current period in a periodtype. 
     */

    /*
     GetVolumesRequest
     */
    private Integer periodType;//Required.
    private Integer periodID;//Optional. Optinal. Will default to current period.
    private Integer customerID;//Optional. Optinal.
    
    /*
    GetVolumesResponse
    */
    
    VolumeResponse[] Volumes ;
    
    /*
    VolumeResponse
    check VolumeResponse class
    */
}

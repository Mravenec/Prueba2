/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders_Payments;

/**
 *
 * @author Mravenec
 */
public class ProcessTransaction {
    /*
     Commits multiple requests in one step. All business rules are checked before commit and it is a commit-all or fail-all. 

     In your application, you may come across several instances where multiple method calls are needed to complete a single data entry. 

     An example of this may be you are creating a new customer, generating a new order, applying a new payment and setting up a new auto order. 
     In this scenario, it would be undesirable to have saved the customer, saved the order, but when you went to apply the payment, you received an error. 
     You would now have a half-committed transaction. 
     If you corrected the issue with the payment then resubmitted from the start, you would now have duplicate customers and orders. 
     Hence the need for transactional support. 

     This works by allowing you to create and post all your requests into a transactional "envelope". 
     The server will then check all business rules before attempting to commit to the database. 
     If all business rules pass, it then commits all data at once using a single database transaction. 
     This guarantees that even if there is a sql exception, all will get rolled back cleanly. 
     If an exception is encountered, you can safely correct the input that caused it and safely re-commit the request.
     */

    /*
     TransactionalRequest
     */
    private ApiRequest[] transactionRequests;

    /*
     TransactionalResponse
    
     private ApiRequest[] transactionRequests;
     */
}

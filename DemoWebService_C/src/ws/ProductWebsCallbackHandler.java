
/**
 * ProductWebsCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package ws;

    /**
     *  ProductWebsCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ProductWebsCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ProductWebsCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ProductWebsCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getProduct method
            * override this method for handling normal response from getProduct operation
            */
           public void receiveResultgetProduct(
                    ws.ProductWebsStub.GetProductResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProduct operation
           */
            public void receiveErrorgetProduct(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllProducts method
            * override this method for handling normal response from getAllProducts operation
            */
           public void receiveResultgetAllProducts(
                    ws.ProductWebsStub.GetAllProductsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllProducts operation
           */
            public void receiveErrorgetAllProducts(java.lang.Exception e) {
            }
                


    }
    
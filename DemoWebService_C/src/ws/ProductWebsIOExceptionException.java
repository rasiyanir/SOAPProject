
/**
 * ProductWebsIOExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

package ws;

public class ProductWebsIOExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1563644959388L;
    
    private ws.ProductWebsStub.ProductWebsIOException faultMessage;

    
        public ProductWebsIOExceptionException() {
            super("ProductWebsIOExceptionException");
        }

        public ProductWebsIOExceptionException(java.lang.String s) {
           super(s);
        }

        public ProductWebsIOExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProductWebsIOExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ws.ProductWebsStub.ProductWebsIOException msg){
       faultMessage = msg;
    }
    
    public ws.ProductWebsStub.ProductWebsIOException getFaultMessage(){
       return faultMessage;
    }
}
    
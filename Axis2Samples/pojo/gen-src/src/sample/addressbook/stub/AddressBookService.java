

/**
 * AddressBookService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package sample.addressbook.stub;

    /*
     *  AddressBookService java interface
     */

    public interface AddressBookService {
          

        /**
          * Auto generated method signature
          * 
                    * @param findEntry
                
         */

         
                     public sample.addressbook.service.FindEntryResponse findEntry(

                        sample.addressbook.service.FindEntry findEntry)
                        throws java.rmi.RemoteException
             ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addEntry(
         sample.addressbook.service.AddEntry addEntry

        ) throws java.rmi.RemoteException
        
        ;

        

        
       //
       }
    
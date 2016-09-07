
package rnptest.inject;

import rnptest.model.Consumer;
import rnptest.model.RemoteStoreType;

/**
 *
 * @author lokex
 */
public class AnnotationRemoteStoreInjector implements RemoteStoreInjector{
    

    @Override
    public Consumer getConsumer(RemoteStoreType remoteStoreType) {
       switch(remoteStoreType){
       
           case PARSE:
               return new Application(new AnnotationParseRemoteStore());
       
           case REST:
               return new Application(new AnnotationRestRemoteStore());
             
           default:
               throw new RuntimeException("RemoteStoreType specified is not valid.");
       }
    }
    
}

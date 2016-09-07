
package rnptest.inject;

import rnptest.model.Consumer;
import rnptest.model.RemoteStoreType;

/**
 *
 * @author lokex
 */
public class CommentRemoteStoreInjector implements RemoteStoreInjector{

   
    @Override
    public Consumer getConsumer(RemoteStoreType remoteStoreType) {
        switch (remoteStoreType){
            case PARSE:
                 return new Application(new CommentParseRemoteStore());
                 
            case REST:
                return new Application(new CommentRestRemoteStore());
                
            default:
                throw new RuntimeException("RemoteStoreType specified not valid.");
        }
    }
    
}

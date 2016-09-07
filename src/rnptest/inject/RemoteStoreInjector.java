
package rnptest.inject;

import rnptest.model.Consumer;
import rnptest.model.RemoteStoreType;

/**
 *
 * @author lokex
 */
public interface RemoteStoreInjector {
    
    /** * @param remoteStoreType type of remote store to inject with
     *  
     * @return consumer injected with remote store defined by remoteStoreType
     */
    Consumer getConsumer(RemoteStoreType remoteStoreType);
}

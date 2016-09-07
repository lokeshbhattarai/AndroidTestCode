
package rnptest.inject;

import rnptest.model.Consumer;
import rnptest.model.RemoteStore;
import rnptest.model.Storable;

/**
 *
 * @author lokex
 */
public class Application implements Consumer{

    RemoteStore remoteStore;
    
    public Application(RemoteStore remoteStore){
        this.remoteStore = remoteStore;
    }

    @Override
    public void storeContent(Storable content) {
        this.remoteStore.store(content);
    }
    
    
    
}


package rnptest.inject;

import rnptest.model.RemoteStore;
import rnptest.model.Storable;
import rnptest.model.Annotation;

/**
 * saves annotation to parse remote store
 * @author lokex
 */
public class AnnotationParseRemoteStore implements RemoteStore{

    @Override
    public void store(Storable contentToStore) {
         //here we know that contentToStore is Annotation.
        Annotation annotation = (Annotation)contentToStore;
        System.out.println("annotation name:"+annotation.getAnnotationName());
        System.out.println("Annotation instance saved via Parse remote store");
    }
    
}

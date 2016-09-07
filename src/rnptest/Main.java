
package rnptest;

import rnptest.model.RemoteStoreType;
import rnptest.model.Consumer;
import rnptest.inject.CommentRemoteStoreInjector;
import rnptest.inject.AnnotationRemoteStoreInjector;
import rnptest.inject.RemoteStoreInjector;
import rnptest.model.Annotation;
import rnptest.model.Comment;


/**
 *
 * @author lokex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteStoreInjector remoteStoreInjector;
        Consumer consumer;
        
        //storing comment to REST remote store
        Comment mockComment = new Comment(1, "Mock comment Title 1", "Mock comment description 1");
        remoteStoreInjector = new CommentRemoteStoreInjector();
        consumer = remoteStoreInjector.getConsumer(RemoteStoreType.REST);
        consumer.storeContent(mockComment);
        
        //storing mockAnnotation to Parse remote store
        Annotation mockAnnotation = new Annotation(2, "@Test");
        remoteStoreInjector = new AnnotationRemoteStoreInjector();
        consumer = remoteStoreInjector.getConsumer(RemoteStoreType.PARSE);
        consumer.storeContent(mockAnnotation);
    }
    
}

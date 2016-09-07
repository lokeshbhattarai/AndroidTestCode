import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rnptest.inject.Application;
import rnptest.inject.RemoteStoreInjector;
import rnptest.model.Annotation;
import rnptest.model.Consumer;
import rnptest.model.RemoteStoreType;
import rnptest.model.Storable;

/**
 *
 * @author lokex
 */
public class ApplicationJunitTest {
    
    private RemoteStoreInjector annotationStoreInjector ;
    
    @Before
    public void setUp(){
        annotationStoreInjector = (RemoteStoreType remoteStoreType) -> {
            return new Application((Storable contentToStore) -> {
                Annotation annotation = (Annotation)contentToStore;
                System.out.println("annotation:"+annotation.getAnnotationName());
            });
        };
        
        
    }
    
    @Test
    public void test(){
        
            Consumer consumer = annotationStoreInjector.getConsumer(RemoteStoreType.REST);
            consumer.storeContent(new Annotation(4, "Mock Annotation"));
        
        }
    
    @After
    public void tear(){
        annotationStoreInjector = null;
    }
}

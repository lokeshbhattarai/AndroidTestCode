
package rnptest.model;

/**
 *
 * @author lokex
 */
public class Annotation implements Storable{
    
    private int id;
    private String annotationName;

    public Annotation(int id, String annotationName) {
        this.id = id;
        this.annotationName = annotationName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnnotationName() {
        return annotationName;
    }

    public void setAnnotationName(String annotationName) {
        this.annotationName = annotationName;
    }
    
    
    
}

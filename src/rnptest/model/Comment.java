
package rnptest.model;

/**
 *
 * @author lokex
 */
public class Comment implements Storable{
    
    private int id;
    private String commentTitle;
    private String commentDescription;

    public Comment(int id, String commentTitle, String commentDescription) {
        this.id = id;
        this.commentTitle = commentTitle;
        this.commentDescription = commentDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getCommentDescription() {
        return commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }

    
}

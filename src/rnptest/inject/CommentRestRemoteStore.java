
package rnptest.inject;

import rnptest.model.RemoteStore;
import rnptest.model.Storable;
import rnptest.model.Comment;

/**
 *saves comment to restful remote server
 * @author lokex
 */
public class CommentRestRemoteStore implements RemoteStore{

    @Override
    public void store(Storable contentToStore) {
       Comment comment = (Comment)contentToStore;
       System.out.println("comment title:"+comment.getCommentTitle());
        
    }
    
}

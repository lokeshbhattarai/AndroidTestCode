
package rnptest.inject;

import rnptest.model.RemoteStore;
import rnptest.model.Storable;
import rnptest.model.Comment;

/**
 * saves comment to parse remote store
 * @author lokex
 */
public class CommentParseRemoteStore implements RemoteStore{

    @Override
    public void store(Storable contentToStore) {
        //logic to store content via parse remote store
        Comment comment = (Comment)contentToStore;
        System.out.println("Comment title:"+comment.getCommentTitle());
        System.out.println("content stored via parse remote store");
    }
    
}

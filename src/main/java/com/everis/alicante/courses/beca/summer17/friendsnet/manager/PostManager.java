package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Post;

public interface PostManager extends Manager<Post, Long> {

    //TODO
    Post addLike(Long id, Like like);

}

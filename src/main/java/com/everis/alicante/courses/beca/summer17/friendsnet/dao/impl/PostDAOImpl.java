package com.everis.alicante.courses.beca.summer17.friendsnet.dao.impl;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Post;
import org.springframework.stereotype.Service;

@Service
public class PostDAOImpl extends AbstractDAO<Post, Long> implements PostDAO{

    @Override
    public Post addLike(Like like) {
        return null;
    }
}

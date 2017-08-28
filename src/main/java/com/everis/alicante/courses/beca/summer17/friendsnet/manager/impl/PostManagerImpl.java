package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PostManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostManagerImpl implements PostManager {

    @Autowired
    PostDAO dao;
    
    //falta rellenar
    @Override
    public Iterable<Post> findAll() {
        return dao.findAll();
    }

    @Override
    public Post findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public Post save(Post e) {
        return dao.save(e);
    }

    @Override
    public Iterable<Post> save(Iterable<Post> es) {
        return dao.save(es);
    }

    @Override
    public Post update(Post e) {
        return dao.update(e);
    }

    @Override
    public Iterable<Post> update(Iterable<Post> es) {
        return dao.update(es);
    }

    @Override
    public void remove(Post es) {
    	dao.remove(es);
    }

		@Override
		public Post addLike(Long id, Like like) {

			return dao.addLike(id, like);
		}
}

package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PostManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/post")
@Transactional
public class PostController {

    @Autowired
    private PostManager manager;

    @GetMapping
    public List<Post> getAll(){
        return (List<Post>)manager.findAll();
    }

    @GetMapping("/{id}")
    public Post getById(@PathVariable Long id){
        return manager.findById(id);
    }

    @GetMapping("/person/{id}")
    public Post getByPersonId(@PathVariable Long id){
        //TODO
        //no se si este metodo funciona
        return (Post) manager.findById(id);
    }

    @PostMapping
    public Post create(@RequestBody Post e){
        return manager.save(e);
    }

    @DeleteMapping
    public void remove(@RequestParam Long id){
        manager.remove(manager.findById(id));
    }

}

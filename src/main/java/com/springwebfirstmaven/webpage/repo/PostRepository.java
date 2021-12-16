package com.springwebfirstmaven.webpage.repo;

import com.springwebfirstmaven.webpage.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post,Long>{
}

package fon.bg.ac.rs.socialnetworkapi.service;

import fon.bg.ac.rs.socialnetworkapi.model.Post;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}

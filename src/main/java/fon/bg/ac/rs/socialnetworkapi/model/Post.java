package fon.bg.ac.rs.socialnetworkapi.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private String id;

    private String post;
    private String name;
    private String email;

    private String image;
    private String profilePicture;
    private String timeStamp;
    private String file;
}

package fon.bg.ac.rs.socialnetworkapi.entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="posts")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    private String id;

    @Lob //so we can save numbers of chars
    private String post;
    private String name;
    private String email;

    @Lob
    private String image;
    private String profilePicture;
    private String timeStamp;
}

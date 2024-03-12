package ken.market.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Member {
    private int memberCode;
    private String email;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private List<Post> posts;
    private double rate;
    private List<Review> reviews;

}


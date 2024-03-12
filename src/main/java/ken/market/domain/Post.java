package ken.market.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private int postId;
    private int memberId;
    private int price;
    private String postTitle;
    private String context;
    private java.util.Date date;
}

package ken.market.service;

import ken.market.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MemberService {

    public void join(Member member){
        // check database if email already exists

        // else send a code to the email and move to the verfication page
    }
}

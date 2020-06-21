package gmh.getmesocialservice.repository;

import gmh.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser()
    {
        User user = new User("super", "usa", 12, "xyz");
        return user;
    }

}

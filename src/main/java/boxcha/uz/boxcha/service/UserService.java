package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService extends GeneralService <User , Number> {
    Page<User> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrLoginContainsIgnoreCaseOrParolContainsIgnoreCaseOrActiveContainsIgnoreCase(String ism , String familiya, String login,String parol,Boolean active, Pageable pageable);

}

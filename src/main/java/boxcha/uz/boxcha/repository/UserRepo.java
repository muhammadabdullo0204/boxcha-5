package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.KirimChiqim;
import boxcha.uz.boxcha.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository <User, Long> {

    Page<User> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrLoginContainsIgnoreCaseOrParolContainsIgnoreCaseOrActiveContainsIgnoreCaseOrId(String ism , String familiya, String login,String parol,Boolean active, Long id , Pageable pageable);

}

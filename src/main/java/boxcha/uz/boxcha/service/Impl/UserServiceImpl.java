package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.User;
import boxcha.uz.boxcha.repository.UserRepo;
import boxcha.uz.boxcha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {


    @Autowired
    private UserRepo userRepo;


    @Override
    public Page<User> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrLoginContainsIgnoreCaseOrParolContainsIgnoreCaseOrActiveContainsIgnoreCase(String ism, String familiya, String login, String parol, Boolean active, Pageable pageable) {
        return null;
    }

    @Override
    public Page<User> getAll(Pageable pageable) {
        return userRepo.findAll(pageable);
    }

    @Override
    public User create(User data) {
        return userRepo.save(data);
    }

    @Override
    public User update(User data) {
        return userRepo.save(data);
    }

    @Override
    public void delete(User data) {
        userRepo.delete(data);

    }

    @Override
    public void deletebyId(Long id) {
        userRepo.deleteById(id);

    }
}

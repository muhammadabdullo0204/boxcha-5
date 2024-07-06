package boxcha.uz.boxcha.controller;

import boxcha.uz.boxcha.entity.User;
import boxcha.uz.boxcha.service.UqituvchiService;
import boxcha.uz.boxcha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Page<User> getAll(@RequestParam (required = false) String ism, String familiya, String login, String parol, Boolean active, Pageable pageable) {
        if (ism == null) ism = "";
        return userService.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrLoginContainsIgnoreCaseOrParolContainsIgnoreCaseOrActiveContainsIgnoreCase(ism, familiya, login, parol, active, pageable);
    }



    @PostMapping
    public User create(User user) {
        return userService.create(user);
    }

    @PutMapping
    public User update(User user) {
        return userService.update(user);
    }

    @DeleteMapping
    public void delete(User user) {
        userService.delete(user);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(Long id) {
        userService.deletebyId(id);
    }
}

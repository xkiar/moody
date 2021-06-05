package lu.arnaud.moody.Controller;

import lombok.RequiredArgsConstructor;
import lu.arnaud.moody.Entity.User;
import lu.arnaud.moody.Service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Users")

public class UserController {
    private final UserService userService;

    @GetMapping
    public Page<User> getAllUsers(@PageableDefault(size = Integer.MAX_VALUE) Pageable pageable) {
        return userService.findAllUsers(pageable);
    }
    @GetMapping("{id}")
    public User getUserbyId(@PathVariable Long id) {
        return userService.findUserById(id);
    }
    @PostMapping
    public User createUser() {
        return null;
    }
}
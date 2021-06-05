package lu.arnaud.moody.Service;

import lombok.RequiredArgsConstructor;
import lu.arnaud.moody.Entity.User;
import lu.arnaud.moody.Repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Page<User> findAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
    public User findUserById(Long id) { return userRepository.getById(id); }
}
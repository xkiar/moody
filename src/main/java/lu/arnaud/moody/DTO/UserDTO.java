package lu.arnaud.moody.DTO;

import lombok.Data;
import lu.arnaud.moody.Entity.User;

@Data
public class UserDTO {
    private Long idUser;
    private String fullName;

    public User getUserbyId(Long id) {
        return null;
    }

}

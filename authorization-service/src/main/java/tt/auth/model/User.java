package tt.auth.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

    private String email;

    private String password;

    private Role role;
}

package javalang.chapter2.task52;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

public final class User {
    private final String username;
    private final String password;
    private final String email;
    private final String nickname;

    public User (Builder userBuilder) {
        this.username = userBuilder.username;
        this.password = userBuilder.password;
        this.email = userBuilder.email;
        this.nickname = userBuilder.nickname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public static class Builder {
        @NotNull(message = "username cannot be null")
        @Size(min = 5, max = 15, message = "username must be between 5 and 15 character")
        private String username;
        @NotNull(message = "password cannot be null")
        @Size(min = 5, max = 15, message = "password must be between 5 and 15 character")
        private String password;
        @Email(message = "email must be valid")
        private String email;
        @NotNull(message = "nickname cannot be null")
        private String nickname;

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder validate() {

            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();

            Set<ConstraintViolation<Builder>> violations = validator.validate(this);

            for (ConstraintViolation<Builder> violation : violations) {
                System.out.println(violation.getMessage());
            }

            return this;
        }
    }
}

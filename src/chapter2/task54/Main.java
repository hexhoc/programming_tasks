package javalang.chapter2.task54;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user = new User.Builder("nick", "pass")
                .withLastname("Lastname")
                .withFirstname("Firstname")
                .withEmail("test@test.com")
                .build();
        //You must remember that user password can hit to string
        //pay extra attention to carefully selecting the
        //information that goes in toString(),
        System.out.println(user);
    }

    public static class User {
        private final String nickname;
        private final String password;
        private final String firstname;
        private final String lastname;
        private final String email;
        private final LocalDate created;

        public User(User.Builder userBuilder) {
            this.nickname = userBuilder.nickname;
            this.password = userBuilder.password;
            this.firstname = userBuilder.firstname;
            this.lastname = userBuilder.lastname;
            this.email = userBuilder.email;
            this.created = LocalDate.now();
        }

        @Override
        public String toString() {
            return "User{" +
                    "nickname='" + nickname + '\'' +
                    ", password='" + password + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", email='" + email + '\'' +
                    ", created=" + created +
                    '}';
        }

        public static class Builder {
            private final String nickname;
            private final String password;
            private String firstname;
            private String lastname;
            private String email;

            public Builder(String nickname, String password) {
                this.nickname = nickname;
                this.password = password;
            }

            public Builder withFirstname(String firstname) {
                this.firstname = firstname;
                return this;
            }

            public Builder withLastname(String lastname) {
                this.lastname = lastname;
                return this;
            }

            public Builder withEmail(String email) {
                this.email = email;
                return this;
            }

            public User build() {
                return new User(this);
            }

        }
    }
}

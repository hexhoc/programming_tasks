package javalang.chapter2.task52;

public class Main {
    public static void main(String[] args) {

        User.Builder userBuilder = new User.Builder()
                .withUsername("user")
                .withPassword("pass")
                .withEmail("mail")
                .withNickname("nickname")
                .validate();

        User user = new User(userBuilder);

        System.out.println(user);
    }
}

package javalang.chapter2.task56;

public class Main {
    public static void main(String[] args) {
        checkPlayerType(PlayerType.CHESS);
    }

    public static void checkPlayerType(PlayerType playerType) {

        String result = switch(playerType) {
            case GOLF, TENNIS, FOOTBALL, BASKETBALL -> "active games";
            case CHESS, POKER -> "calm games";
        };

        System.out.println(result);

    }
}

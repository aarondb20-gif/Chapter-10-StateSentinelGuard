public class Main {
    public static void main(String[] args) {
        SentinelGuard guard = new SentinelGuard(SentinelGuard.State.IDLE);

        guard.hearNoise();
        guard.seeEnemy();
        guard.loseTarget();

    }
}

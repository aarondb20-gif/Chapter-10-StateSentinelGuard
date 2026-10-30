public class Main {
    public static void main(String[] args) {
        //SentinelGuard guard = new SentinelGuard(SentinelGuard.State.IDLE);
        SentinelGuard guard = new SentinelGuard();

        guard.setState(new IdleState()); //Set starting state
        guard.hearNoise();
        guard.seeEnemy();
        guard.loseTarget();

    }
}

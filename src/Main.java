import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        //SentinelGuard guard = new SentinelGuard(SentinelGuard.State.IDLE);
        SentinelGuard guard = new SentinelGuard();

        guard.setState(new IdleState());//Set starting state
        guard.loseTarget();
        guard.hearNoise();
        guard.seeEnemy();


        System.out.println();
        guard.setState(new SleepingState());
        guard.loseTarget();
        guard.seeEnemy();
        guard.hearNoise();

        System.out.println();
        guard.setState(new PatrollingState());
        guard.hearNoise();
        guard.loseTarget();
        guard.seeEnemy();

        System.out.println();
        guard.setState(new AttackingState());
        guard.hearNoise();
        guard.seeEnemy();
        guard.loseTarget();


    }
}

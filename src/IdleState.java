import java.security.Guard;

public class IdleState implements GuardState{


    @Override
    public void hearNoise(SentinelGuard guard) {
        //transition to Patrolling
        System.out.println("Idle: Guard is investigating.");
        guard.setState(new PatrollingState());
    }

    @Override
    public void seeEnemy(SentinelGuard guard) {
        //transition to Attacking
        System.out.println("Idle: The guard has spotted the enemy.");
        guard.setState(new AttackingState());

    }

    @Override
    public void loseTarget(SentinelGuard guard) {
        System.out.println("Idle: No target to lose.");

    }
}

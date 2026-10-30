public class PatrollingState implements GuardState{

    @Override
    public void hearNoise(SentinelGuard guard) {
        System.out.println("Patrolling: The guard is already on alert.");

    }

    @Override
    public void seeEnemy(SentinelGuard guard) {
        //transition to Attacking
        System.out.println("Patrolling: The guard has spotted the enemy.");
        guard.setState(new AttackingState());

    }

    @Override
    public void loseTarget(SentinelGuard guard) {
        System.out.println("Patrolling: No target to lose.");

    }
}

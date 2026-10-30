public class AttackingState implements GuardState{


    @Override
    public void hearNoise(SentinelGuard guard) {
        System.out.println("Attacking: Guard is too busy fighting to notice the noise.");

    }

    @Override
    public void seeEnemy(SentinelGuard guard) {
        System.out.println("Attacking: The guard has spotted the enemy.");

    }

    @Override
    public void loseTarget(SentinelGuard guard) {
        //transition to Patrolling
        System.out.println("Attacking: The guard is searching for the escaped enemy.");
        guard.setState(new PatrollingState());

    }
}

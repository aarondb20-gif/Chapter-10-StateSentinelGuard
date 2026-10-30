public class SentinelGuard {
    protected GuardState currentState;

    protected final GuardState idleState;
    protected final GuardState patrollingState;
    protected final GuardState attackingState;

    public SentinelGuard(){
        this.idleState = new IdleState();
        this.patrollingState = new PatrollingState();
        this.attackingState = new AttackingState();
    }

    public void setState(GuardState newState){
        this.currentState = newState;
    }
    //Context delegates behavior to the current state
    public void hearNoise(){
        currentState.hearNoise(this);
    }

    public void seeEnemy(){
        currentState.seeEnemy(this);
    }

    public void loseTarget(){
        currentState.loseTarget(this);
    }

}

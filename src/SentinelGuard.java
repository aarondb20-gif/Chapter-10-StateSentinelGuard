public class SentinelGuard {
    public enum State{
        IDLE,
        PATROLLING,
        ATTACKING
    }
    private State currentState;

    public SentinelGuard(State currentState){
        this.currentState = currentState; //Initial state
    }
    public void hearNoise(){
        switch (currentState){
            case PATROLLING:
                System.out.println("Patrolling and guard is on alert.");
            case IDLE:

                System.out.println("Begin Patrolling and guard investigating noise.");
                currentState = State.PATROLLING;

            case ATTACKING:
                System.out.println("Guard is too busy fighting to notice the noise.");
        }
    }
    public void seeEnemy(){
        switch (currentState){
            case PATROLLING:

                System.out.println("The guard has spotted the enemy.");
                currentState = State.ATTACKING;
            case IDLE:

                System.out.println("The guard has spotted the enemy.");
                currentState = State.ATTACKING;

            case ATTACKING:
                System.out.println("The guard has spotted the enemy.");
        }
    }

    public void loseTarget(){
        switch (currentState){
            case PATROLLING:
                System.out.println("No target to lose.");
            case IDLE:
                System.out.println("No target to lose.");

            case ATTACKING:
                currentState = State.PATROLLING;
                System.out.println("Guard is searching for escaped enemy.");
        }
    }
}

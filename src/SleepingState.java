public class SleepingState implements GuardState{
    @Override
    public void hearNoise(SentinelGuard guard) {
        System.out.println("Zzz: The guard wakes up.");
        guard.setState(new PatrollingState());
    }

    @Override
    public void seeEnemy(SentinelGuard guard) {
        System.out.println("Zzz: The guard is snoring loudly and doesn't see a thing.");
    }

    @Override
    public void loseTarget(SentinelGuard guard) {
        System.out.println("Zzz: The guard is fast asleep and doesn't care about targets.");
    }
}

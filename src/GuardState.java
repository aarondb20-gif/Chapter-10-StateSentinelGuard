public interface GuardState {
    public void hearNoise(SentinelGuard guard);
    public void seeEnemy(SentinelGuard guard);
    public void loseTarget(SentinelGuard guard);
}

package Strategy;

public class Client {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext(100);
        OfferStrategy strategy = strategyContext.getStrategy(7);
        strategyContext.applyStrategy(strategy);
    }
}

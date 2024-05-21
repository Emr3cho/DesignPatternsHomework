package strategy;

public class TraineeContext {
    private TrainingStrategy strategy;

    public void train(TrainingStrategy strategy) {
        strategy.train();
    }
}

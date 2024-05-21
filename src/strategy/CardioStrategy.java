package strategy;

public class CardioStrategy implements TrainingStrategy {
    @Override
    public void train() {
        System.out.println("Performing cardio exercises.");
    }
}

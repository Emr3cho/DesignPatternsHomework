package decorator;

public class CardioDecorator extends TrainingProgramDecorator {
    public CardioDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String getDescription() {
        return STR."\{super.getDescription()}, with Cardio";
    }
}

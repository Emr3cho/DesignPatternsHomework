package decorator;

public class StrengthTrainingDecorator extends TrainingProgramDecorator {
    public StrengthTrainingDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String getDescription() {
        return STR."\{super.getDescription()}, with Strength Training";
    }
}

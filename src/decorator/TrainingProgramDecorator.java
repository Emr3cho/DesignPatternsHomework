package decorator;

public class TrainingProgramDecorator extends TrainingProgram{
    protected TrainingProgram trainingProgram;

    public TrainingProgramDecorator(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    @Override
    public String getDescription() {
        return trainingProgram.getDescription();
    }
}

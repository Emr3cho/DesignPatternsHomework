import decorator.BasicTrainingProgram;
import decorator.CardioDecorator;
import decorator.StrengthTrainingDecorator;
import decorator.TrainingProgram;
import entity.Client;
import entity.Gym;
import observer.TrainingRegimen;
import strategy.CardioStrategy;
import strategy.StrengthTrainingStrategy;
import strategy.TraineeContext;

void main(){
    Gym gym = Gym.getGymInstance();
    // Singleton instance of FitnessCenter

    // Observer pattern
    Client trainee1 = new Client("Ivanka");
    Client trainee2 = new Client("Ivan");

    TrainingRegimen trainingRegimen = new TrainingRegimen();
    trainingRegimen.addObserver(trainee1);
    trainingRegimen.addObserver(trainee2);

    trainingRegimen.changeRegimen("HUNGRY DO DUPKA!");

    // Decorator pattern
    TrainingProgram basicProgram = new BasicTrainingProgram();
    System.out.println(basicProgram.getDescription());

    TrainingProgram cardioProgram = new CardioDecorator(basicProgram);
    System.out.println(cardioProgram.getDescription());

    TrainingProgram fullProgram = new StrengthTrainingDecorator(cardioProgram);
    System.out.println(fullProgram.getDescription());

    // Strategy pattern
    TraineeContext traineeContext = new TraineeContext();

    traineeContext.train(new CardioStrategy());
    traineeContext.train(new StrengthTrainingStrategy());
}
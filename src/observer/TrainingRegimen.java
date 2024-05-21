package observer;

import java.util.ArrayList;
import java.util.List;

public class TrainingRegimen {
    private List<Observer> trainees = new ArrayList<>();

    public void addObserver(Observer observer) {
        trainees.add(observer);
    }

    public void removeObserver(Observer observer) {
        trainees.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer trainee : trainees) {
            trainee.update(message);
        }
    }

    public void changeRegimen(String newRegimen) {
        notifyObservers(STR."The training regimen has been updated to: \{newRegimen}");
    }
}

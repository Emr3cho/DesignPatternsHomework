package entity;

public class Gym {
    private static Gym gymInstance;

    private Gym(){}

    public static Gym getGymInstance() {
        if(gymInstance == null){
            gymInstance = new Gym();
        }
        return gymInstance;
    }
}

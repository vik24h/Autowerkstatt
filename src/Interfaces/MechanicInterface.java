package Interfaces;

public interface MechanicInterface<C> extends ICrud<C>{
    void addCar(C c);
    void deleteCar(C c);
    void updateCar(C c);

}

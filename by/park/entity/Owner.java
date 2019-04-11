package by.park.entity;

import by.park.objects.Plants;

/*
 * class Owner saves the type of plant and its quantity
 */
public class Owner extends AbstractWorker {
    private int givenAmount;

    public Owner (Plants plant, int givenAmount) {
        super(plant);
        if (givenAmount > 0) {
            this.givenAmount = givenAmount;
        }else {
            throw new IllegalArgumentException("Incompatible value:" + getClass());
        }
    }

    public int getGivenAmount(){
        return givenAmount;
    }

    @Override
    public int hashCode() {
        return givenAmount + getPlant().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + "@ Plant's name: " + getPlant() + " amount: " + givenAmount;
    }
}

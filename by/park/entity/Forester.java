package by.park.entity;

import by.park.objects.Plants;

/*
 * class Forester saves the type of plant and its quantity
 */
public class Forester extends AbstractWorker {
    private int fulfilledAmount;


    public Forester(Plants plant, int fulfilledAmount){
        super(plant);
        if (fulfilledAmount > 0) {
            this.fulfilledAmount = fulfilledAmount;
        }else {
            throw new IllegalArgumentException("Incompatible value:" + getClass());
        }
    }

    public int getFulfilledAmount() {
        return fulfilledAmount;
    }

    @Override
    public int hashCode() {
         return fulfilledAmount + getPlant().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + "@ Plant's name: " + getPlant() + " amount: " + fulfilledAmount;
    }
}

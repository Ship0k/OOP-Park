package by.park.entity;

import by.park.objects.Plants;

/*
 * abstract class AbstractWorker for park entities
 */
public abstract class AbstractWorker {
    private Plants plant;

    AbstractWorker(Plants plant) {
        this.plant = plant;
    }

    public Plants getPlant(){
        return plant;
    }
}

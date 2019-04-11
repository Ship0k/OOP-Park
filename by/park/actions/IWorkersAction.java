package by.park.actions;

import by.park.entity.AbstractWorker;

/*
 * interface IWorkersAction determines the main actions of the park employees
 */
public interface IWorkersAction<T extends AbstractWorker> {
    String landingPlants(T worker);
    String artProcessingPlants(T worker);
    String treatmentPlants(T worker);
    String destructionPlants(T worker);
}

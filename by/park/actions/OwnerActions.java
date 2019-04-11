package by.park.actions;

import by.park.entity.Owner;

/*
 * class OwnerActions defines the method of the abstraction class ConfirmAction
 * and implements the interface IWorkersAction with its methods
 */
public class OwnerActions extends ConfirmAction {
    @Override
    void toApprove() {
      // ... implementation is temporarily absent
    }

    @Override
    public String landingPlants(Owner owner) {
        return String.format("Высадить %d шт. растений вида: %S\n", owner.getGivenAmount(), owner.getPlant());
    }

    @Override
    public String artProcessingPlants(Owner owner) {
        return String.format("Произвести художественную обработку %d шт. растений вида: %S\n",
                owner.getGivenAmount(), owner.getPlant());
    }

    @Override
    public String treatmentPlants(Owner owner) {
        return String.format("Вылечить %d шт. растений вида: %S\n", owner.getGivenAmount(), owner.getPlant());
    }

    @Override
    public String destructionPlants(Owner owner) {
        return String.format("Уничтожить %d шт. растений вида: %S\n", owner.getGivenAmount(), owner.getPlant());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + " Класс не имеет полей и переменных";
    }
}

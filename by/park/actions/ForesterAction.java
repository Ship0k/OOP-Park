package by.park.actions;

import by.park.entity.Forester;

/*
 * class ForesterAction implements methods interface IWorkersAction
 */
public class ForesterAction implements IWorkersAction<Forester> {
    @Override
    public String landingPlants(Forester forester) {
        return String.format("%d шт. растений вида: %s были высажены\n",
                forester.getFulfilledAmount(), forester.getPlant());
    }

    @Override
    public String artProcessingPlants(Forester forester) {
        return String.format("%d шт. растений вида: %s были художественно обработаны\n",
                forester.getFulfilledAmount(), forester.getPlant());
    }

    @Override
    public String treatmentPlants(Forester forester) {
        return String.format("%d шт. растений вида: %s были вылечены\n",
                forester.getFulfilledAmount(), forester.getPlant());
    }

    @Override
    public String destructionPlants(Forester forester) {
        return String.format("%d шт. растений вида: %s были уничтожены\n",
                forester.getFulfilledAmount(), forester.getPlant());
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

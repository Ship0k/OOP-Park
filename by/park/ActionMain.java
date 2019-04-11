package by.park;

import by.park.actions.ForesterAction;
import by.park.actions.IWorkersAction;
import by.park.actions.OwnerActions;
import by.park.entity.Forester;
import by.park.entity.Owner;
import static by.park.objects.Plants.*;

/*
 * Main class for to check the functionality
 *
 * @version    1.0 11 Apr 2019
 * @author     Anatoli Shipkou
 */
public class ActionMain {
    public static void main(String[] args) {
        try {
            Owner task1 = new Owner(BIRCH, 4);
            Owner task2 = new Owner(MAPLE, 2);
            IWorkersAction<Owner> owner = new OwnerActions();

            /* forester's actions may be different from the owner's tasks, for obvious reasons */

            Forester answer1 = new Forester(BIRCH, 3);
            Forester answer2 = new Forester(MAPLE, 2);
            IWorkersAction<Forester> forester = new ForesterAction();


            System.out.println("Владелец дает задания: " + owner.landingPlants(task1) +
                    "    и " + owner.destructionPlants(task2));
            System.out.println("Лесник отчитывается: " + forester.landingPlants(answer1) +
                    "    и " + forester.destructionPlants(answer2));
        }catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

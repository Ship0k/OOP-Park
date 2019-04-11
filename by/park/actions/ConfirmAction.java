package by.park.actions;

import by.park.entity.Owner;
/*
 * abstract class ConfirmAction implements interface methods
 * and declares a method toApprove() for to confirm employee actions
 */
abstract class ConfirmAction implements IWorkersAction<Owner> {
    abstract void toApprove();
}

package Classes;

import Command.Command;

public class GenericController {
    public Command action;

    public GenericController(){}

    public void setAction(Command action) {
        this.action = action;
    }
}

package commands.workout.workoutmanager;

import commands.Command;
import commands.CommandResult;
import exceptions.InvalidCommandWordException;
import exceptions.SchwarzeneggerException;

public class WrongWS extends Command {

    /**
     * Notifies user invalid input command.
     *
     * @param args User's input arguments.
     * @return Status MISSING and COMMAND_NOT_FOUND feedback.
     * @throws SchwarzeneggerException If there are caught exceptions.
     */
    @Override
    public CommandResult execute(String args) throws SchwarzeneggerException {
        throw new InvalidCommandWordException();
    }
}

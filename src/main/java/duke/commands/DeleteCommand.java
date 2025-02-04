package duke.commands;

import duke.tasks.Task;
import duke.tasks.TaskList;
import duke.ui.Ui;

public class DeleteCommand extends Command {

    private int idx;
    private Ui ui;
    private TaskList taskList;

    public DeleteCommand(int idx, Ui ui, TaskList taskList) {
        this.idx = idx;
        this.ui = ui;
        this.taskList = taskList;
    }

    public String execute() throws IndexOutOfBoundsException {
        Task toDelete = taskList.delete(idx);
        return ui.printOnDelete(toDelete, taskList);
    }
}

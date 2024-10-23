public class RemoteControl {
    private Command[] slots;
    private Command lastCommand;

    public RemoteControl() {
        slots = new Command[5];
    }

    public void setCommand(int slot, Command command) {
        slots[slot] = command;
    }

    public void pressButton(int slot) {
        if (slots[slot] != null) {
            slots[slot].execute();
            lastCommand = slots[slot];
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}

public class Daemon extends Process {
    private boolean persistent;

    public Daemon(int pid, String name, boolean persistent) {
        super(pid, name);
        this.persistent = persistent;
    }

    @Override
    public String execute() {
        return "[Daemon] Ejecutando servicio " + getName() + " (PID=" + getPid() + ") - persistente: " + persistent + "\n";
    }
}

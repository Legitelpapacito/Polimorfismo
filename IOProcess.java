public class IOProcess extends Process {
    private String device;

    public IOProcess(int pid, String name, String device) {
        super(pid, name);
        this.device = device;
    }

    @Override
    public String execute() {
        return "[I/O] Ejecutando " + getName() + " (PID=" + getPid() + ") - dispositivo: " + device + "\n [I/O] Esperando E/S...\n";
    }
}

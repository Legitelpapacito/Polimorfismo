public abstract class Process {
    private int pid;
    private String name;

    public Process(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public int getPid() { return pid; }
    public String getName() { return name; }

    public abstract String execute();

    // Overloading: ejecutar varias veces
    public String execute(int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(execute());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("Process[PID=%d, name=%s, type=%s]", pid, name, this.getClass().getSimpleName());
    }
}

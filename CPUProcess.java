public class CPUProcess extends Process {
    private int cyclesRequired;

    public CPUProcess(int pid, String name, int cyclesRequired) {
        super(pid, name);
        this.cyclesRequired = cyclesRequired;
    }

    @Override
    public String execute() {
        StringBuilder sb = new StringBuilder();
        sb.append("[CPU] Ejecutando ").append(getName())
          .append(" (PID=").append(getPid()).append(") - ciclos: ").append(cyclesRequired).append("\n");
        for (int i = 0; i < Math.min(3, cyclesRequired); i++) {
            sb.append(" [CPU] procesando ciclo ").append(i + 1).append("\n");
        }
        return sb.toString();
    }
}

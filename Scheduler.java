import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private List<Process> processes;

    public Scheduler() {
        processes = new ArrayList<>();
    }

    public void addProcess(Process p) {
        processes.add(p);
    }

    public String runAll() {
        StringBuilder sb = new StringBuilder();
        for (Process p : processes) {
            sb.append(p.execute());
        }
        return sb.toString();
    }
}

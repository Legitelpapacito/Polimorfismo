public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        // Ejemplo de carga de procesos
        scheduler.addProcess(new CPUProcess(1, "Compilador", 10));
        scheduler.addProcess(new IOProcess(2, "Descarga", "Red"));
        scheduler.addProcess(new Daemon(3, "Monitor", true));

        System.out.println("--- Simulador simple de procesos ---");

        // Ejecutar todos polimórficamente
        System.out.print(scheduler.runAll());

        // Demostración de overloading: ejecutar un proceso varias veces
        System.out.println("\n--- Ejecutar Compilador 2 veces (overload) ---");
        Process p = new CPUProcess(4, "Compilador2", 5);
        System.out.print(p.execute(2));
    }
}

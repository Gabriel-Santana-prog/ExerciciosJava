import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n--- Lista de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Marcar Tarefa como Concluída");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //

            switch (choice) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String description = scanner.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    System.out.print("Índice da tarefa a marcar como concluída: ");
                    int completeIndex = scanner.nextInt();
                    manager.markTaskAsCompleted(completeIndex);
                    break;
                case 3:
                    System.out.print("Índice da tarefa a remover: ");
                    int removeIndex = scanner.nextInt();
                    manager.removeTask(removeIndex);
                    break;
                case 4:
                    manager.listTasks();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

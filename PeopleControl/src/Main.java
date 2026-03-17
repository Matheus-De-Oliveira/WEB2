import java.util.Scanner;


public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	private static PeopleManager manager = new PeopleManager();
	
	public static int menu() {
		System.out.println("----------------------------------");
		System.out.println("--Sistema de controle de pessoas--");
		System.out.println("----------------------------------");
		System.out.println("--------- MENU DE OPÇÕES ---------");
		System.out.println("----------------------------------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar pelo CPF");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Remover");
		System.out.println("5 - Sair");
		System.out.println("----------------------------------");
		System.out.println("");
		System.out.println("Escolha uma opcao: ");
		return scanner.nextInt();
	}
	
	public static void register () {
		System.out.println("Digite o nome: ");
		String name = scanner.nextLine();
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
		Person person = new Person(name, cpf);
		if(manager.save(person)) {
			System.out.println("Pessoa cadastrada com sucesso!");
			System.out.println("");
			System.out.println(manager.getPeopleList());
		}else {
			System.out.println("Erro de cadastrar a pessoa");
		}
	}
	
	private static void search() {
		System.out.println("Digite o CPF: ");
		System.out.println(" ");
		String cpf = scanner.nextLine();
		Person person = manager.search(cpf);
		if(person != null) {
			System.out.println("Pessoa encontrada. Dados: ");
			System.out.println(person);
		}else {
			System.out.println("Pessoa não encontrada. tente novamente.");
		}
		
	}
	
	private static void update() {
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
		System.out.println("Digite o nome: ");
		String name = scanner.nextLine();
		if(manager.update(cpf, name)) {
			System.out.println("Dados atualizados.");
		}else {
			System.out.println("Erro ao atualizar os dados.");
		}
		
	}
	
	private static void remove() {
		System.out.println("Digite o CPF ");
		String cpf = scanner.nextLine();
		if(manager.remove(cpf)) {
			System.out.println("");
			System.out.println("dados excluidos.");
		}else {
			System.out.println("Erro ao excluir os dados.");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		int opcao;
		
		do {
			opcao = menu();
			scanner.nextLine();
			switch (opcao) {
			case 1: {
				register();
				break;
			}
			case 2:{
				search();
				break;
			}
			case 3:{
				update();
				break;
			}
			case 4:{
				remove();
				break;
			}
			
			default: 
				System.out.println("Opcao invalida. tente novamente. ");
			}
			System.out.println("");
			System.out.println("Precione enter para encerrar....:");
			scanner.nextLine();
		} while (opcao != 5);

	}

	

	

	

}

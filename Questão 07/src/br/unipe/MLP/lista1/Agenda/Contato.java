package br.unipe.MLP.lista1.Agenda;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contato {

	private String[] nome = new String[10];
	private String[] telefone = new String[10];
	private Pattern p;
    private Matcher m;
    
	
	public Contato(){
		
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String[] getNome() {
		return nome;
	}
	public void setNome(String[] nome) {
		this.nome = nome;
	}
	public String[] getTelefone() {
		return telefone;
	}
	public void setTelefone(String[] telefone) {
		this.telefone = telefone;
	}
	
	public String salvarTelefone(String salvarTel){
    	p = Pattern.compile("^[0-9]{4}-[0-9]{4}$");
        m = p.matcher(salvarTel);
        
        if(m.find())
        	return salvarTel;
        else
        	return "Formato de numero invalido. "
        			+ "Ex: ####-####";
    }
	
	public void adcionarContato(String nome1, String telefone1){
	
		if(telefone != null){
			for (int j = 0; j < 10; j++) {
				if(telefone1.equals(telefone[j])){
					System.out.println("Contato já existe!");
				}else{
					int i = 0;
					nome[i] = nome1;
					telefone[i] = salvarTelefone(telefone1);
					
				}		
			}
		}	
	}
	
	public void editar(String nome1, String telefone1){
	
		if(nome != null){
			for (int j = 0; j < 10; j++) {
				if(nome1.equals(nome[j])){
					System.out.printf("Nome\n",  nome1);
					System.out.println(nome1);
					System.out.printf("Número atual:\n", telefone);

					System.out.printf("Novo numero:\n", telefone1);
					System.out.println("Contato editado!");
				}else{
				System.out.println("Contato não encontrado");
					
				}		
			}
		}
	}

	public void remover(String nome1, String resposta){
		if(nome != null){
			for (int j = 0; j < 10; j++) {
				if(nome1.equals(nome[j])){
					System.out.printf("Tem certeza que deseja remover ", nome1," (S/N)?");
					
					if(resposta.equals(nome1)){
						nome[j] = null;
					}
				}else{
					System.out.println("Contato não encontrado!");
				}	
			}
		}
	}
	
	public void listar(){
		if(nome != null){
				 for (int i = 0; i < 10; i++) {
					 System.out.printf("Nome:\n", nome[i]);
					 System.out.printf("Telefone:\n", telefone[i]);
				}
						
		}else{
			System.out.println("Agenda esta vazia!");
		}
	}
	

	
}

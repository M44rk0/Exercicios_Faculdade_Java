package ExemploElevador;

public class Elevador {
	
	/* Criar uma classe ExemploElevador.Elevador para representar o estado dos elevadores de um prédio.
Um ExemploElevador.Elevador deve ter sua identificação (número), limite de peso, quantidade de andares,
a situação (ligado ou desligado) e o andar onde ele está.
Crie um construtor da classe ExemploElevador.Elevador que inicialize o número, limite de peso, quantidade de andares,
situação como desligado e andar 1.
Um elevador deve ter operações para ligar e desligar, subir, descer, sendo que cada operação deve 
alterar os atributos de acordo com o que cada um representa. As operações de subir e descer devem receber 
como parâmetro uma quantidade de andares a subir/descer e alterar o andar do elevador. 
O elevador não pode andar (subir ou descer) se estiver desligado, e ao subir e descer deve respeitar 
a quantidade de andares.
Criar também uma classe principal que instancie 2 ou mais elevadores e execute as operações de ligar, desligar, 
subir, descer, mostrando os dados do elevador depois de cada operação.
No final mostrar o número e o andar onde cada elevador está.
*/
	
	int numero;
	double limitePeso;
	int qtdeAndares;
	boolean ligado;
	int andar;
	
	
	Elevador(int num, double limite, int qtde) {
		this.numero = num;
		this.limitePeso = limite;
		this.qtdeAndares = qtde;
		this.ligado = false;
		this.andar = 1;		
		
	}
	
	void ligar() {
		System.out.println("Ligando elevador " + numero);
		this.ligado = true;
	}
	
	void desligar() {
		System.out.println("Desligando elevador " +  numero);
		this.ligado = false;
	}
	
	void subir(int andares) {
		System.out.println("O elevador "+ numero + " vai subir " + andares + " andares");
		if (ligado) {
			this.andar = this.andar + andares;
			if (this.andar > qtdeAndares) 
				this.andar = this.qtdeAndares;
		}
		else
			System.out.println("O elevador "+ numero + " não subiu pois estava desligado");
			
		
	}
	
	void descer(int andares) {
		System.out.println("O elevador "+ numero + " vai descer " + andares + " andares");
		if (ligado) {
			this.andar = this.andar - andares;
			if (this.andar < 1)
				this.andar = 1;
		}
		else
			System.out.println("O elevador "+ numero + " não desceu pois estava desligado");
	}
	
	public String toString() {
		String status;
		
		if (ligado) status = "Ligado";
		else status = "Desligado";
		
		return "\nDados do ExemploElevador.Elevador " + this.numero  + ": " + status + " - parado no " + andar + "o. andar - Total de andares = " + qtdeAndares + " capacidade = " + limitePeso + "kg";
											
	}
	
	String igual(Elevador elevadorX) {
		if ((this.numero == elevadorX.numero) && (this.qtdeAndares == elevadorX.qtdeAndares))
			return "iguais";
		else
			return "diferentes";
					
	}
	
}

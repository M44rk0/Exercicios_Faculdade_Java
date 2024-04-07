package ExemploElevador;

public class Main {
	/*
	Criar também uma classe principal que instancie 2 ou mais elevadores e execute as operações de ligar, desligar, 
	subir, descer, mostrando os dados do elevador depois de cada operação.
	No final mostrar o número dos elevadores e em que andar para um está.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elevador el1 = new Elevador(1,500.0,15);
		
		System.out.println(el1);
	
		/* madar subir mas com o elevador desligado - não vai subir */
		el1.subir(5); 
		
		System.out.println(el1);
	
		el1.ligar();
		
		System.out.println(el1);

		
		el1.subir(20);
		
		System.out.println(el1);
		
		el1.descer(10);
		
		System.out.println(el1);
		
		Elevador el2 = new Elevador(2,400.0,10);
		
		Elevador el3 = new Elevador(3,400.0,15);
		Elevador el4 = new Elevador(1,400.0,15);
		
		System.out.println(el2);
		
		el2.subir(2);
		
		System.out.println(el2);
	
		
		el2.ligar();
		
		System.out.println(el2);

		
		el2.subir(5);
		
		System.out.println(el2);
		
		el2.descer(10);
		
		System.out.println(el2);
		
		
		System.out.println(el3);
		
		System.out.println("------");
		
		System.out.println(el1.igual(el2));
		System.out.println(el1.igual(el4));
		
		System.out.println("ExemploElevador.Elevador : " + el1.numero + " no andar " + el1.andar);
		System.out.println("ExemploElevador.Elevador : " + el2.numero + " no andar " + el2.andar);
		System.out.println("ExemploElevador.Elevador : " + el3.numero + " no andar " + el3.andar);
		System.out.println("ExemploElevador.Elevador : " + el4.numero + " no andar " + el4.andar);
		}
	

}

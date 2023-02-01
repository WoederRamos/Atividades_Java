package capitulo_04;
public class ExemplosCap04 {
	
public void exemplosSelecao (int valor) {

	if(valor >= 18) {
		System.out.println("Você é de maior");
	}
	else{
		System.out.println("Você é de menor");
	}
}

// Questão 3
public void exemploLacos (int valor) {
	
	int numero = 1;
	
	while(numero < 8){
		System.out.println(numero);
		numero++;
	}
	
	do {
		System.out.println(numero);
		numero++;	
	}
	while(numero < 15 );
	
	for (int i=1;i<10;i++) {
		System.out.println(i);
	}
}

//Questão 4
public void exemploSelecaoSwitch(int valor) {
	
	int nota = valor;
	String letra;
	
	switch(nota) {
	case 100:letra = "Nota A";break;
	case 90:letra = "Nota B";break;
	case 80:letra = "Nota C";break;
	case 70:letra = "Nota D";break;
	case 60:letra = "Nota E";break;
	default:letra = "Valor invalido";break;
	}
	System.out.println(letra);
}
// Questão 5: Else oscilante é o nome dado ao comportamento do compilador 
public void exemploElseOcilante(int valor) {
	
	int idadeBreno = 20;
	int idadeIvo = 15;
	
	if(idadeBreno >= 18)
		if(idadeIvo >=18)
			System.out.println("ivo e Breno são maiores");
		else
			System.out.println("Ivo é menor");
	
	int idadeirmaodeBreno = 12;
	int idadeirmaodeIvo = 25;
	
	if(idadeirmaodeBreno < 18) 
	{
		if(idadeirmaodeIvo < 18)
			System.out.println("O irmao de Breno e o irmao de Ivo são menores");
	}
	else
		System.out.println("O irmao de Breno é menor");
}

}


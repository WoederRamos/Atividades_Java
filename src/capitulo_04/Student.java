package capitulo_04;
//Questão 08: Enquanto o construtor está sendo executado, o objeto ainda não existe então não se 
//deve chamar seus métodos. O livro permite duplicação de código pois o IF está 
//aninhado.
public class Student {
	private String nome;
	private double media;

	public Student(String nome, double media) 
	{
		this.nome = nome;
		
		//Questão 10:
		this.defineMedia(media);

		/**if (media > 0.0)
			if (media <= 100.0)
				this.media = media;**/	
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	//Questão 10:
	public void setMedia(double mediaEstudante) 
	{
		this.defineMedia(mediaEstudante);
	}
	
	//Questão 10:
	private void defineMedia(double media) 
	{
		if (media > 0.0)
			if (media <= 100.0)
				this.media = media;
	}
	
	public double getDefineMedia() 
	{
		return media;
	}

	public String getLetterGrade() 
	{
		String letterGrade = "";
		if (media >= 90.0)
			letterGrade = "A";
		else if (media >= 80.0)
			letterGrade = "B";
		else if(media >= 70.0)
			letterGrade = "C";
		else if (media >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		return letterGrade;	
	}

	// Questão 11:
	public String obtemLetraNota() {
		
		String letterGrade = "";
		letterGrade = ((media >= 90.0 ) ? "A":
		(media >= 80.0 ) ? "B":
		(media >= 70.0 ) ? "C":
		(media >= 60.0 && media < 60.0 ? "D":"F"));
		
		
		return letterGrade;
	}

	//Questão 12:
	public String  toString() 
	{
		System.out.println("Nome " + this.getNome() + " a nota " + this.getLetterGrade());
		return nome;
	}

}

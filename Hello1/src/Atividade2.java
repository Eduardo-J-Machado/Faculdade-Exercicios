
public class Atividade2 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		String curso;
		String turma;
		String nome;
		String ra_cpf;
		
		curso = "ENGENHARIA DA COMPUTAÇÃO";
		turma = "7. SEMESTRE - 2021.01";
		nome = "EDUARDO JOSE MACHADO";
		ra_cpf = "365320416729";
		System.out.println("Atividade 2 - Condicional em Java - B1!");
		System.out.println("Curso:" + curso);
		System.out.println("Turma:" + turma);
		System.out.println("Nome:" + nome);
		System.out.println("Identificação RA ou CPF:" + ra_cpf);
		
		int idade = 17;
		
		if(idade < 16 && idade >= 1) {
			System.out.println("Ainda não atingiu a idade para votação\n idade = " + idade );
		}
		
		else if (idade <= 16 && idade >=1 || idade < 18 && idade >=1 ) {
			System.out.println("Votação Opcional!\nIdade = " + idade );
		}
		
		else if (idade >= 18 && idade <= 70) {
			System.out.println("Votação é Obrigatorio! \nIdade = " + idade );
		}
		
		else if (idade >= 70 && idade <=90) {
			System.out.println("Votação é Facultativo! \nIdade = " + idade );
		}
		
		else {
			System.out.println("Entre com uma idade Valida! \nIdade = " + idade );
		}
		
	}
		
}
		


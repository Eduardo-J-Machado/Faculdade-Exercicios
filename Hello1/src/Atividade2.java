
public class Atividade2 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		String curso;
		String turma;
		String nome;
		String ra_cpf;
		
		curso = "ENGENHARIA DA COMPUTA��O";
		turma = "7. SEMESTRE - 2021.01";
		nome = "EDUARDO JOSE MACHADO";
		ra_cpf = "365320416729";
		System.out.println("Atividade 2 - Condicional em Java - B1!");
		System.out.println("Curso:" + curso);
		System.out.println("Turma:" + turma);
		System.out.println("Nome:" + nome);
		System.out.println("Identifica��o RA ou CPF:" + ra_cpf);
		
		int idade = 17;
		
		if(idade < 16 && idade >= 1) {
			System.out.println("Ainda n�o atingiu a idade para vota��o\n idade = " + idade );
		}
		
		else if (idade <= 16 && idade >=1 || idade < 18 && idade >=1 ) {
			System.out.println("Vota��o Opcional!\nIdade = " + idade );
		}
		
		else if (idade >= 18 && idade <= 70) {
			System.out.println("Vota��o � Obrigatorio! \nIdade = " + idade );
		}
		
		else if (idade >= 70 && idade <=90) {
			System.out.println("Vota��o � Facultativo! \nIdade = " + idade );
		}
		
		else {
			System.out.println("Entre com uma idade Valida! \nIdade = " + idade );
		}
		
	}
		
}
		




public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente thiago = new Cliente();
		thiago.setNome("Thiago Jolvino");
		conta.setTitular(thiago);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setCpf("51014749832");
		System.out.println(conta.getTitular().getCpf());
	}
	
}

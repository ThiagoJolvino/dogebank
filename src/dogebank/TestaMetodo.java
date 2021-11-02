package dogebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoThiago = new Conta();
		contaDoThiago.saldo = 100;
		contaDoThiago.deposita(50);
		System.out.println(contaDoThiago.saldo);
		boolean conseguiuRetirar = contaDoThiago.saca(20);
		System.out.println(contaDoThiago.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(3000, contaDoThiago);
		 
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoThiago.saldo);
		
		contaDoThiago.titular = "Thiago Jolvino";
		System.out.println(contaDoThiago.titular);
		
	}
}

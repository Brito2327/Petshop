package dao;





import bean.Pedido;


public class ComprasDao {

	public double somaCompra(Pedido pedido) {

		double somaTotal = 0;

		AlimentoDao ali = new AlimentoDao();
		AcessorioDao ace = new AcessorioDao();
		SaudeDao sau = new SaudeDao();
		HigieneDao hig = new HigieneDao();
		ServicoDao serv = new ServicoDao();
		
		somaTotal+= sau.BuscarPorId(pedido.getIdSaudePedido()).getPreco();
		
		somaTotal+=ali.BuscarPorId(pedido.getIdAlimentoPedido()).getPreco();
		
		somaTotal+=ace.BuscarPorId(pedido.getIdAcessorioPedido()).getPreco();
		
		somaTotal+=hig.BuscarPorId(pedido.getIdhigienePedido()).getPreco();
		
		somaTotal+=serv.BuscarPorId(pedido.getIdServico()).getPreco();

		return somaTotal;
	}
}

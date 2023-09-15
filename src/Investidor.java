import estruturasdedados.DynamicArray;

public class Investidor {

    private int codigo;
    private String nome;
    private double saldo;
    private DynamicArray<Acao> carteira;

    public Investidor(int codigo, String nome, double saldo) {
        inicializarInvestidor(codigo, nome, saldo);
    }

    public Investidor(int codigo, String nome) {
        inicializarInvestidor(codigo, nome, 0.0);
    }

    private void inicializarInvestidor(int codigo, String nome, double saldoInicial) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldoInicial;
        this.carteira = new DynamicArray<>();
    }

    public void comprarAcao(Acao acao) {
        double valorAcao = acao.calcularValor();
        if (valorAcao > saldo) {
            throw new RuntimeException("Saldo insuficiente para a compra desta ação");
        }
        carteira.add(acao);
        saldo -= valorAcao;
    }

    public double calcularTotal() {
        double valorTotal = 0.0;
        for (Acao acao : carteira) {
            valorTotal += acao.calcularValor();
        }
        return valorTotal;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
}

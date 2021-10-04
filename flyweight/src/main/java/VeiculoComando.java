import java.util.ArrayList;

public class VeiculoComando {
    protected ArrayList<OptionVeiculo> options = new ArrayList<>();

    protected ArrayList<Integer> OpcaoPreçoVenda = new ArrayList<>();

    public void adicionarOpcoes(String nom, int preçoDaVenda, FabriqueOption fabrique)
    {
        this.options.add(fabrique.getOption(nom));
        this.OpcaoPreçoVenda.add(preçoDaVenda);
    }

    public void Opcoes() {

    }

    {
        for (int i=0;i<this.options.size();i++)
        {
            options.get(i).anexar(String.valueOf(this.OpcaoPreçoVenda.get(i)));

        }
    }

}

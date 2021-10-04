import java.util.ArrayList;

public class FabriqueOption {
    protected ArrayList<OptionVeiculo> options = new ArrayList<>();

    public OptionVeiculo getOption(String nom)
    {
        OptionVeiculo resultat = null;
        if (this.options.contains(nom))
        {
            for (int i=0;i<options.size();i++)
            {
                resultat = this.options.get(i);
            }
        }
        else{
            resultat = new OptionVeiculo(nom);
            this.options.add(resultat);
        }
        return resultat;
    }
}

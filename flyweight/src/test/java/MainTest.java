import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest<fabrique> {
    FabriqueOption fabrique = new FabriqueOption();
    VeiculoComando veiculo = new VeiculoComando();
    veiculo.adicionarOpcoes("air bag",80,fabrique);
    veiculo.adicionarOpcoes("Direcao",90,fabrique);
    veiculo.adicionarOpcoes("Vidro eletrico",85,fabrique);
    veiculo.Opcoes();

}
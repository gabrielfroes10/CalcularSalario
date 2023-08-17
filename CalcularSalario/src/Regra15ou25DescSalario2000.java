
    public class Regra15ou25DescSalario2000 implements RegraCalculo {

        @Override
        public double calcular(Funcionario funcionario) {
            return funcionario.getSalario() > 2000 ? funcionario.getSalario() * 0.75 : funcionario.getSalario() * 0.85;
        }
}

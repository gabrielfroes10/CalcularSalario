
    public class Regra10ou20DescSalario3000 implements RegraCalculo {

        @Override
        public double calcular(Funcionario funcionario) {
            return funcionario.getSalario() > 3000 ? funcionario.getSalario() * 0.8 : funcionario.getSalario() * 0.9;
        }
}

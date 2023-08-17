public class CalcularSalario {

        public double calculaSalario(Funcionario funcionario) {
            return funcionario.getCargo().getRegraCalculo().calcular(funcionario);
        }
}

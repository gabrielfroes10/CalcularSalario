

    public enum Cargos {
        DESENVOLVEDOR(new Regra10ou20DescSalario3000()),
        DBA(new Regra15ou25DescSalario2000()),
        TESTER(new Regra15ou25DescSalario2000());

        private RegraCalculo regraCalculo;

        Cargos(RegraCalculo regraCalculo) {
            this.regraCalculo = regraCalculo;
        }

        public RegraCalculo getRegraCalculo() {
            return this.regraCalculo;
        }
}

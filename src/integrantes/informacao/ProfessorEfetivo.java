package integrantes.informacao;

public class ProfessorEfetivo extends Funcionario implements Tratamento{
    private String nome;
    private String telefone;
    private String email;
    private String dataContrat;
    private Regime regime;
    public ProfessorEfetivo(String nome,
                            String telefone,
                            String email,
                            String dataContrat,
                            Regime regime,
                            String departamento,boolean sexo) {
        super(nome, telefone, email, departamento, sexo);
        this.dataContrat = dataContrat;
        this.regime = regime;
    }

    public String getTratamento(){
        if (sexo){
            return "Profa Efetiva "+getNome();
        }else return "Prof Efetivo"+getNome();
    }
    public double getSalario(){
        return regime.getSalario();
    }
    @Override
    public String toString(){
        String desc = getTratamento()+
                " - Telefone: " + telefone +
                "\n(" + email + ")\nDepartamento de " + departamento +"\n" +
                "Salario:R$" + regime.getSalario() + "\nContratado em " + dataContrat;
        return desc;
    }
}

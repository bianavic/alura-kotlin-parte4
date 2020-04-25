
class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){ // delegamos o valor para a mae/pai porque é ela que iniciara as properties

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
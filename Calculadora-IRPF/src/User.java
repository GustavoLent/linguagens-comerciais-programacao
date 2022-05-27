import java.util.Scanner;

public class User {
    private float valorHora;
    private int horasTrabalhadasPorSemana;
    private float salario;

    public User() {
    }

    public User(float valorHora, int horasTrabalhadasPorSemana) {
        this.valorHora = valorHora;
        this.horasTrabalhadasPorSemana = horasTrabalhadasPorSemana;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valor) {
        this.valorHora = valor;
    }

    public int getHorasTrabalhadasPorSemana() {
        return horasTrabalhadasPorSemana;
    }

    public void setHorasTrabalhadasPorSemana(int valor) {
        this.horasTrabalhadasPorSemana = valor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void preencher(Scanner scan) {
        System.out.print("Valor-Hora: ");
        float _valorHora = scan.nextFloat();
        this.setValorHora(_valorHora);

        System.out.print("Horas trabalhadas semanalmente: ");
        int _horasTrabalhadas = scan.nextInt();
        this.setHorasTrabalhadasPorSemana(_horasTrabalhadas);

        float _salario = (_valorHora * (float) _horasTrabalhadas) * 4;
        this.setSalario(_salario);

        return;
    }

    public void calcularDesconto() {
        if (this.salario >= 1903.99 && this.salario <= 2826.65) {

        }
    }

}
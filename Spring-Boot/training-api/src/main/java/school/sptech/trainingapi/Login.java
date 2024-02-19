package school.sptech.trainingapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Login {
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private boolean isAdm;

    public Login() {}

    public Login(String nome, String dataNascimento, String email, String senha, boolean isAdm) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.isAdm = isAdm;
    }

    public int getIdade() throws ParseException {
        LocalDate dataNascimentoFormatada = LocalDate.parse(this.dataNascimento);

        return Period.between(dataNascimentoFormatada, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() {
        return isAdm;
    }

    public void setAdm(boolean adm) {
        isAdm = adm;
    }
}

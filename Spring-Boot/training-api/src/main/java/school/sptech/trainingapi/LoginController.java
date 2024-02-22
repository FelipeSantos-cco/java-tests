package school.sptech.trainingapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/logins")
public class LoginController {
    List<Login> logins = new ArrayList<Login>();

    public LoginController() {
        logins.add(new Login(
                "Felipe Santos",
                "2004-01-22",
                "felipe@gmail.com",
                "senha123",
                true
        ));
        logins.add(new Login(
                "Bruna Santana",
                "2005-05-20",
                "bruna@gmail.com",
                "123senha",
                false
        ));
    }

    @GetMapping("/listar/{email}/{senha}")
    public List<Login> listar(@PathVariable String email, @PathVariable String senha){
        if(isLoginValido(email, senha)){
            Login login = retornaLogin(email, senha);

            if(login.isAdm()){
                return logins;
            } else{
                List<Login> retornoLogin = new ArrayList<>();
                retornoLogin.add(login);
                return retornoLogin;
            }

        }
        return null;
    }


    private boolean isLoginValido(String email, String senha){
        for (Login login : logins) {
            if(login.getEmail().equals(email) && login.getSenha().equals(senha)){
                return true;
            }
        }

        return false;
    }

    private Login retornaLogin(String email, String senha){
        for (Login login : logins) {
            if(isLoginValido(email, senha)){
                return login;
            }
        }

        return null;
    }

}

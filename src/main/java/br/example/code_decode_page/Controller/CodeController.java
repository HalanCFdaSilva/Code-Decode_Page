package br.example.code_decode_page.Controller;

import br.example.code_decode_page.DadosCodificaTexto;
import br.example.code_decode_page.Texto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/code")
public class CodeController {

    Texto texto;

    @GetMapping
    public String textoCodificado(DadosCodificaTexto dados) {


        if (texto != null){
            System.out.println(texto.getTextoAConverter());
        }else{
            System.out.println("get");
        }

        return "code/index";
    }

    @PostMapping
    public String cadastraFilme(DadosCodificaTexto dados) {
       this.texto = new Texto(dados);

        System.out.println(texto + ": texto criado");

        return "redirect:/code";
    }


}

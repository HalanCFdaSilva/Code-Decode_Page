package br.example.code_decode_page.Controller;

import br.example.code_decode_page.DadosCodificaTexto;
import br.example.code_decode_page.codificador.Codificador;
import br.example.code_decode_page.domain.Texto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/code")
public class CodeController {

    Texto texto;

    @GetMapping
    public String textoCodificado(Model model) {


        if (texto != null){
            Codificador codificador = new Codificador();
            codificador.codificarTexto(texto);
            model.addAttribute("texto",texto);
        }else{
            this.texto = new Texto();
            model.addAttribute("texto",texto);
        }

        return "code/index";
    }

    @PostMapping
    public String cadastraFilme(DadosCodificaTexto dados) {
       this.texto = new Texto(dados);


        return "redirect:/code";
    }


}

package br.gabtp1.gab2demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {


    @GetMapping("/adicao")
    public float realizarAdicao(@RequestParam String numero, @RequestParam String outroNumero){
        System.out.println(numero);
        float resultado = Float.parseFloat(numero)+ Float.parseFloat(outroNumero);
        return resultado;
    }

    @PostMapping("/subtracao")
    public float subtrair(@RequestBody  SubtraiDto dto ){
        return Float.parseFloat(dto.minuendo)-Float.parseFloat(dto.subtraendo);
    }

    @GetMapping("/multiplicacao")
    public float multiplicar(@RequestParam String numero, @RequestParam String outroNumero){
        return Float.parseFloat(numero)* Float.parseFloat(outroNumero);
    }

    @GetMapping("/divisao")
    public float dividir(@RequestParam String numero, @RequestParam String outroNumero){
        return Float.parseFloat(numero)/ Float.parseFloat(outroNumero);
    }


    @GetMapping("/exponenciacao")
    public float exponenciar(@RequestParam String numero, @RequestParam String outroNumero){
        float potencia= Float.parseFloat(numero);
        float exponencial= Float.parseFloat(outroNumero);
        float resultado = potencia;
        for (int i = 1; i < exponencial; i++) {
            resultado = resultado*potencia;
        }
        return resultado;
    }

}

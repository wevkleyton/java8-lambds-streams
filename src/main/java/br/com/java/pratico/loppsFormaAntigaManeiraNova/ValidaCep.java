package br.com.java.pratico.loppsFormaAntigaManeiraNova;

public class ValidaCep {

    public static void main(String[] args) {
        Validador<String> validador =valor -> valor.matches("[0-9]{5}-[0-9]{3}");
        System.out.println(validador.valida("04101-300"));
    }
}

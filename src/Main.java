public class Main {
    public static void main(String[] args) {

        String string1 = "exemplo";
        String string2 = "lopez";

        boolean resultado = VerificadorStrings.verificarStrings(string1, string2);

        if (resultado) {
            System.out.println("Os dois últimos caracteres de \"" + string1 + "\" são iguais aos dois primeiros de \"" + string2 + "\".");
        } else {
            System.out.println("Os dois últimos caracteres de \"" + string1 + "\" não são iguais aos dois primeiros de \"" + string2 + "\".");
        }
    }
}
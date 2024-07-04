public class VerificadorStrings {

    // Método para verificar se os dois últimos caracteres de uma string são iguais aos dois primeiros de outra string
    public static boolean verificarStrings(String str1, String str2) {
        if (str1.length() < 2 || str2.length() < 2) {
            return false; // As strings devem ter pelo menos 2 caracteres
        }

        String ultimosDoisCaracteres = str1.substring(str1.length() - 2);
        String primeirosDoisCaracteres = str2.substring(0, 2);

        return ultimosDoisCaracteres.equals(primeirosDoisCaracteres);
    }
}


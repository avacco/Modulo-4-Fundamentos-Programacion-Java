public class Recetas {

    public static void main(String[] args){
        // es recomendado que las variables tengan el siguiente formato: nombreVariable
        String ingredientePrincipal = args[0];

        switch(ingredientePrincipal) {
            case "tomate":
                System.out.println("Picar tomate, sal y aceite.");
                break;
            case "huevo":
                System.out.println("En una sarten poner un huevo a freir.");
                break;
            default:
                System.out.println("Abrir lata de atun, picar cebolla y limon.");
        }

    }
}

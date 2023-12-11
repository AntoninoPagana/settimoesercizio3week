public class Main {
    public static void main(String[] args) {
        String stringa1 = "Develhope";
        String stringa2 = "Develhope";
        comparaStringhe(stringa1, stringa2);
}
    public static void comparaStringhe(String stringa1, String stringa2){
        StringBuilder risultato = new StringBuilder("Le due stringhe sono ");
        if(stringa1.equals(stringa2)){
            risultato.append("uguali");
            System.out.println("Risultato: " + risultato);
        } else {
            risultato.append("diverse");
            System.out.println("Risultato: " + risultato);
        }
    }
}

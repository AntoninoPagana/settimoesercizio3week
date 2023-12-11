public class Main {
    public static void main(String[] args) {
        String stringa1 = "Develhopeeeeeee";
        String stringa2 = "Develhope";
        comparaStringhe(stringa1, stringa2);
}
    public static void comparaStringhe(String stringa1, String stringa2){
        if(stringa1.equals(stringa2)){
            StringBuilder risultato1 = new StringBuilder("Le due stringhe sono ");
            risultato1.append("uguali");
            System.out.println("Risultato: " + risultato1);
        } else {
            StringBuilder risultato2 = new StringBuilder("Le due stringhe sono ");
            risultato2.append("diverse");
            System.out.println("Risultato: " + risultato2);
        }
    }
}

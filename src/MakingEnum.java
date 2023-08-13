enum Try{
    Sunday, monday, tuesday, wednesday, thutrsday, friday, saturday;


}


public class MakingEnum {
    public static void main(String[] args) {
        Try[] t = Try.values();
        for (Try me : t){
            System.out.println(me);
        }


    }
}

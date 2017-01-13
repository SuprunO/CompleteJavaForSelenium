import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by alex on 13.01.2017.
 */
public class Mail {
    public static void main(String[] args) {
        String a = "Dear";
        String [] labelName = new String[20];
        labelName[0]="Maximum Rock & Roll";
        labelName[1]="Sierpien Records";
        labelName[2]="Mass Media";
        labelName[3]="Maximum Rock & Roll";
        String b ="We are goth punk / post - punk band Predsmernaja Kadril from Ukraine. We are looking for Label which will be interested in our tracks release. \n" +

                "You can listen our 6 tracks album following the link:\n" +
                "https://predsmertnajakadril.bandcamp.com\n" +
                "\n" +
                "Contact us via Facebook:\n" +
                "https://www.facebook.com/predsmertnajakadril/\n" +
                "\n" +
                "Awaiting your response, \n" +
                "Best regards, Igor";

        for (int i = 0; i < 4; i++){
            System.out.println(a+" "+labelName[i]+"\n"+ b);
            System.out.println("----------------------------------");
            System.out.println(" ");
        }


    }
}


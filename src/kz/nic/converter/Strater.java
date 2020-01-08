package kz.nic.converter;


import java.io.*;

/**
 *
 * @author admin
 */
public class Strater {

    public final static String DEFAULT_ENCODING = "UTF-8";
    
    /**
     *
     */
    public static void usege() {
        System.out.println("Convert kazakh cyrilic text to kazakh latin text");
        System.out.println("Util usage:");
        System.out.println("param1: input file");
        System.out.println("param2: output file");
        System.out.println("param3: encoding(optional)");
    }

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        if (args.length < 2 || args.length > 3) {
            usege();
            return;
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];
        String fileEncoding = args.length == 2 ? DEFAULT_ENCODING : args[2];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath), fileEncoding));
                Writer writer = new OutputStreamWriter(new FileOutputStream(new File(outputFilePath)), fileEncoding)) {

            KazakhLatinConverter converter = new KazakhLatinConverter();
            
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                String convertedLine = converter.convert(line);
                result.append(convertedLine);
                result.append(System.getProperty("line.separator"));
            }
            writer.write(result.toString());
            writer.flush();
        }

    }
}

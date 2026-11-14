package ode05.networking.streamio;

import java.io.*;

/**
* POKEDEX Erweiterung
*
 *  */



public class Streamio {
        private static final String END_OF_TEXT = "exit";
    public static void main(String[] args) {
        fileInfo();
        echoFromSystem();


    }

    private static void echoFromSystem() {
       File inputsFromConsole = new File("src/main/java/ode05/networking/streamio/systemOut.txt");

        String input = "";

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputsFromConsole))) {
            while (true){
                if(!END_OF_TEXT.equals(input)){
                    break;
                }
                input = bufferedReader.readLine();
                bufferedWriter.write(input + "\n");
            }
        } catch (IOException e) {
            System.out.println("Echo function did not work");
        }
    }

    private static void fileInfo() {
        File reposetoryRoot = new File("");
        System.out.println("respsitoryRoot = " + reposetoryRoot.getAbsolutePath());

        File sourceDirectory = new File("src");
        System.out.println("src =" + sourceDirectory.getAbsolutePath());
        System.out.println("src =" + sourceDirectory.isDirectory());

        File thisFile = new File("./Streamio.java");
        System.out.println("src =" + thisFile.getAbsolutePath());
    }

}

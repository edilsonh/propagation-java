import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class OneLine {
  public String findFile(String s) throws FileNotFoundException{
    return readFile(s);
  }

  public String readFile(String s) throws FileNotFoundException{
    File f = new File(s);
    Scanner scn = new Scanner(f);
    return scn.nextLine();
  }

  public static void main(String[] args){
    try{
      OneLine x = new OneLine();
      String fl = x.findFile("ffile.txt");
      System.out.println("Found the file, here are the contents:");
      System.out.println(fl);
    } catch(FileNotFoundException e){
      System.out.println("Looks like the file is not here or is misspelled buddy!");
    }
  }
}

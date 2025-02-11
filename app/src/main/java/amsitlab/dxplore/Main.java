package amsitlab.dxplore;

import jadx.api.JadxArgs;
import jadx.api.JadxDecompiler;
import java.io.File;

public class Main {

   public static void main(String[] args) {
      JadxArgs jadxArgs = new JadxArgs();
      jadxArgs.setInputFile(new File(args[0]));
      jadxArgs.setOutDir(new File(args[1]));
      try (JadxDecompiler jadx = new JadxDecompiler(jadxArgs)) {
         jadx.load();
         jadx.save();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

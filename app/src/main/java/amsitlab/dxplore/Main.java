package amsitlab.dxplore;

import jadx.api.JadxArgs;
import jadx.api.JadxDecompiler;

public class Main {

   public static void main(String[] args) {
      JadxArgs jadxArgs = new JadxArgs();
      jadxArgs.setInputFile(new File("classes.dex"));
      jadxArgs.setOutDir(new File("output"));
      try (JadxDecompiler jadx = new JadxDecompiler(jadxArgs)) {
         jadx.load();
         jadx.save();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

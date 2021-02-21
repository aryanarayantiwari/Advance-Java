import java.awt.*;
class Getfonts{
    public static void main(String[] args){
String Allfonts[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
for(int i=0;i<Allfonts.length;i++){
    System.out.println(Allfonts[i]);
}
}
}
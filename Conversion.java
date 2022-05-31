
public class Conversion
{
    public static void main(String []args){
        System.out.println(hexadecimalADecimal("FFAABB"));
    }

    public static void Hxd_Dec(String m){

    }

    public static void Validacion(String m){
        m.toUpperCase();
        int []p=new int [m.length()];
        for(int i=0;i<=m.length()-1;i++){
            if(Character.toString(m.charAt(i)).equalsIgnoreCase("A")){
                p[i]=10;
            }
            if(Character.toString(m.charAt(i)).equalsIgnoreCase("B")){
                p[i]=11;
            }
            if(Character.toString(m.charAt(i)).equalsIgnoreCase("C")){
                p[i]=12;
            }
            if(Character.toString(m.charAt(i)).equalsIgnoreCase("D")){
                p[i]=13;
            }
            if(Character.toString(m.charAt(i)).equalsIgnoreCase("E")){
                p[i]=14;
            }
            if(Character.toString(m.charAt(i)).equalsIgnoreCase("F")){
                p[i]=15;
            }
            if(Integer.parseInt(Character.toString(m.charAt(i)))>=0 && Integer.parseInt(Character.toString(m.charAt(i)))<=9 ){

            }
        }
    }

    public static int hexadecimalADecimal(String s) {
        String digitos = "0123456789ABCDEF";
        s = s.toUpperCase();
        int decimal = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digitos.indexOf(c);
            decimal = 16*decimal + d;
        }
        return decimal;
    }
}

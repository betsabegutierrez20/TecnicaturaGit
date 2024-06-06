public class tipoPrim {
    
    public static void main(String[] args) {
  
        //TIPOS PRIMITIVOS parte 1
   
        final byte numEnteroByte = (byte)129;
        System.out.println("numeroBytes = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: "+ Byte.MAX_VALUE);
        
        short numEnteroShort= -32768;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
   
        int numEnteroInt = (int)2147483647L;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);
   
       long numEnteroLong = 9223372036854775807L;
       System.out.println("numEnteroLong =" + numEnteroLong);
       System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
       System.out.println("Valor minimo del long: " + Long.MAX_VALUE);
       
   
       //Tipos flotante
       float numFloat = 3.4028235E38F;
       System.out.println("numEntero = " + numFloat);
       System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
       System.out.println("Valor maximo de float: " + Float.MAX_VALUE);
   
       //Tipo double (este es el mayor rango dentro de java)
       double numDouble = 1.7976931348623157E308D;
       System.out.println("numDouble " + numDouble);
       System.out.println("Valor maximo de double: " + Double.MIN_VALUE);
       System.out.println("Valor maximo deldouble:  " + Double.MAX_VALUE);
    }
    
}

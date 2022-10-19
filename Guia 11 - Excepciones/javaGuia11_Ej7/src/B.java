/*
Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
 */

public class B {

    
    public static void main(String[] args) {
        
        public void metodoB() {
            sentencia_b1
            try 
            {
                sentencia_b2
            } 
            catch (MioException e)
            {
                sentencia_b3
            }
            finally
            {
               sentencia_b4
            }
           }
    }
    
}

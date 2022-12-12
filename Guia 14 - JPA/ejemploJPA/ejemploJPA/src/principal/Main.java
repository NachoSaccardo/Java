package principal;

        //jdbc:mysql://localhost:3306/pruebajpa?useSS
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        try
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejemploJPAPU");
            EntityManager em = emf.createEntityManager();
                
            try
            {
                Fabricante fabricante1 = new Fabricante();
                fabricante1.setId(UUID.randomUUID().toString());
                fabricante1.setNombre("ASUS");
                fabricante1.setCodigo(1);
                
                em.getTransaction().begin();
                em.persist(fabricante1);
                em.getTransaction().commit();
                
            }
            catch(Exception e)
            {
                System.out.println("UPS");
            }
        }
        catch(Exception ex)
            {
                System.out.println("UPS");
            }
        }
    }
    

package src.hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import src.entities.AlmacenamientoEntity;
import src.entities.ClienteEntity;
import src.entities.CuentaCorrienteEntity;
import src.entities.EmpleadoEntity;
import src.entities.EtapaProductivaEntity;
import src.entities.FacturaEntity;
import src.entities.ItemOCMPEntity;
import src.entities.ItemsPedidoEntity;
import src.entities.ItemsPedidoIDEntity;
import src.entities.LoteEntity;
import src.entities.MaterialEntity;
import src.entities.MaterialPorPrendaEntity;
import src.entities.NotaDeCredito;
import src.entities.OrdenCMPEntity;
import src.entities.OrdenDeProduccionEntity;
import src.entities.PedidoEntity;
import src.entities.PrendaEntity;
import src.entities.PrendaVentaEntity;
import src.entities.RemitoEntity;
import src.entities.StockEntity;
import src.entities.SucursalEntity;

public class HibernateUtil
{
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
        	 AnnotationConfiguration config = new AnnotationConfiguration();
        	 config.addAnnotatedClass(SucursalEntity.class);
        	 config.addAnnotatedClass(EmpleadoEntity.class);
        	 config.addAnnotatedClass(ClienteEntity.class);
        	 config.addAnnotatedClass(CuentaCorrienteEntity.class);
        	 config.addAnnotatedClass(PedidoEntity.class);
        	 config.addAnnotatedClass(ItemsPedidoIDEntity.class);
        	 config.addAnnotatedClass(ItemsPedidoEntity.class);
        	 config.addAnnotatedClass(PrendaEntity.class);
        	 config.addAnnotatedClass(NotaDeCredito.class);
        	 config.addAnnotatedClass(MaterialPorPrendaEntity.class);
        	 config.addAnnotatedClass(MaterialEntity.class);
        	 config.addAnnotatedClass(ItemOCMPEntity.class);
        	 config.addAnnotatedClass(OrdenCMPEntity.class);
        	 config.addAnnotatedClass(OrdenDeProduccionEntity.class);
        	 config.addAnnotatedClass(LoteEntity.class);
        	 config.addAnnotatedClass(AlmacenamientoEntity.class);
        	 config.addAnnotatedClass(FacturaEntity.class);
        	 config.addAnnotatedClass(RemitoEntity.class);
        	 config.addAnnotatedClass(PrendaVentaEntity.class);
        	 config.addAnnotatedClass(StockEntity.class);
        	 config.addAnnotatedClass(EtapaProductivaEntity.class);
             sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
  
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}

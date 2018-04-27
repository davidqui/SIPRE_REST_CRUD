/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsrest;

import entidades.AgenteEspecificoProduceLesion;
import entidades.AgenteProduceLesion;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Admin
 */
@Path("Crear")
public class Crear {

    private static final Logger LOG = Logger.getLogger(Crear.class.getName());

    @PersistenceContext(unitName = "SIPRE_REST_CRUDPU")
    private EntityManager em;

    @PUT
    @Path("crearAgenteEspecificoProduceLesion")
    @Produces(MediaType.APPLICATION_JSON)
    public String crearAgenteEspecificoProduceLesion(@PathParam("idAgenteProduceLesion") BigDecimal idAgenteProduceLesion, @PathParam("descripcion") String descripcion,
            @PathParam("idAgenteProduceLesion1") BigDecimal idAgenteProduceLesion1) {

        LOG.log(Level.INFO, "Entrando CrearAgenteEspecificoProduceLesion");

        boolean respuesta = true;
        try {
            AgenteEspecificoProduceLesion agenEspeProle = new AgenteEspecificoProduceLesion();
            agenEspeProle.setIdAgenteProduceLesion(idAgenteProduceLesion);
            agenEspeProle.setDescripcion(descripcion);
            agenEspeProle.setIdAgenteProduceLesion(idAgenteProduceLesion);
            em.persist(agenEspeProle);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error " + e);
            respuesta = false;

        }
        LOG.log(Level.INFO, "Salida crearAgenteEspecificoProduceLesion");
        return "" + respuesta;

    }
    
    
    
    @PUT
    @Path("crearAgenteProduceLesion")
    @Produces(MediaType.APPLICATION_JSON)
    public String crearAgenteProduceLesion(@PathParam("idAgenteProduceLesion") BigDecimal idAgenteProduceLesion, @PathParam("descripcion") String descripcion){
       
         LOG.log(Level.INFO, "Entrando crearAgenteProduceLesion");
        
        boolean respuesta = true;
        try {
            AgenteProduceLesion agenteprole=new AgenteProduceLesion();
            agenteprole.setIdAgenteProduceLesion(idAgenteProduceLesion);
            agenteprole.setDescripcion(descripcion);
            em.persist(agenteprole);
        }catch (Exception e) {
            LOG.log(Level.SEVERE, "Error " + e);
            respuesta = false;

        }
        LOG.log(Level.INFO, "Salida crearAgenteProduceLesion");
        
        
        return "";
    }


    


}

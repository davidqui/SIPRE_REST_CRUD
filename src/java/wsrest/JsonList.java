/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsrest;

import java.io.StringWriter;
import java.io.Writer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import static wsrest.Conexion.openCon;

/**
 *
 * @author Admin
 */

@Path("li")
public class JsonList {
    
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response JSONData() throws Exception {

        JsonObjectBuilder dataIdentifier = Json.createObjectBuilder();
        JsonArrayBuilder dataId = Json.createArrayBuilder();
        JsonArrayBuilder dataName = Json.createArrayBuilder();
        JsonArrayBuilder JSONcontent = Json.createArrayBuilder();

        String jsonString = "";
        Statement stm = openCon().createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM LISTCAT");
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("HaciendaJAXRSPU");
//            EntityManager em = emf.createEntityManager();
//            Query query= em.createNamedQuery("SELECT * FROM LISTCAT");
            
        while (rs.next()) {
            Integer num = rs.getInt("ID_LISTCAT");
            PreparedStatement stm2 = openCon().prepareStatement("SELECT * FROM LISTITEM WHERE ID_LISTCAT = ?");
            stm2.setInt(1, num);
            ResultSet rs2 = stm2.executeQuery();

            while (rs2.next()) {
                if (rs2.getInt("ID_LISTCAT") > 0) {
                    dataId.add(rs2.getInt("ID_LISTCAT"));
                } else {
                    dataId.add(0);
                }
                if (rs2.getString("NAMEITEM") != null) {
                    dataName.add(rs2.getString("NAMEITEM"));
                } else {
                    dataId.add("No definido");
                }
            }

            JSONcontent.add(dataId);
            JSONcontent.add(dataName);

            dataIdentifier.add(rs.getString("IDENTIFIER"), JSONcontent);
        }

        JsonObject jsonObject = dataIdentifier.build();
        try (Writer writer = new StringWriter()) {
            Json.createWriter(writer).write(jsonObject);
            jsonString = writer.toString();
        }
        return Response.ok(jsonString).header("Access-Control-Allow-Origin", "*").build();
    }
    
}

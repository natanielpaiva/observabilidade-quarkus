package observabilidade.exemplo;

import org.jboss.logging.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/exemplo")
public class MinhaController {

    private static final Logger LOG = Logger.getLogger(MinhaController.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getExemplo(@QueryParam("id") String id) throws Exception {
        LOG.info("exemplo");

        if(id == null)
        {
            throw new MinhaExcecao("Esse parametro nao pode ser nulo");
        }

        if(id.equals("1"))
        {
            throw new Exception("Exemplo de erro nao tratado");
        }

        try
        {
            Integer.parseInt(id);
        }
        catch(NumberFormatException e)
        {
            throw new MinhaExcecao("Isso nao é um número !!");
        }

        return Response.ok().entity("Passou um id " + id + " correto !!").build();


    }
}
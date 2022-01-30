package observabilidade.exemplo;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyApplicationExceptionHandler  implements ExceptionMapper<MinhaExcecao> {

    @Override
    public Response toResponse(MinhaExcecao exception) {
        return Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build();
    }
}

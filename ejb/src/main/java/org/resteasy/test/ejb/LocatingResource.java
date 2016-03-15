package org.resteasy.test.ejb;

//import javax.ejb.Local;
import javax.ws.rs.Path;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
//@Local
@Path("/")
public interface LocatingResource
{
   @Path("locating")
   SimpleResource getLocating();
}

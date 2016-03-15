package org.resteasy.test.ejb;

import javax.ejb.EJB;
//import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
@Stateless
//@Local(LocatingResource.class)
public class LocatingResourceBean implements LocatingResource
{
   @EJB
   SimpleResource simple;

//   @EJB
//   SimpleResourceBean simple;

   public SimpleResource getLocating()
   {
      return simple;
   }
}

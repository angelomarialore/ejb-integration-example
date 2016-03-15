package org.resteasy.test.ejb;

import javax.ejb.EJB;
//import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
@Stateless
//@Local(SimpleResource.class)
public class SimpleResourceBean implements SimpleResource
{
   //EJB without interface, called without esplicit lookup  chiarire
   //EJBs utilizzabili x gestire eventuale transazioni. Con interfaccia, disaccoppiamento da classe implementativa
   // ed eventuale chiamata remota, in cluster (evitare)
   // oppure, composizione di diversi ejb con transazionalità gestita dal wrapper, secondo specifiche ejb
   @EJB
   OtherResourceBean otherResourceBean;

   public String getBasic()
   {
      System.out.println("getBasic()");
//      return "basic";
      return otherResourceBean.getBasic();
   }

   public void putBasic(String body)
   {
      System.out.println(body);
   }

   public String getQueryParam(String param)
   {
      return param;
   }

   public String getMatrixParam(String param)
   {
      return param;
   }

   public int getUriParam(int param)
   {
      return param;
   }

}

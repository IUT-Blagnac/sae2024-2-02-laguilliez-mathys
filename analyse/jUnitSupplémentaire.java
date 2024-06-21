package iut.sae.algo;

import org.junit.Test;




import junit.framework.TestCase;


public class AlgoTest extends TestCase {

   
   @Test
   public void testUnRLERLE() {
      try {
         assertEquals("abc", Algo.unRLE(Algo.RLE("abc")));
         assertEquals("aabbcc", Algo.unRLE(Algo.RLE("aabbcc")));
         assertEquals("", Algo.unRLE(Algo.RLE("")));
     } catch (Exception e) {
         fail("Exception inatendue");
      }
   }


   @Test
   public void testPerf() {
      try {
         assertEquals("abc", Algo.unRLE(Algo.RLE("abc",40),40));
      } catch (Exception e) {
         fail("Exception inatendue");
      }
   }
}
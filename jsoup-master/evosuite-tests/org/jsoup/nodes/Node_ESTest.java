/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:06:47 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedWriter;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.select.NodeFilter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Node_ESTest extends Node_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = new Document("name");
      Document document1 = document0.clone();
      document1.hasSameValue(document0);
      assertNotSame(document1, document0);
      assertEquals(0, document1.siblingIndex());
      assertFalse(document1.hasParent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Document.createShell("org.jsoup.nodes.Node$OuterHtmlVisitor");
      boolean boolean0 = document0.hasSameValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = new Document("7kmTof");
      boolean boolean0 = document0.hasSameValue(document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "}");
      boolean boolean0 = textNode0.hasSameValue("SYSTEM");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = new Document("");
      Element element0 = document0.clone();
      boolean boolean0 = element0.equals(document0);
      assertFalse(boolean0);
      assertFalse(element0.hasParent());
      assertEquals(0, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Document.createShell("6IM!<gF~o\"'fzUS");
      document0.prependChild(document0);
      Node node0 = document0.previousSibling();
      assertNull(node0);
      assertEquals(0, document0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Document.createShell("#text");
      Node node0 = document0.previousSibling();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = Document.createShell("6IM!<gF~o\"'fzUS");
      Element element0 = document0.appendElement("6IM!<gF~o\"'fzUS");
      Node node0 = element0.previousSibling();
      assertEquals(0, node0.siblingIndex());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = new Document("BI7/T%");
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) document0;
      nodeArray0[1] = (Node) document0;
      nodeArray0[2] = (Node) document0;
      DataNode dataNode0 = DataNode.createFromEncoded("clas", "org.jsoup.select.Evaluator$TagEndsWith");
      nodeArray0[3] = (Node) dataNode0;
      nodeArray0[4] = (Node) document0;
      nodeArray0[5] = (Node) document0;
      nodeArray0[6] = (Node) document0;
      nodeArray0[7] = (Node) document0;
      document0.addChildren(nodeArray0);
      document0.siblingNodes();
      assertEquals(2, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = new Document("[8;");
      List<Node> list0 = document0.siblingNodes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "?xg|$#?@J9P!", "", "", "?xg|$#?@J9P!");
      Document document0 = new Document("#text");
      // Undeclared exception!
      try { 
        document0.removeChild(documentType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Document.createShell("6IM!<gF~o\"'fzUS");
      document0.appendTo(document0);
      TextNode textNode0 = new TextNode((String) null);
      document0.replaceChild(document0, textNode0);
      assertFalse(document0.hasParent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comment comment0 = new Comment("VQ|GAQ2H+Q]63(Kp9?a", "object");
      TextNode textNode0 = new TextNode("VQ|GAQ2H+Q]63(Kp9?a");
      // Undeclared exception!
      try { 
        comment0.replaceChild(textNode0, textNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = new Document("");
      document0.setParentNode(document0);
      Document document1 = document0.normalise();
      Element element0 = (Element)document1.unwrap();
      assertTrue(element0.isBlock());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Document.createShell("");
      Element element0 = document0.body();
      element0.wrap("org.jsoup.nodes.Node$OuterHtmlVisitor");
      assertEquals(0, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = Document.createShell("");
      Element element0 = document0.prependElement("Axd/*&iP ofvTKg");
      Node node0 = element0.wrap("vE'<m+f^|3+c8}) #");
      assertEquals(0, element0.siblingIndex());
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Document.createShell("'");
      List<Node> list0 = document0.childNodesCopy();
      assertEquals(1, document0.childNodeSize());
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Element element0 = new Element("abs:bo");
      element0.toggleClass("<abs:bo></abs:bo>");
      Node node0 = element0.clearAttributes();
      assertFalse(node0.hasParent());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Element element0 = new Element("abs:bo");
      String string0 = element0.absUrl("abs:bo");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Document document0 = new Document(":not");
      document0.attributes();
      String string0 = document0.attr("abs:charset");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = Document.createShell("abs:bdo");
      String string0 = document0.className();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Document document0 = new Document("body");
      Element element0 = document0.appendElement("body");
      boolean boolean0 = element0.hasParent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("\n * ", "#cdata", true);
      // Undeclared exception!
      try { 
        xmlDeclaration0.wrap("\n * ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Document document0 = new Document("7kmTof");
      Element element0 = document0.prependElement("Refer#er must notbe null");
      element0.after("abs:");
      assertEquals(2, document0.childNodeSize());
      assertEquals(0, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Document document0 = new Document("org.jsoup.nodes.Node$OuterHtmlVisitor");
      CDataNode cDataNode0 = new CDataNode("org.jsoup.nodes.Node$OuterHtmlVisitor");
      // Undeclared exception!
      try { 
        document0.replaceWith(cDataNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Document document0 = new Document("7kmTof");
      Element element0 = document0.prependText("7kmTof");
      String string0 = element0.toString();
      assertEquals(0, element0.siblingIndex());
      assertEquals("7kmTof", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Document document0 = Document.createShell("#text");
      Node node0 = document0.removeAttr("\"sji UC=?m~DBV,(Q");
      assertSame(node0, document0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document document0 = new Document("");
      // Undeclared exception!
      try { 
        document0.before("2r<_r`lz)<dRI2]{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Document document0 = new Document("7kmTof");
      Document document1 = document0.normalise();
      String string0 = document1.toString();
      assertEquals("<html>\n <head></head>\n <body></body>\n</html>", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("dk*6%", "dk*6%", "dk*6%", " ur04E", "abs:abs:bo");
      String string0 = documentType0.toString();
      assertEquals("<!DOCTYPE dk*6% dk*6% \"dk*6%\" \" ur04E\">", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("R>8<Z@");
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      try { 
        cDataNode0.html(pipedWriter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.jsoup.nodes.Node$OuterHtmlVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Document document0 = Document.createShell("");
      Element element0 = document0.body();
      assertTrue(element0.hasParent());
      assertNotNull(element0);
      
      element0.unwrap();
      assertFalse(element0.hasParent());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TextNode textNode0 = new TextNode("", "`+}/z-(3?");
      Node node0 = textNode0.shallowClone();
      assertEquals(0, node0.siblingIndex());
      assertNotNull(node0);
      assertFalse(node0.hasParent());
      assertNotSame(node0, textNode0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Document document0 = Document.createShell("#text");
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn((NodeFilter.FilterResult) null).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node0 = document0.filter(nodeFilter0);
      assertFalse(node0.hasParent());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Document document0 = new Document("#text");
      // Undeclared exception!
      try { 
        document0.after((Node) document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Document document0 = new Document("");
      document0.setBaseUri("k");
      assertEquals("k", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Document document0 = new Document("[8;");
      // Undeclared exception!
      try { 
        document0.before((Node) document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
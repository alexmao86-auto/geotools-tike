/*
 * File is generated by 'Unit Tests Generator' developed under
 * 'Web Test Tools' project at http://sf.net/projects/wttools/
 * Copyright (C) 2001 "Artur Hefczyc" <kobit@users.sourceforge.net>
 * to all 'Web Test Tools' subprojects.
 *
 * No rigths to files and no responsibility for code generated
 * by this tool are belonged to author of 'unittestsgen' utility.
 *
 */
package org.geotools.data.vpf.io;

import java.io.File;
import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.geotools.test.TestData;

//TODO TableInputStream was deprecated in 2.0.x and has been removed 
//in 2.2.x. This file needs to be updated and tests re-enabled.

/**
 * File <code>TableHeaderTest.java</code> is automaticaly generated by
 * 'unittestsgen' application. Code generator is created for java
 * sources and for 'junit' package by "Artur Hefczyc"
 * <kobit@users.sourceforge.net><br/>
 * You should fulfil test methods with proper code for testing
 * purpose. All methods where you should put your code are below and
 * their names starts with 'test'.<br/>
 * You can run unit tests in many ways, however prefered are:
 * <ul>
 *   <li>Run tests for one class only, for example for this class you
 *       can run tests with command:
 *     <pre>
 *       java -cp "jar/thisjarfile.jar;lib/junit.jar" org.geotools.vpf.TableHeaderTest
 *     </pre>
 *   </li>
 *   <li>Run tests for all classes in one command call. Code generator
 *       creates also <code>TestAll.class</code> which runs all
 *       available tests:
 *     <pre>
 *       java -cp "jar/thisjarfile.jar;lib/junit.jar" TestAll
 *     </pre>
 *   </li>
 *   <li>But the most prefered way is to run all tests from
 *     <em>Ant</em> just after compilation process finished.<br/>
 *     To do it. You need:
 *     <ol>
 *       <li>Ant package from
 *         <a href="http://jakarta.apache.org/">Ant</a>
 *       </li>
 *       <li>JUnit package from
 *         <a href="http://www.junit.org/">JUnit</a>
 *       </li>
 *       <li>Put some code in your <code>build.xml</code> file
 *         to tell Ant how to test your package. Sample code for
 *         Ant's <code>build.xml</code> you can find in created file:
 *         <code>sample-junit-build.xml</code>. And remember to have
 *         <code>junit.jar</code> in CLASSPATH <b>before</b> you run Ant.
 *         To generate reports by ant you must have <code>xalan.jar</code>
 *         in your <code>ANT_HOME/lib/</code> directory.
 *       </li>
 *     </ol>
 *   </li>
 * </ul>
 * @source $URL$
 */
public class TableHeaderTest extends TestCase
{
  /**
   * Instance of tested class.
   */
  protected TableHeader varTableHeader;

  /**
   * Public constructor for creating testing class.
   */
  public TableHeaderTest(String name) {
    super(name);
  } // end of TableHeaderTest(String name)
  /**
   * This main method is used for run tests for this class only
   * from command line.
   */
  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  } // end of main(Stringp[] args)
  /**
   * This method is called every time before particular test execution.
   * It creates new instance of tested class and it can perform some more
   * actions which are necessary for performs tests.
   */
  protected void setUp()
    throws IOException
  {
//  	File dht = TestData.file( this, "dnc13/dht" );
//    TableInputStream tis = new TableInputStream( dht.getPath() );
//    varTableHeader = (TableHeader)tis.getHeader();
//    tis.close();
  } // end of setUp()

  /**
   * Returns all tests which should be performed for testing class.
   * By default it returns only name of testing class. Instance of this
   * is then created with its constructor.
   */
  public static Test suite() {
    return new TestSuite(TableHeaderTest.class);
  } // end of suite()

  /**
   * Method for testing original source method:
   * char getByteOrder()
   * from tested class
   */
  public void XtestGetByteOrder()
  {
    assertEquals("Checking byte order detection.",
                 'L', varTableHeader.getByteOrder());
  } // end of testGetByteOrder()

  /**
   * Method for testing original source method:
   * java.util.List getColumnDefs()
   * from tested class
   */
  public void XtestGetColumnDefs()
  {
    assertEquals("Checking number of detected column definitions.",
                 20, varTableHeader.getColumnDefs().size());
  } // end of testGetColumnDefs()

  /**
   * Method for testing original source method:
   * java.lang.String getDescription()
   * from tested class
   */
  public void XtestGetDescription()
  {
    assertEquals("Cheking description detection.",
                 "Database Header Table", varTableHeader.getDescription());
  } // end of testGetDescription()

  /**
   * Method for testing original source method:
   * int getLength()
   * from tested class
   */
  public void XtestGetLength()
  {
    assertEquals("Cheking header length detection.",
                 1261, varTableHeader.getLength());
  } // end of testGetLength()

  /**
   * Method for testing original source method:
   * java.lang.String getNarrativeTable()
   * from tested class
   */
  public void XtestGetNarrativeTable()
  {
    assertNull("Cheking narrative table name detection.",
               varTableHeader.getNarrativeTable());
  } // end of testGetNarrativeTable()
  
  public void testNull() {
	  //TODO delete this when this file has been updated - prevents maven from throwing an exception
  }

} // end of TableHeaderTest

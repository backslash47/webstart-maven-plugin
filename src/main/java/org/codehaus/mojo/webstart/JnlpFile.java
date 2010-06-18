package org.codehaus.mojo.webstart;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.List;

/**
 * This class represents a &lt;jnlpFile&gt; configuration element from the
 * pom.xml file. It contains the configuration elements that are specific
 * to a single JNLP that will be generated by the webstart plugin.
 *
 * @author Kevin Stembridge
 * @since 1.0-alpha-2
 * @version $Revision$
 *
 */
public class JnlpFile
{
    
    private String outputFilename;
    
    private String templateFilename;
    
    private List jarResources;
    
    private String mainClass;

    /**
     * Creates a new uninitialized {@code JnlpFile}.
     *
     */
    public JnlpFile()
    {
        // do nothing
    }

    /**
     * Returns the name to be used for the generated JNLP file.
     * @return Returns the value of the outputFilename field.
     */
    protected String getOutputFilename()
    {
        return this.outputFilename;
    }

    /**
     * Returns the name of the Velocity template file used to generate the
     * JNLP file. 
     * 
     * @return Returns the name of the JNLP template file.
     */
    protected String getTemplateFilename()
    {
        return this.templateFilename;
    }

    /**
     * Returns the collection of <code>JarResource</code> elements for this JNLP file.
     * @return Returns the value of the jarResources field.
     */
    protected List getJarResources()
    {
        return this.jarResources;
    }

    /**
     * Returns the fully qualified classname of the class to be specified as 
     * the <code>main-class</code> in the generated JNLP file.
     * @return Returns the value of the mainClass field.
     */
    protected String getMainClass()
    {
        return this.mainClass;
    }

    /**
     * Sets the collection of <code>JarResource</code> elements for this JNLP file.
     * @param jarResources
     */
    protected void setJarResources( List jarResources )
    {
        this.jarResources = jarResources;
    }

    /**
     * Sets the outputFileName.
     * @param outputFilename
     */
    protected void setOutputFilename( String outputFilename )
    {
        this.outputFilename = outputFilename;
    }

    /**
     * Sets the fully qualified classname of the class to be specified as 
     * the <code>main-class</code> in the generated JNLP file.
     * @param mainClass 
     */
    protected void setMainClass( String mainClass )
    {
        this.mainClass = mainClass;
    }

}

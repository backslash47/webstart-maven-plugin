package org.codehaus.mojo.webstart.util;

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

import org.apache.maven.plugin.MojoExecutionException;

import java.io.File;
import java.util.Map;

/**
 * Jar helper to update entries of manifest.
 * <p/>
 * Created on 10/26/13.
 *
 * @author Tony Chemit <chemit@codelutin.com>
 * @since 1.0-beta-4
 */
public interface JarUtil
{

    /**
     * Plexus component role.
     */
    String ROLE = JarUtil.class.getName();

    void setManifestEntries( Map<String, String> entries )
        throws MojoExecutionException;

    void updateManifestEntries( File jar )
        throws MojoExecutionException;
}

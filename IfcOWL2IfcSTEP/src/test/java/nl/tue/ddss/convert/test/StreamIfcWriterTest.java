/*******************************************************************************
 * Copyright 2017 Chi Zhang
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package nl.tue.ddss.convert.test;


import java.io.IOException;

import nl.tue.ddss.convert.rdf2ifc.StreamIfcWriter;

public class StreamIfcWriterTest {

	
	public static void main(String[] args) throws IOException{
		
		final String filename = "C:/Users/Chi/Desktop/ifcspff/air-terminal-library-object.ifc.ttl";
		String out="C:/Users/Chi/Desktop/ifcspff_1/air-terminal-library-object.ifc";
//		final String filename = "C:/Users/Chi/Desktop/air-terminal-element.ttl";
//		OutputStream out=new FileOutputStream("C:/Users/Chi/Desktop/air-terminal-element.ttl.ifc");
		StreamIfcWriter w=new StreamIfcWriter();
		w.convert(filename,out);
		System.out.println("");
	}
}

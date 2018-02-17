/**
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
package com.example.newapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.datatorrent.api.DefaultInputPort;
import com.datatorrent.api.DefaultOutputPort;
import com.datatorrent.api.Context.OperatorContext;
import com.datatorrent.common.util.BaseOperator;
import com.google.common.collect.Maps;

public class OutputOperator extends BaseOperator
{
	private boolean sendPerTuple = true; 
	public transient DefaultInputPort<String> input = new DefaultInputPort<String>() {
   
    	@Override
    	public void process(String tuple)
    	{
 //     		processTuple(tuple);
		System.out.println(tuple);
		System.out.println("abc");
    	}
	};
	//public transient DefaultOutputPort<Entry<String, Long>> output = new DefaultOutputPort<Entry<String,Long>>();
}

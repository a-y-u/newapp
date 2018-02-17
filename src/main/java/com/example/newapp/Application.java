/**
 * Put your copyright and license info here.
 */
package com.example.newapp;

import org.apache.hadoop.conf.Configuration;

import com.datatorrent.api.annotation.ApplicationAnnotation;
import com.datatorrent.api.StreamingApplication;
import com.datatorrent.api.DAG;
import com.datatorrent.api.DAG.Locality;
import com.datatorrent.lib.io.ConsoleOutputOperator;

@ApplicationAnnotation(name="MyNewApp")
public class Application implements StreamingApplication
{

  @Override
  public void populateDAG(DAG dag, Configuration conf)
  {
    // Sample DAG with 2 operators
    // Replace this code with the DAG you want to build

   InputOperator operatorInput            = dag.addOperator("Input", new InputOperator());

   OutputOperator operatorOutput	 = dag.addOperator("Output", new OutputOperator());

    dag.addStream("Data", operatorInput.output, operatorOutput.input);
  }
}

/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.altus.dataeng.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import java.util.*;

/**
 * Hive specific job information. This is only ever present for HIVE jobs.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-05-15T16:32:03.781-07:00")
public class JobHiveJobDetails  {

  /**
   * The actual content of the Hive script to execute. This script can be templatized with variables of the form ${VARIABLE} that will be provided as params.
   **/
  private String script = null;

  /**
   * Parameters to be passed to the Hive script. For example: InputDir=/home/input-data or OutputDir=/output.
   **/
  private List<String> params = new ArrayList<String>();

  /**
   * XML document containing configuration for Beeline.
   **/
  private String jobXml = null;

  /**
   * Getter for script.
   **/
  @JsonProperty("script")
  public String getScript() {
    return script;
  }

  /**
   * Setter for script.
   **/
  public void setScript(String script) {
    this.script = script;
  }

  /**
   * Getter for params.
   **/
  @JsonProperty("params")
  public List<String> getParams() {
    return params;
  }

  /**
   * Setter for params.
   **/
  public void setParams(List<String> params) {
    this.params = params;
  }

  /**
   * Getter for jobXml.
   **/
  @JsonProperty("jobXml")
  public String getJobXml() {
    return jobXml;
  }

  /**
   * Setter for jobXml.
   **/
  public void setJobXml(String jobXml) {
    this.jobXml = jobXml;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobHiveJobDetails jobHiveJobDetails = (JobHiveJobDetails) o;
    if (!Objects.equals(this.script, jobHiveJobDetails.script)) {
      return false;
    }
    if (!Objects.equals(this.params, jobHiveJobDetails.params)) {
      return false;
    }
    if (!Objects.equals(this.jobXml, jobHiveJobDetails.jobXml)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, params, jobXml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobHiveJobDetails {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    jobXml: ").append(toIndentedString(jobXml)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


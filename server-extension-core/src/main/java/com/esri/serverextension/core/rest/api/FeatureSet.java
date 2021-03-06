/*
 * Copyright (c) 2017 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.​
 */

package com.esri.serverextension.core.rest.api;

import com.esri.arcgis.geometry.ISpatialReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureSet implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  objectIdFieldName; //optional
    private String globalIdFieldName; //optional
    private String displayFieldName; //optional
    private GeometryType geometryType; //for feature layers only
    private ISpatialReference spatialReference; //for feature layers only
    @JsonProperty("hasZ")
    private boolean hasZ; //optional  Default is false.
    @JsonProperty("hasM")
    private boolean hasM; //optional  Default is false.
    private Map<String, String> fieldAliases;
    private List<Field> fields;
    private List<Feature> features; //features will include geometry for feature layers only

    public FeatureSet() {

    }

    public String getObjectIdFieldName() {
        return objectIdFieldName;
    }

    public void setObjectIdFieldName(String objectIdFieldName) {
        this.objectIdFieldName = objectIdFieldName;
    }

    public String getGlobalIdFieldName() {
        return globalIdFieldName;
    }

    public void setGlobalIdFieldName(String globalIdFieldName) {
        this.globalIdFieldName = globalIdFieldName;
    }

    public String getDisplayFieldName() {
        return displayFieldName;
    }

    public void setDisplayFieldName(String displayFieldName) {
        this.displayFieldName = displayFieldName;
    }

    public GeometryType getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(GeometryType geometryType) {
        this.geometryType = geometryType;
    }

    public ISpatialReference getSpatialReference() {
        return spatialReference;
    }

    public void setSpatialReference(ISpatialReference spatialReference) {
        this.spatialReference = spatialReference;
    }

    public boolean isHasZ() {
        return hasZ;
    }

    public void setHasZ(boolean hasZ) {
        this.hasZ = hasZ;
    }

    public boolean isHasM() {
        return hasM;
    }

    public void setHasM(boolean hasM) {
        this.hasM = hasM;
    }

    public Map<String, String> getFieldAliases() {
        return fieldAliases;
    }

    public void setFieldAliases(Map<String, String> fieldAliases) {
        this.fieldAliases = fieldAliases;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

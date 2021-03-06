package org.batfish.datamodel.routing_policy.expr;

import java.io.Serializable;

import org.batfish.datamodel.routing_policy.Environment;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "class")
public abstract class AsExpr implements Serializable {

   /**
    *
    */
   private static final long serialVersionUID = 1L;

   @Override
   public abstract boolean equals(Object obj);

   public abstract int evaluate(Environment environment);

   @Override
   public abstract int hashCode();

}

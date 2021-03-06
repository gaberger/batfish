package org.batfish.datamodel.vendor_family.cisco;

import org.batfish.common.util.ComparableStructure;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoggingHost extends ComparableStructure<String> {

   /**
    *
    */
   private static final long serialVersionUID = 1L;

   @JsonCreator
   public LoggingHost(@JsonProperty(NAME_VAR) String name) {
      super(name);
   }

}

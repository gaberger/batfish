package org.batfish.representation.juniper;

import java.util.List;

import org.batfish.datamodel.Configuration;
import org.batfish.datamodel.routing_policy.statement.Statement;
import org.batfish.datamodel.routing_policy.statement.Statements;
import org.batfish.common.Warnings;

public final class PsThenNextPolicy extends PsThen {

   public static final PsThenNextPolicy INSTANCE = new PsThenNextPolicy();

   /**
    *
    */
   private static final long serialVersionUID = 1L;

   private PsThenNextPolicy() {
   }

   @Override
   public void applyTo(List<Statement> statements,
         JuniperConfiguration juniperVendorConfiguration, Configuration c,
         Warnings w) {
      statements.add(Statements.FallThrough.toStaticStatement());
   }

}

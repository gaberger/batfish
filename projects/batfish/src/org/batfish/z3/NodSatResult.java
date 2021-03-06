package org.batfish.z3;

import java.util.Map;

import org.batfish.common.BatfishLogger;
import org.batfish.common.BatfishLogger.BatfishLoggerHistory;
import org.batfish.datamodel.answers.NodSatAnswerElement;
import org.batfish.job.BatfishJobResult;

public class NodSatResult<Key>
      extends BatfishJobResult<Map<Key, Boolean>, NodSatAnswerElement> {

   private final Map<Key, Boolean> _results;

   public NodSatResult(long elapsedTime, BatfishLoggerHistory history,
         Throwable failureCause) {
      super(elapsedTime, history, failureCause);
      _results = null;
   }

   public NodSatResult(Map<Key, Boolean> results, BatfishLoggerHistory history,
         long elapsedTime) {
      super(elapsedTime, history);
      _results = results;
   }

   @Override
   public void appendHistory(BatfishLogger logger) {
      logger.append(_history);
   }

   @Override
   public void applyTo(Map<Key, Boolean> output, BatfishLogger logger,
         NodSatAnswerElement answerElement) {
      output.putAll(_results);
   }

   @Override
   public String toString() {
      if (_results == null) {
         return "<FAILED>";
      }
      else {
         int numSat = 0;
         int numUnsat = 0;
         for (Boolean result : _results.values()) {
            if (result) {
               numSat++;
            }
            else {
               numUnsat++;
            }
         }
         return "<UNSAT: " + numUnsat + ", SAT: " + numSat + ">";
      }
   }

}

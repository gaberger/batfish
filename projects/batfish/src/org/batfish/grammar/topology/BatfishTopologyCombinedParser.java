package org.batfish.grammar.topology;

import org.batfish.grammar.BatfishCombinedParser;
import org.batfish.grammar.topology.BatfishTopologyParser.TopologyContext;
import org.batfish.main.Settings;

public class BatfishTopologyCombinedParser extends
      BatfishCombinedParser<BatfishTopologyParser, BatfishTopologyLexer> {

   public static final String HEADER = getHeader();

   private static String getHeader() {
      String headerTextWithQuotes = BatfishTopologyLexer.VOCABULARY
            .getLiteralName(BatfishTopologyLexer.HEADER);
      String headerText = headerTextWithQuotes.substring(1,
            headerTextWithQuotes.length() - 1);
      return headerText;
   }

   public BatfishTopologyCombinedParser(String input, Settings settings) {
      super(BatfishTopologyParser.class, BatfishTopologyLexer.class, input,
            settings);
   }

   @Override
   public TopologyContext parse() {
      return _parser.topology();
   }

}

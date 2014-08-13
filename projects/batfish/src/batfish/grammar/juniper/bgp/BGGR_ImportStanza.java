package batfish.grammar.juniper.bgp;

import java.util.List;

import batfish.representation.juniper.BGPImportList;

public class BGGR_ImportStanza extends BG_GRStanza {
   
   BGPImportList _iList;
   
   /* ------------------------------ Constructor ----------------------------*/
   public BGGR_ImportStanza(BGPImportList i) {
      _iList = i;
      set_stanzaStatus(i.get_stanzaStatus());
   }
   
   /* ----------------------------- Other Methods ---------------------------*/
   public List<String> GetImportNames () {
      return _iList.get_policyNames();
   }
   
   /* ---------------------------- Getters/Setters --------------------------*/
   
   /* --------------------------- Inherited Methods -------------------------*/  
   @Override
   public BG_GRType getType() {
      return BG_GRType.IMPORT;
   }

}
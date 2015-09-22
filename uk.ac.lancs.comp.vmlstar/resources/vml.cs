SYNTAXDEF VMLStar
FOR <http://uk.ac.lancs.comp/vmlstar>
START VmlModel

RULES {
  VmlModel ::= features coreModel concerns+ ;
  
  FeatureModelRef ::= "import" "features" fmURI[] ;
  
  CoreModelRef ::= "import" "core" coreURI[] ;
  
  Concern ::= "concern" name[] 
              "{" 
                (subConcerns | variants | pointcuts)+ 
              "}" ;
              
  // TODO: Here, we really need some sort of reference resolution to determine 
  // the feature based on its name.
  Variant ::= "variant" feature[] "{" 
                ("onSelect" onSelect+ )? 
                ("onUnSelect" onUnSelect+ )? 
              "}";
              
  PointCutReference ::= "pc" "(" pc[] ")" ;
  
  PointCut ::= "pointcut" name[] "{" pce "}";
  
  PCEAndOperator ::= "and" "(" operands ("," operands)+ ")" ;
  
  PCEOrOperator ::= "or" "(" operands ("," operands)+ ")" ;
}
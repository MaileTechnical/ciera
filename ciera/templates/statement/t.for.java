.if ( "" != oal )
${indent}// ${oal}
.end if
${indent}for ( Iterator<${iterator_type}> _${self.iterator_name}_iter = ${iterable_expr}.iterator(); _${self.iterator_name}_iter.hasNext(); ) ${control_block}\

T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(type_name);
T_b(" ");
T_b(self->name);
T_b("() throws XtumlException {");
T_b("\n");
T_b("        ");
T_b(type_name);
T_b(" ");
T_b(T_l(type_name));
T_b(" = new ");
T_b(type_name);
T_b("Impl();");
T_b("\n");
T_b("        ");
T_b("for ( ");
T_b(self->selector_class_name);
T_b(" ");
T_b(T_l(self->selector_class_name));
T_b(" : this ) ");
T_b(T_l(type_name));
T_b(".add");
if ( multiplicity_many ) {
T_b("All");
}
T_b("( ");
T_b(T_l(self->selector_class_name));
T_b(".");
T_b(self->selector_name);
T_b("() );");
T_b("\n");
T_b("        ");
T_b("return ");
T_b(T_l(type_name));
T_b(";");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");

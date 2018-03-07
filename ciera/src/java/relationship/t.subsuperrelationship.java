T_b("    ");
T_b("private class ");
T_b(self->name);
T_b(" extends ");
T_b(extends);
T_b(" {");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("        ");
T_b("private static final int relNum = ");
T_b(T_s(num));
T_b(";");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("        ");
T_b("// supertype class");
T_b("\n");
T_b("        ");
T_b("private UniqueId ");
T_b(self->supertype_class_name);
T_b(";");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("        ");
T_b("// subtype class");
T_b("\n");
T_b("        ");
T_b("private UniqueId subtype;");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("        ");
T_b("public ");
T_b(self->name);
T_b("( UniqueId ");
T_b(self->supertype_class_name);
T_b(", UniqueId subtype ) throws XtumlException {");
T_b("\n");
T_b("            ");
T_b("this.");
T_b(self->supertype_class_name);
T_b(" = ");
T_b(self->supertype_class_name);
T_b(";");
T_b("\n");
T_b("            ");
T_b("this.subtype = subtype;");
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("        ");
T_b("@Override");
T_b("\n");
T_b("        ");
T_b("public UniqueId getSupertype() {");
T_b("\n");
T_b("            ");
T_b("return ");
T_b(self->supertype_class_name);
T_b(";");
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("        ");
T_b("@Override");
T_b("\n");
T_b("        ");
T_b("public UniqueId getSubtype() {");
T_b("\n");
T_b("            ");
T_b("return subtype;");
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("        ");
T_b("@Override");
T_b("\n");
T_b("        ");
T_b("public int getNumber() {");
T_b("\n");
T_b("            ");
T_b("return relNum;");
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("        ");
T_b("@Override");
T_b("\n");
T_b("        ");
T_b("public void delete() {");
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");

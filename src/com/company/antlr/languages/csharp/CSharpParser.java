// Generated from C:/Users/johbe07/OneDrive/OneDrive - CA Technologies/Projects/POM/POMConfigurationBuilder/src/com/company/antlr/languages/csharp\CSharpParser.g4 by ANTLR 4.7
package com.company.antlr.languages.csharp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, SINGLE_LINE_DOC_COMMENT=2, DELIMITED_DOC_COMMENT=3, 
		SINGLE_LINE_COMMENT=4, DELIMITED_COMMENT=5, WHITESPACES=6, SHARP=7, ABSTRACT=8, 
		ADD=9, ALIAS=10, ARGLIST=11, AS=12, ASCENDING=13, ASYNC=14, AWAIT=15, 
		BASE=16, BOOL=17, BREAK=18, BY=19, BYTE=20, CASE=21, CATCH=22, CHAR=23, 
		CHECKED=24, CLASS=25, CONST=26, CONTINUE=27, DECIMAL=28, DEFAULT=29, DELEGATE=30, 
		DESCENDING=31, DO=32, DOUBLE=33, DYNAMIC=34, ELSE=35, ENUM=36, EQUALS=37, 
		EVENT=38, EXPLICIT=39, EXTERN=40, FALSE=41, FINALLY=42, FIXED=43, FLOAT=44, 
		FOR=45, FOREACH=46, FROM=47, GET=48, GOTO=49, GROUP=50, IF=51, IMPLICIT=52, 
		IN=53, INT=54, INTERFACE=55, INTERNAL=56, INTO=57, IS=58, JOIN=59, LET=60, 
		LOCK=61, LONG=62, NAMEOF=63, NAMESPACE=64, NEW=65, NULL=66, OBJECT=67, 
		ON=68, OPERATOR=69, ORDERBY=70, OUT=71, OVERRIDE=72, PARAMS=73, PARTIAL=74, 
		PRIVATE=75, PROTECTED=76, PUBLIC=77, READONLY=78, REF=79, REMOVE=80, RETURN=81, 
		SBYTE=82, SEALED=83, SELECT=84, SET=85, SHORT=86, SIZEOF=87, STACKALLOC=88, 
		STATIC=89, STRING=90, STRUCT=91, SWITCH=92, THIS=93, THROW=94, TRUE=95, 
		TRY=96, TYPEOF=97, UINT=98, ULONG=99, UNCHECKED=100, UNSAFE=101, USHORT=102, 
		USING=103, VAR=104, VIRTUAL=105, VOID=106, VOLATILE=107, WHEN=108, WHERE=109, 
		WHILE=110, YIELD=111, IDENTIFIER=112, LITERAL_ACCESS=113, INTEGER_LITERAL=114, 
		HEX_INTEGER_LITERAL=115, REAL_LITERAL=116, CHARACTER_LITERAL=117, REGULAR_STRING=118, 
		VERBATIUM_STRING=119, INTERPOLATED_REGULAR_STRING_START=120, INTERPOLATED_VERBATIUM_STRING_START=121, 
		OPEN_BRACE=122, CLOSE_BRACE=123, OPEN_BRACKET=124, CLOSE_BRACKET=125, 
		OPEN_PARENS=126, CLOSE_PARENS=127, DOT=128, COMMA=129, COLON=130, SEMICOLON=131, 
		PLUS=132, MINUS=133, STAR=134, DIV=135, PERCENT=136, AMP=137, BITWISE_OR=138, 
		CARET=139, BANG=140, TILDE=141, ASSIGNMENT=142, LT=143, GT=144, INTERR=145, 
		DOUBLE_COLON=146, OP_COALESCING=147, OP_INC=148, OP_DEC=149, OP_AND=150, 
		OP_OR=151, OP_PTR=152, OP_EQ=153, OP_NE=154, OP_LE=155, OP_GE=156, OP_ADD_ASSIGNMENT=157, 
		OP_SUB_ASSIGNMENT=158, OP_MULT_ASSIGNMENT=159, OP_DIV_ASSIGNMENT=160, 
		OP_MOD_ASSIGNMENT=161, OP_AND_ASSIGNMENT=162, OP_OR_ASSIGNMENT=163, OP_XOR_ASSIGNMENT=164, 
		OP_LEFT_SHIFT=165, OP_LEFT_SHIFT_ASSIGNMENT=166, DOUBLE_CURLY_INSIDE=167, 
		OPEN_BRACE_INSIDE=168, REGULAR_CHAR_INSIDE=169, VERBATIUM_DOUBLE_QUOTE_INSIDE=170, 
		DOUBLE_QUOTE_INSIDE=171, REGULAR_STRING_INSIDE=172, VERBATIUM_INSIDE_STRING=173, 
		CLOSE_BRACE_INSIDE=174, FORMAT_STRING=175, DIRECTIVE_WHITESPACES=176, 
		DIGITS=177, DEFINE=178, UNDEF=179, ELIF=180, ENDIF=181, LINE=182, ERROR=183, 
		WARNING=184, REGION=185, ENDREGION=186, PRAGMA=187, DIRECTIVE_HIDDEN=188, 
		CONDITIONAL_SYMBOL=189, DIRECTIVE_NEW_LINE=190, TEXT=191, DOUBLE_CURLY_CLOSE_INSIDE=192;
	public static final int
		RULE_compilation_unit = 0, RULE_namespace_or_type_name = 1, RULE_type = 2, 
		RULE_base_type = 3, RULE_simple_type = 4, RULE_numeric_type = 5, RULE_integral_type = 6, 
		RULE_floating_point_type = 7, RULE_class_type = 8, RULE_type_argument_list = 9, 
		RULE_argument_list = 10, RULE_argument = 11, RULE_expression = 12, RULE_non_assignment_expression = 13, 
		RULE_assignment = 14, RULE_assignment_operator = 15, RULE_conditional_expression = 16, 
		RULE_null_coalescing_expression = 17, RULE_conditional_or_expression = 18, 
		RULE_conditional_and_expression = 19, RULE_inclusive_or_expression = 20, 
		RULE_exclusive_or_expression = 21, RULE_and_expression = 22, RULE_equality_expression = 23, 
		RULE_relational_expression = 24, RULE_shift_expression = 25, RULE_additive_expression = 26, 
		RULE_multiplicative_expression = 27, RULE_unary_expression = 28, RULE_primary_expression = 29, 
		RULE_primary_expression_start = 30, RULE_member_access = 31, RULE_bracket_expression = 32, 
		RULE_indexer_argument = 33, RULE_predefined_type = 34, RULE_expression_list = 35, 
		RULE_object_or_collection_initializer = 36, RULE_object_initializer = 37, 
		RULE_member_initializer_list = 38, RULE_member_initializer = 39, RULE_initializer_value = 40, 
		RULE_collection_initializer = 41, RULE_element_initializer = 42, RULE_anonymous_object_initializer = 43, 
		RULE_member_declarator_list = 44, RULE_member_declarator = 45, RULE_unbound_type_name = 46, 
		RULE_generic_dimension_specifier = 47, RULE_isType = 48, RULE_lambda_expression = 49, 
		RULE_anonymous_function_signature = 50, RULE_explicit_anonymous_function_parameter_list = 51, 
		RULE_explicit_anonymous_function_parameter = 52, RULE_implicit_anonymous_function_parameter_list = 53, 
		RULE_anonymous_function_body = 54, RULE_query_expression = 55, RULE_from_clause = 56, 
		RULE_query_body = 57, RULE_query_body_clause = 58, RULE_let_clause = 59, 
		RULE_where_clause = 60, RULE_combined_join_clause = 61, RULE_orderby_clause = 62, 
		RULE_ordering = 63, RULE_select_or_group_clause = 64, RULE_query_continuation = 65, 
		RULE_statement = 66, RULE_labeled_Statement = 67, RULE_embedded_statement = 68, 
		RULE_simple_embedded_statement = 69, RULE_block = 70, RULE_local_variable_declaration = 71, 
		RULE_local_variable_type = 72, RULE_local_variable_declarator = 73, RULE_local_variable_initializer = 74, 
		RULE_local_constant_declaration = 75, RULE_if_body = 76, RULE_switch_section = 77, 
		RULE_switch_label = 78, RULE_statement_list = 79, RULE_for_initializer = 80, 
		RULE_for_iterator = 81, RULE_catch_clauses = 82, RULE_specific_catch_clause = 83, 
		RULE_general_catch_clause = 84, RULE_exception_filter = 85, RULE_finally_clause = 86, 
		RULE_resource_acquisition = 87, RULE_namespace_declaration = 88, RULE_qualified_identifier = 89, 
		RULE_namespace_body = 90, RULE_extern_alias_directives = 91, RULE_extern_alias_directive = 92, 
		RULE_using_directives = 93, RULE_using_directive = 94, RULE_namespace_member_declarations = 95, 
		RULE_namespace_member_declaration = 96, RULE_type_declaration = 97, RULE_qualified_alias_member = 98, 
		RULE_type_parameter_list = 99, RULE_type_parameter = 100, RULE_class_base = 101, 
		RULE_interface_type_list = 102, RULE_type_parameter_constraints_clauses = 103, 
		RULE_type_parameter_constraints_clause = 104, RULE_type_parameter_constraints = 105, 
		RULE_primary_constraint = 106, RULE_secondary_constraints = 107, RULE_constructor_constraint = 108, 
		RULE_class_body = 109, RULE_class_member_declarations = 110, RULE_class_member_declaration = 111, 
		RULE_all_member_modifiers = 112, RULE_all_member_modifier = 113, RULE_common_member_declaration = 114, 
		RULE_typed_member_declaration = 115, RULE_constant_declarators = 116, 
		RULE_constant_declarator = 117, RULE_variable_declarators = 118, RULE_variable_declarator = 119, 
		RULE_variable_initializer = 120, RULE_return_type = 121, RULE_member_name = 122, 
		RULE_method_body = 123, RULE_formal_parameter_list = 124, RULE_fixed_parameters = 125, 
		RULE_fixed_parameter = 126, RULE_parameter_modifier = 127, RULE_parameter_array = 128, 
		RULE_accessor_declarations = 129, RULE_get_accessor_declaration = 130, 
		RULE_set_accessor_declaration = 131, RULE_accessor_modifier = 132, RULE_accessor_body = 133, 
		RULE_event_accessor_declarations = 134, RULE_add_accessor_declaration = 135, 
		RULE_remove_accessor_declaration = 136, RULE_overloadable_operator = 137, 
		RULE_conversion_operator_declarator = 138, RULE_constructor_initializer = 139, 
		RULE_body = 140, RULE_struct_interfaces = 141, RULE_struct_body = 142, 
		RULE_struct_member_declaration = 143, RULE_array_type = 144, RULE_rank_specifier = 145, 
		RULE_array_initializer = 146, RULE_variant_type_parameter_list = 147, 
		RULE_variant_type_parameter = 148, RULE_variance_annotation = 149, RULE_interface_base = 150, 
		RULE_interface_body = 151, RULE_interface_member_declaration = 152, RULE_interface_accessors = 153, 
		RULE_enum_base = 154, RULE_enum_body = 155, RULE_enum_member_declaration = 156, 
		RULE_global_attribute_section = 157, RULE_global_attribute_target = 158, 
		RULE_attributes = 159, RULE_attribute_section = 160, RULE_attribute_target = 161, 
		RULE_attribute_list = 162, RULE_attribute = 163, RULE_attribute_argument = 164, 
		RULE_pointer_type = 165, RULE_fixed_pointer_declarators = 166, RULE_fixed_pointer_declarator = 167, 
		RULE_fixed_pointer_initializer = 168, RULE_fixed_size_buffer_declarator = 169, 
		RULE_local_variable_initializer_unsafe = 170, RULE_right_arrow = 171, 
		RULE_right_shift = 172, RULE_right_shift_assignment = 173, RULE_literal = 174, 
		RULE_boolean_literal = 175, RULE_string_literal = 176, RULE_interpolated_regular_string = 177, 
		RULE_interpolated_verbatium_string = 178, RULE_interpolated_regular_string_part = 179, 
		RULE_interpolated_verbatium_string_part = 180, RULE_interpolated_string_expression = 181, 
		RULE_keyword = 182, RULE_class_definition = 183, RULE_struct_definition = 184, 
		RULE_interface_definition = 185, RULE_enum_definition = 186, RULE_delegate_definition = 187, 
		RULE_event_declaration = 188, RULE_field_declaration = 189, RULE_property_declaration = 190, 
		RULE_constant_declaration = 191, RULE_indexer_declaration = 192, RULE_destructor_definition = 193, 
		RULE_constructor_declaration = 194, RULE_method_declaration = 195, RULE_method_member_name = 196, 
		RULE_operator_declaration = 197, RULE_arg_declaration = 198, RULE_method_invocation = 199, 
		RULE_object_creation_expression = 200, RULE_identifier = 201;
	public static final String[] ruleNames = {
		"compilation_unit", "namespace_or_type_name", "type", "base_type", "simple_type", 
		"numeric_type", "integral_type", "floating_point_type", "class_type", 
		"type_argument_list", "argument_list", "argument", "expression", "non_assignment_expression", 
		"assignment", "assignment_operator", "conditional_expression", "null_coalescing_expression", 
		"conditional_or_expression", "conditional_and_expression", "inclusive_or_expression", 
		"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "additive_expression", "multiplicative_expression", 
		"unary_expression", "primary_expression", "primary_expression_start", 
		"member_access", "bracket_expression", "indexer_argument", "predefined_type", 
		"expression_list", "object_or_collection_initializer", "object_initializer", 
		"member_initializer_list", "member_initializer", "initializer_value", 
		"collection_initializer", "element_initializer", "anonymous_object_initializer", 
		"member_declarator_list", "member_declarator", "unbound_type_name", "generic_dimension_specifier", 
		"isType", "lambda_expression", "anonymous_function_signature", "explicit_anonymous_function_parameter_list", 
		"explicit_anonymous_function_parameter", "implicit_anonymous_function_parameter_list", 
		"anonymous_function_body", "query_expression", "from_clause", "query_body", 
		"query_body_clause", "let_clause", "where_clause", "combined_join_clause", 
		"orderby_clause", "ordering", "select_or_group_clause", "query_continuation", 
		"statement", "labeled_Statement", "embedded_statement", "simple_embedded_statement", 
		"block", "local_variable_declaration", "local_variable_type", "local_variable_declarator", 
		"local_variable_initializer", "local_constant_declaration", "if_body", 
		"switch_section", "switch_label", "statement_list", "for_initializer", 
		"for_iterator", "catch_clauses", "specific_catch_clause", "general_catch_clause", 
		"exception_filter", "finally_clause", "resource_acquisition", "namespace_declaration", 
		"qualified_identifier", "namespace_body", "extern_alias_directives", "extern_alias_directive", 
		"using_directives", "using_directive", "namespace_member_declarations", 
		"namespace_member_declaration", "type_declaration", "qualified_alias_member", 
		"type_parameter_list", "type_parameter", "class_base", "interface_type_list", 
		"type_parameter_constraints_clauses", "type_parameter_constraints_clause", 
		"type_parameter_constraints", "primary_constraint", "secondary_constraints", 
		"constructor_constraint", "class_body", "class_member_declarations", "class_member_declaration", 
		"all_member_modifiers", "all_member_modifier", "common_member_declaration", 
		"typed_member_declaration", "constant_declarators", "constant_declarator", 
		"variable_declarators", "variable_declarator", "variable_initializer", 
		"return_type", "member_name", "method_body", "formal_parameter_list", 
		"fixed_parameters", "fixed_parameter", "parameter_modifier", "parameter_array", 
		"accessor_declarations", "get_accessor_declaration", "set_accessor_declaration", 
		"accessor_modifier", "accessor_body", "event_accessor_declarations", "add_accessor_declaration", 
		"remove_accessor_declaration", "overloadable_operator", "conversion_operator_declarator", 
		"constructor_initializer", "body", "struct_interfaces", "struct_body", 
		"struct_member_declaration", "array_type", "rank_specifier", "array_initializer", 
		"variant_type_parameter_list", "variant_type_parameter", "variance_annotation", 
		"interface_base", "interface_body", "interface_member_declaration", "interface_accessors", 
		"enum_base", "enum_body", "enum_member_declaration", "global_attribute_section", 
		"global_attribute_target", "attributes", "attribute_section", "attribute_target", 
		"attribute_list", "attribute", "attribute_argument", "pointer_type", "fixed_pointer_declarators", 
		"fixed_pointer_declarator", "fixed_pointer_initializer", "fixed_size_buffer_declarator", 
		"local_variable_initializer_unsafe", "right_arrow", "right_shift", "right_shift_assignment", 
		"literal", "boolean_literal", "string_literal", "interpolated_regular_string", 
		"interpolated_verbatium_string", "interpolated_regular_string_part", "interpolated_verbatium_string_part", 
		"interpolated_string_expression", "keyword", "class_definition", "struct_definition", 
		"interface_definition", "enum_definition", "delegate_definition", "event_declaration", 
		"field_declaration", "property_declaration", "constant_declaration", "indexer_declaration", 
		"destructor_definition", "constructor_declaration", "method_declaration", 
		"method_member_name", "operator_declaration", "arg_declaration", "method_invocation", 
		"object_creation_expression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u00EF\u00BB\u00BF'", null, null, null, null, null, "'#'", "'abstract'", 
		"'add'", "'alias'", "'__arglist'", "'as'", "'ascending'", "'async'", "'await'", 
		"'base'", "'bool'", "'break'", "'by'", "'byte'", "'case'", "'catch'", 
		"'char'", "'checked'", "'class'", "'const'", "'continue'", "'decimal'", 
		"'default'", "'delegate'", "'descending'", "'do'", "'double'", "'dynamic'", 
		"'else'", "'enum'", "'equals'", "'event'", "'explicit'", "'extern'", "'false'", 
		"'finally'", "'fixed'", "'float'", "'for'", "'foreach'", "'from'", "'get'", 
		"'goto'", "'group'", "'if'", "'implicit'", "'in'", "'int'", "'interface'", 
		"'internal'", "'into'", "'is'", "'join'", "'let'", "'lock'", "'long'", 
		"'nameof'", "'namespace'", "'new'", "'null'", "'object'", "'on'", "'operator'", 
		"'orderby'", "'out'", "'override'", "'params'", "'partial'", "'private'", 
		"'protected'", "'public'", "'readonly'", "'ref'", "'remove'", "'return'", 
		"'sbyte'", "'sealed'", "'select'", "'set'", "'short'", "'sizeof'", "'stackalloc'", 
		"'static'", "'string'", "'struct'", "'switch'", "'this'", "'throw'", "'true'", 
		"'try'", "'typeof'", "'uint'", "'ulong'", "'unchecked'", "'unsafe'", "'ushort'", 
		"'using'", "'var'", "'virtual'", "'void'", "'volatile'", "'when'", "'where'", 
		"'while'", "'yield'", null, null, null, null, null, null, null, null, 
		null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", 
		"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", 
		"'~'", "'='", "'<'", "'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", 
		"'||'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'&='", "'|='", "'^='", "'<<'", "'<<='", "'{{'", null, 
		null, null, null, null, null, null, null, null, null, "'define'", "'undef'", 
		"'elif'", "'endif'", "'line'", null, null, null, null, null, "'hidden'", 
		null, null, null, "'}}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "DELIMITED_DOC_COMMENT", 
		"SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", "WHITESPACES", "SHARP", "ABSTRACT", 
		"ADD", "ALIAS", "ARGLIST", "AS", "ASCENDING", "ASYNC", "AWAIT", "BASE", 
		"BOOL", "BREAK", "BY", "BYTE", "CASE", "CATCH", "CHAR", "CHECKED", "CLASS", 
		"CONST", "CONTINUE", "DECIMAL", "DEFAULT", "DELEGATE", "DESCENDING", "DO", 
		"DOUBLE", "DYNAMIC", "ELSE", "ENUM", "EQUALS", "EVENT", "EXPLICIT", "EXTERN", 
		"FALSE", "FINALLY", "FIXED", "FLOAT", "FOR", "FOREACH", "FROM", "GET", 
		"GOTO", "GROUP", "IF", "IMPLICIT", "IN", "INT", "INTERFACE", "INTERNAL", 
		"INTO", "IS", "JOIN", "LET", "LOCK", "LONG", "NAMEOF", "NAMESPACE", "NEW", 
		"NULL", "OBJECT", "ON", "OPERATOR", "ORDERBY", "OUT", "OVERRIDE", "PARAMS", 
		"PARTIAL", "PRIVATE", "PROTECTED", "PUBLIC", "READONLY", "REF", "REMOVE", 
		"RETURN", "SBYTE", "SEALED", "SELECT", "SET", "SHORT", "SIZEOF", "STACKALLOC", 
		"STATIC", "STRING", "STRUCT", "SWITCH", "THIS", "THROW", "TRUE", "TRY", 
		"TYPEOF", "UINT", "ULONG", "UNCHECKED", "UNSAFE", "USHORT", "USING", "VAR", 
		"VIRTUAL", "VOID", "VOLATILE", "WHEN", "WHERE", "WHILE", "YIELD", "IDENTIFIER", 
		"LITERAL_ACCESS", "INTEGER_LITERAL", "HEX_INTEGER_LITERAL", "REAL_LITERAL", 
		"CHARACTER_LITERAL", "REGULAR_STRING", "VERBATIUM_STRING", "INTERPOLATED_REGULAR_STRING_START", 
		"INTERPOLATED_VERBATIUM_STRING_START", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "OPEN_PARENS", "CLOSE_PARENS", "DOT", "COMMA", "COLON", 
		"SEMICOLON", "PLUS", "MINUS", "STAR", "DIV", "PERCENT", "AMP", "BITWISE_OR", 
		"CARET", "BANG", "TILDE", "ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", 
		"OP_COALESCING", "OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", 
		"OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", 
		"OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", 
		"OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "DOUBLE_CURLY_INSIDE", 
		"OPEN_BRACE_INSIDE", "REGULAR_CHAR_INSIDE", "VERBATIUM_DOUBLE_QUOTE_INSIDE", 
		"DOUBLE_QUOTE_INSIDE", "REGULAR_STRING_INSIDE", "VERBATIUM_INSIDE_STRING", 
		"CLOSE_BRACE_INSIDE", "FORMAT_STRING", "DIRECTIVE_WHITESPACES", "DIGITS", 
		"DEFINE", "UNDEF", "ELIF", "ENDIF", "LINE", "ERROR", "WARNING", "REGION", 
		"ENDREGION", "PRAGMA", "DIRECTIVE_HIDDEN", "CONDITIONAL_SYMBOL", "DIRECTIVE_NEW_LINE", 
		"TEXT", "DOUBLE_CURLY_CLOSE_INSIDE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSharpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSharpParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(CSharpParser.BYTE_ORDER_MARK, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public List<Global_attribute_sectionContext> global_attribute_section() {
			return getRuleContexts(Global_attribute_sectionContext.class);
		}
		public Global_attribute_sectionContext global_attribute_section(int i) {
			return getRuleContext(Global_attribute_sectionContext.class,i);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCompilation_unit(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(404);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(407);
				extern_alias_directives();
				}
				break;
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(410);
				using_directives();
				}
			}

			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413);
					global_attribute_section();
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(419);
				namespace_member_declarations();
				}
			}

			setState(422);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_or_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Namespace_or_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_or_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_or_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_or_type_name(this);
		}
	}

	public final Namespace_or_type_nameContext namespace_or_type_name() throws RecognitionException {
		Namespace_or_type_nameContext _localctx = new Namespace_or_type_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace_or_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(424);
				identifier();
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(425);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(428);
				qualified_alias_member();
				}
				break;
			}
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					match(DOT);
					setState(432);
					identifier();
					setState(434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(433);
						type_argument_list();
						}
						break;
					}
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			base_type();
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(445);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTERR:
						{
						setState(442);
						match(INTERR);
						}
						break;
					case OPEN_BRACKET:
						{
						setState(443);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(444);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBase_type(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base_type);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				simple_type();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				class_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(VOID);
				setState(453);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_typeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSimple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSimple_type(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simple_type);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				numeric_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_typeContext extends ParserRuleContext {
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNumeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNumeric_type(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numeric_type);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				integral_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				floating_point_type();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integral_typeContext extends ParserRuleContext {
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIntegral_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIntegral_type(this);
		}
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (SBYTE - 82)) | (1L << (SHORT - 82)) | (1L << (UINT - 82)) | (1L << (ULONG - 82)) | (1L << (USHORT - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFloating_point_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFloating_point_type(this);
		}
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_typeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_type(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_type);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				namespace_or_type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(OBJECT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(DYNAMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_argument_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_argument_list(this);
		}
	}

	public final Type_argument_listContext type_argument_list() throws RecognitionException {
		Type_argument_listContext _localctx = new Type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(LT);
			setState(476);
			type();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(477);
				match(COMMA);
				setState(478);
				type();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			argument();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(487);
				match(COMMA);
				setState(488);
				argument();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public Token refout;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(494);
				identifier();
				setState(495);
				match(COLON);
				}
				break;
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT || _la==REF) {
				{
				setState(499);
				((ArgumentContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==REF) ) {
					((ArgumentContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(502);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				non_assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_assignment_expressionContext extends ParserRuleContext {
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Non_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNon_assignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNon_assignment_expression(this);
		}
	}

	public final Non_assignment_expressionContext non_assignment_expression() throws RecognitionException {
		Non_assignment_expressionContext _localctx = new Non_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_non_assignment_expression);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				lambda_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				query_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				conditional_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			unary_expression();
			setState(514);
			assignment_operator();
			setState(515);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Right_shift_assignmentContext right_shift_assignment() {
			return getRuleContext(Right_shift_assignmentContext.class,0);
		}
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_operator);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(ASSIGNMENT);
				}
				break;
			case OP_ADD_ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(OP_ADD_ASSIGNMENT);
				}
				break;
			case OP_SUB_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(OP_SUB_ASSIGNMENT);
				}
				break;
			case OP_MULT_ASSIGNMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				match(OP_MULT_ASSIGNMENT);
				}
				break;
			case OP_DIV_ASSIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(521);
				match(OP_DIV_ASSIGNMENT);
				}
				break;
			case OP_MOD_ASSIGNMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(522);
				match(OP_MOD_ASSIGNMENT);
				}
				break;
			case OP_AND_ASSIGNMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(523);
				match(OP_AND_ASSIGNMENT);
				}
				break;
			case OP_OR_ASSIGNMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(524);
				match(OP_OR_ASSIGNMENT);
				}
				break;
			case OP_XOR_ASSIGNMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(525);
				match(OP_XOR_ASSIGNMENT);
				}
				break;
			case OP_LEFT_SHIFT_ASSIGNMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(526);
				match(OP_LEFT_SHIFT_ASSIGNMENT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 11);
				{
				setState(527);
				right_shift_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			null_coalescing_expression();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(531);
				match(INTERR);
				setState(532);
				expression();
				setState(533);
				match(COLON);
				setState(534);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Conditional_or_expressionContext conditional_or_expression() {
			return getRuleContext(Conditional_or_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_coalescing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNull_coalescing_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNull_coalescing_expression(this);
		}
	}

	public final Null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		Null_coalescing_expressionContext _localctx = new Null_coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_null_coalescing_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			conditional_or_expression();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COALESCING) {
				{
				setState(539);
				match(OP_COALESCING);
				setState(540);
				null_coalescing_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_or_expressionContext extends ParserRuleContext {
		public List<Conditional_and_expressionContext> conditional_and_expression() {
			return getRuleContexts(Conditional_and_expressionContext.class);
		}
		public Conditional_and_expressionContext conditional_and_expression(int i) {
			return getRuleContext(Conditional_and_expressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(CSharpParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(CSharpParser.OP_OR, i);
		}
		public Conditional_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_or_expression(this);
		}
	}

	public final Conditional_or_expressionContext conditional_or_expression() throws RecognitionException {
		Conditional_or_expressionContext _localctx = new Conditional_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			conditional_and_expression();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(544);
				match(OP_OR);
				setState(545);
				conditional_and_expression();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(CSharpParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(CSharpParser.OP_AND, i);
		}
		public Conditional_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_and_expression(this);
		}
	}

	public final Conditional_and_expressionContext conditional_and_expression() throws RecognitionException {
		Conditional_and_expressionContext _localctx = new Conditional_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditional_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			inclusive_or_expression();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(552);
				match(OP_AND);
				setState(553);
				inclusive_or_expression();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			exclusive_or_expression();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITWISE_OR) {
				{
				{
				setState(560);
				match(BITWISE_OR);
				setState(561);
				exclusive_or_expression();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			and_expression();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(568);
				match(CARET);
				setState(569);
				and_expression();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			equality_expression();
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(576);
					match(AMP);
					setState(577);
					equality_expression();
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(CSharpParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(CSharpParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(CSharpParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(CSharpParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			relational_expression();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ || _la==OP_NE) {
				{
				{
				setState(584);
				_la = _input.LA(1);
				if ( !(_la==OP_EQ || _la==OP_NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(585);
				relational_expression();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> IS() { return getTokens(CSharpParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(CSharpParser.IS, i);
		}
		public List<IsTypeContext> isType() {
			return getRuleContexts(IsTypeContext.class);
		}
		public IsTypeContext isType(int i) {
			return getRuleContext(IsTypeContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(CSharpParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(CSharpParser.AS, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			shift_expression();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AS || _la==IS || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LT - 143)) | (1L << (GT - 143)) | (1L << (OP_LE - 143)) | (1L << (OP_GE - 143)))) != 0)) {
				{
				setState(598);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case GT:
				case OP_LE:
				case OP_GE:
					{
					setState(592);
					_la = _input.LA(1);
					if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LT - 143)) | (1L << (GT - 143)) | (1L << (OP_LE - 143)) | (1L << (OP_GE - 143)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(593);
					shift_expression();
					}
					break;
				case IS:
					{
					setState(594);
					match(IS);
					setState(595);
					isType();
					}
					break;
				case AS:
					{
					setState(596);
					match(AS);
					setState(597);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<Right_shiftContext> right_shift() {
			return getRuleContexts(Right_shiftContext.class);
		}
		public Right_shiftContext right_shift(int i) {
			return getRuleContext(Right_shiftContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			additive_expression();
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(606);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OP_LEFT_SHIFT:
						{
						setState(604);
						match(OP_LEFT_SHIFT);
						}
						break;
					case GT:
						{
						setState(605);
						right_shift();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(608);
					additive_expression();
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			multiplicative_expression();
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(615);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(616);
					multiplicative_expression();
					}
					} 
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			unary_expression();
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(623);
					_la = _input.LA(1);
					if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (STAR - 134)) | (1L << (DIV - 134)) | (1L << (PERCENT - 134)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(624);
					unary_expression();
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_expression);
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(PLUS);
				setState(632);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(MINUS);
				setState(634);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
				match(BANG);
				setState(636);
				unary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(637);
				match(TILDE);
				setState(638);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(639);
				match(OP_INC);
				setState(640);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(641);
				match(OP_DEC);
				setState(642);
				unary_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(643);
				match(OPEN_PARENS);
				setState(644);
				type();
				setState(645);
				match(CLOSE_PARENS);
				setState(646);
				unary_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(648);
				match(AWAIT);
				setState(649);
				unary_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(650);
				match(AMP);
				setState(651);
				unary_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(652);
				match(STAR);
				setState(653);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<Bracket_expressionContext> bracket_expression() {
			return getRuleContexts(Bracket_expressionContext.class);
		}
		public Bracket_expressionContext bracket_expression(int i) {
			return getRuleContext(Bracket_expressionContext.class,i);
		}
		public List<Member_accessContext> member_access() {
			return getRuleContexts(Member_accessContext.class);
		}
		public Member_accessContext member_access(int i) {
			return getRuleContext(Member_accessContext.class,i);
		}
		public List<Method_invocationContext> method_invocation() {
			return getRuleContexts(Method_invocationContext.class);
		}
		public Method_invocationContext method_invocation(int i) {
			return getRuleContext(Method_invocationContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			((Primary_expressionContext)_localctx).pe = primary_expression_start();
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(657);
					bracket_expression();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(669);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
					case INTERR:
						{
						setState(663);
						member_access();
						}
						break;
					case OPEN_PARENS:
						{
						setState(664);
						method_invocation();
						}
						break;
					case OP_INC:
						{
						setState(665);
						match(OP_INC);
						}
						break;
					case OP_DEC:
						{
						setState(666);
						match(OP_DEC);
						}
						break;
					case OP_PTR:
						{
						setState(667);
						match(OP_PTR);
						setState(668);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(671);
							bracket_expression();
							}
							} 
						}
						setState(676);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					}
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expression_startContext extends ParserRuleContext {
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
	 
		public Primary_expression_startContext() { }
		public void copyFrom(Primary_expression_startContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode LITERAL_ACCESS() { return getToken(CSharpParser.LITERAL_ACCESS, 0); }
		public LiteralAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteralAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteralAccessExpression(this);
		}
	}
	public static class DefaultValueExpressionContext extends Primary_expression_startContext {
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public DefaultValueExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDefaultValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDefaultValueExpression(this);
		}
	}
	public static class BaseAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public BaseAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBaseAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBaseAccessExpression(this);
		}
	}
	public static class SizeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public SizeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSizeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSizeofExpression(this);
		}
	}
	public static class ParenthesisExpressionsContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public ParenthesisExpressionsContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParenthesisExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParenthesisExpressions(this);
		}
	}
	public static class ThisReferenceExpressionContext extends Primary_expression_startContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public ThisReferenceExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterThisReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitThisReferenceExpression(this);
		}
	}
	public static class ObjectCreationExpressionContext extends Primary_expression_startContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Anonymous_object_initializerContext anonymous_object_initializer() {
			return getRuleContext(Anonymous_object_initializerContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Object_creation_expressionContext object_creation_expression() {
			return getRuleContext(Object_creation_expressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ObjectCreationExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObjectCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObjectCreationExpression(this);
		}
	}
	public static class AnonymousMethodExpressionContext extends Primary_expression_startContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public AnonymousMethodExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymousMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymousMethodExpression(this);
		}
	}
	public static class TypeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Unbound_type_nameContext unbound_type_name() {
			return getRuleContext(Unbound_type_nameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TypeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTypeofExpression(this);
		}
	}
	public static class UncheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public UncheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUncheckedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUncheckedExpression(this);
		}
	}
	public static class SimpleNameExpressionContext extends Primary_expression_startContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public SimpleNameExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSimpleNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSimpleNameExpression(this);
		}
	}
	public static class MemberAccessExpressionContext extends Primary_expression_startContext {
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public MemberAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMemberAccessExpression(this);
		}
	}
	public static class CheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public CheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCheckedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCheckedExpression(this);
		}
	}
	public static class LiteralExpressionContext extends Primary_expression_startContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteralExpression(this);
		}
	}
	public static class NameofExpressionContext extends Primary_expression_startContext {
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public NameofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNameofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNameofExpression(this);
		}
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primary_expression_start);
		int _la;
		try {
			int _alt;
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				literal();
				}
				break;
			case 2:
				_localctx = new SimpleNameExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				identifier();
				setState(685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(684);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ParenthesisExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				match(OPEN_PARENS);
				setState(688);
				expression();
				setState(689);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(691);
				predefined_type();
				}
				break;
			case 5:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(692);
				qualified_alias_member();
				}
				break;
			case 6:
				_localctx = new LiteralAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(693);
				match(LITERAL_ACCESS);
				}
				break;
			case 7:
				_localctx = new ThisReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(694);
				match(THIS);
				}
				break;
			case 8:
				_localctx = new BaseAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(695);
				match(BASE);
				setState(705);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(696);
					match(DOT);
					setState(697);
					identifier();
					setState(699);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(698);
						type_argument_list();
						}
						break;
					}
					}
					break;
				case OPEN_BRACKET:
					{
					setState(701);
					match(OPEN_BRACKET);
					setState(702);
					expression_list();
					setState(703);
					match(CLOSE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				_localctx = new ObjectCreationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(707);
				match(NEW);
				setState(736);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(708);
					type();
					setState(730);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(709);
						object_creation_expression();
						}
						break;
					case 2:
						{
						setState(710);
						object_or_collection_initializer();
						}
						break;
					case 3:
						{
						setState(711);
						match(OPEN_BRACKET);
						setState(712);
						expression_list();
						setState(713);
						match(CLOSE_BRACKET);
						setState(717);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(714);
								rank_specifier();
								}
								} 
							}
							setState(719);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
						}
						setState(721);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OPEN_BRACE) {
							{
							setState(720);
							array_initializer();
							}
						}

						}
						break;
					case 4:
						{
						setState(724); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(723);
							rank_specifier();
							}
							}
							setState(726); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==OPEN_BRACKET );
						setState(728);
						array_initializer();
						}
						break;
					}
					}
					break;
				case OPEN_BRACE:
					{
					setState(732);
					anonymous_object_initializer();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(733);
					rank_specifier();
					setState(734);
					array_initializer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				_localctx = new TypeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(738);
				match(TYPEOF);
				setState(739);
				match(OPEN_PARENS);
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(740);
					unbound_type_name();
					}
					break;
				case 2:
					{
					setState(741);
					type();
					}
					break;
				case 3:
					{
					setState(742);
					match(VOID);
					}
					break;
				}
				setState(745);
				match(CLOSE_PARENS);
				}
				break;
			case 11:
				_localctx = new CheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(746);
				match(CHECKED);
				setState(747);
				match(OPEN_PARENS);
				setState(748);
				expression();
				setState(749);
				match(CLOSE_PARENS);
				}
				break;
			case 12:
				_localctx = new UncheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(751);
				match(UNCHECKED);
				setState(752);
				match(OPEN_PARENS);
				setState(753);
				expression();
				setState(754);
				match(CLOSE_PARENS);
				}
				break;
			case 13:
				_localctx = new DefaultValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(756);
				match(DEFAULT);
				setState(757);
				match(OPEN_PARENS);
				setState(758);
				type();
				setState(759);
				match(CLOSE_PARENS);
				}
				break;
			case 14:
				_localctx = new AnonymousMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(761);
					match(ASYNC);
					}
				}

				setState(764);
				match(DELEGATE);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENS) {
					{
					setState(765);
					match(OPEN_PARENS);
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
						{
						setState(766);
						explicit_anonymous_function_parameter_list();
						}
					}

					setState(769);
					match(CLOSE_PARENS);
					}
				}

				setState(772);
				block();
				}
				break;
			case 15:
				_localctx = new SizeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(773);
				match(SIZEOF);
				setState(774);
				match(OPEN_PARENS);
				setState(775);
				type();
				setState(776);
				match(CLOSE_PARENS);
				}
				break;
			case 16:
				_localctx = new NameofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(778);
				match(NAMEOF);
				setState(779);
				match(OPEN_PARENS);
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(780);
						identifier();
						setState(781);
						match(DOT);
						}
						} 
					}
					setState(787);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(788);
				identifier();
				setState(789);
				match(CLOSE_PARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_accessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_access(this);
		}
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_member_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(793);
				match(INTERR);
				}
			}

			setState(796);
			match(DOT);
			setState(797);
			identifier();
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(798);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bracket_expressionContext extends ParserRuleContext {
		public List<Indexer_argumentContext> indexer_argument() {
			return getRuleContexts(Indexer_argumentContext.class);
		}
		public Indexer_argumentContext indexer_argument(int i) {
			return getRuleContext(Indexer_argumentContext.class,i);
		}
		public Bracket_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBracket_expression(this);
		}
	}

	public final Bracket_expressionContext bracket_expression() throws RecognitionException {
		Bracket_expressionContext _localctx = new Bracket_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bracket_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(801);
				match(INTERR);
				}
			}

			setState(804);
			match(OPEN_BRACKET);
			setState(805);
			indexer_argument();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(806);
				match(COMMA);
				setState(807);
				indexer_argument();
				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(813);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexer_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Indexer_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIndexer_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIndexer_argument(this);
		}
	}

	public final Indexer_argumentContext indexer_argument() throws RecognitionException {
		Indexer_argumentContext _localctx = new Indexer_argumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_indexer_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(815);
				identifier();
				setState(816);
				match(COLON);
				}
				break;
			}
			setState(820);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPredefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPredefined_type(this);
		}
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_predefined_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (SBYTE - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			expression();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(825);
				match(COMMA);
				setState(826);
				expression();
				}
				}
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_or_collection_initializerContext extends ParserRuleContext {
		public Object_initializerContext object_initializer() {
			return getRuleContext(Object_initializerContext.class,0);
		}
		public Collection_initializerContext collection_initializer() {
			return getRuleContext(Collection_initializerContext.class,0);
		}
		public Object_or_collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_or_collection_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_or_collection_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_or_collection_initializer(this);
		}
	}

	public final Object_or_collection_initializerContext object_or_collection_initializer() throws RecognitionException {
		Object_or_collection_initializerContext _localctx = new Object_or_collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_object_or_collection_initializer);
		try {
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				object_initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				collection_initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_initializer_listContext member_initializer_list() {
			return getRuleContext(Member_initializer_listContext.class,0);
		}
		public Object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_initializer(this);
		}
	}

	public final Object_initializerContext object_initializer() throws RecognitionException {
		Object_initializerContext _localctx = new Object_initializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(OPEN_BRACE);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (OPEN_BRACKET - 68)))) != 0)) {
				{
				setState(837);
				member_initializer_list();
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(838);
					match(COMMA);
					}
				}

				}
			}

			setState(843);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializer_listContext extends ParserRuleContext {
		public List<Member_initializerContext> member_initializer() {
			return getRuleContexts(Member_initializerContext.class);
		}
		public Member_initializerContext member_initializer(int i) {
			return getRuleContext(Member_initializerContext.class,i);
		}
		public Member_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_initializer_list(this);
		}
	}

	public final Member_initializer_listContext member_initializer_list() throws RecognitionException {
		Member_initializer_listContext _localctx = new Member_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_member_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			member_initializer();
			setState(850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(846);
					match(COMMA);
					setState(847);
					member_initializer();
					}
					} 
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializerContext extends ParserRuleContext {
		public Initializer_valueContext initializer_value() {
			return getRuleContext(Initializer_valueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_initializer(this);
		}
	}

	public final Member_initializerContext member_initializer() throws RecognitionException {
		Member_initializerContext _localctx = new Member_initializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(853);
				identifier();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(854);
				match(OPEN_BRACKET);
				setState(855);
				expression();
				setState(856);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(860);
			match(ASSIGNMENT);
			setState(861);
			initializer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInitializer_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInitializer_value(this);
		}
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_initializer_value);
		try {
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				object_or_collection_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public List<Element_initializerContext> element_initializer() {
			return getRuleContexts(Element_initializerContext.class);
		}
		public Element_initializerContext element_initializer(int i) {
			return getRuleContext(Element_initializerContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCollection_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCollection_initializer(this);
		}
	}

	public final Collection_initializerContext collection_initializer() throws RecognitionException {
		Collection_initializerContext _localctx = new Collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_collection_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(OPEN_BRACE);
			setState(868);
			element_initializer();
			setState(873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(869);
					match(COMMA);
					setState(870);
					element_initializer();
					}
					} 
				}
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(876);
				match(COMMA);
				}
			}

			setState(879);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_initializerContext extends ParserRuleContext {
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Element_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterElement_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitElement_initializer(this);
		}
	}

	public final Element_initializerContext element_initializer() throws RecognitionException {
		Element_initializerContext _localctx = new Element_initializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_element_initializer);
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				non_assignment_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				match(OPEN_BRACE);
				setState(883);
				expression_list();
				setState(884);
				match(CLOSE_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_declarator_listContext member_declarator_list() {
			return getRuleContext(Member_declarator_listContext.class,0);
		}
		public Anonymous_object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_object_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_object_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_object_initializer(this);
		}
	}

	public final Anonymous_object_initializerContext anonymous_object_initializer() throws RecognitionException {
		Anonymous_object_initializerContext _localctx = new Anonymous_object_initializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_anonymous_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(OPEN_BRACE);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0)) {
				{
				setState(889);
				member_declarator_list();
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(890);
					match(COMMA);
					}
				}

				}
			}

			setState(895);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declarator_listContext extends ParserRuleContext {
		public List<Member_declaratorContext> member_declarator() {
			return getRuleContexts(Member_declaratorContext.class);
		}
		public Member_declaratorContext member_declarator(int i) {
			return getRuleContext(Member_declaratorContext.class,i);
		}
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_declarator_list(this);
		}
	}

	public final Member_declarator_listContext member_declarator_list() throws RecognitionException {
		Member_declarator_listContext _localctx = new Member_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_member_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			member_declarator();
			setState(902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(898);
					match(COMMA);
					setState(899);
					member_declarator();
					}
					} 
				}
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declaratorContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_declarator(this);
		}
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_member_declarator);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				identifier();
				setState(907);
				match(ASSIGNMENT);
				setState(908);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unbound_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Generic_dimension_specifierContext> generic_dimension_specifier() {
			return getRuleContexts(Generic_dimension_specifierContext.class);
		}
		public Generic_dimension_specifierContext generic_dimension_specifier(int i) {
			return getRuleContext(Generic_dimension_specifierContext.class,i);
		}
		public Unbound_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbound_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnbound_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnbound_type_name(this);
		}
	}

	public final Unbound_type_nameContext unbound_type_name() throws RecognitionException {
		Unbound_type_nameContext _localctx = new Unbound_type_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unbound_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			identifier();
			setState(921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_PARENS:
			case DOT:
			case LT:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(913);
					generic_dimension_specifier();
					}
				}

				}
				break;
			case DOUBLE_COLON:
				{
				setState(916);
				match(DOUBLE_COLON);
				setState(917);
				identifier();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(918);
					generic_dimension_specifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(923);
				match(DOT);
				setState(924);
				identifier();
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(925);
					generic_dimension_specifier();
					}
				}

				}
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_dimension_specifierContext extends ParserRuleContext {
		public Generic_dimension_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_dimension_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGeneric_dimension_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGeneric_dimension_specifier(this);
		}
	}

	public final Generic_dimension_specifierContext generic_dimension_specifier() throws RecognitionException {
		Generic_dimension_specifierContext _localctx = new Generic_dimension_specifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_generic_dimension_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(LT);
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(934);
				match(COMMA);
				}
				}
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsTypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public IsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIsType(this);
		}
	}

	public final IsTypeContext isType() throws RecognitionException {
		IsTypeContext _localctx = new IsTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_isType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			base_type();
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(945);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(943);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(944);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(950);
				match(INTERR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_expressionContext extends ParserRuleContext {
		public Anonymous_function_signatureContext anonymous_function_signature() {
			return getRuleContext(Anonymous_function_signatureContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Anonymous_function_bodyContext anonymous_function_body() {
			return getRuleContext(Anonymous_function_bodyContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLambda_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLambda_expression(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lambda_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(953);
				match(ASYNC);
				}
				break;
			}
			setState(956);
			anonymous_function_signature();
			setState(957);
			right_arrow();
			setState(958);
			anonymous_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_function_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() {
			return getRuleContext(Implicit_anonymous_function_parameter_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Anonymous_function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_function_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_function_signature(this);
		}
	}

	public final Anonymous_function_signatureContext anonymous_function_signature() throws RecognitionException {
		Anonymous_function_signatureContext _localctx = new Anonymous_function_signatureContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_anonymous_function_signature);
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				match(OPEN_PARENS);
				setState(961);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				match(OPEN_PARENS);
				setState(963);
				explicit_anonymous_function_parameter_list();
				setState(964);
				match(CLOSE_PARENS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(OPEN_PARENS);
				setState(967);
				implicit_anonymous_function_parameter_list();
				setState(968);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(970);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<Explicit_anonymous_function_parameterContext> explicit_anonymous_function_parameter() {
			return getRuleContexts(Explicit_anonymous_function_parameterContext.class);
		}
		public Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter(int i) {
			return getRuleContext(Explicit_anonymous_function_parameterContext.class,i);
		}
		public Explicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExplicit_anonymous_function_parameter_list(this);
		}
	}

	public final Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() throws RecognitionException {
		Explicit_anonymous_function_parameter_listContext _localctx = new Explicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_explicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			explicit_anonymous_function_parameter();
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(974);
				match(COMMA);
				setState(975);
				explicit_anonymous_function_parameter();
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_anonymous_function_parameterContext extends ParserRuleContext {
		public Token refout;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public Explicit_anonymous_function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExplicit_anonymous_function_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExplicit_anonymous_function_parameter(this);
		}
	}

	public final Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter() throws RecognitionException {
		Explicit_anonymous_function_parameterContext _localctx = new Explicit_anonymous_function_parameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_explicit_anonymous_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT || _la==REF) {
				{
				setState(981);
				((Explicit_anonymous_function_parameterContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==REF) ) {
					((Explicit_anonymous_function_parameterContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(984);
			type();
			setState(985);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Implicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_anonymous_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterImplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitImplicit_anonymous_function_parameter_list(this);
		}
	}

	public final Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() throws RecognitionException {
		Implicit_anonymous_function_parameter_listContext _localctx = new Implicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_implicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			identifier();
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(988);
				match(COMMA);
				setState(989);
				identifier();
				}
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_function_bodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Anonymous_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_function_body(this);
		}
	}

	public final Anonymous_function_bodyContext anonymous_function_body() throws RecognitionException {
		Anonymous_function_bodyContext _localctx = new Anonymous_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_anonymous_function_body);
		try {
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_expression(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			from_clause();
			setState(1000);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			match(FROM);
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1003);
				type();
				}
				break;
			}
			setState(1006);
			identifier();
			setState(1007);
			match(IN);
			setState(1008);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_bodyContext extends ParserRuleContext {
		public Select_or_group_clauseContext select_or_group_clause() {
			return getRuleContext(Select_or_group_clauseContext.class,0);
		}
		public List<Query_body_clauseContext> query_body_clause() {
			return getRuleContexts(Query_body_clauseContext.class);
		}
		public Query_body_clauseContext query_body_clause(int i) {
			return getRuleContext(Query_body_clauseContext.class,i);
		}
		public Query_continuationContext query_continuation() {
			return getRuleContext(Query_continuationContext.class,0);
		}
		public Query_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_body(this);
		}
	}

	public final Query_bodyContext query_body() throws RecognitionException {
		Query_bodyContext _localctx = new Query_bodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_query_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (FROM - 47)) | (1L << (JOIN - 47)) | (1L << (LET - 47)) | (1L << (ORDERBY - 47)) | (1L << (WHERE - 47)))) != 0)) {
				{
				{
				setState(1010);
				query_body_clause();
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1016);
			select_or_group_clause();
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(1017);
				query_continuation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_body_clauseContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Let_clauseContext let_clause() {
			return getRuleContext(Let_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Combined_join_clauseContext combined_join_clause() {
			return getRuleContext(Combined_join_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Query_body_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_body_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_body_clause(this);
		}
	}

	public final Query_body_clauseContext query_body_clause() throws RecognitionException {
		Query_body_clauseContext _localctx = new Query_body_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_query_body_clause);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				from_clause();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				let_clause();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1022);
				where_clause();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1023);
				combined_join_clause();
				}
				break;
			case ORDERBY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1024);
				orderby_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_clauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLet_clause(this);
		}
	}

	public final Let_clauseContext let_clause() throws RecognitionException {
		Let_clauseContext _localctx = new Let_clauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_let_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(LET);
			setState(1028);
			identifier();
			setState(1029);
			match(ASSIGNMENT);
			setState(1030);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(WHERE);
			setState(1033);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combined_join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public Combined_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCombined_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCombined_join_clause(this);
		}
	}

	public final Combined_join_clauseContext combined_join_clause() throws RecognitionException {
		Combined_join_clauseContext _localctx = new Combined_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_combined_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(JOIN);
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1036);
				type();
				}
				break;
			}
			setState(1039);
			identifier();
			setState(1040);
			match(IN);
			setState(1041);
			expression();
			setState(1042);
			match(ON);
			setState(1043);
			expression();
			setState(1044);
			match(EQUALS);
			setState(1045);
			expression();
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1046);
				match(INTO);
				setState(1047);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public List<OrderingContext> ordering() {
			return getRuleContexts(OrderingContext.class);
		}
		public OrderingContext ordering(int i) {
			return getRuleContext(OrderingContext.class,i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOrderby_clause(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(ORDERBY);
			setState(1051);
			ordering();
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1052);
				match(COMMA);
				setState(1053);
				ordering();
				}
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderingContext extends ParserRuleContext {
		public Token dir;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public OrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOrdering(this);
		}
	}

	public final OrderingContext ordering() throws RecognitionException {
		OrderingContext _localctx = new OrderingContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			expression();
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASCENDING || _la==DESCENDING) {
				{
				setState(1060);
				((OrderingContext)_localctx).dir = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASCENDING || _la==DESCENDING) ) {
					((OrderingContext)_localctx).dir = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_group_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public Select_or_group_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_group_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSelect_or_group_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSelect_or_group_clause(this);
		}
	}

	public final Select_or_group_clauseContext select_or_group_clause() throws RecognitionException {
		Select_or_group_clauseContext _localctx = new Select_or_group_clauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_select_or_group_clause);
		try {
			setState(1070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				match(SELECT);
				setState(1064);
				expression();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				match(GROUP);
				setState(1066);
				expression();
				setState(1067);
				match(BY);
				setState(1068);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_continuationContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_continuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_continuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_continuation(this);
		}
	}

	public final Query_continuationContext query_continuation() throws RecognitionException {
		Query_continuationContext _localctx = new Query_continuationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_query_continuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(INTO);
			setState(1073);
			identifier();
			setState(1074);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationStatementContext extends StatementContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public Local_constant_declarationContext local_constant_declaration() {
			return getRuleContext(Local_constant_declarationContext.class,0);
		}
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDeclarationStatement(this);
		}
	}
	public static class EmbeddedStatementContext extends StatementContext {
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public EmbeddedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEmbeddedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEmbeddedStatement(this);
		}
	}
	public static class LabeledStatementContext extends StatementContext {
		public Labeled_StatementContext labeled_Statement() {
			return getRuleContext(Labeled_StatementContext.class,0);
		}
		public LabeledStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLabeledStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_statement);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new LabeledStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				labeled_Statement();
				}
				break;
			case 2:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(1077);
					local_variable_declaration();
					}
					break;
				case CONST:
					{
					setState(1078);
					local_constant_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1081);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new EmbeddedStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1083);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLabeled_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLabeled_Statement(this);
		}
	}

	public final Labeled_StatementContext labeled_Statement() throws RecognitionException {
		Labeled_StatementContext _localctx = new Labeled_StatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_labeled_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			identifier();
			setState(1087);
			match(COLON);
			setState(1088);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Embedded_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public Embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEmbedded_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEmbedded_statement(this);
		}
	}

	public final Embedded_statementContext embedded_statement() throws RecognitionException {
		Embedded_statementContext _localctx = new Embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_embedded_statement);
		try {
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1090);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_embedded_statementContext extends ParserRuleContext {
		public Simple_embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_embedded_statement; }
	 
		public Simple_embedded_statementContext() { }
		public void copyFrom(Simple_embedded_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyStatementContext extends Simple_embedded_statementContext {
		public EmptyStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEmptyStatement(this);
		}
	}
	public static class TryStatementContext extends Simple_embedded_statementContext {
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTryStatement(this);
		}
	}
	public static class CheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCheckedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCheckedStatement(this);
		}
	}
	public static class ThrowStatementContext extends Simple_embedded_statementContext {
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitThrowStatement(this);
		}
	}
	public static class UnsafeStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnsafeStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnsafeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnsafeStatement(this);
		}
	}
	public static class ForStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_iteratorContext for_iterator() {
			return getRuleContext(For_iteratorContext.class,0);
		}
		public ForStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitForStatement(this);
		}
	}
	public static class BreakStatementContext extends Simple_embedded_statementContext {
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public BreakStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBreakStatement(this);
		}
	}
	public static class IfStatementContext extends Simple_embedded_statementContext {
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public IfStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIfStatement(this);
		}
	}
	public static class ReturnStatementContext extends Simple_embedded_statementContext {
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitReturnStatement(this);
		}
	}
	public static class GotoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public GotoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGotoStatement(this);
		}
	}
	public static class SwitchStatementContext extends Simple_embedded_statementContext {
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public SwitchStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitchStatement(this);
		}
	}
	public static class FixedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public FixedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixedStatement(this);
		}
	}
	public static class WhileStatementContext extends Simple_embedded_statementContext {
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public WhileStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitWhileStatement(this);
		}
	}
	public static class DoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public DoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDoStatement(this);
		}
	}
	public static class ForeachStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public ForeachStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitForeachStatement(this);
		}
	}
	public static class UncheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUncheckedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUncheckedStatement(this);
		}
	}
	public static class ExpressionStatementContext extends Simple_embedded_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpressionStatement(this);
		}
	}
	public static class ContinueStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public ContinueStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitContinueStatement(this);
		}
	}
	public static class UsingStatementContext extends Simple_embedded_statementContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Resource_acquisitionContext resource_acquisition() {
			return getRuleContext(Resource_acquisitionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public UsingStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingStatement(this);
		}
	}
	public static class LockStatementContext extends Simple_embedded_statementContext {
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public LockStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLockStatement(this);
		}
	}
	public static class YieldStatementContext extends Simple_embedded_statementContext {
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public YieldStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitYieldStatement(this);
		}
	}

	public final Simple_embedded_statementContext simple_embedded_statement() throws RecognitionException {
		Simple_embedded_statementContext _localctx = new Simple_embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_simple_embedded_statement);
		int _la;
		try {
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				expression();
				setState(1096);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1098);
				match(IF);
				setState(1099);
				match(OPEN_PARENS);
				setState(1100);
				expression();
				setState(1101);
				match(CLOSE_PARENS);
				setState(1102);
				if_body();
				setState(1105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1103);
					match(ELSE);
					setState(1104);
					if_body();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1107);
				match(SWITCH);
				setState(1108);
				match(OPEN_PARENS);
				setState(1109);
				expression();
				setState(1110);
				match(CLOSE_PARENS);
				setState(1111);
				match(OPEN_BRACE);
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1112);
					switch_section();
					}
					}
					setState(1117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1118);
				match(CLOSE_BRACE);
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1120);
				match(WHILE);
				setState(1121);
				match(OPEN_PARENS);
				setState(1122);
				expression();
				setState(1123);
				match(CLOSE_PARENS);
				setState(1124);
				embedded_statement();
				}
				break;
			case 6:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1126);
				match(DO);
				setState(1127);
				embedded_statement();
				setState(1128);
				match(WHILE);
				setState(1129);
				match(OPEN_PARENS);
				setState(1130);
				expression();
				setState(1131);
				match(CLOSE_PARENS);
				setState(1132);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1134);
				match(FOR);
				setState(1135);
				match(OPEN_PARENS);
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1136);
					for_initializer();
					}
				}

				setState(1139);
				match(SEMICOLON);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1140);
					expression();
					}
				}

				setState(1143);
				match(SEMICOLON);
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1144);
					for_iterator();
					}
				}

				setState(1147);
				match(CLOSE_PARENS);
				setState(1148);
				embedded_statement();
				}
				break;
			case 8:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1149);
				match(FOREACH);
				setState(1150);
				match(OPEN_PARENS);
				setState(1151);
				local_variable_type();
				setState(1152);
				identifier();
				setState(1153);
				match(IN);
				setState(1154);
				expression();
				setState(1155);
				match(CLOSE_PARENS);
				setState(1156);
				embedded_statement();
				}
				break;
			case 9:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1158);
				match(BREAK);
				setState(1159);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1160);
				match(CONTINUE);
				setState(1161);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1162);
				match(GOTO);
				setState(1167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(1163);
					identifier();
					}
					break;
				case CASE:
					{
					setState(1164);
					match(CASE);
					setState(1165);
					expression();
					}
					break;
				case DEFAULT:
					{
					setState(1166);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1169);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1170);
				match(RETURN);
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1171);
					expression();
					}
				}

				setState(1174);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1175);
				match(THROW);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1176);
					expression();
					}
				}

				setState(1179);
				match(SEMICOLON);
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1180);
				match(TRY);
				setState(1181);
				block();
				setState(1187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1182);
					catch_clauses();
					setState(1184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1183);
						finally_clause();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1186);
					finally_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new CheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1189);
				match(CHECKED);
				setState(1190);
				block();
				}
				break;
			case 16:
				_localctx = new UncheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1191);
				match(UNCHECKED);
				setState(1192);
				block();
				}
				break;
			case 17:
				_localctx = new LockStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1193);
				match(LOCK);
				setState(1194);
				match(OPEN_PARENS);
				setState(1195);
				expression();
				setState(1196);
				match(CLOSE_PARENS);
				setState(1197);
				embedded_statement();
				}
				break;
			case 18:
				_localctx = new UsingStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1199);
				match(USING);
				setState(1200);
				match(OPEN_PARENS);
				setState(1201);
				resource_acquisition();
				setState(1202);
				match(CLOSE_PARENS);
				setState(1203);
				embedded_statement();
				}
				break;
			case 19:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1205);
				match(YIELD);
				setState(1209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(1206);
					match(RETURN);
					setState(1207);
					expression();
					}
					break;
				case BREAK:
					{
					setState(1208);
					match(BREAK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1211);
				match(SEMICOLON);
				}
				break;
			case 20:
				_localctx = new UnsafeStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1212);
				match(UNSAFE);
				setState(1213);
				block();
				}
				break;
			case 21:
				_localctx = new FixedStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1214);
				match(FIXED);
				setState(1215);
				match(OPEN_PARENS);
				setState(1216);
				pointer_type();
				setState(1217);
				fixed_pointer_declarators();
				setState(1218);
				match(CLOSE_PARENS);
				setState(1219);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(OPEN_BRACE);
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DO) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << FROM) | (1L << GET) | (1L << GOTO) | (1L << GROUP) | (1L << IF) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LOCK) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (RETURN - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (SWITCH - 65)) | (1L << (THIS - 65)) | (1L << (THROW - 65)) | (1L << (TRUE - 65)) | (1L << (TRY - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (USING - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (WHILE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_BRACE - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (SEMICOLON - 131)) | (1L << (PLUS - 131)) | (1L << (MINUS - 131)) | (1L << (STAR - 131)) | (1L << (AMP - 131)) | (1L << (BANG - 131)) | (1L << (TILDE - 131)) | (1L << (OP_INC - 131)) | (1L << (OP_DEC - 131)))) != 0)) {
				{
				setState(1224);
				statement_list();
				}
			}

			setState(1227);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declarationContext extends ParserRuleContext {
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public List<Local_variable_declaratorContext> local_variable_declarator() {
			return getRuleContexts(Local_variable_declaratorContext.class);
		}
		public Local_variable_declaratorContext local_variable_declarator(int i) {
			return getRuleContext(Local_variable_declaratorContext.class,i);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_declaration(this);
		}
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_local_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			local_variable_type();
			setState(1230);
			local_variable_declarator();
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1231);
				match(COMMA);
				setState(1232);
				local_variable_declarator();
				}
				}
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_typeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Local_variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_type(this);
		}
	}

	public final Local_variable_typeContext local_variable_type() throws RecognitionException {
		Local_variable_typeContext _localctx = new Local_variable_typeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_local_variable_type);
		try {
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Local_variable_initializerContext local_variable_initializer() {
			return getRuleContext(Local_variable_initializerContext.class,0);
		}
		public Local_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_declarator(this);
		}
	}

	public final Local_variable_declaratorContext local_variable_declarator() throws RecognitionException {
		Local_variable_declaratorContext _localctx = new Local_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_local_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			identifier();
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1243);
				match(ASSIGNMENT);
				setState(1244);
				local_variable_initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() {
			return getRuleContext(Local_variable_initializer_unsafeContext.class,0);
		}
		public Local_variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_initializer(this);
		}
	}

	public final Local_variable_initializerContext local_variable_initializer() throws RecognitionException {
		Local_variable_initializerContext _localctx = new Local_variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_local_variable_initializer);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				array_initializer();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1249);
				local_variable_initializer_unsafe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Local_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_constant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_constant_declaration(this);
		}
	}

	public final Local_constant_declarationContext local_constant_declaration() throws RecognitionException {
		Local_constant_declarationContext _localctx = new Local_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_local_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(CONST);
			setState(1253);
			type();
			setState(1254);
			constant_declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIf_body(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_if_body);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_sectionContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_section(this);
		}
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_switch_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1261); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1260);
					switch_label();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1263); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1265);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_label(this);
		}
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switch_label);
		try {
			setState(1273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				match(CASE);
				setState(1268);
				expression();
				setState(1269);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
				match(DEFAULT);
				setState(1272);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1275);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initializerContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFor_initializer(this);
		}
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_for_initializer);
		int _la;
		try {
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1281);
				expression();
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1282);
					match(COMMA);
					setState(1283);
					expression();
					}
					}
					setState(1288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_iteratorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_iteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFor_iterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFor_iterator(this);
		}
	}

	public final For_iteratorContext for_iterator() throws RecognitionException {
		For_iteratorContext _localctx = new For_iteratorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_for_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			expression();
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1292);
				match(COMMA);
				setState(1293);
				expression();
				}
				}
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clausesContext extends ParserRuleContext {
		public List<Specific_catch_clauseContext> specific_catch_clause() {
			return getRuleContexts(Specific_catch_clauseContext.class);
		}
		public Specific_catch_clauseContext specific_catch_clause(int i) {
			return getRuleContext(Specific_catch_clauseContext.class,i);
		}
		public General_catch_clauseContext general_catch_clause() {
			return getRuleContext(General_catch_clauseContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCatch_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCatch_clauses(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_catch_clauses);
		int _la;
		try {
			int _alt;
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299);
				specific_catch_clause();
				setState(1303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1300);
						specific_catch_clause();
						}
						} 
					}
					setState(1305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1306);
					general_catch_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				general_catch_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specific_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public Specific_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSpecific_catch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSpecific_catch_clause(this);
		}
	}

	public final Specific_catch_clauseContext specific_catch_clause() throws RecognitionException {
		Specific_catch_clauseContext _localctx = new Specific_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_specific_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			match(CATCH);
			setState(1313);
			match(OPEN_PARENS);
			setState(1314);
			class_type();
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1315);
				identifier();
				}
			}

			setState(1318);
			match(CLOSE_PARENS);
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1319);
				exception_filter();
				}
			}

			setState(1322);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public General_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGeneral_catch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGeneral_catch_clause(this);
		}
	}

	public final General_catch_clauseContext general_catch_clause() throws RecognitionException {
		General_catch_clauseContext _localctx = new General_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_general_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(CATCH);
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1325);
				exception_filter();
				}
			}

			setState(1328);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_filterContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Exception_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterException_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitException_filter(this);
		}
	}

	public final Exception_filterContext exception_filter() throws RecognitionException {
		Exception_filterContext _localctx = new Exception_filterContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_exception_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(WHEN);
			setState(1331);
			match(OPEN_PARENS);
			setState(1332);
			expression();
			setState(1333);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFinally_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFinally_clause(this);
		}
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(FINALLY);
			setState(1336);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_acquisitionContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Resource_acquisitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_acquisition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterResource_acquisition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitResource_acquisition(this);
		}
	}

	public final Resource_acquisitionContext resource_acquisition() throws RecognitionException {
		Resource_acquisitionContext _localctx = new Resource_acquisitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_resource_acquisition);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1339);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_declarationContext extends ParserRuleContext {
		public Qualified_identifierContext qi;
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public Qualified_identifierContext qualified_identifier() {
			return getRuleContext(Qualified_identifierContext.class,0);
		}
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_declaration(this);
		}
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(NAMESPACE);
			setState(1343);
			((Namespace_declarationContext)_localctx).qi = qualified_identifier();
			setState(1344);
			namespace_body();
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1345);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_identifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQualified_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQualified_identifier(this);
		}
	}

	public final Qualified_identifierContext qualified_identifier() throws RecognitionException {
		Qualified_identifierContext _localctx = new Qualified_identifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_qualified_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			identifier();
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1349);
				match(DOT);
				setState(1350);
				identifier();
				}
				}
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Namespace_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_body(this);
		}
	}

	public final Namespace_bodyContext namespace_body() throws RecognitionException {
		Namespace_bodyContext _localctx = new Namespace_bodyContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namespace_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(OPEN_BRACE);
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1357);
				extern_alias_directives();
				}
				break;
			}
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1360);
				using_directives();
				}
			}

			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(1363);
				namespace_member_declarations();
				}
			}

			setState(1366);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extern_alias_directivesContext extends ParserRuleContext {
		public List<Extern_alias_directiveContext> extern_alias_directive() {
			return getRuleContexts(Extern_alias_directiveContext.class);
		}
		public Extern_alias_directiveContext extern_alias_directive(int i) {
			return getRuleContext(Extern_alias_directiveContext.class,i);
		}
		public Extern_alias_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExtern_alias_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExtern_alias_directives(this);
		}
	}

	public final Extern_alias_directivesContext extern_alias_directives() throws RecognitionException {
		Extern_alias_directivesContext _localctx = new Extern_alias_directivesContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_extern_alias_directives);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1369); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1368);
					extern_alias_directive();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1371); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extern_alias_directiveContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Extern_alias_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExtern_alias_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExtern_alias_directive(this);
		}
	}

	public final Extern_alias_directiveContext extern_alias_directive() throws RecognitionException {
		Extern_alias_directiveContext _localctx = new Extern_alias_directiveContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_extern_alias_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(EXTERN);
			setState(1374);
			match(ALIAS);
			setState(1375);
			identifier();
			setState(1376);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directivesContext extends ParserRuleContext {
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public Using_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsing_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsing_directives(this);
		}
	}

	public final Using_directivesContext using_directives() throws RecognitionException {
		Using_directivesContext _localctx = new Using_directivesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_using_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1378);
				using_directive();
				}
				}
				setState(1381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directiveContext extends ParserRuleContext {
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
	 
		public Using_directiveContext() { }
		public void copyFrom(Using_directiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingAliasDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingAliasDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingAliasDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingAliasDirective(this);
		}
	}
	public static class UsingNamespaceDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingNamespaceDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingNamespaceDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingNamespaceDirective(this);
		}
	}
	public static class UsingStaticDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingStaticDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingStaticDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingStaticDirective(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_using_directive);
		try {
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new UsingAliasDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				match(USING);
				setState(1384);
				identifier();
				setState(1385);
				match(ASSIGNMENT);
				setState(1386);
				namespace_or_type_name();
				setState(1387);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new UsingNamespaceDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1389);
				match(USING);
				setState(1390);
				namespace_or_type_name();
				setState(1391);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new UsingStaticDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1393);
				match(USING);
				setState(1394);
				match(STATIC);
				setState(1395);
				namespace_or_type_name();
				setState(1396);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationsContext extends ParserRuleContext {
		public List<Namespace_member_declarationContext> namespace_member_declaration() {
			return getRuleContexts(Namespace_member_declarationContext.class);
		}
		public Namespace_member_declarationContext namespace_member_declaration(int i) {
			return getRuleContext(Namespace_member_declarationContext.class,i);
		}
		public Namespace_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_member_declarations(this);
		}
	}

	public final Namespace_member_declarationsContext namespace_member_declarations() throws RecognitionException {
		Namespace_member_declarationsContext _localctx = new Namespace_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespace_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1400);
				namespace_member_declaration();
				}
				}
				setState(1403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationContext extends ParserRuleContext {
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Namespace_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_member_declaration(this);
		}
	}

	public final Namespace_member_declarationContext namespace_member_declaration() throws RecognitionException {
		Namespace_member_declarationContext _localctx = new Namespace_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespace_member_declaration);
		try {
			setState(1407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1405);
				namespace_declaration();
				}
				break;
			case ABSTRACT:
			case ASYNC:
			case CLASS:
			case DELEGATE:
			case ENUM:
			case EXTERN:
			case INTERFACE:
			case INTERNAL:
			case NEW:
			case OVERRIDE:
			case PARTIAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case SEALED:
			case STATIC:
			case STRUCT:
			case UNSAFE:
			case VIRTUAL:
			case VOLATILE:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1406);
				type_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declarationContext extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_declaration(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1409);
				attributes();
				}
			}

			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << EXTERN) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)))) != 0)) {
				{
				setState(1412);
				all_member_modifiers();
				}
			}

			setState(1420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1415);
				class_definition();
				}
				break;
			case STRUCT:
				{
				setState(1416);
				struct_definition();
				}
				break;
			case INTERFACE:
				{
				setState(1417);
				interface_definition();
				}
				break;
			case ENUM:
				{
				setState(1418);
				enum_definition();
				}
				break;
			case DELEGATE:
				{
				setState(1419);
				delegate_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_alias_memberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Qualified_alias_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_alias_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQualified_alias_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQualified_alias_member(this);
		}
	}

	public final Qualified_alias_memberContext qualified_alias_member() throws RecognitionException {
		Qualified_alias_memberContext _localctx = new Qualified_alias_memberContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_qualified_alias_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			identifier();
			setState(1423);
			match(DOUBLE_COLON);
			setState(1424);
			identifier();
			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1425);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_listContext extends ParserRuleContext {
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public Type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_list(this);
		}
	}

	public final Type_parameter_listContext type_parameter_list() throws RecognitionException {
		Type_parameter_listContext _localctx = new Type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(LT);
			setState(1429);
			type_parameter();
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1430);
				match(COMMA);
				setState(1431);
				type_parameter();
				}
				}
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1437);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter(this);
		}
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1439);
				attributes();
				}
			}

			setState(1442);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_baseContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Class_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_base(this);
		}
	}

	public final Class_baseContext class_base() throws RecognitionException {
		Class_baseContext _localctx = new Class_baseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_class_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(COLON);
			setState(1445);
			class_type();
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1446);
				match(COMMA);
				setState(1447);
				namespace_or_type_name();
				}
				}
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_type_listContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Interface_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_type_list(this);
		}
	}

	public final Interface_type_listContext interface_type_list() throws RecognitionException {
		Interface_type_listContext _localctx = new Interface_type_listContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interface_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			namespace_or_type_name();
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1454);
				match(COMMA);
				setState(1455);
				namespace_or_type_name();
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraints_clausesContext extends ParserRuleContext {
		public List<Type_parameter_constraints_clauseContext> type_parameter_constraints_clause() {
			return getRuleContexts(Type_parameter_constraints_clauseContext.class);
		}
		public Type_parameter_constraints_clauseContext type_parameter_constraints_clause(int i) {
			return getRuleContext(Type_parameter_constraints_clauseContext.class,i);
		}
		public Type_parameter_constraints_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints_clauses(this);
		}
	}

	public final Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() throws RecognitionException {
		Type_parameter_constraints_clausesContext _localctx = new Type_parameter_constraints_clausesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_type_parameter_constraints_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1461);
				type_parameter_constraints_clause();
				}
				}
				setState(1464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHERE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraints_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_parameter_constraintsContext type_parameter_constraints() {
			return getRuleContext(Type_parameter_constraintsContext.class,0);
		}
		public Type_parameter_constraints_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints_clause(this);
		}
	}

	public final Type_parameter_constraints_clauseContext type_parameter_constraints_clause() throws RecognitionException {
		Type_parameter_constraints_clauseContext _localctx = new Type_parameter_constraints_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_type_parameter_constraints_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(WHERE);
			setState(1467);
			identifier();
			setState(1468);
			match(COLON);
			setState(1469);
			type_parameter_constraints();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraintsContext extends ParserRuleContext {
		public Constructor_constraintContext constructor_constraint() {
			return getRuleContext(Constructor_constraintContext.class,0);
		}
		public Primary_constraintContext primary_constraint() {
			return getRuleContext(Primary_constraintContext.class,0);
		}
		public Secondary_constraintsContext secondary_constraints() {
			return getRuleContext(Secondary_constraintsContext.class,0);
		}
		public Type_parameter_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints(this);
		}
	}

	public final Type_parameter_constraintsContext type_parameter_constraints() throws RecognitionException {
		Type_parameter_constraintsContext _localctx = new Type_parameter_constraintsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_type_parameter_constraints);
		int _la;
		try {
			setState(1481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				constructor_constraint();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case CLASS:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case STRUCT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				primary_constraint();
				setState(1475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1473);
					match(COMMA);
					setState(1474);
					secondary_constraints();
					}
					break;
				}
				setState(1479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1477);
					match(COMMA);
					setState(1478);
					constructor_constraint();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_constraintContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public Primary_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPrimary_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPrimary_constraint(this);
		}
	}

	public final Primary_constraintContext primary_constraint() throws RecognitionException {
		Primary_constraintContext _localctx = new Primary_constraintContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_primary_constraint);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				class_type();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1484);
				match(CLASS);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				match(STRUCT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secondary_constraintsContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Secondary_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSecondary_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSecondary_constraints(this);
		}
	}

	public final Secondary_constraintsContext secondary_constraints() throws RecognitionException {
		Secondary_constraintsContext _localctx = new Secondary_constraintsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_secondary_constraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			namespace_or_type_name();
			setState(1493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1489);
					match(COMMA);
					setState(1490);
					namespace_or_type_name();
					}
					} 
				}
				setState(1495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_constraintContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Constructor_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_constraint(this);
		}
	}

	public final Constructor_constraintContext constructor_constraint() throws RecognitionException {
		Constructor_constraintContext _localctx = new Constructor_constraintContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_constructor_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			match(NEW);
			setState(1497);
			match(OPEN_PARENS);
			setState(1498);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Class_member_declarationsContext class_member_declarations() {
			return getRuleContext(Class_member_declarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			match(OPEN_BRACE);
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0) || _la==TILDE) {
				{
				setState(1501);
				class_member_declarations();
				}
			}

			setState(1504);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationsContext extends ParserRuleContext {
		public List<Class_member_declarationContext> class_member_declaration() {
			return getRuleContexts(Class_member_declarationContext.class);
		}
		public Class_member_declarationContext class_member_declaration(int i) {
			return getRuleContext(Class_member_declarationContext.class,i);
		}
		public Class_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_member_declarations(this);
		}
	}

	public final Class_member_declarationsContext class_member_declarations() throws RecognitionException {
		Class_member_declarationsContext _localctx = new Class_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_class_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1506);
				class_member_declaration();
				}
				}
				setState(1509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0) || _la==TILDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public Destructor_definitionContext destructor_definition() {
			return getRuleContext(Destructor_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Class_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_member_declaration(this);
		}
	}

	public final Class_member_declarationContext class_member_declaration() throws RecognitionException {
		Class_member_declarationContext _localctx = new Class_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_class_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1511);
				attributes();
				}
			}

			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1514);
				all_member_modifiers();
				}
				break;
			}
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(1517);
				common_member_declaration();
				}
				break;
			case TILDE:
				{
				setState(1518);
				destructor_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifiersContext extends ParserRuleContext {
		public List<All_member_modifierContext> all_member_modifier() {
			return getRuleContexts(All_member_modifierContext.class);
		}
		public All_member_modifierContext all_member_modifier(int i) {
			return getRuleContext(All_member_modifierContext.class,i);
		}
		public All_member_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAll_member_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAll_member_modifiers(this);
		}
	}

	public final All_member_modifiersContext all_member_modifiers() throws RecognitionException {
		All_member_modifiersContext _localctx = new All_member_modifiersContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_all_member_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1522); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1521);
					all_member_modifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1524); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifierContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public All_member_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAll_member_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAll_member_modifier(this);
		}
	}

	public final All_member_modifierContext all_member_modifier() throws RecognitionException {
		All_member_modifierContext _localctx = new All_member_modifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_all_member_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << EXTERN) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_member_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Typed_member_declarationContext typed_member_declaration() {
			return getRuleContext(Typed_member_declarationContext.class,0);
		}
		public Event_declarationContext event_declaration() {
			return getRuleContext(Event_declarationContext.class,0);
		}
		public Conversion_operator_declaratorContext conversion_operator_declarator() {
			return getRuleContext(Conversion_operator_declaratorContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public Common_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCommon_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCommon_member_declaration(this);
		}
	}

	public final Common_member_declarationContext common_member_declaration() throws RecognitionException {
		Common_member_declarationContext _localctx = new Common_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_common_member_declaration);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
				typed_member_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1530);
				event_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1531);
				conversion_operator_declarator();
				setState(1537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
				case SEMICOLON:
					{
					setState(1532);
					body();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1533);
					right_arrow();
					setState(1534);
					expression();
					setState(1535);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1539);
				constructor_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1540);
				match(VOID);
				setState(1541);
				method_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1542);
				class_definition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1543);
				struct_definition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1544);
				interface_definition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1545);
				enum_definition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1546);
				delegate_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_member_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Indexer_declarationContext indexer_declaration() {
			return getRuleContext(Indexer_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Typed_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTyped_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTyped_member_declaration(this);
		}
	}

	public final Typed_member_declarationContext typed_member_declaration() throws RecognitionException {
		Typed_member_declarationContext _localctx = new Typed_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_typed_member_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			type();
			setState(1559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1550);
				namespace_or_type_name();
				setState(1551);
				match(DOT);
				setState(1552);
				indexer_declaration();
				}
				break;
			case 2:
				{
				setState(1554);
				method_declaration();
				}
				break;
			case 3:
				{
				setState(1555);
				property_declaration();
				}
				break;
			case 4:
				{
				setState(1556);
				indexer_declaration();
				}
				break;
			case 5:
				{
				setState(1557);
				operator_declaration();
				}
				break;
			case 6:
				{
				setState(1558);
				field_declaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaratorsContext extends ParserRuleContext {
		public List<Constant_declaratorContext> constant_declarator() {
			return getRuleContexts(Constant_declaratorContext.class);
		}
		public Constant_declaratorContext constant_declarator(int i) {
			return getRuleContext(Constant_declaratorContext.class,i);
		}
		public Constant_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declarators(this);
		}
	}

	public final Constant_declaratorsContext constant_declarators() throws RecognitionException {
		Constant_declaratorsContext _localctx = new Constant_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_constant_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			constant_declarator();
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1562);
				match(COMMA);
				setState(1563);
				constant_declarator();
				}
				}
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declarator(this);
		}
	}

	public final Constant_declaratorContext constant_declarator() throws RecognitionException {
		Constant_declaratorContext _localctx = new Constant_declaratorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_constant_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			identifier();
			setState(1570);
			match(ASSIGNMENT);
			setState(1571);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_declarators(this);
		}
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			variable_declarator();
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1574);
				match(COMMA);
				setState(1575);
				variable_declarator();
				}
				}
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_declarator(this);
		}
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			identifier();
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1582);
				match(ASSIGNMENT);
				setState(1583);
				variable_initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_initializer(this);
		}
	}

	public final Variable_initializerContext variable_initializer() throws RecognitionException {
		Variable_initializerContext _localctx = new Variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_variable_initializer);
		try {
			setState(1588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1586);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1587);
				array_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_return_type);
		try {
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1591);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_nameContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_name(this);
		}
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			namespace_or_type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_body(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_method_body);
		try {
			setState(1598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Parameter_arrayContext parameter_array() {
			return getRuleContext(Parameter_arrayContext.class,0);
		}
		public Fixed_parametersContext fixed_parameters() {
			return getRuleContext(Fixed_parametersContext.class,0);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFormal_parameter_list(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_formal_parameter_list);
		int _la;
		try {
			setState(1606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				parameter_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				fixed_parameters();
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1602);
					match(COMMA);
					setState(1603);
					parameter_array();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parametersContext extends ParserRuleContext {
		public List<Fixed_parameterContext> fixed_parameter() {
			return getRuleContexts(Fixed_parameterContext.class);
		}
		public Fixed_parameterContext fixed_parameter(int i) {
			return getRuleContext(Fixed_parameterContext.class,i);
		}
		public Fixed_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_parameters(this);
		}
	}

	public final Fixed_parametersContext fixed_parameters() throws RecognitionException {
		Fixed_parametersContext _localctx = new Fixed_parametersContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_fixed_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			fixed_parameter();
			setState(1613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1609);
					match(COMMA);
					setState(1610);
					fixed_parameter();
					}
					} 
				}
				setState(1615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parameterContext extends ParserRuleContext {
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_modifierContext parameter_modifier() {
			return getRuleContext(Parameter_modifierContext.class,0);
		}
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public Fixed_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_parameter(this);
		}
	}

	public final Fixed_parameterContext fixed_parameter() throws RecognitionException {
		Fixed_parameterContext _localctx = new Fixed_parameterContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_fixed_parameter);
		int _la;
		try {
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1616);
					attributes();
					}
				}

				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (OUT - 71)) | (1L << (REF - 71)) | (1L << (THIS - 71)))) != 0)) {
					{
					setState(1619);
					parameter_modifier();
					}
				}

				setState(1622);
				arg_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1623);
				match(ARGLIST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_modifierContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Parameter_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParameter_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParameter_modifier(this);
		}
	}

	public final Parameter_modifierContext parameter_modifier() throws RecognitionException {
		Parameter_modifierContext _localctx = new Parameter_modifierContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_parameter_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (OUT - 71)) | (1L << (REF - 71)) | (1L << (THIS - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_arrayContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParameter_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParameter_array(this);
		}
	}

	public final Parameter_arrayContext parameter_array() throws RecognitionException {
		Parameter_arrayContext _localctx = new Parameter_arrayContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_parameter_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1628);
				attributes();
				}
			}

			setState(1631);
			match(PARAMS);
			setState(1632);
			array_type();
			setState(1633);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_declarationsContext extends ParserRuleContext {
		public AttributesContext attrs;
		public Accessor_modifierContext mods;
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext set_accessor_declaration() {
			return getRuleContext(Set_accessor_declarationContext.class,0);
		}
		public Get_accessor_declarationContext get_accessor_declaration() {
			return getRuleContext(Get_accessor_declarationContext.class,0);
		}
		public Accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_declarations(this);
		}
	}

	public final Accessor_declarationsContext accessor_declarations() throws RecognitionException {
		Accessor_declarationsContext _localctx = new Accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1635);
				((Accessor_declarationsContext)_localctx).attrs = attributes();
				}
			}

			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1638);
				((Accessor_declarationsContext)_localctx).mods = accessor_modifier();
				}
			}

			setState(1651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1641);
				match(GET);
				setState(1642);
				accessor_body();
				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERNAL || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PRIVATE - 75)) | (1L << (PROTECTED - 75)) | (1L << (SET - 75)) | (1L << (OPEN_BRACKET - 75)))) != 0)) {
					{
					setState(1643);
					set_accessor_declaration();
					}
				}

				}
				break;
			case SET:
				{
				setState(1646);
				match(SET);
				setState(1647);
				accessor_body();
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==INTERNAL || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PRIVATE - 75)) | (1L << (PROTECTED - 75)) | (1L << (OPEN_BRACKET - 75)))) != 0)) {
					{
					setState(1648);
					get_accessor_declaration();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Get_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGet_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGet_accessor_declaration(this);
		}
	}

	public final Get_accessor_declarationContext get_accessor_declaration() throws RecognitionException {
		Get_accessor_declarationContext _localctx = new Get_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_get_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1653);
				attributes();
				}
			}

			setState(1657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1656);
				accessor_modifier();
				}
			}

			setState(1659);
			match(GET);
			setState(1660);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSet_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSet_accessor_declaration(this);
		}
	}

	public final Set_accessor_declarationContext set_accessor_declaration() throws RecognitionException {
		Set_accessor_declarationContext _localctx = new Set_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_set_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1662);
				attributes();
				}
			}

			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1665);
				accessor_modifier();
				}
			}

			setState(1668);
			match(SET);
			setState(1669);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_modifierContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public Accessor_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_modifier(this);
		}
	}

	public final Accessor_modifierContext accessor_modifier() throws RecognitionException {
		Accessor_modifierContext _localctx = new Accessor_modifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_accessor_modifier);
		try {
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				match(PROTECTED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				match(INTERNAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1673);
				match(PRIVATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1674);
				match(PROTECTED);
				setState(1675);
				match(INTERNAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1676);
				match(INTERNAL);
				setState(1677);
				match(PROTECTED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Accessor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_body(this);
		}
	}

	public final Accessor_bodyContext accessor_body() throws RecognitionException {
		Accessor_bodyContext _localctx = new Accessor_bodyContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_accessor_body);
		try {
			setState(1682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_accessor_declarationsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Remove_accessor_declarationContext remove_accessor_declaration() {
			return getRuleContext(Remove_accessor_declarationContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public Add_accessor_declarationContext add_accessor_declaration() {
			return getRuleContext(Add_accessor_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Event_accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_accessor_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEvent_accessor_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEvent_accessor_declarations(this);
		}
	}

	public final Event_accessor_declarationsContext event_accessor_declarations() throws RecognitionException {
		Event_accessor_declarationsContext _localctx = new Event_accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_event_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1684);
				attributes();
				}
			}

			setState(1695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(1687);
				match(ADD);
				setState(1688);
				block();
				setState(1689);
				remove_accessor_declaration();
				}
				break;
			case REMOVE:
				{
				setState(1691);
				match(REMOVE);
				setState(1692);
				block();
				setState(1693);
				add_accessor_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Add_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAdd_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAdd_accessor_declaration(this);
		}
	}

	public final Add_accessor_declarationContext add_accessor_declaration() throws RecognitionException {
		Add_accessor_declarationContext _localctx = new Add_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_add_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1697);
				attributes();
				}
			}

			setState(1700);
			match(ADD);
			setState(1701);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Remove_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Remove_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRemove_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRemove_accessor_declaration(this);
		}
	}

	public final Remove_accessor_declarationContext remove_accessor_declaration() throws RecognitionException {
		Remove_accessor_declarationContext _localctx = new Remove_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_remove_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1703);
				attributes();
				}
			}

			setState(1706);
			match(REMOVE);
			setState(1707);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Overloadable_operatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Right_shiftContext right_shift() {
			return getRuleContext(Right_shiftContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(CSharpParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(CSharpParser.OP_NE, 0); }
		public Overloadable_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloadable_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOverloadable_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOverloadable_operator(this);
		}
	}

	public final Overloadable_operatorContext overloadable_operator() throws RecognitionException {
		Overloadable_operatorContext _localctx = new Overloadable_operatorContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_overloadable_operator);
		try {
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1709);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1710);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1711);
				match(BANG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1712);
				match(TILDE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1713);
				match(OP_INC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1714);
				match(OP_DEC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1715);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1716);
				match(FALSE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1717);
				match(STAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1718);
				match(DIV);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1719);
				match(PERCENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1720);
				match(AMP);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1721);
				match(BITWISE_OR);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1722);
				match(CARET);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1723);
				match(OP_LEFT_SHIFT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1724);
				right_shift();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1725);
				match(OP_EQ);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1726);
				match(OP_NE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1727);
				match(GT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1728);
				match(LT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1729);
				match(OP_GE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1730);
				match(OP_LE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conversion_operator_declaratorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public Conversion_operator_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_operator_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConversion_operator_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConversion_operator_declarator(this);
		}
	}

	public final Conversion_operator_declaratorContext conversion_operator_declarator() throws RecognitionException {
		Conversion_operator_declaratorContext _localctx = new Conversion_operator_declaratorContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_conversion_operator_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			_la = _input.LA(1);
			if ( !(_la==EXPLICIT || _la==IMPLICIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1734);
			match(OPERATOR);
			setState(1735);
			type();
			setState(1736);
			match(OPEN_PARENS);
			setState(1737);
			arg_declaration();
			setState(1738);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Constructor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_initializer(this);
		}
	}

	public final Constructor_initializerContext constructor_initializer() throws RecognitionException {
		Constructor_initializerContext _localctx = new Constructor_initializerContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_constructor_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(COLON);
			setState(1741);
			_la = _input.LA(1);
			if ( !(_la==BASE || _la==THIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1742);
			match(OPEN_PARENS);
			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(1743);
				argument_list();
				}
			}

			setState(1746);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_body);
		try {
			setState(1750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1748);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1749);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_interfacesContext extends ParserRuleContext {
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Struct_interfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_interfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_interfaces(this);
		}
	}

	public final Struct_interfacesContext struct_interfaces() throws RecognitionException {
		Struct_interfacesContext _localctx = new Struct_interfacesContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_struct_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(COLON);
			setState(1753);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Struct_member_declarationContext> struct_member_declaration() {
			return getRuleContexts(Struct_member_declarationContext.class);
		}
		public Struct_member_declarationContext struct_member_declaration(int i) {
			return getRuleContext(Struct_member_declarationContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_body(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(OPEN_BRACE);
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FIXED) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0)) {
				{
				{
				setState(1756);
				struct_member_declaration();
				}
				}
				setState(1761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1762);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public List<Fixed_size_buffer_declaratorContext> fixed_size_buffer_declarator() {
			return getRuleContexts(Fixed_size_buffer_declaratorContext.class);
		}
		public Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator(int i) {
			return getRuleContext(Fixed_size_buffer_declaratorContext.class,i);
		}
		public Struct_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_member_declaration(this);
		}
	}

	public final Struct_member_declarationContext struct_member_declaration() throws RecognitionException {
		Struct_member_declarationContext _localctx = new Struct_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_struct_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1764);
				attributes();
				}
			}

			setState(1768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1767);
				all_member_modifiers();
				}
				break;
			}
			setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(1770);
				common_member_declaration();
				}
				break;
			case FIXED:
				{
				setState(1771);
				match(FIXED);
				setState(1772);
				type();
				setState(1774); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1773);
					fixed_size_buffer_declarator();
					}
					}
					setState(1776); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0) );
				setState(1778);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_typeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArray_type(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			base_type();
			setState(1790); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR || _la==INTERR) {
					{
					{
					setState(1783);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==INTERR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1789);
				rank_specifier();
				}
				}
				setState(1792); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (OPEN_BRACKET - 124)) | (1L << (STAR - 124)) | (1L << (INTERR - 124)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rank_specifierContext extends ParserRuleContext {
		public Rank_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRank_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRank_specifier(this);
		}
	}

	public final Rank_specifierContext rank_specifier() throws RecognitionException {
		Rank_specifierContext _localctx = new Rank_specifierContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			match(OPEN_BRACKET);
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1795);
				match(COMMA);
				}
				}
				setState(1800);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1801);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Variable_initializerContext> variable_initializer() {
			return getRuleContexts(Variable_initializerContext.class);
		}
		public Variable_initializerContext variable_initializer(int i) {
			return getRuleContext(Variable_initializerContext.class,i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArray_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArray_initializer(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_array_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			match(OPEN_BRACE);
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_BRACE - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(1804);
				variable_initializer();
				setState(1809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1805);
						match(COMMA);
						setState(1806);
						variable_initializer();
						}
						} 
					}
					setState(1811);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1812);
					match(COMMA);
					}
				}

				}
			}

			setState(1817);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameter_listContext extends ParserRuleContext {
		public List<Variant_type_parameterContext> variant_type_parameter() {
			return getRuleContexts(Variant_type_parameterContext.class);
		}
		public Variant_type_parameterContext variant_type_parameter(int i) {
			return getRuleContext(Variant_type_parameterContext.class,i);
		}
		public Variant_type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariant_type_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariant_type_parameter_list(this);
		}
	}

	public final Variant_type_parameter_listContext variant_type_parameter_list() throws RecognitionException {
		Variant_type_parameter_listContext _localctx = new Variant_type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_variant_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			match(LT);
			setState(1820);
			variant_type_parameter();
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1821);
				match(COMMA);
				setState(1822);
				variant_type_parameter();
				}
				}
				setState(1827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1828);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Variance_annotationContext variance_annotation() {
			return getRuleContext(Variance_annotationContext.class,0);
		}
		public Variant_type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariant_type_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariant_type_parameter(this);
		}
	}

	public final Variant_type_parameterContext variant_type_parameter() throws RecognitionException {
		Variant_type_parameterContext _localctx = new Variant_type_parameterContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_variant_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1830);
				attributes();
				}
			}

			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(1833);
				variance_annotation();
				}
			}

			setState(1836);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variance_annotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public Variance_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariance_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariance_annotation(this);
		}
	}

	public final Variance_annotationContext variance_annotation() throws RecognitionException {
		Variance_annotationContext _localctx = new Variance_annotationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_variance_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_baseContext extends ParserRuleContext {
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Interface_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_base(this);
		}
	}

	public final Interface_baseContext interface_base() throws RecognitionException {
		Interface_baseContext _localctx = new Interface_baseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_interface_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(COLON);
			setState(1841);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Interface_member_declarationContext> interface_member_declaration() {
			return getRuleContexts(Interface_member_declarationContext.class);
		}
		public Interface_member_declarationContext interface_member_declaration(int i) {
			return getRuleContext(Interface_member_declarationContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_body(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			match(OPEN_BRACE);
			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << EVENT) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STRING - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0)) {
				{
				{
				setState(1844);
				interface_member_declaration();
				}
				}
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1850);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_member_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Interface_accessorsContext interface_accessors() {
			return getRuleContext(Interface_accessorsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_member_declaration(this);
		}
	}

	public final Interface_member_declarationContext interface_member_declaration() throws RecognitionException {
		Interface_member_declarationContext _localctx = new Interface_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_interface_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1852);
				attributes();
				}
			}

			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(1855);
				match(NEW);
				}
			}

			setState(1914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(1858);
					match(UNSAFE);
					}
				}

				setState(1861);
				type();
				setState(1889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1862);
					identifier();
					setState(1864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1863);
						type_parameter_list();
						}
					}

					setState(1866);
					match(OPEN_PARENS);
					setState(1868);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
						{
						setState(1867);
						formal_parameter_list();
						}
					}

					setState(1870);
					match(CLOSE_PARENS);
					setState(1872);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(1871);
						type_parameter_constraints_clauses();
						}
					}

					setState(1874);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(1876);
					identifier();
					setState(1877);
					match(OPEN_BRACE);
					setState(1878);
					interface_accessors();
					setState(1879);
					match(CLOSE_BRACE);
					}
					break;
				case 3:
					{
					setState(1881);
					match(THIS);
					setState(1882);
					match(OPEN_BRACKET);
					setState(1883);
					formal_parameter_list();
					setState(1884);
					match(CLOSE_BRACKET);
					setState(1885);
					match(OPEN_BRACE);
					setState(1886);
					interface_accessors();
					setState(1887);
					match(CLOSE_BRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(1891);
					match(UNSAFE);
					}
				}

				setState(1894);
				match(VOID);
				setState(1895);
				identifier();
				setState(1897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1896);
					type_parameter_list();
					}
				}

				setState(1899);
				match(OPEN_PARENS);
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
					{
					setState(1900);
					formal_parameter_list();
					}
				}

				setState(1903);
				match(CLOSE_PARENS);
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1904);
					type_parameter_constraints_clauses();
					}
				}

				setState(1907);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(1909);
				match(EVENT);
				setState(1910);
				type();
				setState(1911);
				identifier();
				setState(1912);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_accessorsContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public Interface_accessorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_accessors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_accessors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_accessors(this);
		}
	}

	public final Interface_accessorsContext interface_accessors() throws RecognitionException {
		Interface_accessorsContext _localctx = new Interface_accessorsContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_interface_accessors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1916);
				attributes();
				}
			}

			setState(1937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1919);
				match(GET);
				setState(1920);
				match(SEMICOLON);
				setState(1926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET || _la==OPEN_BRACKET) {
					{
					setState(1922);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(1921);
						attributes();
						}
					}

					setState(1924);
					match(SET);
					setState(1925);
					match(SEMICOLON);
					}
				}

				}
				break;
			case SET:
				{
				setState(1928);
				match(SET);
				setState(1929);
				match(SEMICOLON);
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==OPEN_BRACKET) {
					{
					setState(1931);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(1930);
						attributes();
						}
					}

					setState(1933);
					match(GET);
					setState(1934);
					match(SEMICOLON);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_baseContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Enum_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_base(this);
		}
	}

	public final Enum_baseContext enum_base() throws RecognitionException {
		Enum_baseContext _localctx = new Enum_baseContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_enum_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			match(COLON);
			setState(1940);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Enum_member_declarationContext> enum_member_declaration() {
			return getRuleContexts(Enum_member_declarationContext.class);
		}
		public Enum_member_declarationContext enum_member_declaration(int i) {
			return getRuleContext(Enum_member_declarationContext.class,i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_body(this);
		}
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_enum_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			match(OPEN_BRACE);
			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (OPEN_BRACKET - 68)))) != 0)) {
				{
				setState(1943);
				enum_member_declaration();
				setState(1948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1944);
						match(COMMA);
						setState(1945);
						enum_member_declaration();
						}
						} 
					}
					setState(1950);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				}
				setState(1952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1951);
					match(COMMA);
					}
				}

				}
			}

			setState(1956);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_member_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Enum_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_member_declaration(this);
		}
	}

	public final Enum_member_declarationContext enum_member_declaration() throws RecognitionException {
		Enum_member_declarationContext _localctx = new Enum_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_enum_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1958);
				attributes();
				}
			}

			setState(1961);
			identifier();
			setState(1964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1962);
				match(ASSIGNMENT);
				setState(1963);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_sectionContext extends ParserRuleContext {
		public Global_attribute_targetContext global_attribute_target() {
			return getRuleContext(Global_attribute_targetContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Global_attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGlobal_attribute_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGlobal_attribute_section(this);
		}
	}

	public final Global_attribute_sectionContext global_attribute_section() throws RecognitionException {
		Global_attribute_sectionContext _localctx = new Global_attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_global_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(OPEN_BRACKET);
			setState(1967);
			global_attribute_target();
			setState(1968);
			match(COLON);
			setState(1969);
			attribute_list();
			setState(1971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1970);
				match(COMMA);
				}
			}

			setState(1973);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Global_attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGlobal_attribute_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGlobal_attribute_target(this);
		}
	}

	public final Global_attribute_targetContext global_attribute_target() throws RecognitionException {
		Global_attribute_targetContext _localctx = new Global_attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_global_attribute_target);
		try {
			setState(1977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case AS:
			case BASE:
			case BOOL:
			case BREAK:
			case BYTE:
			case CASE:
			case CATCH:
			case CHAR:
			case CHECKED:
			case CLASS:
			case CONST:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DO:
			case DOUBLE:
			case ELSE:
			case ENUM:
			case EVENT:
			case EXPLICIT:
			case EXTERN:
			case FALSE:
			case FINALLY:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case GOTO:
			case IF:
			case IMPLICIT:
			case IN:
			case INT:
			case INTERFACE:
			case INTERNAL:
			case IS:
			case LOCK:
			case LONG:
			case NAMESPACE:
			case NEW:
			case NULL:
			case OBJECT:
			case OPERATOR:
			case OUT:
			case OVERRIDE:
			case PARAMS:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case REF:
			case RETURN:
			case SBYTE:
			case SEALED:
			case SHORT:
			case SIZEOF:
			case STACKALLOC:
			case STATIC:
			case STRING:
			case STRUCT:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VIRTUAL:
			case VOID:
			case VOLATILE:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1975);
				keyword();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1976);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<Attribute_sectionContext> attribute_section() {
			return getRuleContexts(Attribute_sectionContext.class);
		}
		public Attribute_sectionContext attribute_section(int i) {
			return getRuleContext(Attribute_sectionContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1979);
				attribute_section();
				}
				}
				setState(1982); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_sectionContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Attribute_targetContext attribute_target() {
			return getRuleContext(Attribute_targetContext.class,0);
		}
		public Attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_section(this);
		}
	}

	public final Attribute_sectionContext attribute_section() throws RecognitionException {
		Attribute_sectionContext _localctx = new Attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			match(OPEN_BRACKET);
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1985);
				attribute_target();
				setState(1986);
				match(COLON);
				}
				break;
			}
			setState(1990);
			attribute_list();
			setState(1992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1991);
				match(COMMA);
				}
			}

			setState(1994);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_target(this);
		}
	}

	public final Attribute_targetContext attribute_target() throws RecognitionException {
		Attribute_targetContext _localctx = new Attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_attribute_target);
		try {
			setState(1998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case AS:
			case BASE:
			case BOOL:
			case BREAK:
			case BYTE:
			case CASE:
			case CATCH:
			case CHAR:
			case CHECKED:
			case CLASS:
			case CONST:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DO:
			case DOUBLE:
			case ELSE:
			case ENUM:
			case EVENT:
			case EXPLICIT:
			case EXTERN:
			case FALSE:
			case FINALLY:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case GOTO:
			case IF:
			case IMPLICIT:
			case IN:
			case INT:
			case INTERFACE:
			case INTERNAL:
			case IS:
			case LOCK:
			case LONG:
			case NAMESPACE:
			case NEW:
			case NULL:
			case OBJECT:
			case OPERATOR:
			case OUT:
			case OVERRIDE:
			case PARAMS:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case REF:
			case RETURN:
			case SBYTE:
			case SEALED:
			case SHORT:
			case SIZEOF:
			case STACKALLOC:
			case STATIC:
			case STRING:
			case STRUCT:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VIRTUAL:
			case VOID:
			case VOLATILE:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1996);
				keyword();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_list(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			attribute();
			setState(2005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2001);
					match(COMMA);
					setState(2002);
					attribute();
					}
					} 
				}
				setState(2007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<Attribute_argumentContext> attribute_argument() {
			return getRuleContexts(Attribute_argumentContext.class);
		}
		public Attribute_argumentContext attribute_argument(int i) {
			return getRuleContext(Attribute_argumentContext.class,i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			namespace_or_type_name();
			setState(2021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(2009);
				match(OPEN_PARENS);
				setState(2018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(2010);
					attribute_argument();
					setState(2015);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2011);
						match(COMMA);
						setState(2012);
						attribute_argument();
						}
						}
						setState(2017);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2020);
				match(CLOSE_PARENS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_argument(this);
		}
	}

	public final Attribute_argumentContext attribute_argument() throws RecognitionException {
		Attribute_argumentContext _localctx = new Attribute_argumentContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_attribute_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2023);
				identifier();
				setState(2024);
				match(COLON);
				}
				break;
			}
			setState(2028);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPointer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPointer_type(this);
		}
	}

	public final Pointer_typeContext pointer_type() throws RecognitionException {
		Pointer_typeContext _localctx = new Pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_pointer_type);
		int _la;
		try {
			setState(2045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2032);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SBYTE:
				case SHORT:
				case UINT:
				case ULONG:
				case USHORT:
					{
					setState(2030);
					simple_type();
					}
					break;
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case STRING:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(2031);
					class_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET || _la==INTERR) {
					{
					setState(2036);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(2034);
						rank_specifier();
						}
						break;
					case INTERR:
						{
						setState(2035);
						match(INTERR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2040);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2041);
				match(STAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2043);
				match(VOID);
				setState(2044);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_declaratorsContext extends ParserRuleContext {
		public List<Fixed_pointer_declaratorContext> fixed_pointer_declarator() {
			return getRuleContexts(Fixed_pointer_declaratorContext.class);
		}
		public Fixed_pointer_declaratorContext fixed_pointer_declarator(int i) {
			return getRuleContext(Fixed_pointer_declaratorContext.class,i);
		}
		public Fixed_pointer_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_declarators(this);
		}
	}

	public final Fixed_pointer_declaratorsContext fixed_pointer_declarators() throws RecognitionException {
		Fixed_pointer_declaratorsContext _localctx = new Fixed_pointer_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_fixed_pointer_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			fixed_pointer_declarator();
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2048);
				match(COMMA);
				setState(2049);
				fixed_pointer_declarator();
				}
				}
				setState(2054);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Fixed_pointer_initializerContext fixed_pointer_initializer() {
			return getRuleContext(Fixed_pointer_initializerContext.class,0);
		}
		public Fixed_pointer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_declarator(this);
		}
	}

	public final Fixed_pointer_declaratorContext fixed_pointer_declarator() throws RecognitionException {
		Fixed_pointer_declaratorContext _localctx = new Fixed_pointer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_fixed_pointer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			identifier();
			setState(2056);
			match(ASSIGNMENT);
			setState(2057);
			fixed_pointer_initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() {
			return getRuleContext(Local_variable_initializer_unsafeContext.class,0);
		}
		public Fixed_pointer_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_initializer(this);
		}
	}

	public final Fixed_pointer_initializerContext fixed_pointer_initializer() throws RecognitionException {
		Fixed_pointer_initializerContext _localctx = new Fixed_pointer_initializerContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_fixed_pointer_initializer);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2060);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2059);
					match(AMP);
					}
					break;
				}
				setState(2062);
				expression();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2063);
				local_variable_initializer_unsafe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_size_buffer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Fixed_size_buffer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_size_buffer_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_size_buffer_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_size_buffer_declarator(this);
		}
	}

	public final Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator() throws RecognitionException {
		Fixed_size_buffer_declaratorContext _localctx = new Fixed_size_buffer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_fixed_size_buffer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			identifier();
			setState(2067);
			match(OPEN_BRACKET);
			setState(2068);
			expression();
			setState(2069);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_initializer_unsafeContext extends ParserRuleContext {
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Local_variable_initializer_unsafeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer_unsafe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_initializer_unsafe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_initializer_unsafe(this);
		}
	}

	public final Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() throws RecognitionException {
		Local_variable_initializer_unsafeContext _localctx = new Local_variable_initializer_unsafeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_local_variable_initializer_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			match(STACKALLOC);
			setState(2072);
			type();
			setState(2073);
			match(OPEN_BRACKET);
			setState(2074);
			expression();
			setState(2075);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_arrowContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_arrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_arrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_arrow(this);
		}
	}

	public final Right_arrowContext right_arrow() throws RecognitionException {
		Right_arrowContext _localctx = new Right_arrowContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_right_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2077);
			((Right_arrowContext)_localctx).first = match(ASSIGNMENT);
			setState(2078);
			((Right_arrowContext)_localctx).second = match(GT);
			setState(2079);
			if (!((((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shiftContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_shift(this);
		}
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			((Right_shiftContext)_localctx).first = match(GT);
			setState(2082);
			((Right_shiftContext)_localctx).second = match(GT);
			setState(2083);
			if (!((((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shift_assignmentContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_shift_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_shift_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_shift_assignment(this);
		}
	}

	public final Right_shift_assignmentContext right_shift_assignment() throws RecognitionException {
		Right_shift_assignmentContext _localctx = new Right_shift_assignmentContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_right_shift_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			((Right_shift_assignmentContext)_localctx).first = match(GT);
			setState(2086);
			((Right_shift_assignmentContext)_localctx).second = match(OP_GE);
			setState(2087);
			if (!((((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(CSharpParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(CSharpParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(CSharpParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CSharpParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_literal);
		try {
			setState(2096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2089);
				boolean_literal();
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2090);
				string_literal();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2091);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2092);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2093);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2094);
				match(CHARACTER_LITERAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(2095);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public Interpolated_regular_stringContext interpolated_regular_string() {
			return getRuleContext(Interpolated_regular_stringContext.class,0);
		}
		public Interpolated_verbatium_stringContext interpolated_verbatium_string() {
			return getRuleContext(Interpolated_verbatium_stringContext.class,0);
		}
		public TerminalNode REGULAR_STRING() { return getToken(CSharpParser.REGULAR_STRING, 0); }
		public TerminalNode VERBATIUM_STRING() { return getToken(CSharpParser.VERBATIUM_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_string_literal);
		try {
			setState(2104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(2100);
				interpolated_regular_string();
				}
				break;
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				interpolated_verbatium_string();
				}
				break;
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2102);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2103);
				match(VERBATIUM_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_regular_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_REGULAR_STRING_START() { return getToken(CSharpParser.INTERPOLATED_REGULAR_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_regular_string_partContext> interpolated_regular_string_part() {
			return getRuleContexts(Interpolated_regular_string_partContext.class);
		}
		public Interpolated_regular_string_partContext interpolated_regular_string_part(int i) {
			return getRuleContext(Interpolated_regular_string_partContext.class,i);
		}
		public Interpolated_regular_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_regular_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_regular_string(this);
		}
	}

	public final Interpolated_regular_stringContext interpolated_regular_string() throws RecognitionException {
		Interpolated_regular_stringContext _localctx = new Interpolated_regular_stringContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(2110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)) | (1L << (DOUBLE_CURLY_INSIDE - 132)) | (1L << (REGULAR_CHAR_INSIDE - 132)) | (1L << (REGULAR_STRING_INSIDE - 132)))) != 0)) {
				{
				{
				setState(2107);
				interpolated_regular_string_part();
				}
				}
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2113);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_verbatium_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_VERBATIUM_STRING_START() { return getToken(CSharpParser.INTERPOLATED_VERBATIUM_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_verbatium_string_partContext> interpolated_verbatium_string_part() {
			return getRuleContexts(Interpolated_verbatium_string_partContext.class);
		}
		public Interpolated_verbatium_string_partContext interpolated_verbatium_string_part(int i) {
			return getRuleContext(Interpolated_verbatium_string_partContext.class,i);
		}
		public Interpolated_verbatium_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_verbatium_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_verbatium_string(this);
		}
	}

	public final Interpolated_verbatium_stringContext interpolated_verbatium_string() throws RecognitionException {
		Interpolated_verbatium_stringContext _localctx = new Interpolated_verbatium_stringContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_interpolated_verbatium_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			match(INTERPOLATED_VERBATIUM_STRING_START);
			setState(2119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)) | (1L << (DOUBLE_CURLY_INSIDE - 132)) | (1L << (VERBATIUM_DOUBLE_QUOTE_INSIDE - 132)) | (1L << (VERBATIUM_INSIDE_STRING - 132)))) != 0)) {
				{
				{
				setState(2116);
				interpolated_verbatium_string_part();
				}
				}
				setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2122);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_regular_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode REGULAR_CHAR_INSIDE() { return getToken(CSharpParser.REGULAR_CHAR_INSIDE, 0); }
		public TerminalNode REGULAR_STRING_INSIDE() { return getToken(CSharpParser.REGULAR_STRING_INSIDE, 0); }
		public Interpolated_regular_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_regular_string_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_regular_string_part(this);
		}
	}

	public final Interpolated_regular_string_partContext interpolated_regular_string_part() throws RecognitionException {
		Interpolated_regular_string_partContext _localctx = new Interpolated_regular_string_partContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_interpolated_regular_string_part);
		try {
			setState(2128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2125);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2126);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2127);
				match(REGULAR_STRING_INSIDE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_verbatium_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode VERBATIUM_DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.VERBATIUM_DOUBLE_QUOTE_INSIDE, 0); }
		public TerminalNode VERBATIUM_INSIDE_STRING() { return getToken(CSharpParser.VERBATIUM_INSIDE_STRING, 0); }
		public Interpolated_verbatium_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_verbatium_string_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_verbatium_string_part(this);
		}
	}

	public final Interpolated_verbatium_string_partContext interpolated_verbatium_string_part() throws RecognitionException {
		Interpolated_verbatium_string_partContext _localctx = new Interpolated_verbatium_string_partContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_interpolated_verbatium_string_part);
		try {
			setState(2134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2130);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2131);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case VERBATIUM_DOUBLE_QUOTE_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2132);
				match(VERBATIUM_DOUBLE_QUOTE_INSIDE);
				}
				break;
			case VERBATIUM_INSIDE_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2133);
				match(VERBATIUM_INSIDE_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_string_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> FORMAT_STRING() { return getTokens(CSharpParser.FORMAT_STRING); }
		public TerminalNode FORMAT_STRING(int i) {
			return getToken(CSharpParser.FORMAT_STRING, i);
		}
		public Interpolated_string_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_string_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_string_expression(this);
		}
	}

	public final Interpolated_string_expressionContext interpolated_string_expression() throws RecognitionException {
		Interpolated_string_expressionContext _localctx = new Interpolated_string_expressionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			expression();
			setState(2141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2137);
				match(COMMA);
				setState(2138);
				expression();
				}
				}
				setState(2143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2144);
				match(COLON);
				setState(2146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2145);
					match(FORMAT_STRING);
					}
					}
					setState(2148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FORMAT_STRING );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(CSharpParser.AS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode IS() { return getToken(CSharpParser.IS, 0); }
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << AS) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CASE) | (1L << CATCH) | (1L << CHAR) | (1L << CHECKED) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DO) | (1L << DOUBLE) | (1L << ELSE) | (1L << ENUM) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FALSE) | (1L << FINALLY) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << GOTO) | (1L << IF) | (1L << IMPLICIT) | (1L << IN) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IS) | (1L << LOCK) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (OPERATOR - 64)) | (1L << (OUT - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARAMS - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (REF - 64)) | (1L << (RETURN - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCT - 64)) | (1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (THROW - 64)) | (1L << (TRUE - 64)) | (1L << (TRY - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (USING - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Class_baseContext class_base() {
			return getRuleContext(Class_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_definition(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2154);
			match(CLASS);
			setState(2155);
			identifier();
			setState(2157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2156);
				type_parameter_list();
				}
			}

			setState(2160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2159);
				class_base();
				}
			}

			setState(2163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2162);
				type_parameter_constraints_clauses();
				}
			}

			setState(2165);
			class_body();
			setState(2167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2166);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_definitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Struct_interfacesContext struct_interfaces() {
			return getRuleContext(Struct_interfacesContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_definition(this);
		}
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			match(STRUCT);
			setState(2170);
			identifier();
			setState(2172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2171);
				type_parameter_list();
				}
			}

			setState(2175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2174);
				struct_interfaces();
				}
			}

			setState(2178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2177);
				type_parameter_constraints_clauses();
				}
			}

			setState(2180);
			struct_body();
			setState(2182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2181);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_definitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Interface_baseContext interface_base() {
			return getRuleContext(Interface_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_definition(this);
		}
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			match(INTERFACE);
			setState(2185);
			identifier();
			setState(2187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2186);
				variant_type_parameter_list();
				}
			}

			setState(2190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2189);
				interface_base();
				}
			}

			setState(2193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2192);
				type_parameter_constraints_clauses();
				}
			}

			setState(2195);
			interface_body();
			setState(2197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2196);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_definitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
		}
		public Enum_baseContext enum_base() {
			return getRuleContext(Enum_baseContext.class,0);
		}
		public Enum_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_definition(this);
		}
	}

	public final Enum_definitionContext enum_definition() throws RecognitionException {
		Enum_definitionContext _localctx = new Enum_definitionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_enum_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(ENUM);
			setState(2200);
			identifier();
			setState(2202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2201);
				enum_base();
				}
			}

			setState(2204);
			enum_body();
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2205);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delegate_definitionContext extends ParserRuleContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Delegate_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegate_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDelegate_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDelegate_definition(this);
		}
	}

	public final Delegate_definitionContext delegate_definition() throws RecognitionException {
		Delegate_definitionContext _localctx = new Delegate_definitionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_delegate_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(DELEGATE);
			setState(2209);
			return_type();
			setState(2210);
			identifier();
			setState(2212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2211);
				variant_type_parameter_list();
				}
			}

			setState(2214);
			match(OPEN_PARENS);
			setState(2216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
				{
				setState(2215);
				formal_parameter_list();
				}
			}

			setState(2218);
			match(CLOSE_PARENS);
			setState(2220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2219);
				type_parameter_constraints_clauses();
				}
			}

			setState(2222);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_declarationContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Event_accessor_declarationsContext event_accessor_declarations() {
			return getRuleContext(Event_accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Event_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEvent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEvent_declaration(this);
		}
	}

	public final Event_declarationContext event_declaration() throws RecognitionException {
		Event_declarationContext _localctx = new Event_declarationContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_event_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			match(EVENT);
			setState(2225);
			type();
			setState(2234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2226);
				variable_declarators();
				setState(2227);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(2229);
				member_name();
				setState(2230);
				match(OPEN_BRACE);
				setState(2231);
				event_accessor_declarations();
				setState(2232);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declarationContext extends ParserRuleContext {
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterField_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitField_declaration(this);
		}
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			variable_declarators();
			setState(2237);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_declarationContext extends ParserRuleContext {
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitProperty_declaration(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			member_name();
			setState(2253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2240);
				match(OPEN_BRACE);
				setState(2241);
				accessor_declarations();
				setState(2242);
				match(CLOSE_BRACE);
				setState(2247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(2243);
					match(ASSIGNMENT);
					setState(2244);
					variable_initializer();
					setState(2245);
					match(SEMICOLON);
					}
				}

				}
				break;
			case ASSIGNMENT:
				{
				setState(2249);
				right_arrow();
				setState(2250);
				expression();
				setState(2251);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declaration(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(CONST);
			setState(2256);
			type();
			setState(2257);
			constant_declarators();
			setState(2258);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexer_declarationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Indexer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIndexer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIndexer_declaration(this);
		}
	}

	public final Indexer_declarationContext indexer_declaration() throws RecognitionException {
		Indexer_declarationContext _localctx = new Indexer_declarationContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_indexer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			match(THIS);
			setState(2261);
			match(OPEN_BRACKET);
			setState(2262);
			formal_parameter_list();
			setState(2263);
			match(CLOSE_BRACKET);
			setState(2272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2264);
				match(OPEN_BRACE);
				setState(2265);
				accessor_declarations();
				setState(2266);
				match(CLOSE_BRACE);
				}
				break;
			case ASSIGNMENT:
				{
				setState(2268);
				right_arrow();
				setState(2269);
				expression();
				setState(2270);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Destructor_definitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Destructor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDestructor_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDestructor_definition(this);
		}
	}

	public final Destructor_definitionContext destructor_definition() throws RecognitionException {
		Destructor_definitionContext _localctx = new Destructor_definitionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_destructor_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2274);
			match(TILDE);
			setState(2275);
			identifier();
			setState(2276);
			match(OPEN_PARENS);
			setState(2277);
			match(CLOSE_PARENS);
			setState(2278);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Constructor_initializerContext constructor_initializer() {
			return getRuleContext(Constructor_initializerContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_declaration(this);
		}
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			identifier();
			setState(2281);
			match(OPEN_PARENS);
			setState(2283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
				{
				setState(2282);
				formal_parameter_list();
				}
			}

			setState(2285);
			match(CLOSE_PARENS);
			setState(2287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2286);
				constructor_initializer();
				}
			}

			setState(2289);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_member_nameContext method_member_name() {
			return getRuleContext(Method_member_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			method_member_name();
			setState(2293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2292);
				type_parameter_list();
				}
			}

			setState(2295);
			match(OPEN_PARENS);
			setState(2297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)))) != 0)) {
				{
				setState(2296);
				formal_parameter_list();
				}
			}

			setState(2299);
			match(CLOSE_PARENS);
			setState(2301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2300);
				type_parameter_constraints_clauses();
				}
			}

			setState(2308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2303);
				method_body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2304);
				right_arrow();
				setState(2305);
				expression();
				setState(2306);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_member_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Method_member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_member_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_member_name(this);
		}
	}

	public final Method_member_nameContext method_member_name() throws RecognitionException {
		Method_member_nameContext _localctx = new Method_member_nameContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_method_member_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2310);
				identifier();
				}
				break;
			case 2:
				{
				setState(2311);
				identifier();
				setState(2312);
				match(DOUBLE_COLON);
				setState(2313);
				identifier();
				}
				break;
			}
			setState(2324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2317);
						type_argument_list();
						}
					}

					setState(2320);
					match(DOT);
					setState(2321);
					identifier();
					}
					} 
				}
				setState(2326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_declarationContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public Overloadable_operatorContext overloadable_operator() {
			return getRuleContext(Overloadable_operatorContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<Arg_declarationContext> arg_declaration() {
			return getRuleContexts(Arg_declarationContext.class);
		}
		public Arg_declarationContext arg_declaration(int i) {
			return getRuleContext(Arg_declarationContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOperator_declaration(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_operator_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			match(OPERATOR);
			setState(2328);
			overloadable_operator();
			setState(2329);
			match(OPEN_PARENS);
			setState(2330);
			arg_declaration();
			setState(2333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2331);
				match(COMMA);
				setState(2332);
				arg_declaration();
				}
			}

			setState(2335);
			match(CLOSE_PARENS);
			setState(2341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2336);
				body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2337);
				right_arrow();
				setState(2338);
				expression();
				setState(2339);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arg_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArg_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArg_declaration(this);
		}
	}

	public final Arg_declarationContext arg_declaration() throws RecognitionException {
		Arg_declarationContext _localctx = new Arg_declarationContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_arg_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			type();
			setState(2344);
			identifier();
			setState(2347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2345);
				match(ASSIGNMENT);
				setState(2346);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_invocationContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_invocation(this);
		}
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			match(OPEN_PARENS);
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(2350);
				argument_list();
				}
			}

			setState(2353);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_creation_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Object_creation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_creation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_creation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_creation_expression(this);
		}
	}

	public final Object_creation_expressionContext object_creation_expression() throws RecognitionException {
		Object_creation_expressionContext _localctx = new Object_creation_expressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_object_creation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			match(OPEN_PARENS);
			setState(2357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(2356);
				argument_list();
				}
			}

			setState(2359);
			match(CLOSE_PARENS);
			setState(2361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(2360);
				object_or_collection_initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CSharpParser.IDENTIFIER, 0); }
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 171:
			return right_arrow_sempred((Right_arrowContext)_localctx, predIndex);
		case 172:
			return right_shift_sempred((Right_shiftContext)_localctx, predIndex);
		case 173:
			return right_shift_assignment_sempred((Right_shift_assignmentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean right_arrow_sempred(Right_arrowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return (((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_sempred(Right_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return (((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_assignment_sempred(Right_shift_assignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return (((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c2\u0940\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\3\2\5\2\u0198\n\2\3\2"+
		"\5\2\u019b\n\2\3\2\5\2\u019e\n\2\3\2\7\2\u01a1\n\2\f\2\16\2\u01a4\13\2"+
		"\3\2\5\2\u01a7\n\2\3\2\3\2\3\3\3\3\5\3\u01ad\n\3\3\3\5\3\u01b0\n\3\3\3"+
		"\3\3\3\3\5\3\u01b5\n\3\7\3\u01b7\n\3\f\3\16\3\u01ba\13\3\3\4\3\4\3\4\3"+
		"\4\7\4\u01c0\n\4\f\4\16\4\u01c3\13\4\3\5\3\5\3\5\3\5\5\5\u01c9\n\5\3\6"+
		"\3\6\5\6\u01cd\n\6\3\7\3\7\3\7\5\7\u01d2\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\n\u01dc\n\n\3\13\3\13\3\13\3\13\7\13\u01e2\n\13\f\13\16\13\u01e5"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u01ec\n\f\f\f\16\f\u01ef\13\f\3\r\3\r"+
		"\3\r\5\r\u01f4\n\r\3\r\5\r\u01f7\n\r\3\r\3\r\3\16\3\16\5\16\u01fd\n\16"+
		"\3\17\3\17\3\17\5\17\u0202\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0213\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u021b\n\22\3\23\3\23\3\23\5\23\u0220\n\23\3\24\3\24\3"+
		"\24\7\24\u0225\n\24\f\24\16\24\u0228\13\24\3\25\3\25\3\25\7\25\u022d\n"+
		"\25\f\25\16\25\u0230\13\25\3\26\3\26\3\26\7\26\u0235\n\26\f\26\16\26\u0238"+
		"\13\26\3\27\3\27\3\27\7\27\u023d\n\27\f\27\16\27\u0240\13\27\3\30\3\30"+
		"\3\30\7\30\u0245\n\30\f\30\16\30\u0248\13\30\3\31\3\31\3\31\7\31\u024d"+
		"\n\31\f\31\16\31\u0250\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0259"+
		"\n\32\f\32\16\32\u025c\13\32\3\33\3\33\3\33\5\33\u0261\n\33\3\33\7\33"+
		"\u0264\n\33\f\33\16\33\u0267\13\33\3\34\3\34\3\34\7\34\u026c\n\34\f\34"+
		"\16\34\u026f\13\34\3\35\3\35\3\35\7\35\u0274\n\35\f\35\16\35\u0277\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0291\n\36"+
		"\3\37\3\37\7\37\u0295\n\37\f\37\16\37\u0298\13\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u02a0\n\37\3\37\7\37\u02a3\n\37\f\37\16\37\u02a6\13\37"+
		"\7\37\u02a8\n\37\f\37\16\37\u02ab\13\37\3 \3 \3 \5 \u02b0\n \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02be\n \3 \3 \3 \3 \5 \u02c4\n \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \7 \u02ce\n \f \16 \u02d1\13 \3 \5 \u02d4\n \3 \6 \u02d7"+
		"\n \r \16 \u02d8\3 \3 \5 \u02dd\n \3 \3 \3 \3 \5 \u02e3\n \3 \3 \3 \3"+
		" \3 \5 \u02ea\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5"+
		" \u02fd\n \3 \3 \3 \5 \u0302\n \3 \5 \u0305\n \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \7 \u0312\n \f \16 \u0315\13 \3 \3 \3 \5 \u031a\n \3!\5!\u031d"+
		"\n!\3!\3!\3!\5!\u0322\n!\3\"\5\"\u0325\n\"\3\"\3\"\3\"\3\"\7\"\u032b\n"+
		"\"\f\"\16\"\u032e\13\"\3\"\3\"\3#\3#\3#\5#\u0335\n#\3#\3#\3$\3$\3%\3%"+
		"\3%\7%\u033e\n%\f%\16%\u0341\13%\3&\3&\5&\u0345\n&\3\'\3\'\3\'\5\'\u034a"+
		"\n\'\5\'\u034c\n\'\3\'\3\'\3(\3(\3(\7(\u0353\n(\f(\16(\u0356\13(\3)\3"+
		")\3)\3)\3)\5)\u035d\n)\3)\3)\3)\3*\3*\5*\u0364\n*\3+\3+\3+\3+\7+\u036a"+
		"\n+\f+\16+\u036d\13+\3+\5+\u0370\n+\3+\3+\3,\3,\3,\3,\3,\5,\u0379\n,\3"+
		"-\3-\3-\5-\u037e\n-\5-\u0380\n-\3-\3-\3.\3.\3.\7.\u0387\n.\f.\16.\u038a"+
		"\13.\3/\3/\3/\3/\3/\5/\u0391\n/\3\60\3\60\5\60\u0395\n\60\3\60\3\60\3"+
		"\60\5\60\u039a\n\60\5\60\u039c\n\60\3\60\3\60\3\60\5\60\u03a1\n\60\7\60"+
		"\u03a3\n\60\f\60\16\60\u03a6\13\60\3\61\3\61\7\61\u03aa\n\61\f\61\16\61"+
		"\u03ad\13\61\3\61\3\61\3\62\3\62\3\62\7\62\u03b4\n\62\f\62\16\62\u03b7"+
		"\13\62\3\62\5\62\u03ba\n\62\3\63\5\63\u03bd\n\63\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03ce\n\64"+
		"\3\65\3\65\3\65\7\65\u03d3\n\65\f\65\16\65\u03d6\13\65\3\66\5\66\u03d9"+
		"\n\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u03e1\n\67\f\67\16\67\u03e4\13"+
		"\67\38\38\58\u03e8\n8\39\39\39\3:\3:\5:\u03ef\n:\3:\3:\3:\3:\3;\7;\u03f6"+
		"\n;\f;\16;\u03f9\13;\3;\3;\5;\u03fd\n;\3<\3<\3<\3<\3<\5<\u0404\n<\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3?\3?\5?\u0410\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u041b"+
		"\n?\3@\3@\3@\3@\7@\u0421\n@\f@\16@\u0424\13@\3A\3A\5A\u0428\nA\3B\3B\3"+
		"B\3B\3B\3B\3B\5B\u0431\nB\3C\3C\3C\3C\3D\3D\3D\5D\u043a\nD\3D\3D\3D\5"+
		"D\u043f\nD\3E\3E\3E\3E\3F\3F\5F\u0447\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\5G\u0454\nG\3G\3G\3G\3G\3G\3G\7G\u045c\nG\fG\16G\u045f\13G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0474\nG\3G\3G"+
		"\5G\u0478\nG\3G\3G\5G\u047c\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\5G\u0492\nG\3G\3G\3G\5G\u0497\nG\3G\3G\3G\5G\u049c"+
		"\nG\3G\3G\3G\3G\3G\5G\u04a3\nG\3G\5G\u04a6\nG\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04bc\nG\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\5G\u04c8\nG\3H\3H\5H\u04cc\nH\3H\3H\3I\3I\3I\3I\7I\u04d4\nI"+
		"\fI\16I\u04d7\13I\3J\3J\5J\u04db\nJ\3K\3K\3K\5K\u04e0\nK\3L\3L\3L\5L\u04e5"+
		"\nL\3M\3M\3M\3M\3N\3N\5N\u04ed\nN\3O\6O\u04f0\nO\rO\16O\u04f1\3O\3O\3"+
		"P\3P\3P\3P\3P\3P\5P\u04fc\nP\3Q\6Q\u04ff\nQ\rQ\16Q\u0500\3R\3R\3R\3R\7"+
		"R\u0507\nR\fR\16R\u050a\13R\5R\u050c\nR\3S\3S\3S\7S\u0511\nS\fS\16S\u0514"+
		"\13S\3T\3T\7T\u0518\nT\fT\16T\u051b\13T\3T\5T\u051e\nT\3T\5T\u0521\nT"+
		"\3U\3U\3U\3U\5U\u0527\nU\3U\3U\5U\u052b\nU\3U\3U\3V\3V\5V\u0531\nV\3V"+
		"\3V\3W\3W\3W\3W\3W\3X\3X\3X\3Y\3Y\5Y\u053f\nY\3Z\3Z\3Z\3Z\5Z\u0545\nZ"+
		"\3[\3[\3[\7[\u054a\n[\f[\16[\u054d\13[\3\\\3\\\5\\\u0551\n\\\3\\\5\\\u0554"+
		"\n\\\3\\\5\\\u0557\n\\\3\\\3\\\3]\6]\u055c\n]\r]\16]\u055d\3^\3^\3^\3"+
		"^\3^\3_\6_\u0566\n_\r_\16_\u0567\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\5`\u0579\n`\3a\6a\u057c\na\ra\16a\u057d\3b\3b\5b\u0582\nb\3c\5"+
		"c\u0585\nc\3c\5c\u0588\nc\3c\3c\3c\3c\3c\5c\u058f\nc\3d\3d\3d\3d\5d\u0595"+
		"\nd\3e\3e\3e\3e\7e\u059b\ne\fe\16e\u059e\13e\3e\3e\3f\5f\u05a3\nf\3f\3"+
		"f\3g\3g\3g\3g\7g\u05ab\ng\fg\16g\u05ae\13g\3h\3h\3h\7h\u05b3\nh\fh\16"+
		"h\u05b6\13h\3i\6i\u05b9\ni\ri\16i\u05ba\3j\3j\3j\3j\3j\3k\3k\3k\3k\5k"+
		"\u05c6\nk\3k\3k\5k\u05ca\nk\5k\u05cc\nk\3l\3l\3l\5l\u05d1\nl\3m\3m\3m"+
		"\7m\u05d6\nm\fm\16m\u05d9\13m\3n\3n\3n\3n\3o\3o\5o\u05e1\no\3o\3o\3p\6"+
		"p\u05e6\np\rp\16p\u05e7\3q\5q\u05eb\nq\3q\5q\u05ee\nq\3q\3q\5q\u05f2\n"+
		"q\3r\6r\u05f5\nr\rr\16r\u05f6\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u0604"+
		"\nt\3t\3t\3t\3t\3t\3t\3t\3t\5t\u060e\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u"+
		"\5u\u061a\nu\3v\3v\3v\7v\u061f\nv\fv\16v\u0622\13v\3w\3w\3w\3w\3x\3x\3"+
		"x\7x\u062b\nx\fx\16x\u062e\13x\3y\3y\3y\5y\u0633\ny\3z\3z\5z\u0637\nz"+
		"\3{\3{\5{\u063b\n{\3|\3|\3}\3}\5}\u0641\n}\3~\3~\3~\3~\5~\u0647\n~\5~"+
		"\u0649\n~\3\177\3\177\3\177\7\177\u064e\n\177\f\177\16\177\u0651\13\177"+
		"\3\u0080\5\u0080\u0654\n\u0080\3\u0080\5\u0080\u0657\n\u0080\3\u0080\3"+
		"\u0080\5\u0080\u065b\n\u0080\3\u0081\3\u0081\3\u0082\5\u0082\u0660\n\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\5\u0083\u0667\n\u0083\3\u0083"+
		"\5\u0083\u066a\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u066f\n\u0083\3"+
		"\u0083\3\u0083\3\u0083\5\u0083\u0674\n\u0083\5\u0083\u0676\n\u0083\3\u0084"+
		"\5\u0084\u0679\n\u0084\3\u0084\5\u0084\u067c\n\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0085\5\u0085\u0682\n\u0085\3\u0085\5\u0085\u0685\n\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0691\n\u0086\3\u0087\3\u0087\5\u0087\u0695\n\u0087\3\u0088\5"+
		"\u0088\u0698\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\5\u0088\u06a2\n\u0088\3\u0089\5\u0089\u06a5\n\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u008a\5\u008a\u06ab\n\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u06c6\n\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u06d3\n\u008d\3\u008d\3\u008d\3\u008e\3\u008e\5\u008e\u06d9\n"+
		"\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\7\u0090\u06e0\n\u0090\f"+
		"\u0090\16\u0090\u06e3\13\u0090\3\u0090\3\u0090\3\u0091\5\u0091\u06e8\n"+
		"\u0091\3\u0091\5\u0091\u06eb\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\6"+
		"\u0091\u06f1\n\u0091\r\u0091\16\u0091\u06f2\3\u0091\3\u0091\5\u0091\u06f7"+
		"\n\u0091\3\u0092\3\u0092\7\u0092\u06fb\n\u0092\f\u0092\16\u0092\u06fe"+
		"\13\u0092\3\u0092\6\u0092\u0701\n\u0092\r\u0092\16\u0092\u0702\3\u0093"+
		"\3\u0093\7\u0093\u0707\n\u0093\f\u0093\16\u0093\u070a\13\u0093\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u0712\n\u0094\f\u0094"+
		"\16\u0094\u0715\13\u0094\3\u0094\5\u0094\u0718\n\u0094\5\u0094\u071a\n"+
		"\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u0722\n"+
		"\u0095\f\u0095\16\u0095\u0725\13\u0095\3\u0095\3\u0095\3\u0096\5\u0096"+
		"\u072a\n\u0096\3\u0096\5\u0096\u072d\n\u0096\3\u0096\3\u0096\3\u0097\3"+
		"\u0097\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\7\u0099\u0738\n\u0099\f"+
		"\u0099\16\u0099\u073b\13\u0099\3\u0099\3\u0099\3\u009a\5\u009a\u0740\n"+
		"\u009a\3\u009a\5\u009a\u0743\n\u009a\3\u009a\5\u009a\u0746\n\u009a\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u074b\n\u009a\3\u009a\3\u009a\5\u009a\u074f\n"+
		"\u009a\3\u009a\3\u009a\5\u009a\u0753\n\u009a\3\u009a\3\u009a\3\u009a\3"+
		"\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\5\u009a\u0764\n\u009a\3\u009a\5\u009a\u0767\n"+
		"\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u076c\n\u009a\3\u009a\3\u009a\5"+
		"\u009a\u0770\n\u009a\3\u009a\3\u009a\5\u009a\u0774\n\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u077d\n\u009a\3\u009b"+
		"\5\u009b\u0780\n\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u0785\n\u009b\3"+
		"\u009b\3\u009b\5\u009b\u0789\n\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u078e"+
		"\n\u009b\3\u009b\3\u009b\5\u009b\u0792\n\u009b\5\u009b\u0794\n\u009b\3"+
		"\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u079d\n"+
		"\u009d\f\u009d\16\u009d\u07a0\13\u009d\3\u009d\5\u009d\u07a3\n\u009d\5"+
		"\u009d\u07a5\n\u009d\3\u009d\3\u009d\3\u009e\5\u009e\u07aa\n\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u07af\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\5\u009f\u07b6\n\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0"+
		"\u07bc\n\u00a0\3\u00a1\6\u00a1\u07bf\n\u00a1\r\u00a1\16\u00a1\u07c0\3"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u07c7\n\u00a2\3\u00a2\3\u00a2\5"+
		"\u00a2\u07cb\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u07d1\n\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u07d6\n\u00a4\f\u00a4\16\u00a4\u07d9"+
		"\13\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u07e0\n\u00a5"+
		"\f\u00a5\16\u00a5\u07e3\13\u00a5\5\u00a5\u07e5\n\u00a5\3\u00a5\5\u00a5"+
		"\u07e8\n\u00a5\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u07ed\n\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a7\3\u00a7\5\u00a7\u07f3\n\u00a7\3\u00a7\3\u00a7\7\u00a7\u07f7"+
		"\n\u00a7\f\u00a7\16\u00a7\u07fa\13\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u0800\n\u00a7\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u0805\n\u00a8\f"+
		"\u00a8\16\u00a8\u0808\13\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa"+
		"\5\u00aa\u080f\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u0813\n\u00aa\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\5\u00b0\u0833\n\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u083b\n\u00b2\3\u00b3\3\u00b3\7\u00b3\u083f\n"+
		"\u00b3\f\u00b3\16\u00b3\u0842\13\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4"+
		"\7\u00b4\u0848\n\u00b4\f\u00b4\16\u00b4\u084b\13\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0853\n\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0859\n\u00b6\3\u00b7\3\u00b7\3\u00b7\7\u00b7"+
		"\u085e\n\u00b7\f\u00b7\16\u00b7\u0861\13\u00b7\3\u00b7\3\u00b7\6\u00b7"+
		"\u0865\n\u00b7\r\u00b7\16\u00b7\u0866\5\u00b7\u0869\n\u00b7\3\u00b8\3"+
		"\u00b8\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0870\n\u00b9\3\u00b9\5\u00b9\u0873"+
		"\n\u00b9\3\u00b9\5\u00b9\u0876\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u087a\n"+
		"\u00b9\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u087f\n\u00ba\3\u00ba\5\u00ba\u0882"+
		"\n\u00ba\3\u00ba\5\u00ba\u0885\n\u00ba\3\u00ba\3\u00ba\5\u00ba\u0889\n"+
		"\u00ba\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u088e\n\u00bb\3\u00bb\5\u00bb\u0891"+
		"\n\u00bb\3\u00bb\5\u00bb\u0894\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0898\n"+
		"\u00bb\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u089d\n\u00bc\3\u00bc\3\u00bc\5"+
		"\u00bc\u08a1\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08a7\n\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u08ab\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u08af\n"+
		"\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u08bd\n\u00be\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\5\u00c0\u08ca\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08d0\n"+
		"\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u08e3\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u08ee\n\u00c4\3\u00c4\3\u00c4\5\u00c4"+
		"\u08f2\n\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\5\u00c5\u08f8\n\u00c5\3"+
		"\u00c5\3\u00c5\5\u00c5\u08fc\n\u00c5\3\u00c5\3\u00c5\5\u00c5\u0900\n\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0907\n\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u090e\n\u00c6\3\u00c6\5\u00c6"+
		"\u0911\n\u00c6\3\u00c6\3\u00c6\7\u00c6\u0915\n\u00c6\f\u00c6\16\u00c6"+
		"\u0918\13\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0920\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0928\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u092e\n\u00c8\3"+
		"\u00c9\3\u00c9\5\u00c9\u0932\n\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\5"+
		"\u00ca\u0938\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u093c\n\u00ca\3\u00cb\3\u00cb"+
		"\3\u00cb\2\2\u00cc\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\2\24\n\2\26\26\31\3188@@TTXXdehh\4\2##..\4\2IIQQ\3"+
		"\2\u009b\u009c\4\2\u0091\u0092\u009d\u009e\3\2\u0086\u0087\3\2\u0088\u008a"+
		"\20\2\23\23\26\26\31\31\36\36##..88@@EETTXX\\\\dehh\4\2\17\17!!\16\2\n"+
		"\n\20\20**::CCJJLPUU[[ggkkmm\5\2IIQQ__\4\2))\66\66\4\2\22\22__\4\2\u0088"+
		"\u0088\u0093\u0093\4\2\67\67II\4\2++aa\25\2\n\n\16\16\22\24\26 \"#%&("+
		"\60\63\63\65:<<?@BEGGIKMQSUXikmpp\25\2\13\r\17\21\25\25!!$$\'\'\61\62"+
		"\64\64;;=>AAFFHHLLRRVWjjnoqr\2\u0a1d\2\u0197\3\2\2\2\4\u01af\3\2\2\2\6"+
		"\u01bb\3\2\2\2\b\u01c8\3\2\2\2\n\u01cc\3\2\2\2\f\u01d1\3\2\2\2\16\u01d3"+
		"\3\2\2\2\20\u01d5\3\2\2\2\22\u01db\3\2\2\2\24\u01dd\3\2\2\2\26\u01e8\3"+
		"\2\2\2\30\u01f3\3\2\2\2\32\u01fc\3\2\2\2\34\u0201\3\2\2\2\36\u0203\3\2"+
		"\2\2 \u0212\3\2\2\2\"\u0214\3\2\2\2$\u021c\3\2\2\2&\u0221\3\2\2\2(\u0229"+
		"\3\2\2\2*\u0231\3\2\2\2,\u0239\3\2\2\2.\u0241\3\2\2\2\60\u0249\3\2\2\2"+
		"\62\u0251\3\2\2\2\64\u025d\3\2\2\2\66\u0268\3\2\2\28\u0270\3\2\2\2:\u0290"+
		"\3\2\2\2<\u0292\3\2\2\2>\u0319\3\2\2\2@\u031c\3\2\2\2B\u0324\3\2\2\2D"+
		"\u0334\3\2\2\2F\u0338\3\2\2\2H\u033a\3\2\2\2J\u0344\3\2\2\2L\u0346\3\2"+
		"\2\2N\u034f\3\2\2\2P\u035c\3\2\2\2R\u0363\3\2\2\2T\u0365\3\2\2\2V\u0378"+
		"\3\2\2\2X\u037a\3\2\2\2Z\u0383\3\2\2\2\\\u0390\3\2\2\2^\u0392\3\2\2\2"+
		"`\u03a7\3\2\2\2b\u03b0\3\2\2\2d\u03bc\3\2\2\2f\u03cd\3\2\2\2h\u03cf\3"+
		"\2\2\2j\u03d8\3\2\2\2l\u03dd\3\2\2\2n\u03e7\3\2\2\2p\u03e9\3\2\2\2r\u03ec"+
		"\3\2\2\2t\u03f7\3\2\2\2v\u0403\3\2\2\2x\u0405\3\2\2\2z\u040a\3\2\2\2|"+
		"\u040d\3\2\2\2~\u041c\3\2\2\2\u0080\u0425\3\2\2\2\u0082\u0430\3\2\2\2"+
		"\u0084\u0432\3\2\2\2\u0086\u043e\3\2\2\2\u0088\u0440\3\2\2\2\u008a\u0446"+
		"\3\2\2\2\u008c\u04c7\3\2\2\2\u008e\u04c9\3\2\2\2\u0090\u04cf\3\2\2\2\u0092"+
		"\u04da\3\2\2\2\u0094\u04dc\3\2\2\2\u0096\u04e4\3\2\2\2\u0098\u04e6\3\2"+
		"\2\2\u009a\u04ec\3\2\2\2\u009c\u04ef\3\2\2\2\u009e\u04fb\3\2\2\2\u00a0"+
		"\u04fe\3\2\2\2\u00a2\u050b\3\2\2\2\u00a4\u050d\3\2\2\2\u00a6\u0520\3\2"+
		"\2\2\u00a8\u0522\3\2\2\2\u00aa\u052e\3\2\2\2\u00ac\u0534\3\2\2\2\u00ae"+
		"\u0539\3\2\2\2\u00b0\u053e\3\2\2\2\u00b2\u0540\3\2\2\2\u00b4\u0546\3\2"+
		"\2\2\u00b6\u054e\3\2\2\2\u00b8\u055b\3\2\2\2\u00ba\u055f\3\2\2\2\u00bc"+
		"\u0565\3\2\2\2\u00be\u0578\3\2\2\2\u00c0\u057b\3\2\2\2\u00c2\u0581\3\2"+
		"\2\2\u00c4\u0584\3\2\2\2\u00c6\u0590\3\2\2\2\u00c8\u0596\3\2\2\2\u00ca"+
		"\u05a2\3\2\2\2\u00cc\u05a6\3\2\2\2\u00ce\u05af\3\2\2\2\u00d0\u05b8\3\2"+
		"\2\2\u00d2\u05bc\3\2\2\2\u00d4\u05cb\3\2\2\2\u00d6\u05d0\3\2\2\2\u00d8"+
		"\u05d2\3\2\2\2\u00da\u05da\3\2\2\2\u00dc\u05de\3\2\2\2\u00de\u05e5\3\2"+
		"\2\2\u00e0\u05ea\3\2\2\2\u00e2\u05f4\3\2\2\2\u00e4\u05f8\3\2\2\2\u00e6"+
		"\u060d\3\2\2\2\u00e8\u060f\3\2\2\2\u00ea\u061b\3\2\2\2\u00ec\u0623\3\2"+
		"\2\2\u00ee\u0627\3\2\2\2\u00f0\u062f\3\2\2\2\u00f2\u0636\3\2\2\2\u00f4"+
		"\u063a\3\2\2\2\u00f6\u063c\3\2\2\2\u00f8\u0640\3\2\2\2\u00fa\u0648\3\2"+
		"\2\2\u00fc\u064a\3\2\2\2\u00fe\u065a\3\2\2\2\u0100\u065c\3\2\2\2\u0102"+
		"\u065f\3\2\2\2\u0104\u0666\3\2\2\2\u0106\u0678\3\2\2\2\u0108\u0681\3\2"+
		"\2\2\u010a\u0690\3\2\2\2\u010c\u0694\3\2\2\2\u010e\u0697\3\2\2\2\u0110"+
		"\u06a4\3\2\2\2\u0112\u06aa\3\2\2\2\u0114\u06c5\3\2\2\2\u0116\u06c7\3\2"+
		"\2\2\u0118\u06ce\3\2\2\2\u011a\u06d8\3\2\2\2\u011c\u06da\3\2\2\2\u011e"+
		"\u06dd\3\2\2\2\u0120\u06e7\3\2\2\2\u0122\u06f8\3\2\2\2\u0124\u0704\3\2"+
		"\2\2\u0126\u070d\3\2\2\2\u0128\u071d\3\2\2\2\u012a\u0729\3\2\2\2\u012c"+
		"\u0730\3\2\2\2\u012e\u0732\3\2\2\2\u0130\u0735\3\2\2\2\u0132\u073f\3\2"+
		"\2\2\u0134\u077f\3\2\2\2\u0136\u0795\3\2\2\2\u0138\u0798\3\2\2\2\u013a"+
		"\u07a9\3\2\2\2\u013c\u07b0\3\2\2\2\u013e\u07bb\3\2\2\2\u0140\u07be\3\2"+
		"\2\2\u0142\u07c2\3\2\2\2\u0144\u07d0\3\2\2\2\u0146\u07d2\3\2\2\2\u0148"+
		"\u07da\3\2\2\2\u014a\u07ec\3\2\2\2\u014c\u07ff\3\2\2\2\u014e\u0801\3\2"+
		"\2\2\u0150\u0809\3\2\2\2\u0152\u0812\3\2\2\2\u0154\u0814\3\2\2\2\u0156"+
		"\u0819\3\2\2\2\u0158\u081f\3\2\2\2\u015a\u0823\3\2\2\2\u015c\u0827\3\2"+
		"\2\2\u015e\u0832\3\2\2\2\u0160\u0834\3\2\2\2\u0162\u083a\3\2\2\2\u0164"+
		"\u083c\3\2\2\2\u0166\u0845\3\2\2\2\u0168\u0852\3\2\2\2\u016a\u0858\3\2"+
		"\2\2\u016c\u085a\3\2\2\2\u016e\u086a\3\2\2\2\u0170\u086c\3\2\2\2\u0172"+
		"\u087b\3\2\2\2\u0174\u088a\3\2\2\2\u0176\u0899\3\2\2\2\u0178\u08a2\3\2"+
		"\2\2\u017a\u08b2\3\2\2\2\u017c\u08be\3\2\2\2\u017e\u08c1\3\2\2\2\u0180"+
		"\u08d1\3\2\2\2\u0182\u08d6\3\2\2\2\u0184\u08e4\3\2\2\2\u0186\u08ea\3\2"+
		"\2\2\u0188\u08f5\3\2\2\2\u018a\u090d\3\2\2\2\u018c\u0919\3\2\2\2\u018e"+
		"\u0929\3\2\2\2\u0190\u092f\3\2\2\2\u0192\u0935\3\2\2\2\u0194\u093d\3\2"+
		"\2\2\u0196\u0198\7\3\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019a\3\2\2\2\u0199\u019b\5\u00b8]\2\u019a\u0199\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019e\5\u00bc_\2\u019d\u019c\3\2\2"+
		"\2\u019d\u019e\3\2\2\2\u019e\u01a2\3\2\2\2\u019f\u01a1\5\u013c\u009f\2"+
		"\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\5\u00c0a"+
		"\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9"+
		"\7\2\2\3\u01a9\3\3\2\2\2\u01aa\u01ac\5\u0194\u00cb\2\u01ab\u01ad\5\24"+
		"\13\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01b0\5\u00c6d\2\u01af\u01aa\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b8"+
		"\3\2\2\2\u01b1\u01b2\7\u0082\2\2\u01b2\u01b4\5\u0194\u00cb\2\u01b3\u01b5"+
		"\5\24\13\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2"+
		"\u01b6\u01b1\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\5\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01c1\5\b\5\2\u01bc"+
		"\u01c0\7\u0093\2\2\u01bd\u01c0\5\u0124\u0093\2\u01be\u01c0\7\u0088\2\2"+
		"\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c3"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\7\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c9\5\n\6\2\u01c5\u01c9\5\22\n\2\u01c6\u01c7\7"+
		"l\2\2\u01c7\u01c9\7\u0088\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2"+
		"\u01c8\u01c6\3\2\2\2\u01c9\t\3\2\2\2\u01ca\u01cd\5\f\7\2\u01cb\u01cd\7"+
		"\23\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\13\3\2\2\2\u01ce"+
		"\u01d2\5\16\b\2\u01cf\u01d2\5\20\t\2\u01d0\u01d2\7\36\2\2\u01d1\u01ce"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\r\3\2\2\2\u01d3"+
		"\u01d4\t\2\2\2\u01d4\17\3\2\2\2\u01d5\u01d6\t\3\2\2\u01d6\21\3\2\2\2\u01d7"+
		"\u01dc\5\4\3\2\u01d8\u01dc\7E\2\2\u01d9\u01dc\7$\2\2\u01da\u01dc\7\\\2"+
		"\2\u01db\u01d7\3\2\2\2\u01db\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da"+
		"\3\2\2\2\u01dc\23\3\2\2\2\u01dd\u01de\7\u0091\2\2\u01de\u01e3\5\6\4\2"+
		"\u01df\u01e0\7\u0083\2\2\u01e0\u01e2\5\6\4\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7\u0092\2\2\u01e7\25\3\2\2\2\u01e8"+
		"\u01ed\5\30\r\2\u01e9\u01ea\7\u0083\2\2\u01ea\u01ec\5\30\r\2\u01eb\u01e9"+
		"\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\27\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\5\u0194\u00cb\2\u01f1\u01f2"+
		"\7\u0084\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f4\3\2\2"+
		"\2\u01f4\u01f6\3\2\2\2\u01f5\u01f7\t\4\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\5\32\16\2\u01f9\31\3\2\2\2\u01fa"+
		"\u01fd\5\36\20\2\u01fb\u01fd\5\34\17\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb"+
		"\3\2\2\2\u01fd\33\3\2\2\2\u01fe\u0202\5d\63\2\u01ff\u0202\5p9\2\u0200"+
		"\u0202\5\"\22\2\u0201\u01fe\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0200\3"+
		"\2\2\2\u0202\35\3\2\2\2\u0203\u0204\5:\36\2\u0204\u0205\5 \21\2\u0205"+
		"\u0206\5\32\16\2\u0206\37\3\2\2\2\u0207\u0213\7\u0090\2\2\u0208\u0213"+
		"\7\u009f\2\2\u0209\u0213\7\u00a0\2\2\u020a\u0213\7\u00a1\2\2\u020b\u0213"+
		"\7\u00a2\2\2\u020c\u0213\7\u00a3\2\2\u020d\u0213\7\u00a4\2\2\u020e\u0213"+
		"\7\u00a5\2\2\u020f\u0213\7\u00a6\2\2\u0210\u0213\7\u00a8\2\2\u0211\u0213"+
		"\5\u015c\u00af\2\u0212\u0207\3\2\2\2\u0212\u0208\3\2\2\2\u0212\u0209\3"+
		"\2\2\2\u0212\u020a\3\2\2\2\u0212\u020b\3\2\2\2\u0212\u020c\3\2\2\2\u0212"+
		"\u020d\3\2\2\2\u0212\u020e\3\2\2\2\u0212\u020f\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0211\3\2\2\2\u0213!\3\2\2\2\u0214\u021a\5$\23\2\u0215\u0216"+
		"\7\u0093\2\2\u0216\u0217\5\32\16\2\u0217\u0218\7\u0084\2\2\u0218\u0219"+
		"\5\32\16\2\u0219\u021b\3\2\2\2\u021a\u0215\3\2\2\2\u021a\u021b\3\2\2\2"+
		"\u021b#\3\2\2\2\u021c\u021f\5&\24\2\u021d\u021e\7\u0095\2\2\u021e\u0220"+
		"\5$\23\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220%\3\2\2\2\u0221"+
		"\u0226\5(\25\2\u0222\u0223\7\u0099\2\2\u0223\u0225\5(\25\2\u0224\u0222"+
		"\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\'\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022e\5*\26\2\u022a\u022b\7\u0098"+
		"\2\2\u022b\u022d\5*\26\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f)\3\2\2\2\u0230\u022e\3\2\2\2"+
		"\u0231\u0236\5,\27\2\u0232\u0233\7\u008c\2\2\u0233\u0235\5,\27\2\u0234"+
		"\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237+\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023e\5.\30\2\u023a\u023b"+
		"\7\u008d\2\2\u023b\u023d\5.\30\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2"+
		"\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f-\3\2\2\2\u0240\u023e"+
		"\3\2\2\2\u0241\u0246\5\60\31\2\u0242\u0243\7\u008b\2\2\u0243\u0245\5\60"+
		"\31\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247/\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024e\5\62\32"+
		"\2\u024a\u024b\t\5\2\2\u024b\u024d\5\62\32\2\u024c\u024a\3\2\2\2\u024d"+
		"\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\61\3\2\2"+
		"\2\u0250\u024e\3\2\2\2\u0251\u025a\5\64\33\2\u0252\u0253\t\6\2\2\u0253"+
		"\u0259\5\64\33\2\u0254\u0255\7<\2\2\u0255\u0259\5b\62\2\u0256\u0257\7"+
		"\16\2\2\u0257\u0259\5\6\4\2\u0258\u0252\3\2\2\2\u0258\u0254\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2"+
		"\2\2\u025b\63\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0265\5\66\34\2\u025e"+
		"\u0261\7\u00a7\2\2\u025f\u0261\5\u015a\u00ae\2\u0260\u025e\3\2\2\2\u0260"+
		"\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\5\66\34\2\u0263\u0260\3"+
		"\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\65\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026d\58\35\2\u0269\u026a\t\7\2"+
		"\2\u026a\u026c\58\35\2\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\67\3\2\2\2\u026f\u026d\3\2\2\2\u0270"+
		"\u0275\5:\36\2\u0271\u0272\t\b\2\2\u0272\u0274\5:\36\2\u0273\u0271\3\2"+
		"\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276"+
		"9\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0291\5<\37\2\u0279\u027a\7\u0086"+
		"\2\2\u027a\u0291\5:\36\2\u027b\u027c\7\u0087\2\2\u027c\u0291\5:\36\2\u027d"+
		"\u027e\7\u008e\2\2\u027e\u0291\5:\36\2\u027f\u0280\7\u008f\2\2\u0280\u0291"+
		"\5:\36\2\u0281\u0282\7\u0096\2\2\u0282\u0291\5:\36\2\u0283\u0284\7\u0097"+
		"\2\2\u0284\u0291\5:\36\2\u0285\u0286\7\u0080\2\2\u0286\u0287\5\6\4\2\u0287"+
		"\u0288\7\u0081\2\2\u0288\u0289\5:\36\2\u0289\u0291\3\2\2\2\u028a\u028b"+
		"\7\21\2\2\u028b\u0291\5:\36\2\u028c\u028d\7\u008b\2\2\u028d\u0291\5:\36"+
		"\2\u028e\u028f\7\u0088\2\2\u028f\u0291\5:\36\2\u0290\u0278\3\2\2\2\u0290"+
		"\u0279\3\2\2\2\u0290\u027b\3\2\2\2\u0290\u027d\3\2\2\2\u0290\u027f\3\2"+
		"\2\2\u0290\u0281\3\2\2\2\u0290\u0283\3\2\2\2\u0290\u0285\3\2\2\2\u0290"+
		"\u028a\3\2\2\2\u0290\u028c\3\2\2\2\u0290\u028e\3\2\2\2\u0291;\3\2\2\2"+
		"\u0292\u0296\5> \2\u0293\u0295\5B\"\2\u0294\u0293\3\2\2\2\u0295\u0298"+
		"\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u02a9\3\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0299\u02a0\5@!\2\u029a\u02a0\5\u0190\u00c9\2\u029b\u02a0"+
		"\7\u0096\2\2\u029c\u02a0\7\u0097\2\2\u029d\u029e\7\u009a\2\2\u029e\u02a0"+
		"\5\u0194\u00cb\2\u029f\u0299\3\2\2\2\u029f\u029a\3\2\2\2\u029f\u029b\3"+
		"\2\2\2\u029f\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a4\3\2\2\2\u02a1"+
		"\u02a3\5B\"\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2"+
		"\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7"+
		"\u029f\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa=\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u031a\5\u015e\u00b0\2\u02ad"+
		"\u02af\5\u0194\u00cb\2\u02ae\u02b0\5\24\13\2\u02af\u02ae\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u031a\3\2\2\2\u02b1\u02b2\7\u0080\2\2\u02b2\u02b3"+
		"\5\32\16\2\u02b3\u02b4\7\u0081\2\2\u02b4\u031a\3\2\2\2\u02b5\u031a\5F"+
		"$\2\u02b6\u031a\5\u00c6d\2\u02b7\u031a\7s\2\2\u02b8\u031a\7_\2\2\u02b9"+
		"\u02c3\7\22\2\2\u02ba\u02bb\7\u0082\2\2\u02bb\u02bd\5\u0194\u00cb\2\u02bc"+
		"\u02be\5\24\13\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c4\3"+
		"\2\2\2\u02bf\u02c0\7~\2\2\u02c0\u02c1\5H%\2\u02c1\u02c2\7\177\2\2\u02c2"+
		"\u02c4\3\2\2\2\u02c3\u02ba\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c4\u031a\3\2"+
		"\2\2\u02c5\u02e2\7C\2\2\u02c6\u02dc\5\6\4\2\u02c7\u02dd\5\u0192\u00ca"+
		"\2\u02c8\u02dd\5J&\2\u02c9\u02ca\7~\2\2\u02ca\u02cb\5H%\2\u02cb\u02cf"+
		"\7\177\2\2\u02cc\u02ce\5\u0124\u0093\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1"+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02d4\5\u0126\u0094\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02dd\3\2\2\2\u02d5\u02d7\5\u0124\u0093\2\u02d6\u02d5\3"+
		"\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02db\5\u0126\u0094\2\u02db\u02dd\3\2\2\2\u02dc\u02c7"+
		"\3\2\2\2\u02dc\u02c8\3\2\2\2\u02dc\u02c9\3\2\2\2\u02dc\u02d6\3\2\2\2\u02dd"+
		"\u02e3\3\2\2\2\u02de\u02e3\5X-\2\u02df\u02e0\5\u0124\u0093\2\u02e0\u02e1"+
		"\5\u0126\u0094\2\u02e1\u02e3\3\2\2\2\u02e2\u02c6\3\2\2\2\u02e2\u02de\3"+
		"\2\2\2\u02e2\u02df\3\2\2\2\u02e3\u031a\3\2\2\2\u02e4\u02e5\7c\2\2\u02e5"+
		"\u02e9\7\u0080\2\2\u02e6\u02ea\5^\60\2\u02e7\u02ea\5\6\4\2\u02e8\u02ea"+
		"\7l\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u031a\7\u0081\2\2\u02ec\u02ed\7\32\2\2\u02ed\u02ee"+
		"\7\u0080\2\2\u02ee\u02ef\5\32\16\2\u02ef\u02f0\7\u0081\2\2\u02f0\u031a"+
		"\3\2\2\2\u02f1\u02f2\7f\2\2\u02f2\u02f3\7\u0080\2\2\u02f3\u02f4\5\32\16"+
		"\2\u02f4\u02f5\7\u0081\2\2\u02f5\u031a\3\2\2\2\u02f6\u02f7\7\37\2\2\u02f7"+
		"\u02f8\7\u0080\2\2\u02f8\u02f9\5\6\4\2\u02f9\u02fa\7\u0081\2\2\u02fa\u031a"+
		"\3\2\2\2\u02fb\u02fd\7\20\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2"+
		"\u02fd\u02fe\3\2\2\2\u02fe\u0304\7 \2\2\u02ff\u0301\7\u0080\2\2\u0300"+
		"\u0302\5h\65\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\u0305\7\u0081\2\2\u0304\u02ff\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u031a\5\u008eH\2\u0307\u0308\7Y\2\2\u0308\u0309\7"+
		"\u0080\2\2\u0309\u030a\5\6\4\2\u030a\u030b\7\u0081\2\2\u030b\u031a\3\2"+
		"\2\2\u030c\u030d\7A\2\2\u030d\u0313\7\u0080\2\2\u030e\u030f\5\u0194\u00cb"+
		"\2\u030f\u0310\7\u0082\2\2\u0310\u0312\3\2\2\2\u0311\u030e\3\2\2\2\u0312"+
		"\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2"+
		"\2\2\u0315\u0313\3\2\2\2\u0316\u0317\5\u0194\u00cb\2\u0317\u0318\7\u0081"+
		"\2\2\u0318\u031a\3\2\2\2\u0319\u02ac\3\2\2\2\u0319\u02ad\3\2\2\2\u0319"+
		"\u02b1\3\2\2\2\u0319\u02b5\3\2\2\2\u0319\u02b6\3\2\2\2\u0319\u02b7\3\2"+
		"\2\2\u0319\u02b8\3\2\2\2\u0319\u02b9\3\2\2\2\u0319\u02c5\3\2\2\2\u0319"+
		"\u02e4\3\2\2\2\u0319\u02ec\3\2\2\2\u0319\u02f1\3\2\2\2\u0319\u02f6\3\2"+
		"\2\2\u0319\u02fc\3\2\2\2\u0319\u0307\3\2\2\2\u0319\u030c\3\2\2\2\u031a"+
		"?\3\2\2\2\u031b\u031d\7\u0093\2\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031e\u031f\7\u0082\2\2\u031f\u0321\5\u0194\u00cb"+
		"\2\u0320\u0322\5\24\13\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"A\3\2\2\2\u0323\u0325\7\u0093\2\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u0326\3\2\2\2\u0326\u0327\7~\2\2\u0327\u032c\5D#\2\u0328\u0329"+
		"\7\u0083\2\2\u0329\u032b\5D#\2\u032a\u0328\3\2\2\2\u032b\u032e\3\2\2\2"+
		"\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u032c"+
		"\3\2\2\2\u032f\u0330\7\177\2\2\u0330C\3\2\2\2\u0331\u0332\5\u0194\u00cb"+
		"\2\u0332\u0333\7\u0084\2\2\u0333\u0335\3\2\2\2\u0334\u0331\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\5\32\16\2\u0337E\3\2\2"+
		"\2\u0338\u0339\t\t\2\2\u0339G\3\2\2\2\u033a\u033f\5\32\16\2\u033b\u033c"+
		"\7\u0083\2\2\u033c\u033e\5\32\16\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2"+
		"\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340I\3\2\2\2\u0341\u033f"+
		"\3\2\2\2\u0342\u0345\5L\'\2\u0343\u0345\5T+\2\u0344\u0342\3\2\2\2\u0344"+
		"\u0343\3\2\2\2\u0345K\3\2\2\2\u0346\u034b\7|\2\2\u0347\u0349\5N(\2\u0348"+
		"\u034a\7\u0083\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c"+
		"\3\2\2\2\u034b\u0347\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u034e\7}\2\2\u034eM\3\2\2\2\u034f\u0354\5P)\2\u0350\u0351\7\u0083\2\2"+
		"\u0351\u0353\5P)\2\u0352\u0350\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355O\3\2\2\2\u0356\u0354\3\2\2\2\u0357"+
		"\u035d\5\u0194\u00cb\2\u0358\u0359\7~\2\2\u0359\u035a\5\32\16\2\u035a"+
		"\u035b\7\177\2\2\u035b\u035d\3\2\2\2\u035c\u0357\3\2\2\2\u035c\u0358\3"+
		"\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\7\u0090\2\2\u035f\u0360\5R*\2\u0360"+
		"Q\3\2\2\2\u0361\u0364\5\32\16\2\u0362\u0364\5J&\2\u0363\u0361\3\2\2\2"+
		"\u0363\u0362\3\2\2\2\u0364S\3\2\2\2\u0365\u0366\7|\2\2\u0366\u036b\5V"+
		",\2\u0367\u0368\7\u0083\2\2\u0368\u036a\5V,\2\u0369\u0367\3\2\2\2\u036a"+
		"\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036f\3\2"+
		"\2\2\u036d\u036b\3\2\2\2\u036e\u0370\7\u0083\2\2\u036f\u036e\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\7}\2\2\u0372U\3\2\2\2\u0373"+
		"\u0379\5\34\17\2\u0374\u0375\7|\2\2\u0375\u0376\5H%\2\u0376\u0377\7}\2"+
		"\2\u0377\u0379\3\2\2\2\u0378\u0373\3\2\2\2\u0378\u0374\3\2\2\2\u0379W"+
		"\3\2\2\2\u037a\u037f\7|\2\2\u037b\u037d\5Z.\2\u037c\u037e\7\u0083\2\2"+
		"\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u037b"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\7}\2\2\u0382"+
		"Y\3\2\2\2\u0383\u0388\5\\/\2\u0384\u0385\7\u0083\2\2\u0385\u0387\5\\/"+
		"\2\u0386\u0384\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389[\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u0391\5<\37\2\u038c"+
		"\u038d\5\u0194\u00cb\2\u038d\u038e\7\u0090\2\2\u038e\u038f\5\32\16\2\u038f"+
		"\u0391\3\2\2\2\u0390\u038b\3\2\2\2\u0390\u038c\3\2\2\2\u0391]\3\2\2\2"+
		"\u0392\u039b\5\u0194\u00cb\2\u0393\u0395\5`\61\2\u0394\u0393\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u039c\3\2\2\2\u0396\u0397\7\u0094\2\2\u0397\u0399"+
		"\5\u0194\u00cb\2\u0398\u039a\5`\61\2\u0399\u0398\3\2\2\2\u0399\u039a\3"+
		"\2\2\2\u039a\u039c\3\2\2\2\u039b\u0394\3\2\2\2\u039b\u0396\3\2\2\2\u039c"+
		"\u03a4\3\2\2\2\u039d\u039e\7\u0082\2\2\u039e\u03a0\5\u0194\u00cb\2\u039f"+
		"\u03a1\5`\61\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2"+
		"\2\2\u03a2\u039d\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5_\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03ab\7\u0091"+
		"\2\2\u03a8\u03aa\7\u0083\2\2\u03a9\u03a8\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab"+
		"\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03ab\3\2"+
		"\2\2\u03ae\u03af\7\u0092\2\2\u03afa\3\2\2\2\u03b0\u03b5\5\b\5\2\u03b1"+
		"\u03b4\5\u0124\u0093\2\u03b2\u03b4\7\u0088\2\2\u03b3\u03b1\3\2\2\2\u03b3"+
		"\u03b2\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03ba\7\u0093\2\2\u03b9"+
		"\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03bac\3\2\2\2\u03bb\u03bd\7\20\2\2"+
		"\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf"+
		"\5f\64\2\u03bf\u03c0\5\u0158\u00ad\2\u03c0\u03c1\5n8\2\u03c1e\3\2\2\2"+
		"\u03c2\u03c3\7\u0080\2\2\u03c3\u03ce\7\u0081\2\2\u03c4\u03c5\7\u0080\2"+
		"\2\u03c5\u03c6\5h\65\2\u03c6\u03c7\7\u0081\2\2\u03c7\u03ce\3\2\2\2\u03c8"+
		"\u03c9\7\u0080\2\2\u03c9\u03ca\5l\67\2\u03ca\u03cb\7\u0081\2\2\u03cb\u03ce"+
		"\3\2\2\2\u03cc\u03ce\5\u0194\u00cb\2\u03cd\u03c2\3\2\2\2\u03cd\u03c4\3"+
		"\2\2\2\u03cd\u03c8\3\2\2\2\u03cd\u03cc\3\2\2\2\u03ceg\3\2\2\2\u03cf\u03d4"+
		"\5j\66\2\u03d0\u03d1\7\u0083\2\2\u03d1\u03d3\5j\66\2\u03d2\u03d0\3\2\2"+
		"\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5i"+
		"\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d9\t\4\2\2\u03d8\u03d7\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\5\6\4\2\u03db\u03dc\5\u0194"+
		"\u00cb\2\u03dck\3\2\2\2\u03dd\u03e2\5\u0194\u00cb\2\u03de\u03df\7\u0083"+
		"\2\2\u03df\u03e1\5\u0194\u00cb\2\u03e0\u03de\3\2\2\2\u03e1\u03e4\3\2\2"+
		"\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3m\3\2\2\2\u03e4\u03e2"+
		"\3\2\2\2\u03e5\u03e8\5\32\16\2\u03e6\u03e8\5\u008eH\2\u03e7\u03e5\3\2"+
		"\2\2\u03e7\u03e6\3\2\2\2\u03e8o\3\2\2\2\u03e9\u03ea\5r:\2\u03ea\u03eb"+
		"\5t;\2\u03ebq\3\2\2\2\u03ec\u03ee\7\61\2\2\u03ed\u03ef\5\6\4\2\u03ee\u03ed"+
		"\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\5\u0194\u00cb"+
		"\2\u03f1\u03f2\7\67\2\2\u03f2\u03f3\5\32\16\2\u03f3s\3\2\2\2\u03f4\u03f6"+
		"\5v<\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7"+
		"\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fc\5\u0082"+
		"B\2\u03fb\u03fd\5\u0084C\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"u\3\2\2\2\u03fe\u0404\5r:\2\u03ff\u0404\5x=\2\u0400\u0404\5z>\2\u0401"+
		"\u0404\5|?\2\u0402\u0404\5~@\2\u0403\u03fe\3\2\2\2\u0403\u03ff\3\2\2\2"+
		"\u0403\u0400\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0402\3\2\2\2\u0404w\3"+
		"\2\2\2\u0405\u0406\7>\2\2\u0406\u0407\5\u0194\u00cb\2\u0407\u0408\7\u0090"+
		"\2\2\u0408\u0409\5\32\16\2\u0409y\3\2\2\2\u040a\u040b\7o\2\2\u040b\u040c"+
		"\5\32\16\2\u040c{\3\2\2\2\u040d\u040f\7=\2\2\u040e\u0410\5\6\4\2\u040f"+
		"\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\5\u0194"+
		"\u00cb\2\u0412\u0413\7\67\2\2\u0413\u0414\5\32\16\2\u0414\u0415\7F\2\2"+
		"\u0415\u0416\5\32\16\2\u0416\u0417\7\'\2\2\u0417\u041a\5\32\16\2\u0418"+
		"\u0419\7;\2\2\u0419\u041b\5\u0194\u00cb\2\u041a\u0418\3\2\2\2\u041a\u041b"+
		"\3\2\2\2\u041b}\3\2\2\2\u041c\u041d\7H\2\2\u041d\u0422\5\u0080A\2\u041e"+
		"\u041f\7\u0083\2\2\u041f\u0421\5\u0080A\2\u0420\u041e\3\2\2\2\u0421\u0424"+
		"\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\177\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0425\u0427\5\32\16\2\u0426\u0428\t\n\2\2\u0427\u0426\3"+
		"\2\2\2\u0427\u0428\3\2\2\2\u0428\u0081\3\2\2\2\u0429\u042a\7V\2\2\u042a"+
		"\u0431\5\32\16\2\u042b\u042c\7\64\2\2\u042c\u042d\5\32\16\2\u042d\u042e"+
		"\7\25\2\2\u042e\u042f\5\32\16\2\u042f\u0431\3\2\2\2\u0430\u0429\3\2\2"+
		"\2\u0430\u042b\3\2\2\2\u0431\u0083\3\2\2\2\u0432\u0433\7;\2\2\u0433\u0434"+
		"\5\u0194\u00cb\2\u0434\u0435\5t;\2\u0435\u0085\3\2\2\2\u0436\u043f\5\u0088"+
		"E\2\u0437\u043a\5\u0090I\2\u0438\u043a\5\u0098M\2\u0439\u0437\3\2\2\2"+
		"\u0439\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\7\u0085\2\2\u043c"+
		"\u043f\3\2\2\2\u043d\u043f\5\u008aF\2\u043e\u0436\3\2\2\2\u043e\u0439"+
		"\3\2\2\2\u043e\u043d\3\2\2\2\u043f\u0087\3\2\2\2\u0440\u0441\5\u0194\u00cb"+
		"\2\u0441\u0442\7\u0084\2\2\u0442\u0443\5\u0086D\2\u0443\u0089\3\2\2\2"+
		"\u0444\u0447\5\u008eH\2\u0445\u0447\5\u008cG\2\u0446\u0444\3\2\2\2\u0446"+
		"\u0445\3\2\2\2\u0447\u008b\3\2\2\2\u0448\u04c8\7\u0085\2\2\u0449\u044a"+
		"\5\32\16\2\u044a\u044b\7\u0085\2\2\u044b\u04c8\3\2\2\2\u044c\u044d\7\65"+
		"\2\2\u044d\u044e\7\u0080\2\2\u044e\u044f\5\32\16\2\u044f\u0450\7\u0081"+
		"\2\2\u0450\u0453\5\u009aN\2\u0451\u0452\7%\2\2\u0452\u0454\5\u009aN\2"+
		"\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u04c8\3\2\2\2\u0455\u0456"+
		"\7^\2\2\u0456\u0457\7\u0080\2\2\u0457\u0458\5\32\16\2\u0458\u0459\7\u0081"+
		"\2\2\u0459\u045d\7|\2\2\u045a\u045c\5\u009cO\2\u045b\u045a\3\2\2\2\u045c"+
		"\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0460\3\2"+
		"\2\2\u045f\u045d\3\2\2\2\u0460\u0461\7}\2\2\u0461\u04c8\3\2\2\2\u0462"+
		"\u0463\7p\2\2\u0463\u0464\7\u0080\2\2\u0464\u0465\5\32\16\2\u0465\u0466"+
		"\7\u0081\2\2\u0466\u0467\5\u008aF\2\u0467\u04c8\3\2\2\2\u0468\u0469\7"+
		"\"\2\2\u0469\u046a\5\u008aF\2\u046a\u046b\7p\2\2\u046b\u046c\7\u0080\2"+
		"\2\u046c\u046d\5\32\16\2\u046d\u046e\7\u0081\2\2\u046e\u046f\7\u0085\2"+
		"\2\u046f\u04c8\3\2\2\2\u0470\u0471\7/\2\2\u0471\u0473\7\u0080\2\2\u0472"+
		"\u0474\5\u00a2R\2\u0473\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u0477\7\u0085\2\2\u0476\u0478\5\32\16\2\u0477\u0476\3\2"+
		"\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\7\u0085\2\2\u047a"+
		"\u047c\5\u00a4S\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d"+
		"\3\2\2\2\u047d\u047e\7\u0081\2\2\u047e\u04c8\5\u008aF\2\u047f\u0480\7"+
		"\60\2\2\u0480\u0481\7\u0080\2\2\u0481\u0482\5\u0092J\2\u0482\u0483\5\u0194"+
		"\u00cb\2\u0483\u0484\7\67\2\2\u0484\u0485\5\32\16\2\u0485\u0486\7\u0081"+
		"\2\2\u0486\u0487\5\u008aF\2\u0487\u04c8\3\2\2\2\u0488\u0489\7\24\2\2\u0489"+
		"\u04c8\7\u0085\2\2\u048a\u048b\7\35\2\2\u048b\u04c8\7\u0085\2\2\u048c"+
		"\u0491\7\63\2\2\u048d\u0492\5\u0194\u00cb\2\u048e\u048f\7\27\2\2\u048f"+
		"\u0492\5\32\16\2\u0490\u0492\7\37\2\2\u0491\u048d\3\2\2\2\u0491\u048e"+
		"\3\2\2\2\u0491\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u04c8\7\u0085\2"+
		"\2\u0494\u0496\7S\2\2\u0495\u0497\5\32\16\2\u0496\u0495\3\2\2\2\u0496"+
		"\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u04c8\7\u0085\2\2\u0499\u049b"+
		"\7`\2\2\u049a\u049c\5\32\16\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2"+
		"\u049c\u049d\3\2\2\2\u049d\u04c8\7\u0085\2\2\u049e\u049f\7b\2\2\u049f"+
		"\u04a5\5\u008eH\2\u04a0\u04a2\5\u00a6T\2\u04a1\u04a3\5\u00aeX\2\u04a2"+
		"\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a6\5\u00ae"+
		"X\2\u04a5\u04a0\3\2\2\2\u04a5\u04a4\3\2\2\2\u04a6\u04c8\3\2\2\2\u04a7"+
		"\u04a8\7\32\2\2\u04a8\u04c8\5\u008eH\2\u04a9\u04aa\7f\2\2\u04aa\u04c8"+
		"\5\u008eH\2\u04ab\u04ac\7?\2\2\u04ac\u04ad\7\u0080\2\2\u04ad\u04ae\5\32"+
		"\16\2\u04ae\u04af\7\u0081\2\2\u04af\u04b0\5\u008aF\2\u04b0\u04c8\3\2\2"+
		"\2\u04b1\u04b2\7i\2\2\u04b2\u04b3\7\u0080\2\2\u04b3\u04b4\5\u00b0Y\2\u04b4"+
		"\u04b5\7\u0081\2\2\u04b5\u04b6\5\u008aF\2\u04b6\u04c8\3\2\2\2\u04b7\u04bb"+
		"\7q\2\2\u04b8\u04b9\7S\2\2\u04b9\u04bc\5\32\16\2\u04ba\u04bc\7\24\2\2"+
		"\u04bb\u04b8\3\2\2\2\u04bb\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04c8"+
		"\7\u0085\2\2\u04be\u04bf\7g\2\2\u04bf\u04c8\5\u008eH\2\u04c0\u04c1\7-"+
		"\2\2\u04c1\u04c2\7\u0080\2\2\u04c2\u04c3\5\u014c\u00a7\2\u04c3\u04c4\5"+
		"\u014e\u00a8\2\u04c4\u04c5\7\u0081\2\2\u04c5\u04c6\5\u008aF\2\u04c6\u04c8"+
		"\3\2\2\2\u04c7\u0448\3\2\2\2\u04c7\u0449\3\2\2\2\u04c7\u044c\3\2\2\2\u04c7"+
		"\u0455\3\2\2\2\u04c7\u0462\3\2\2\2\u04c7\u0468\3\2\2\2\u04c7\u0470\3\2"+
		"\2\2\u04c7\u047f\3\2\2\2\u04c7\u0488\3\2\2\2\u04c7\u048a\3\2\2\2\u04c7"+
		"\u048c\3\2\2\2\u04c7\u0494\3\2\2\2\u04c7\u0499\3\2\2\2\u04c7\u049e\3\2"+
		"\2\2\u04c7\u04a7\3\2\2\2\u04c7\u04a9\3\2\2\2\u04c7\u04ab\3\2\2\2\u04c7"+
		"\u04b1\3\2\2\2\u04c7\u04b7\3\2\2\2\u04c7\u04be\3\2\2\2\u04c7\u04c0\3\2"+
		"\2\2\u04c8\u008d\3\2\2\2\u04c9\u04cb\7|\2\2\u04ca\u04cc\5\u00a0Q\2\u04cb"+
		"\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\7}"+
		"\2\2\u04ce\u008f\3\2\2\2\u04cf\u04d0\5\u0092J\2\u04d0\u04d5\5\u0094K\2"+
		"\u04d1\u04d2\7\u0083\2\2\u04d2\u04d4\5\u0094K\2\u04d3\u04d1\3\2\2\2\u04d4"+
		"\u04d7\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u0091\3\2"+
		"\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04db\7j\2\2\u04d9\u04db\5\6\4\2\u04da"+
		"\u04d8\3\2\2\2\u04da\u04d9\3\2\2\2\u04db\u0093\3\2\2\2\u04dc\u04df\5\u0194"+
		"\u00cb\2\u04dd\u04de\7\u0090\2\2\u04de\u04e0\5\u0096L\2\u04df\u04dd\3"+
		"\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u0095\3\2\2\2\u04e1\u04e5\5\32\16\2\u04e2"+
		"\u04e5\5\u0126\u0094\2\u04e3\u04e5\5\u0156\u00ac\2\u04e4\u04e1\3\2\2\2"+
		"\u04e4\u04e2\3\2\2\2\u04e4\u04e3\3\2\2\2\u04e5\u0097\3\2\2\2\u04e6\u04e7"+
		"\7\34\2\2\u04e7\u04e8\5\6\4\2\u04e8\u04e9\5\u00eav\2\u04e9\u0099\3\2\2"+
		"\2\u04ea\u04ed\5\u008eH\2\u04eb\u04ed\5\u008cG\2\u04ec\u04ea\3\2\2\2\u04ec"+
		"\u04eb\3\2\2\2\u04ed\u009b\3\2\2\2\u04ee\u04f0\5\u009eP\2\u04ef\u04ee"+
		"\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2"+
		"\u04f3\3\2\2\2\u04f3\u04f4\5\u00a0Q\2\u04f4\u009d\3\2\2\2\u04f5\u04f6"+
		"\7\27\2\2\u04f6\u04f7\5\32\16\2\u04f7\u04f8\7\u0084\2\2\u04f8\u04fc\3"+
		"\2\2\2\u04f9\u04fa\7\37\2\2\u04fa\u04fc\7\u0084\2\2\u04fb\u04f5\3\2\2"+
		"\2\u04fb\u04f9\3\2\2\2\u04fc\u009f\3\2\2\2\u04fd\u04ff\5\u0086D\2\u04fe"+
		"\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501\3\2"+
		"\2\2\u0501\u00a1\3\2\2\2\u0502\u050c\5\u0090I\2\u0503\u0508\5\32\16\2"+
		"\u0504\u0505\7\u0083\2\2\u0505\u0507\5\32\16\2\u0506\u0504\3\2\2\2\u0507"+
		"\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050c\3\2"+
		"\2\2\u050a\u0508\3\2\2\2\u050b\u0502\3\2\2\2\u050b\u0503\3\2\2\2\u050c"+
		"\u00a3\3\2\2\2\u050d\u0512\5\32\16\2\u050e\u050f\7\u0083\2\2\u050f\u0511"+
		"\5\32\16\2\u0510\u050e\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2"+
		"\u0512\u0513\3\2\2\2\u0513\u00a5\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u0519"+
		"\5\u00a8U\2\u0516\u0518\5\u00a8U\2\u0517\u0516\3\2\2\2\u0518\u051b\3\2"+
		"\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051d\3\2\2\2\u051b"+
		"\u0519\3\2\2\2\u051c\u051e\5\u00aaV\2\u051d\u051c\3\2\2\2\u051d\u051e"+
		"\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u0521\5\u00aaV\2\u0520\u0515\3\2\2"+
		"\2\u0520\u051f\3\2\2\2\u0521\u00a7\3\2\2\2\u0522\u0523\7\30\2\2\u0523"+
		"\u0524\7\u0080\2\2\u0524\u0526\5\22\n\2\u0525\u0527\5\u0194\u00cb\2\u0526"+
		"\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052a\7\u0081"+
		"\2\2\u0529\u052b\5\u00acW\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u052c\3\2\2\2\u052c\u052d\5\u008eH\2\u052d\u00a9\3\2\2\2\u052e\u0530"+
		"\7\30\2\2\u052f\u0531\5\u00acW\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2"+
		"\2\u0531\u0532\3\2\2\2\u0532\u0533\5\u008eH\2\u0533\u00ab\3\2\2\2\u0534"+
		"\u0535\7n\2\2\u0535\u0536\7\u0080\2\2\u0536\u0537\5\32\16\2\u0537\u0538"+
		"\7\u0081\2\2\u0538\u00ad\3\2\2\2\u0539\u053a\7,\2\2\u053a\u053b\5\u008e"+
		"H\2\u053b\u00af\3\2\2\2\u053c\u053f\5\u0090I\2\u053d\u053f\5\32\16\2\u053e"+
		"\u053c\3\2\2\2\u053e\u053d\3\2\2\2\u053f\u00b1\3\2\2\2\u0540\u0541\7B"+
		"\2\2\u0541\u0542\5\u00b4[\2\u0542\u0544\5\u00b6\\\2\u0543\u0545\7\u0085"+
		"\2\2\u0544\u0543\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u00b3\3\2\2\2\u0546"+
		"\u054b\5\u0194\u00cb\2\u0547\u0548\7\u0082\2\2\u0548\u054a\5\u0194\u00cb"+
		"\2\u0549\u0547\3\2\2\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c"+
		"\3\2\2\2\u054c\u00b5\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u0550\7|\2\2\u054f"+
		"\u0551\5\u00b8]\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553"+
		"\3\2\2\2\u0552\u0554\5\u00bc_\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2"+
		"\2\u0554\u0556\3\2\2\2\u0555\u0557\5\u00c0a\2\u0556\u0555\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\7}\2\2\u0559\u00b7\3\2"+
		"\2\2\u055a\u055c\5\u00ba^\2\u055b\u055a\3\2\2\2\u055c\u055d\3\2\2\2\u055d"+
		"\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u00b9\3\2\2\2\u055f\u0560\7*"+
		"\2\2\u0560\u0561\7\f\2\2\u0561\u0562\5\u0194\u00cb\2\u0562\u0563\7\u0085"+
		"\2\2\u0563\u00bb\3\2\2\2\u0564\u0566\5\u00be`\2\u0565\u0564\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u00bd\3\2"+
		"\2\2\u0569\u056a\7i\2\2\u056a\u056b\5\u0194\u00cb\2\u056b\u056c\7\u0090"+
		"\2\2\u056c\u056d\5\4\3\2\u056d\u056e\7\u0085\2\2\u056e\u0579\3\2\2\2\u056f"+
		"\u0570\7i\2\2\u0570\u0571\5\4\3\2\u0571\u0572\7\u0085\2\2\u0572\u0579"+
		"\3\2\2\2\u0573\u0574\7i\2\2\u0574\u0575\7[\2\2\u0575\u0576\5\4\3\2\u0576"+
		"\u0577\7\u0085\2\2\u0577\u0579\3\2\2\2\u0578\u0569\3\2\2\2\u0578\u056f"+
		"\3\2\2\2\u0578\u0573\3\2\2\2\u0579\u00bf\3\2\2\2\u057a\u057c\5\u00c2b"+
		"\2\u057b\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057b\3\2\2\2\u057d\u057e"+
		"\3\2\2\2\u057e\u00c1\3\2\2\2\u057f\u0582\5\u00b2Z\2\u0580\u0582\5\u00c4"+
		"c\2\u0581\u057f\3\2\2\2\u0581\u0580\3\2\2\2\u0582\u00c3\3\2\2\2\u0583"+
		"\u0585\5\u0140\u00a1\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587"+
		"\3\2\2\2\u0586\u0588\5\u00e2r\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2"+
		"\2\u0588\u058e\3\2\2\2\u0589\u058f\5\u0170\u00b9\2\u058a\u058f\5\u0172"+
		"\u00ba\2\u058b\u058f\5\u0174\u00bb\2\u058c\u058f\5\u0176\u00bc\2\u058d"+
		"\u058f\5\u0178\u00bd\2\u058e\u0589\3\2\2\2\u058e\u058a\3\2\2\2\u058e\u058b"+
		"\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058d\3\2\2\2\u058f\u00c5\3\2\2\2\u0590"+
		"\u0591\5\u0194\u00cb\2\u0591\u0592\7\u0094\2\2\u0592\u0594\5\u0194\u00cb"+
		"\2\u0593\u0595\5\24\13\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u00c7\3\2\2\2\u0596\u0597\7\u0091\2\2\u0597\u059c\5\u00caf\2\u0598\u0599"+
		"\7\u0083\2\2\u0599\u059b\5\u00caf\2\u059a\u0598\3\2\2\2\u059b\u059e\3"+
		"\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e"+
		"\u059c\3\2\2\2\u059f\u05a0\7\u0092\2\2\u05a0\u00c9\3\2\2\2\u05a1\u05a3"+
		"\5\u0140\u00a1\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3"+
		"\2\2\2\u05a4\u05a5\5\u0194\u00cb\2\u05a5\u00cb\3\2\2\2\u05a6\u05a7\7\u0084"+
		"\2\2\u05a7\u05ac\5\22\n\2\u05a8\u05a9\7\u0083\2\2\u05a9\u05ab\5\4\3\2"+
		"\u05aa\u05a8\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad"+
		"\3\2\2\2\u05ad\u00cd\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b4\5\4\3\2\u05b0"+
		"\u05b1\7\u0083\2\2\u05b1\u05b3\5\4\3\2\u05b2\u05b0\3\2\2\2\u05b3\u05b6"+
		"\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u00cf\3\2\2\2\u05b6"+
		"\u05b4\3\2\2\2\u05b7\u05b9\5\u00d2j\2\u05b8\u05b7\3\2\2\2\u05b9\u05ba"+
		"\3\2\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u00d1\3\2\2\2\u05bc"+
		"\u05bd\7o\2\2\u05bd\u05be\5\u0194\u00cb\2\u05be\u05bf\7\u0084\2\2\u05bf"+
		"\u05c0\5\u00d4k\2\u05c0\u00d3\3\2\2\2\u05c1\u05cc\5\u00dan\2\u05c2\u05c5"+
		"\5\u00d6l\2\u05c3\u05c4\7\u0083\2\2\u05c4\u05c6\5\u00d8m\2\u05c5\u05c3"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c9\3\2\2\2\u05c7\u05c8\7\u0083\2"+
		"\2\u05c8\u05ca\5\u00dan\2\u05c9\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca"+
		"\u05cc\3\2\2\2\u05cb\u05c1\3\2\2\2\u05cb\u05c2\3\2\2\2\u05cc\u00d5\3\2"+
		"\2\2\u05cd\u05d1\5\22\n\2\u05ce\u05d1\7\33\2\2\u05cf\u05d1\7]\2\2\u05d0"+
		"\u05cd\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05cf\3\2\2\2\u05d1\u00d7\3\2"+
		"\2\2\u05d2\u05d7\5\4\3\2\u05d3\u05d4\7\u0083\2\2\u05d4\u05d6\5\4\3\2\u05d5"+
		"\u05d3\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2"+
		"\2\2\u05d8\u00d9\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05db\7C\2\2\u05db"+
		"\u05dc\7\u0080\2\2\u05dc\u05dd\7\u0081\2\2\u05dd\u00db\3\2\2\2\u05de\u05e0"+
		"\7|\2\2\u05df\u05e1\5\u00dep\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2"+
		"\u05e1\u05e2\3\2\2\2\u05e2\u05e3\7}\2\2\u05e3\u00dd\3\2\2\2\u05e4\u05e6"+
		"\5\u00e0q\2\u05e5\u05e4\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e5\3\2\2"+
		"\2\u05e7\u05e8\3\2\2\2\u05e8\u00df\3\2\2\2\u05e9\u05eb\5\u0140\u00a1\2"+
		"\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed\3\2\2\2\u05ec\u05ee"+
		"\5\u00e2r\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f1\3\2\2"+
		"\2\u05ef\u05f2\5\u00e6t\2\u05f0\u05f2\5\u0184\u00c3\2\u05f1\u05ef\3\2"+
		"\2\2\u05f1\u05f0\3\2\2\2\u05f2\u00e1\3\2\2\2\u05f3\u05f5\5\u00e4s\2\u05f4"+
		"\u05f3\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2"+
		"\2\2\u05f7\u00e3\3\2\2\2\u05f8\u05f9\t\13\2\2\u05f9\u00e5\3\2\2\2\u05fa"+
		"\u060e\5\u0180\u00c1\2\u05fb\u060e\5\u00e8u\2\u05fc\u060e\5\u017a\u00be"+
		"\2\u05fd\u0603\5\u0116\u008c\2\u05fe\u0604\5\u011a\u008e\2\u05ff\u0600"+
		"\5\u0158\u00ad\2\u0600\u0601\5\32\16\2\u0601\u0602\7\u0085\2\2\u0602\u0604"+
		"\3\2\2\2\u0603\u05fe\3\2\2\2\u0603\u05ff\3\2\2\2\u0604\u060e\3\2\2\2\u0605"+
		"\u060e\5\u0186\u00c4\2\u0606\u0607\7l\2\2\u0607\u060e\5\u0188\u00c5\2"+
		"\u0608\u060e\5\u0170\u00b9\2\u0609\u060e\5\u0172\u00ba\2\u060a\u060e\5"+
		"\u0174\u00bb\2\u060b\u060e\5\u0176\u00bc\2\u060c\u060e\5\u0178\u00bd\2"+
		"\u060d\u05fa\3\2\2\2\u060d\u05fb\3\2\2\2\u060d\u05fc\3\2\2\2\u060d\u05fd"+
		"\3\2\2\2\u060d\u0605\3\2\2\2\u060d\u0606\3\2\2\2\u060d\u0608\3\2\2\2\u060d"+
		"\u0609\3\2\2\2\u060d\u060a\3\2\2\2\u060d\u060b\3\2\2\2\u060d\u060c\3\2"+
		"\2\2\u060e\u00e7\3\2\2\2\u060f\u0619\5\6\4\2\u0610\u0611\5\4\3\2\u0611"+
		"\u0612\7\u0082\2\2\u0612\u0613\5\u0182\u00c2\2\u0613\u061a\3\2\2\2\u0614"+
		"\u061a\5\u0188\u00c5\2\u0615\u061a\5\u017e\u00c0\2\u0616\u061a\5\u0182"+
		"\u00c2\2\u0617\u061a\5\u018c\u00c7\2\u0618\u061a\5\u017c\u00bf\2\u0619"+
		"\u0610\3\2\2\2\u0619\u0614\3\2\2\2\u0619\u0615\3\2\2\2\u0619\u0616\3\2"+
		"\2\2\u0619\u0617\3\2\2\2\u0619\u0618\3\2\2\2\u061a\u00e9\3\2\2\2\u061b"+
		"\u0620\5\u00ecw\2\u061c\u061d\7\u0083\2\2\u061d\u061f\5\u00ecw\2\u061e"+
		"\u061c\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0620\u0621\3\2"+
		"\2\2\u0621\u00eb\3\2\2\2\u0622\u0620\3\2\2\2\u0623\u0624\5\u0194\u00cb"+
		"\2\u0624\u0625\7\u0090\2\2\u0625\u0626\5\32\16\2\u0626\u00ed\3\2\2\2\u0627"+
		"\u062c\5\u00f0y\2\u0628\u0629\7\u0083\2\2\u0629\u062b\5\u00f0y\2\u062a"+
		"\u0628\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2"+
		"\2\2\u062d\u00ef\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u0632\5\u0194\u00cb"+
		"\2\u0630\u0631\7\u0090\2\2\u0631\u0633\5\u00f2z\2\u0632\u0630\3\2\2\2"+
		"\u0632\u0633\3\2\2\2\u0633\u00f1\3\2\2\2\u0634\u0637\5\32\16\2\u0635\u0637"+
		"\5\u0126\u0094\2\u0636\u0634\3\2\2\2\u0636\u0635\3\2\2\2\u0637\u00f3\3"+
		"\2\2\2\u0638\u063b\5\6\4\2\u0639\u063b\7l\2\2\u063a\u0638\3\2\2\2\u063a"+
		"\u0639\3\2\2\2\u063b\u00f5\3\2\2\2\u063c\u063d\5\4\3\2\u063d\u00f7\3\2"+
		"\2\2\u063e\u0641\5\u008eH\2\u063f\u0641\7\u0085\2\2\u0640\u063e\3\2\2"+
		"\2\u0640\u063f\3\2\2\2\u0641\u00f9\3\2\2\2\u0642\u0649\5\u0102\u0082\2"+
		"\u0643\u0646\5\u00fc\177\2\u0644\u0645\7\u0083\2\2\u0645\u0647\5\u0102"+
		"\u0082\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\3\2\2\2\u0648"+
		"\u0642\3\2\2\2\u0648\u0643\3\2\2\2\u0649\u00fb\3\2\2\2\u064a\u064f\5\u00fe"+
		"\u0080\2\u064b\u064c\7\u0083\2\2\u064c\u064e\5\u00fe\u0080\2\u064d\u064b"+
		"\3\2\2\2\u064e\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650"+
		"\u00fd\3\2\2\2\u0651\u064f\3\2\2\2\u0652\u0654\5\u0140\u00a1\2\u0653\u0652"+
		"\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0656\3\2\2\2\u0655\u0657\5\u0100\u0081"+
		"\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065b"+
		"\5\u018e\u00c8\2\u0659\u065b\7\r\2\2\u065a\u0653\3\2\2\2\u065a\u0659\3"+
		"\2\2\2\u065b\u00ff\3\2\2\2\u065c\u065d\t\f\2\2\u065d\u0101\3\2\2\2\u065e"+
		"\u0660\5\u0140\u00a1\2\u065f\u065e\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0661"+
		"\3\2\2\2\u0661\u0662\7K\2\2\u0662\u0663\5\u0122\u0092\2\u0663\u0664\5"+
		"\u0194\u00cb\2\u0664\u0103\3\2\2\2\u0665\u0667\5\u0140\u00a1\2\u0666\u0665"+
		"\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0669\3\2\2\2\u0668\u066a\5\u010a\u0086"+
		"\2\u0669\u0668\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u0675\3\2\2\2\u066b\u066c"+
		"\7\62\2\2\u066c\u066e\5\u010c\u0087\2\u066d\u066f\5\u0108\u0085\2\u066e"+
		"\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0676\3\2\2\2\u0670\u0671\7W"+
		"\2\2\u0671\u0673\5\u010c\u0087\2\u0672\u0674\5\u0106\u0084\2\u0673\u0672"+
		"\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676\3\2\2\2\u0675\u066b\3\2\2\2\u0675"+
		"\u0670\3\2\2\2\u0676\u0105\3\2\2\2\u0677\u0679\5\u0140\u00a1\2\u0678\u0677"+
		"\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b\3\2\2\2\u067a\u067c\5\u010a\u0086"+
		"\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e"+
		"\7\62\2\2\u067e\u067f\5\u010c\u0087\2\u067f\u0107\3\2\2\2\u0680\u0682"+
		"\5\u0140\u00a1\2\u0681\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0684\3"+
		"\2\2\2\u0683\u0685\5\u010a\u0086\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2"+
		"\2\2\u0685\u0686\3\2\2\2\u0686\u0687\7W\2\2\u0687\u0688\5\u010c\u0087"+
		"\2\u0688\u0109\3\2\2\2\u0689\u0691\7N\2\2\u068a\u0691\7:\2\2\u068b\u0691"+
		"\7M\2\2\u068c\u068d\7N\2\2\u068d\u0691\7:\2\2\u068e\u068f\7:\2\2\u068f"+
		"\u0691\7N\2\2\u0690\u0689\3\2\2\2\u0690\u068a\3\2\2\2\u0690\u068b\3\2"+
		"\2\2\u0690\u068c\3\2\2\2\u0690\u068e\3\2\2\2\u0691\u010b\3\2\2\2\u0692"+
		"\u0695\5\u008eH\2\u0693\u0695\7\u0085\2\2\u0694\u0692\3\2\2\2\u0694\u0693"+
		"\3\2\2\2\u0695\u010d\3\2\2\2\u0696\u0698\5\u0140\u00a1\2\u0697\u0696\3"+
		"\2\2\2\u0697\u0698\3\2\2\2\u0698\u06a1\3\2\2\2\u0699\u069a\7\13\2\2\u069a"+
		"\u069b\5\u008eH\2\u069b\u069c\5\u0112\u008a\2\u069c\u06a2\3\2\2\2\u069d"+
		"\u069e\7R\2\2\u069e\u069f\5\u008eH\2\u069f\u06a0\5\u0110\u0089\2\u06a0"+
		"\u06a2\3\2\2\2\u06a1\u0699\3\2\2\2\u06a1\u069d\3\2\2\2\u06a2\u010f\3\2"+
		"\2\2\u06a3\u06a5\5\u0140\u00a1\2\u06a4\u06a3\3\2\2\2\u06a4\u06a5\3\2\2"+
		"\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\7\13\2\2\u06a7\u06a8\5\u008eH\2\u06a8"+
		"\u0111\3\2\2\2\u06a9\u06ab\5\u0140\u00a1\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab"+
		"\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\7R\2\2\u06ad\u06ae\5\u008eH\2"+
		"\u06ae\u0113\3\2\2\2\u06af\u06c6\7\u0086\2\2\u06b0\u06c6\7\u0087\2\2\u06b1"+
		"\u06c6\7\u008e\2\2\u06b2\u06c6\7\u008f\2\2\u06b3\u06c6\7\u0096\2\2\u06b4"+
		"\u06c6\7\u0097\2\2\u06b5\u06c6\7a\2\2\u06b6\u06c6\7+\2\2\u06b7\u06c6\7"+
		"\u0088\2\2\u06b8\u06c6\7\u0089\2\2\u06b9\u06c6\7\u008a\2\2\u06ba\u06c6"+
		"\7\u008b\2\2\u06bb\u06c6\7\u008c\2\2\u06bc\u06c6\7\u008d\2\2\u06bd\u06c6"+
		"\7\u00a7\2\2\u06be\u06c6\5\u015a\u00ae\2\u06bf\u06c6\7\u009b\2\2\u06c0"+
		"\u06c6\7\u009c\2\2\u06c1\u06c6\7\u0092\2\2\u06c2\u06c6\7\u0091\2\2\u06c3"+
		"\u06c6\7\u009e\2\2\u06c4\u06c6\7\u009d\2\2\u06c5\u06af\3\2\2\2\u06c5\u06b0"+
		"\3\2\2\2\u06c5\u06b1\3\2\2\2\u06c5\u06b2\3\2\2\2\u06c5\u06b3\3\2\2\2\u06c5"+
		"\u06b4\3\2\2\2\u06c5\u06b5\3\2\2\2\u06c5\u06b6\3\2\2\2\u06c5\u06b7\3\2"+
		"\2\2\u06c5\u06b8\3\2\2\2\u06c5\u06b9\3\2\2\2\u06c5\u06ba\3\2\2\2\u06c5"+
		"\u06bb\3\2\2\2\u06c5\u06bc\3\2\2\2\u06c5\u06bd\3\2\2\2\u06c5\u06be\3\2"+
		"\2\2\u06c5\u06bf\3\2\2\2\u06c5\u06c0\3\2\2\2\u06c5\u06c1\3\2\2\2\u06c5"+
		"\u06c2\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c4\3\2\2\2\u06c6\u0115\3\2"+
		"\2\2\u06c7\u06c8\t\r\2\2\u06c8\u06c9\7G\2\2\u06c9\u06ca\5\6\4\2\u06ca"+
		"\u06cb\7\u0080\2\2\u06cb\u06cc\5\u018e\u00c8\2\u06cc\u06cd\7\u0081\2\2"+
		"\u06cd\u0117\3\2\2\2\u06ce\u06cf\7\u0084\2\2\u06cf\u06d0\t\16\2\2\u06d0"+
		"\u06d2\7\u0080\2\2\u06d1\u06d3\5\26\f\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3"+
		"\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d5\7\u0081\2\2\u06d5\u0119\3\2\2"+
		"\2\u06d6\u06d9\5\u008eH\2\u06d7\u06d9\7\u0085\2\2\u06d8\u06d6\3\2\2\2"+
		"\u06d8\u06d7\3\2\2\2\u06d9\u011b\3\2\2\2\u06da\u06db\7\u0084\2\2\u06db"+
		"\u06dc\5\u00ceh\2\u06dc\u011d\3\2\2\2\u06dd\u06e1\7|\2\2\u06de\u06e0\5"+
		"\u0120\u0091\2\u06df\u06de\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1\u06df\3\2"+
		"\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e4\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e4"+
		"\u06e5\7}\2\2\u06e5\u011f\3\2\2\2\u06e6\u06e8\5\u0140\u00a1\2\u06e7\u06e6"+
		"\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06ea\3\2\2\2\u06e9\u06eb\5\u00e2r"+
		"\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06f6\3\2\2\2\u06ec\u06f7"+
		"\5\u00e6t\2\u06ed\u06ee\7-\2\2\u06ee\u06f0\5\6\4\2\u06ef\u06f1\5\u0154"+
		"\u00ab\2\u06f0\u06ef\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2"+
		"\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\7\u0085\2\2\u06f5\u06f7"+
		"\3\2\2\2\u06f6\u06ec\3\2\2\2\u06f6\u06ed\3\2\2\2\u06f7\u0121\3\2\2\2\u06f8"+
		"\u0700\5\b\5\2\u06f9\u06fb\t\17\2\2\u06fa\u06f9\3\2\2\2\u06fb\u06fe\3"+
		"\2\2\2\u06fc\u06fa\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06ff\3\2\2\2\u06fe"+
		"\u06fc\3\2\2\2\u06ff\u0701\5\u0124\u0093\2\u0700\u06fc\3\2\2\2\u0701\u0702"+
		"\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0123\3\2\2\2\u0704"+
		"\u0708\7~\2\2\u0705\u0707\7\u0083\2\2\u0706\u0705\3\2\2\2\u0707\u070a"+
		"\3\2\2\2\u0708\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070b\3\2\2\2\u070a"+
		"\u0708\3\2\2\2\u070b\u070c\7\177\2\2\u070c\u0125\3\2\2\2\u070d\u0719\7"+
		"|\2\2\u070e\u0713\5\u00f2z\2\u070f\u0710\7\u0083\2\2\u0710\u0712\5\u00f2"+
		"z\2\u0711\u070f\3\2\2\2\u0712\u0715\3\2\2\2\u0713\u0711\3\2\2\2\u0713"+
		"\u0714\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2\2\2\u0716\u0718\7\u0083"+
		"\2\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071a\3\2\2\2\u0719"+
		"\u070e\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u071c\7}"+
		"\2\2\u071c\u0127\3\2\2\2\u071d\u071e\7\u0091\2\2\u071e\u0723\5\u012a\u0096"+
		"\2\u071f\u0720\7\u0083\2\2\u0720\u0722\5\u012a\u0096\2\u0721\u071f\3\2"+
		"\2\2\u0722\u0725\3\2\2\2\u0723\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724"+
		"\u0726\3\2\2\2\u0725\u0723\3\2\2\2\u0726\u0727\7\u0092\2\2\u0727\u0129"+
		"\3\2\2\2\u0728\u072a\5\u0140\u00a1\2\u0729\u0728\3\2\2\2\u0729\u072a\3"+
		"\2\2\2\u072a\u072c\3\2\2\2\u072b\u072d\5\u012c\u0097\2\u072c\u072b\3\2"+
		"\2\2\u072c\u072d\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\5\u0194\u00cb"+
		"\2\u072f\u012b\3\2\2\2\u0730\u0731\t\20\2\2\u0731\u012d\3\2\2\2\u0732"+
		"\u0733\7\u0084\2\2\u0733\u0734\5\u00ceh\2\u0734\u012f\3\2\2\2\u0735\u0739"+
		"\7|\2\2\u0736\u0738\5\u0132\u009a\2\u0737\u0736\3\2\2\2\u0738\u073b\3"+
		"\2\2\2\u0739\u0737\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073c\3\2\2\2\u073b"+
		"\u0739\3\2\2\2\u073c\u073d\7}\2\2\u073d\u0131\3\2\2\2\u073e\u0740\5\u0140"+
		"\u00a1\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0742\3\2\2\2\u0741"+
		"\u0743\7C\2\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u077c\3\2"+
		"\2\2\u0744\u0746\7g\2\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746"+
		"\u0747\3\2\2\2\u0747\u0763\5\6\4\2\u0748\u074a\5\u0194\u00cb\2\u0749\u074b"+
		"\5\u00c8e\2\u074a\u0749\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\3\2\2"+
		"\2\u074c\u074e\7\u0080\2\2\u074d\u074f\5\u00fa~\2\u074e\u074d\3\2\2\2"+
		"\u074e\u074f\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0752\7\u0081\2\2\u0751"+
		"\u0753\5\u00d0i\2\u0752\u0751\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754"+
		"\3\2\2\2\u0754\u0755\7\u0085\2\2\u0755\u0764\3\2\2\2\u0756\u0757\5\u0194"+
		"\u00cb\2\u0757\u0758\7|\2\2\u0758\u0759\5\u0134\u009b\2\u0759\u075a\7"+
		"}\2\2\u075a\u0764\3\2\2\2\u075b\u075c\7_\2\2\u075c\u075d\7~\2\2\u075d"+
		"\u075e\5\u00fa~\2\u075e\u075f\7\177\2\2\u075f\u0760\7|\2\2\u0760\u0761"+
		"\5\u0134\u009b\2\u0761\u0762\7}\2\2\u0762\u0764\3\2\2\2\u0763\u0748\3"+
		"\2\2\2\u0763\u0756\3\2\2\2\u0763\u075b\3\2\2\2\u0764\u077d\3\2\2\2\u0765"+
		"\u0767\7g\2\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768\3\2"+
		"\2\2\u0768\u0769\7l\2\2\u0769\u076b\5\u0194\u00cb\2\u076a\u076c\5\u00c8"+
		"e\2\u076b\u076a\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\3\2\2\2\u076d"+
		"\u076f\7\u0080\2\2\u076e\u0770\5\u00fa~\2\u076f\u076e\3\2\2\2\u076f\u0770"+
		"\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0773\7\u0081\2\2\u0772\u0774\5\u00d0"+
		"i\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\3\2\2\2\u0775"+
		"\u0776\7\u0085\2\2\u0776\u077d\3\2\2\2\u0777\u0778\7(\2\2\u0778\u0779"+
		"\5\6\4\2\u0779\u077a\5\u0194\u00cb\2\u077a\u077b\7\u0085\2\2\u077b\u077d"+
		"\3\2\2\2\u077c\u0745\3\2\2\2\u077c\u0766\3\2\2\2\u077c\u0777\3\2\2\2\u077d"+
		"\u0133\3\2\2\2\u077e\u0780\5\u0140\u00a1\2\u077f\u077e\3\2\2\2\u077f\u0780"+
		"\3\2\2\2\u0780\u0793\3\2\2\2\u0781\u0782\7\62\2\2\u0782\u0788\7\u0085"+
		"\2\2\u0783\u0785\5\u0140\u00a1\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2"+
		"\2\u0785\u0786\3\2\2\2\u0786\u0787\7W\2\2\u0787\u0789\7\u0085\2\2\u0788"+
		"\u0784\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u0794\3\2\2\2\u078a\u078b\7W"+
		"\2\2\u078b\u0791\7\u0085\2\2\u078c\u078e\5\u0140\u00a1\2\u078d\u078c\3"+
		"\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\7\62\2\2\u0790"+
		"\u0792\7\u0085\2\2\u0791\u078d\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0794"+
		"\3\2\2\2\u0793\u0781\3\2\2\2\u0793\u078a\3\2\2\2\u0794\u0135\3\2\2\2\u0795"+
		"\u0796\7\u0084\2\2\u0796\u0797\5\6\4\2\u0797\u0137\3\2\2\2\u0798\u07a4"+
		"\7|\2\2\u0799\u079e\5\u013a\u009e\2\u079a\u079b\7\u0083\2\2\u079b\u079d"+
		"\5\u013a\u009e\2\u079c\u079a\3\2\2\2\u079d\u07a0\3\2\2\2\u079e\u079c\3"+
		"\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a2\3\2\2\2\u07a0\u079e\3\2\2\2\u07a1"+
		"\u07a3\7\u0083\2\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a5"+
		"\3\2\2\2\u07a4\u0799\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6"+
		"\u07a7\7}\2\2\u07a7\u0139\3\2\2\2\u07a8\u07aa\5\u0140\u00a1\2\u07a9\u07a8"+
		"\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ae\5\u0194\u00cb"+
		"\2\u07ac\u07ad\7\u0090\2\2\u07ad\u07af\5\32\16\2\u07ae\u07ac\3\2\2\2\u07ae"+
		"\u07af\3\2\2\2\u07af\u013b\3\2\2\2\u07b0\u07b1\7~\2\2\u07b1\u07b2\5\u013e"+
		"\u00a0\2\u07b2\u07b3\7\u0084\2\2\u07b3\u07b5\5\u0146\u00a4\2\u07b4\u07b6"+
		"\7\u0083\2\2\u07b5\u07b4\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b7\3\2\2"+
		"\2\u07b7\u07b8\7\177\2\2\u07b8\u013d\3\2\2\2\u07b9\u07bc\5\u016e\u00b8"+
		"\2\u07ba\u07bc\5\u0194\u00cb\2\u07bb\u07b9\3\2\2\2\u07bb\u07ba\3\2\2\2"+
		"\u07bc\u013f\3\2\2\2\u07bd\u07bf\5\u0142\u00a2\2\u07be\u07bd\3\2\2\2\u07bf"+
		"\u07c0\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u0141\3\2"+
		"\2\2\u07c2\u07c6\7~\2\2\u07c3\u07c4\5\u0144\u00a3\2\u07c4\u07c5\7\u0084"+
		"\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07c3\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7"+
		"\u07c8\3\2\2\2\u07c8\u07ca\5\u0146\u00a4\2\u07c9\u07cb\7\u0083\2\2\u07ca"+
		"\u07c9\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd\7\177"+
		"\2\2\u07cd\u0143\3\2\2\2\u07ce\u07d1\5\u016e\u00b8\2\u07cf\u07d1\5\u0194"+
		"\u00cb\2\u07d0\u07ce\3\2\2\2\u07d0\u07cf\3\2\2\2\u07d1\u0145\3\2\2\2\u07d2"+
		"\u07d7\5\u0148\u00a5\2\u07d3\u07d4\7\u0083\2\2\u07d4\u07d6\5\u0148\u00a5"+
		"\2\u07d5\u07d3\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d8"+
		"\3\2\2\2\u07d8\u0147\3\2\2\2\u07d9\u07d7\3\2\2\2\u07da\u07e7\5\4\3\2\u07db"+
		"\u07e4\7\u0080\2\2\u07dc\u07e1\5\u014a\u00a6\2\u07dd\u07de\7\u0083\2\2"+
		"\u07de\u07e0\5\u014a\u00a6\2\u07df\u07dd\3\2\2\2\u07e0\u07e3\3\2\2\2\u07e1"+
		"\u07df\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e5\3\2\2\2\u07e3\u07e1\3\2"+
		"\2\2\u07e4\u07dc\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6"+
		"\u07e8\7\u0081\2\2\u07e7\u07db\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u0149"+
		"\3\2\2\2\u07e9\u07ea\5\u0194\u00cb\2\u07ea\u07eb\7\u0084\2\2\u07eb\u07ed"+
		"\3\2\2\2\u07ec\u07e9\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee"+
		"\u07ef\5\32\16\2\u07ef\u014b\3\2\2\2\u07f0\u07f3\5\n\6\2\u07f1\u07f3\5"+
		"\22\n\2\u07f2\u07f0\3\2\2\2\u07f2\u07f1\3\2\2\2\u07f3\u07f8\3\2\2\2\u07f4"+
		"\u07f7\5\u0124\u0093\2\u07f5\u07f7\7\u0093\2\2\u07f6\u07f4\3\2\2\2\u07f6"+
		"\u07f5\3\2\2\2\u07f7\u07fa\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f8\u07f9\3\2"+
		"\2\2\u07f9\u07fb\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fb\u07fc\7\u0088\2\2\u07fc"+
		"\u0800\3\2\2\2\u07fd\u07fe\7l\2\2\u07fe\u0800\7\u0088\2\2\u07ff\u07f2"+
		"\3\2\2\2\u07ff\u07fd\3\2\2\2\u0800\u014d\3\2\2\2\u0801\u0806\5\u0150\u00a9"+
		"\2\u0802\u0803\7\u0083\2\2\u0803\u0805\5\u0150\u00a9\2\u0804\u0802\3\2"+
		"\2\2\u0805\u0808\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807"+
		"\u014f\3\2\2\2\u0808\u0806\3\2\2\2\u0809\u080a\5\u0194\u00cb\2\u080a\u080b"+
		"\7\u0090\2\2\u080b\u080c\5\u0152\u00aa\2\u080c\u0151\3\2\2\2\u080d\u080f"+
		"\7\u008b\2\2\u080e\u080d\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0810\3\2\2"+
		"\2\u0810\u0813\5\32\16\2\u0811\u0813\5\u0156\u00ac\2\u0812\u080e\3\2\2"+
		"\2\u0812\u0811\3\2\2\2\u0813\u0153\3\2\2\2\u0814\u0815\5\u0194\u00cb\2"+
		"\u0815\u0816\7~\2\2\u0816\u0817\5\32\16\2\u0817\u0818\7\177\2\2\u0818"+
		"\u0155\3\2\2\2\u0819\u081a\7Z\2\2\u081a\u081b\5\6\4\2\u081b\u081c\7~\2"+
		"\2\u081c\u081d\5\32\16\2\u081d\u081e\7\177\2\2\u081e\u0157\3\2\2\2\u081f"+
		"\u0820\7\u0090\2\2\u0820\u0821\7\u0092\2\2\u0821\u0822\6\u00ad\2\3\u0822"+
		"\u0159\3\2\2\2\u0823\u0824\7\u0092\2\2\u0824\u0825\7\u0092\2\2\u0825\u0826"+
		"\6\u00ae\3\3\u0826\u015b\3\2\2\2\u0827\u0828\7\u0092\2\2\u0828\u0829\7"+
		"\u009e\2\2\u0829\u082a\6\u00af\4\3\u082a\u015d\3\2\2\2\u082b\u0833\5\u0160"+
		"\u00b1\2\u082c\u0833\5\u0162\u00b2\2\u082d\u0833\7t\2\2\u082e\u0833\7"+
		"u\2\2\u082f\u0833\7v\2\2\u0830\u0833\7w\2\2\u0831\u0833\7D\2\2\u0832\u082b"+
		"\3\2\2\2\u0832\u082c\3\2\2\2\u0832\u082d\3\2\2\2\u0832\u082e\3\2\2\2\u0832"+
		"\u082f\3\2\2\2\u0832\u0830\3\2\2\2\u0832\u0831\3\2\2\2\u0833\u015f\3\2"+
		"\2\2\u0834\u0835\t\21\2\2\u0835\u0161\3\2\2\2\u0836\u083b\5\u0164\u00b3"+
		"\2\u0837\u083b\5\u0166\u00b4\2\u0838\u083b\7x\2\2\u0839\u083b\7y\2\2\u083a"+
		"\u0836\3\2\2\2\u083a\u0837\3\2\2\2\u083a\u0838\3\2\2\2\u083a\u0839\3\2"+
		"\2\2\u083b\u0163\3\2\2\2\u083c\u0840\7z\2\2\u083d\u083f\5\u0168\u00b5"+
		"\2\u083e\u083d\3\2\2\2\u083f\u0842\3\2\2\2\u0840\u083e\3\2\2\2\u0840\u0841"+
		"\3\2\2\2\u0841\u0843\3\2\2\2\u0842\u0840\3\2\2\2\u0843\u0844\7\u00ad\2"+
		"\2\u0844\u0165\3\2\2\2\u0845\u0849\7{\2\2\u0846\u0848\5\u016a\u00b6\2"+
		"\u0847\u0846\3\2\2\2\u0848\u084b\3\2\2\2\u0849\u0847\3\2\2\2\u0849\u084a"+
		"\3\2\2\2\u084a\u084c\3\2\2\2\u084b\u0849\3\2\2\2\u084c\u084d\7\u00ad\2"+
		"\2\u084d\u0167\3\2\2\2\u084e\u0853\5\u016c\u00b7\2\u084f\u0853\7\u00a9"+
		"\2\2\u0850\u0853\7\u00ab\2\2\u0851\u0853\7\u00ae\2\2\u0852\u084e\3\2\2"+
		"\2\u0852\u084f\3\2\2\2\u0852\u0850\3\2\2\2\u0852\u0851\3\2\2\2\u0853\u0169"+
		"\3\2\2\2\u0854\u0859\5\u016c\u00b7\2\u0855\u0859\7\u00a9\2\2\u0856\u0859"+
		"\7\u00ac\2\2\u0857\u0859\7\u00af\2\2\u0858\u0854\3\2\2\2\u0858\u0855\3"+
		"\2\2\2\u0858\u0856\3\2\2\2\u0858\u0857\3\2\2\2\u0859\u016b\3\2\2\2\u085a"+
		"\u085f\5\32\16\2\u085b\u085c\7\u0083\2\2\u085c\u085e\5\32\16\2\u085d\u085b"+
		"\3\2\2\2\u085e\u0861\3\2\2\2\u085f\u085d\3\2\2\2\u085f\u0860\3\2\2\2\u0860"+
		"\u0868\3\2\2\2\u0861\u085f\3\2\2\2\u0862\u0864\7\u0084\2\2\u0863\u0865"+
		"\7\u00b1\2\2\u0864\u0863\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0864\3\2\2"+
		"\2\u0866\u0867\3\2\2\2\u0867\u0869\3\2\2\2\u0868\u0862\3\2\2\2\u0868\u0869"+
		"\3\2\2\2\u0869\u016d\3\2\2\2\u086a\u086b\t\22\2\2\u086b\u016f\3\2\2\2"+
		"\u086c\u086d\7\33\2\2\u086d\u086f\5\u0194\u00cb\2\u086e\u0870\5\u00c8"+
		"e\2\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0872\3\2\2\2\u0871"+
		"\u0873\5\u00ccg\2\u0872\u0871\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0875"+
		"\3\2\2\2\u0874\u0876\5\u00d0i\2\u0875\u0874\3\2\2\2\u0875\u0876\3\2\2"+
		"\2\u0876\u0877\3\2\2\2\u0877\u0879\5\u00dco\2\u0878\u087a\7\u0085\2\2"+
		"\u0879\u0878\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u0171\3\2\2\2\u087b\u087c"+
		"\7]\2\2\u087c\u087e\5\u0194\u00cb\2\u087d\u087f\5\u00c8e\2\u087e\u087d"+
		"\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0881\3\2\2\2\u0880\u0882\5\u011c\u008f"+
		"\2\u0881\u0880\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0884\3\2\2\2\u0883\u0885"+
		"\5\u00d0i\2\u0884\u0883\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0886\3\2\2"+
		"\2\u0886\u0888\5\u011e\u0090\2\u0887\u0889\7\u0085\2\2\u0888\u0887\3\2"+
		"\2\2\u0888\u0889\3\2\2\2\u0889\u0173\3\2\2\2\u088a\u088b\79\2\2\u088b"+
		"\u088d\5\u0194\u00cb\2\u088c\u088e\5\u0128\u0095\2\u088d\u088c\3\2\2\2"+
		"\u088d\u088e\3\2\2\2\u088e\u0890\3\2\2\2\u088f\u0891\5\u012e\u0098\2\u0890"+
		"\u088f\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0893\3\2\2\2\u0892\u0894\5\u00d0"+
		"i\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0895\3\2\2\2\u0895"+
		"\u0897\5\u0130\u0099\2\u0896\u0898\7\u0085\2\2\u0897\u0896\3\2\2\2\u0897"+
		"\u0898\3\2\2\2\u0898\u0175\3\2\2\2\u0899\u089a\7&\2\2\u089a\u089c\5\u0194"+
		"\u00cb\2\u089b\u089d\5\u0136\u009c\2\u089c\u089b\3\2\2\2\u089c\u089d\3"+
		"\2\2\2\u089d\u089e\3\2\2\2\u089e\u08a0\5\u0138\u009d\2\u089f\u08a1\7\u0085"+
		"\2\2\u08a0\u089f\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u0177\3\2\2\2\u08a2"+
		"\u08a3\7 \2\2\u08a3\u08a4\5\u00f4{\2\u08a4\u08a6\5\u0194\u00cb\2\u08a5"+
		"\u08a7\5\u0128\u0095\2\u08a6\u08a5\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a8"+
		"\3\2\2\2\u08a8\u08aa\7\u0080\2\2\u08a9\u08ab\5\u00fa~\2\u08aa\u08a9\3"+
		"\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ae\7\u0081\2\2"+
		"\u08ad\u08af\5\u00d0i\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af"+
		"\u08b0\3\2\2\2\u08b0\u08b1\7\u0085\2\2\u08b1\u0179\3\2\2\2\u08b2\u08b3"+
		"\7(\2\2\u08b3\u08bc\5\6\4\2\u08b4\u08b5\5\u00eex\2\u08b5\u08b6\7\u0085"+
		"\2\2\u08b6\u08bd\3\2\2\2\u08b7\u08b8\5\u00f6|\2\u08b8\u08b9\7|\2\2\u08b9"+
		"\u08ba\5\u010e\u0088\2\u08ba\u08bb\7}\2\2\u08bb\u08bd\3\2\2\2\u08bc\u08b4"+
		"\3\2\2\2\u08bc\u08b7\3\2\2\2\u08bd\u017b\3\2\2\2\u08be\u08bf\5\u00eex"+
		"\2\u08bf\u08c0\7\u0085\2\2\u08c0\u017d\3\2\2\2\u08c1\u08cf\5\u00f6|\2"+
		"\u08c2\u08c3\7|\2\2\u08c3\u08c4\5\u0104\u0083\2\u08c4\u08c9\7}\2\2\u08c5"+
		"\u08c6\7\u0090\2\2\u08c6\u08c7\5\u00f2z\2\u08c7\u08c8\7\u0085\2\2\u08c8"+
		"\u08ca\3\2\2\2\u08c9\u08c5\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08d0\3\2"+
		"\2\2\u08cb\u08cc\5\u0158\u00ad\2\u08cc\u08cd\5\32\16\2\u08cd\u08ce\7\u0085"+
		"\2\2\u08ce\u08d0\3\2\2\2\u08cf\u08c2\3\2\2\2\u08cf\u08cb\3\2\2\2\u08d0"+
		"\u017f\3\2\2\2\u08d1\u08d2\7\34\2\2\u08d2\u08d3\5\6\4\2\u08d3\u08d4\5"+
		"\u00eav\2\u08d4\u08d5\7\u0085\2\2\u08d5\u0181\3\2\2\2\u08d6\u08d7\7_\2"+
		"\2\u08d7\u08d8\7~\2\2\u08d8\u08d9\5\u00fa~\2\u08d9\u08e2\7\177\2\2\u08da"+
		"\u08db\7|\2\2\u08db\u08dc\5\u0104\u0083\2\u08dc\u08dd\7}\2\2\u08dd\u08e3"+
		"\3\2\2\2\u08de\u08df\5\u0158\u00ad\2\u08df\u08e0\5\32\16\2\u08e0\u08e1"+
		"\7\u0085\2\2\u08e1\u08e3\3\2\2\2\u08e2\u08da\3\2\2\2\u08e2\u08de\3\2\2"+
		"\2\u08e3\u0183\3\2\2\2\u08e4\u08e5\7\u008f\2\2\u08e5\u08e6\5\u0194\u00cb"+
		"\2\u08e6\u08e7\7\u0080\2\2\u08e7\u08e8\7\u0081\2\2\u08e8\u08e9\5\u011a"+
		"\u008e\2\u08e9\u0185\3\2\2\2\u08ea\u08eb\5\u0194\u00cb\2\u08eb\u08ed\7"+
		"\u0080\2\2\u08ec\u08ee\5\u00fa~\2\u08ed\u08ec\3\2\2\2\u08ed\u08ee\3\2"+
		"\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f1\7\u0081\2\2\u08f0\u08f2\5\u0118\u008d"+
		"\2\u08f1\u08f0\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f4"+
		"\5\u011a\u008e\2\u08f4\u0187\3\2\2\2\u08f5\u08f7\5\u018a\u00c6\2\u08f6"+
		"\u08f8\5\u00c8e\2\u08f7\u08f6\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08f9"+
		"\3\2\2\2\u08f9\u08fb\7\u0080\2\2\u08fa\u08fc\5\u00fa~\2\u08fb\u08fa\3"+
		"\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u08ff\7\u0081\2\2"+
		"\u08fe\u0900\5\u00d0i\2\u08ff\u08fe\3\2\2\2\u08ff\u0900\3\2\2\2\u0900"+
		"\u0906\3\2\2\2\u0901\u0907\5\u00f8}\2\u0902\u0903\5\u0158\u00ad\2\u0903"+
		"\u0904\5\32\16\2\u0904\u0905\7\u0085\2\2\u0905\u0907\3\2\2\2\u0906\u0901"+
		"\3\2\2\2\u0906\u0902\3\2\2\2\u0907\u0189\3\2\2\2\u0908\u090e\5\u0194\u00cb"+
		"\2\u0909\u090a\5\u0194\u00cb\2\u090a\u090b\7\u0094\2\2\u090b\u090c\5\u0194"+
		"\u00cb\2\u090c\u090e\3\2\2\2\u090d\u0908\3\2\2\2\u090d\u0909\3\2\2\2\u090e"+
		"\u0916\3\2\2\2\u090f\u0911\5\24\13\2\u0910\u090f\3\2\2\2\u0910\u0911\3"+
		"\2\2\2\u0911\u0912\3\2\2\2\u0912\u0913\7\u0082\2\2\u0913\u0915\5\u0194"+
		"\u00cb\2\u0914\u0910\3\2\2\2\u0915\u0918\3\2\2\2\u0916\u0914\3\2\2\2\u0916"+
		"\u0917\3\2\2\2\u0917\u018b\3\2\2\2\u0918\u0916\3\2\2\2\u0919\u091a\7G"+
		"\2\2\u091a\u091b\5\u0114\u008b\2\u091b\u091c\7\u0080\2\2\u091c\u091f\5"+
		"\u018e\u00c8\2\u091d\u091e\7\u0083\2\2\u091e\u0920\5\u018e\u00c8\2\u091f"+
		"\u091d\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0927\7\u0081"+
		"\2\2\u0922\u0928\5\u011a\u008e\2\u0923\u0924\5\u0158\u00ad\2\u0924\u0925"+
		"\5\32\16\2\u0925\u0926\7\u0085\2\2\u0926\u0928\3\2\2\2\u0927\u0922\3\2"+
		"\2\2\u0927\u0923\3\2\2\2\u0928\u018d\3\2\2\2\u0929\u092a\5\6\4\2\u092a"+
		"\u092d\5\u0194\u00cb\2\u092b\u092c\7\u0090\2\2\u092c\u092e\5\32\16\2\u092d"+
		"\u092b\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u018f\3\2\2\2\u092f\u0931\7\u0080"+
		"\2\2\u0930\u0932\5\26\f\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932"+
		"\u0933\3\2\2\2\u0933\u0934\7\u0081\2\2\u0934\u0191\3\2\2\2\u0935\u0937"+
		"\7\u0080\2\2\u0936\u0938\5\26\f\2\u0937\u0936\3\2\2\2\u0937\u0938\3\2"+
		"\2\2\u0938\u0939\3\2\2\2\u0939\u093b\7\u0081\2\2\u093a\u093c\5J&\2\u093b"+
		"\u093a\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u0193\3\2\2\2\u093d\u093e\t\23"+
		"\2\2\u093e\u0195\3\2\2\2\u012b\u0197\u019a\u019d\u01a2\u01a6\u01ac\u01af"+
		"\u01b4\u01b8\u01bf\u01c1\u01c8\u01cc\u01d1\u01db\u01e3\u01ed\u01f3\u01f6"+
		"\u01fc\u0201\u0212\u021a\u021f\u0226\u022e\u0236\u023e\u0246\u024e\u0258"+
		"\u025a\u0260\u0265\u026d\u0275\u0290\u0296\u029f\u02a4\u02a9\u02af\u02bd"+
		"\u02c3\u02cf\u02d3\u02d8\u02dc\u02e2\u02e9\u02fc\u0301\u0304\u0313\u0319"+
		"\u031c\u0321\u0324\u032c\u0334\u033f\u0344\u0349\u034b\u0354\u035c\u0363"+
		"\u036b\u036f\u0378\u037d\u037f\u0388\u0390\u0394\u0399\u039b\u03a0\u03a4"+
		"\u03ab\u03b3\u03b5\u03b9\u03bc\u03cd\u03d4\u03d8\u03e2\u03e7\u03ee\u03f7"+
		"\u03fc\u0403\u040f\u041a\u0422\u0427\u0430\u0439\u043e\u0446\u0453\u045d"+
		"\u0473\u0477\u047b\u0491\u0496\u049b\u04a2\u04a5\u04bb\u04c7\u04cb\u04d5"+
		"\u04da\u04df\u04e4\u04ec\u04f1\u04fb\u0500\u0508\u050b\u0512\u0519\u051d"+
		"\u0520\u0526\u052a\u0530\u053e\u0544\u054b\u0550\u0553\u0556\u055d\u0567"+
		"\u0578\u057d\u0581\u0584\u0587\u058e\u0594\u059c\u05a2\u05ac\u05b4\u05ba"+
		"\u05c5\u05c9\u05cb\u05d0\u05d7\u05e0\u05e7\u05ea\u05ed\u05f1\u05f6\u0603"+
		"\u060d\u0619\u0620\u062c\u0632\u0636\u063a\u0640\u0646\u0648\u064f\u0653"+
		"\u0656\u065a\u065f\u0666\u0669\u066e\u0673\u0675\u0678\u067b\u0681\u0684"+
		"\u0690\u0694\u0697\u06a1\u06a4\u06aa\u06c5\u06d2\u06d8\u06e1\u06e7\u06ea"+
		"\u06f2\u06f6\u06fc\u0702\u0708\u0713\u0717\u0719\u0723\u0729\u072c\u0739"+
		"\u073f\u0742\u0745\u074a\u074e\u0752\u0763\u0766\u076b\u076f\u0773\u077c"+
		"\u077f\u0784\u0788\u078d\u0791\u0793\u079e\u07a2\u07a4\u07a9\u07ae\u07b5"+
		"\u07bb\u07c0\u07c6\u07ca\u07d0\u07d7\u07e1\u07e4\u07e7\u07ec\u07f2\u07f6"+
		"\u07f8\u07ff\u0806\u080e\u0812\u0832\u083a\u0840\u0849\u0852\u0858\u085f"+
		"\u0866\u0868\u086f\u0872\u0875\u0879\u087e\u0881\u0884\u0888\u088d\u0890"+
		"\u0893\u0897\u089c\u08a0\u08a6\u08aa\u08ae\u08bc\u08c9\u08cf\u08e2\u08ed"+
		"\u08f1\u08f7\u08fb\u08ff\u0906\u090d\u0910\u0916\u091f\u0927\u092d\u0931"+
		"\u0937\u093b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
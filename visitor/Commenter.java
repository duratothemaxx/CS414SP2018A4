/* Josh Edwards
 * CS414 Spring 2018
 * Assignment A4 - Visitor Pattern 
 * 2.28.2018
 */


package visitor;

import syntaxtree.*;

public class Commenter extends TreeDumper {

	// commenting before a nested class declaration
	public void visit(NestedClassDeclaration n) {
		out.println("\n/*************");
		out.println("New nested class " + n.f1.f1.toString());
		out.print("*************/");
		n.f0.accept(this);
		n.f1.accept(this);
	}

	// commenting before a method declaration
	public void visit(MethodDeclaration n) {
		out.println("\n/*************");
		out.println("New method " + n.f2.f0.toString());
		out.print("*************/");
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
		n.f4.accept(this);
	}

	// commenting before a class declaration
	public void visit(ClassDeclaration n) {
		out.println("/*************");
		out.println("New class " + n.f1.f1.toString());
		out.println("*************/");
		n.f0.accept(this);
		n.f1.accept(this);
	}

	// commenting before a constructor declaration
	public void visit(ConstructorDeclaration n) {
		out.println("\n/*************");
		out.println("New constructor " + n.f1.toString());
		out.print("*************/");
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
		n.f4.accept(this);
		n.f5.accept(this);
		n.f6.accept(this);
		n.f7.accept(this);
	}

	// commenting before and after instance variable declaration
	public void visit(FieldDeclaration n) {
		out.print("\n// Class variable definition begins");
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
		n.f4.accept(this);
		out.print("\n// Class variable definition ends");
	}
}

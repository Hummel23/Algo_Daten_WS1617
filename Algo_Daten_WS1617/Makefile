JC = javac
JCFLAGS = -g
JBINDIR = bin	

JAVA = java
JAVAFLAGS = -cp

JDOC = javadoc
JDOCDIR = java-doc

MAINCLASS= main/Main

SOURCES = ./src/data/Main.java \
 	  ./src/data/Student.java \
	  ./src/lists/DoublyLinkedList.java \
	  ./src/lists/SinglyLinkedList.java \
	  ./src/lists/Listable.java \
	 # ./src/test/DoublyLinkedListTest.java \
	 # ./src/test/SinglyLinkedListTest.java \

default:
	echo 'Run target default'
	mkdir -p $(JBINDIR)
	$(JC) $(JCFLAGS) $(SOURCES) -d $(JBINDIR)

run:
	@echo 'Run target run'
	cd $(JBINDIR); $(JAVA) $(JAVAFLAGS) . $(MAINCLASS)	

doc:
	@echo 'Run target doc' 
	$(JDOC) -version -author -d $(JDOCDIR) $(SOURCES)		

clean:
	@echo 'Run target clean'
	$(RM) -r $(JBINDIR)

distclean: clean
	@echo 'Run target distclean'
	$(RM) -r $(JDOCDIR)

release: distclean default doc	


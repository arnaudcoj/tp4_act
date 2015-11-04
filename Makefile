CC=javac

all: TSP.class

%.class: %.java
	javac $^

$PHONY: clean 

clean:
	rm -rf *~ *.class

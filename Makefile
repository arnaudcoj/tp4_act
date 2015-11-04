PKG := $(wildcard src/*)
SRC := $(wildcard src/$(PKG)/*.java)
OUT := bin/$(PKG:src/%=%)

LIST := $(SRC:src/%.java=$(OUT)/%.class)

all: $(LIST)

$(OUT)/%.class: src/%.java | $(OUT)
	javac -d $| $<

$(OUT):
	@mkdir $@

$PHONY: clean 

clean:
	rm -rf *~ bin/*/*.class

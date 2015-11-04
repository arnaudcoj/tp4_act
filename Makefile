PKG := $(wildcard src/*)
SRC := src
OUT := bin
OUTTSP := $(OUT)/travellingSalemansProblem
OUTCPB := $(OUT)/classesPb
SRCTSP := $(SRC)/travellingSalemansProblem
SRCCPB := $(SRC)/classesPb
LISTTSP := $(wildcard $(SRCTSP)/*.java)
LISTCPB := $(wildcard $(SRCCPB)/*.java)


all: tsp cpb


tsp: $(OUTTSP)/ cpb
	javac $(LISTTSP) -d $(OUT) -cp $(OUT)

cpb: $(OUTCPB)/
	javac $(LISTCPB) -d $(OUT) -cp $(OUT)


$(OUTTSP): $(OUT)
	@mkdir $@

$(OUTCPB): $(OUT)
	@mkdir $@

$(OUT):
	@mkdir $@


$PHONY: clean 

clean:
	rm -rf *~ bin

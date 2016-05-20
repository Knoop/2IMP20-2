# If no arguments are supplied, clear it
if [ $# -eq 0 ]
  then
    clear
fi

# Run tokenizer on file
java -jar e:/beaver/lib/beaver-cc-0.9.11.jar Oberon0.grammar
mv src/oberon0/parser/OberonParser.java src/oberon0/parser/OberonParser.java~
mv OberonParser.java src/oberon0/parser/OberonParser.java